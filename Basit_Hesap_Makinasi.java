import java.util.Scanner;

public class Basit_Hesap_Makinasi {
    public static void main(String[] args) {

        int n1,n2,islem;

        Scanner input= new Scanner(System.in);

        System.out.print("İlk Sayıyı Giriniz: ");
        n1=input.nextInt();

        System.out.print("İkinci Sayıyı Giriniz: ");
        n2=input.nextInt();

        System.out.println("Bir İşlem Seçiniz \n \n 1-Topla: \n 2-Çıkar: \n 3-Çarp: \n 4-Böl: ");
        System.out.print("Seçiminiz: ");
        islem= input.nextInt();

        switch(islem){

            case 1:
                System.out.print("Sonuç= "+(n1+n2));
                break;

            case 2:
                System.out.print("Sonuç= "+(n1-n2));
                break;

            case 3:
                System.out.print("Sonuç= "+(n1*n2));
                break;

            case 4:
                if (n2==0){
                    System.out.print("Sayı 0'a bölünmez");
                }
                else {
                    System.out.print("Sonuç= "+(n1/n2));}

                break;

            default:
                System.out.print("Yanlış İşlem Girdiniz");

                break;
        }
}}