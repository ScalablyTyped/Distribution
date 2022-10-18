package typings.mangopay2NodejsSdk

import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.IBAN
import typings.mangopay2NodejsSdk.typingsModelsEntityBaseMod.entityBase.EntityBaseData
import typings.mangopay2NodejsSdk.typingsTypesMod.CountryISO
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typingsModelsBankingAliasMod {
  
  object bankingAlias {
    
    trait BankingAliasData
      extends StObject
         with EntityBaseData {
      
      /**
        * Whether the banking alias is active or not
        */
      var Active: Boolean
      
      /**
        * The Country of the Address
        */
      var Country: CountryISO
      
      /**
        * The user ID who is credited (defaults to the owner of the wallet)
        */
      var CreditedUserId: String
      
      /**
        * The owner of the wallet/banking alias
        */
      var OwnerName: String
      
      /**
        * The type of banking alias (note that only IBAN is available at present)
        */
      var Type: BankingAliasType
      
      /**
        * The ID of a wallet
        */
      var WalletId: String
    }
    object BankingAliasData {
      
      inline def apply(
        Active: Boolean,
        Country: CountryISO,
        CreationDate: Double,
        CreditedUserId: String,
        Id: String,
        OwnerName: String,
        Tag: String,
        Type: BankingAliasType,
        WalletId: String
      ): BankingAliasData = {
        val __obj = js.Dynamic.literal(Active = Active.asInstanceOf[js.Any], Country = Country.asInstanceOf[js.Any], CreationDate = CreationDate.asInstanceOf[js.Any], CreditedUserId = CreditedUserId.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], OwnerName = OwnerName.asInstanceOf[js.Any], Tag = Tag.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], WalletId = WalletId.asInstanceOf[js.Any])
        __obj.asInstanceOf[BankingAliasData]
      }
      
      extension [Self <: BankingAliasData](x: Self) {
        
        inline def setActive(value: Boolean): Self = StObject.set(x, "Active", value.asInstanceOf[js.Any])
        
        inline def setCountry(value: CountryISO): Self = StObject.set(x, "Country", value.asInstanceOf[js.Any])
        
        inline def setCreditedUserId(value: String): Self = StObject.set(x, "CreditedUserId", value.asInstanceOf[js.Any])
        
        inline def setOwnerName(value: String): Self = StObject.set(x, "OwnerName", value.asInstanceOf[js.Any])
        
        inline def setType(value: BankingAliasType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
        
        inline def setWalletId(value: String): Self = StObject.set(x, "WalletId", value.asInstanceOf[js.Any])
      }
    }
    
    type BankingAliasType = IBAN
    
    /* Inlined parent mangopay2-nodejs-sdk.mangopay2-nodejs-sdk/typings/types.PickPartialRequired<mangopay2-nodejs-sdk.mangopay2-nodejs-sdk/typings/models/bankingAlias.bankingAlias.IBANBankingAliasData, 'Tag' | 'CreditedUserId', 'OwnerName' | 'Country'> */
    trait CreateIBANBankingAlias extends StObject {
      
      var Country: CountryISO
      
      var CreditedUserId: js.UndefOr[String] = js.undefined
      
      var OwnerName: String
      
      var Tag: js.UndefOr[String] = js.undefined
    }
    object CreateIBANBankingAlias {
      
      inline def apply(Country: CountryISO, OwnerName: String): CreateIBANBankingAlias = {
        val __obj = js.Dynamic.literal(Country = Country.asInstanceOf[js.Any], OwnerName = OwnerName.asInstanceOf[js.Any])
        __obj.asInstanceOf[CreateIBANBankingAlias]
      }
      
      extension [Self <: CreateIBANBankingAlias](x: Self) {
        
        inline def setCountry(value: CountryISO): Self = StObject.set(x, "Country", value.asInstanceOf[js.Any])
        
        inline def setCreditedUserId(value: String): Self = StObject.set(x, "CreditedUserId", value.asInstanceOf[js.Any])
        
        inline def setCreditedUserIdUndefined: Self = StObject.set(x, "CreditedUserId", js.undefined)
        
        inline def setOwnerName(value: String): Self = StObject.set(x, "OwnerName", value.asInstanceOf[js.Any])
        
        inline def setTag(value: String): Self = StObject.set(x, "Tag", value.asInstanceOf[js.Any])
        
        inline def setTagUndefined: Self = StObject.set(x, "Tag", js.undefined)
      }
    }
    
    trait IBANBankingAliasData
      extends StObject
         with BankingAliasData {
      
      /**
        * The BIC of the banking alias
        */
      var BIC: String
      
      /**
        * The IBAN of the banking alias
        */
      var IBAN: String
      
      /**
        * The type of banking alias (note that only IBAN is available at present)
        */
      @JSName("Type")
      var Type_IBANBankingAliasData: IBAN
    }
    object IBANBankingAliasData {
      
      inline def apply(
        Active: Boolean,
        BIC: String,
        Country: CountryISO,
        CreationDate: Double,
        CreditedUserId: String,
        IBAN: String,
        Id: String,
        OwnerName: String,
        Tag: String,
        WalletId: String
      ): IBANBankingAliasData = {
        val __obj = js.Dynamic.literal(Active = Active.asInstanceOf[js.Any], BIC = BIC.asInstanceOf[js.Any], Country = Country.asInstanceOf[js.Any], CreationDate = CreationDate.asInstanceOf[js.Any], CreditedUserId = CreditedUserId.asInstanceOf[js.Any], IBAN = IBAN.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], OwnerName = OwnerName.asInstanceOf[js.Any], Tag = Tag.asInstanceOf[js.Any], Type = "IBAN", WalletId = WalletId.asInstanceOf[js.Any])
        __obj.asInstanceOf[IBANBankingAliasData]
      }
      
      extension [Self <: IBANBankingAliasData](x: Self) {
        
        inline def setBIC(value: String): Self = StObject.set(x, "BIC", value.asInstanceOf[js.Any])
        
        inline def setIBAN(value: String): Self = StObject.set(x, "IBAN", value.asInstanceOf[js.Any])
        
        inline def setType(value: IBAN): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
      }
    }
  }
}
