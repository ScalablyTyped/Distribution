package typings.mangopay2NodejsSdk

import typings.mangopay2NodejsSdk.typingsModelsEntityBaseMod.entityBase.EntityBaseData
import typings.mangopay2NodejsSdk.typingsModelsMoneyMod.money.MoneyData
import typings.mangopay2NodejsSdk.typingsTypesMod.CurrencyISO
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typingsModelsWalletMod {
  
  object wallet {
    
    /* Rewritten from type alias, can be one of: 
      - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.FEES
      - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CREDIT
    */
    trait ClientFundsType extends StObject
    object ClientFundsType {
      
      inline def CREDIT: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CREDIT = "CREDIT".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CREDIT]
      
      inline def FEES: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.FEES = "FEES".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.FEES]
    }
    
    /* Inlined parent mangopay2-nodejs-sdk.mangopay2-nodejs-sdk/typings/types.Omit<mangopay2-nodejs-sdk.mangopay2-nodejs-sdk/typings/models/wallet.wallet.WalletData, 'Owners' | 'Description'> */
    trait ClientWalletData extends StObject {
      
      var Balance: MoneyData
      
      var CreationDate: Double
      
      var Currency: CurrencyISO
      
      var FundsType: ClientFundsType
      
      var Id: String
      
      var Tag: String
    }
    object ClientWalletData {
      
      inline def apply(
        Balance: MoneyData,
        CreationDate: Double,
        Currency: CurrencyISO,
        FundsType: ClientFundsType,
        Id: String,
        Tag: String
      ): ClientWalletData = {
        val __obj = js.Dynamic.literal(Balance = Balance.asInstanceOf[js.Any], CreationDate = CreationDate.asInstanceOf[js.Any], Currency = Currency.asInstanceOf[js.Any], FundsType = FundsType.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], Tag = Tag.asInstanceOf[js.Any])
        __obj.asInstanceOf[ClientWalletData]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: ClientWalletData] (val x: Self) extends AnyVal {
        
        inline def setBalance(value: MoneyData): Self = StObject.set(x, "Balance", value.asInstanceOf[js.Any])
        
        inline def setCreationDate(value: Double): Self = StObject.set(x, "CreationDate", value.asInstanceOf[js.Any])
        
        inline def setCurrency(value: CurrencyISO): Self = StObject.set(x, "Currency", value.asInstanceOf[js.Any])
        
        inline def setFundsType(value: ClientFundsType): Self = StObject.set(x, "FundsType", value.asInstanceOf[js.Any])
        
        inline def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
        
        inline def setTag(value: String): Self = StObject.set(x, "Tag", value.asInstanceOf[js.Any])
      }
    }
    
    /* Inlined mangopay2-nodejs-sdk.mangopay2-nodejs-sdk/typings/models/wallet.wallet.UpdateWallet & std.Pick<mangopay2-nodejs-sdk.mangopay2-nodejs-sdk/typings/models/wallet.wallet.WalletData, 'Owners' | 'Currency' | 'Description'> */
    trait CreateWallet extends StObject {
      
      var Currency: CurrencyISO
      
      var Description: js.UndefOr[String] = js.undefined
      
      var Owners: js.Array[String]
      
      var Tag: js.UndefOr[String] = js.undefined
    }
    object CreateWallet {
      
      inline def apply(Currency: CurrencyISO, Owners: js.Array[String]): CreateWallet = {
        val __obj = js.Dynamic.literal(Currency = Currency.asInstanceOf[js.Any], Owners = Owners.asInstanceOf[js.Any])
        __obj.asInstanceOf[CreateWallet]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: CreateWallet] (val x: Self) extends AnyVal {
        
        inline def setCurrency(value: CurrencyISO): Self = StObject.set(x, "Currency", value.asInstanceOf[js.Any])
        
        inline def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
        
        inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
        
        inline def setOwners(value: js.Array[String]): Self = StObject.set(x, "Owners", value.asInstanceOf[js.Any])
        
        inline def setOwnersVarargs(value: String*): Self = StObject.set(x, "Owners", js.Array(value*))
        
        inline def setTag(value: String): Self = StObject.set(x, "Tag", value.asInstanceOf[js.Any])
        
        inline def setTagUndefined: Self = StObject.set(x, "Tag", js.undefined)
      }
    }
    
    /* Rewritten from type alias, can be one of: 
      - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DEFAULT
      - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.FEES
      - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CREDIT
    */
    trait FundsType extends StObject
    object FundsType {
      
      inline def CREDIT: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CREDIT = "CREDIT".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CREDIT]
      
      inline def DEFAULT: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DEFAULT = "DEFAULT".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DEFAULT]
      
      inline def FEES: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.FEES = "FEES".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.FEES]
    }
    
    /* Inlined mangopay2-nodejs-sdk.mangopay2-nodejs-sdk/typings/types.PickPartial<mangopay2-nodejs-sdk.mangopay2-nodejs-sdk/typings/models/wallet.wallet.WalletData, 'Tag' | 'Description'> */
    trait UpdateWallet extends StObject {
      
      var Description: js.UndefOr[String] = js.undefined
      
      var Tag: js.UndefOr[String] = js.undefined
    }
    object UpdateWallet {
      
      inline def apply(): UpdateWallet = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[UpdateWallet]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: UpdateWallet] (val x: Self) extends AnyVal {
        
        inline def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
        
        inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
        
        inline def setTag(value: String): Self = StObject.set(x, "Tag", value.asInstanceOf[js.Any])
        
        inline def setTagUndefined: Self = StObject.set(x, "Tag", js.undefined)
      }
    }
    
    trait WalletData
      extends StObject
         with EntityBaseData {
      
      /**
        * The current balance of the wallet
        */
      var Balance: MoneyData
      
      /**
        * The currency - should be ISO_4217 format
        */
      var Currency: CurrencyISO
      
      /**
        * A description of the wallet
        */
      var Description: String
      
      /**
        * The type of funds in the wallet
        */
      var FundsType: typings.mangopay2NodejsSdk.typingsModelsWalletMod.wallet.FundsType
      
      /**
        * An array of userIDs of who own's the wallet. For now, you only can set up a unique owner.
        */
      var Owners: js.Array[String]
    }
    object WalletData {
      
      inline def apply(
        Balance: MoneyData,
        CreationDate: Double,
        Currency: CurrencyISO,
        Description: String,
        FundsType: FundsType,
        Id: String,
        Owners: js.Array[String],
        Tag: String
      ): WalletData = {
        val __obj = js.Dynamic.literal(Balance = Balance.asInstanceOf[js.Any], CreationDate = CreationDate.asInstanceOf[js.Any], Currency = Currency.asInstanceOf[js.Any], Description = Description.asInstanceOf[js.Any], FundsType = FundsType.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], Owners = Owners.asInstanceOf[js.Any], Tag = Tag.asInstanceOf[js.Any])
        __obj.asInstanceOf[WalletData]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: WalletData] (val x: Self) extends AnyVal {
        
        inline def setBalance(value: MoneyData): Self = StObject.set(x, "Balance", value.asInstanceOf[js.Any])
        
        inline def setCurrency(value: CurrencyISO): Self = StObject.set(x, "Currency", value.asInstanceOf[js.Any])
        
        inline def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
        
        inline def setFundsType(value: FundsType): Self = StObject.set(x, "FundsType", value.asInstanceOf[js.Any])
        
        inline def setOwners(value: js.Array[String]): Self = StObject.set(x, "Owners", value.asInstanceOf[js.Any])
        
        inline def setOwnersVarargs(value: String*): Self = StObject.set(x, "Owners", js.Array(value*))
      }
    }
  }
}
