package typings.mangopay2NodejsSdk

import typings.mangopay2NodejsSdk.entityBaseMod.entityBase.EntityBaseData
import typings.mangopay2NodejsSdk.typesMod.CurrencyISO
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object moneyMod {
  
  object money {
    
    trait EMoneyData
      extends StObject
         with EntityBaseData {
      
      /**
        * The amount of money that has been credited to this user
        */
      var CreditedEMoney: MoneyData
      
      /**
        * The amount of money that has been debited from this user
        */
      var DebitedEMoney: MoneyData
      
      /**
        * The object owner's UserId
        */
      var UserId: String
    }
    object EMoneyData {
      
      inline def apply(
        CreationDate: Double,
        CreditedEMoney: MoneyData,
        DebitedEMoney: MoneyData,
        Id: String,
        Tag: String,
        UserId: String
      ): EMoneyData = {
        val __obj = js.Dynamic.literal(CreationDate = CreationDate.asInstanceOf[js.Any], CreditedEMoney = CreditedEMoney.asInstanceOf[js.Any], DebitedEMoney = DebitedEMoney.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], Tag = Tag.asInstanceOf[js.Any], UserId = UserId.asInstanceOf[js.Any])
        __obj.asInstanceOf[EMoneyData]
      }
      
      extension [Self <: EMoneyData](x: Self) {
        
        inline def setCreditedEMoney(value: MoneyData): Self = StObject.set(x, "CreditedEMoney", value.asInstanceOf[js.Any])
        
        inline def setDebitedEMoney(value: MoneyData): Self = StObject.set(x, "DebitedEMoney", value.asInstanceOf[js.Any])
        
        inline def setUserId(value: String): Self = StObject.set(x, "UserId", value.asInstanceOf[js.Any])
      }
    }
    
    trait MoneyData extends StObject {
      
      /**
        * An amount of money in the smallest sub-division of the currency, e.g. 12.60 EUR would be represented as 1260 whereas 12 JPY would be represented as just 12)
        */
      var Amount: Double
      
      /**
        * The currency - should be ISO_4217 format
        */
      var Currency: CurrencyISO
    }
    object MoneyData {
      
      inline def apply(Amount: Double, Currency: CurrencyISO): MoneyData = {
        val __obj = js.Dynamic.literal(Amount = Amount.asInstanceOf[js.Any], Currency = Currency.asInstanceOf[js.Any])
        __obj.asInstanceOf[MoneyData]
      }
      
      extension [Self <: MoneyData](x: Self) {
        
        inline def setAmount(value: Double): Self = StObject.set(x, "Amount", value.asInstanceOf[js.Any])
        
        inline def setCurrency(value: CurrencyISO): Self = StObject.set(x, "Currency", value.asInstanceOf[js.Any])
      }
    }
  }
}
