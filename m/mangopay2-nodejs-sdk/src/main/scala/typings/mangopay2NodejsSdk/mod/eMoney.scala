package typings.mangopay2NodejsSdk.mod

import typings.mangopay2NodejsSdk.mod.entityBase.EntityBaseData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object eMoney {
  
  @js.native
  trait EMoneyData extends EntityBaseData {
    
    /**
      * The amount of money that has been credited to this user
      */
    var CreditedEMoney: MoneyData = js.native
    
    /**
      * The amount of money that has been debited from this user
      */
    var DebitedEMoney: MoneyData = js.native
    
    /**
      * The object owner's UserId
      */
    var UserId: String = js.native
  }
  object EMoneyData {
    
    @scala.inline
    def apply(
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
    
    @scala.inline
    implicit class EMoneyDataMutableBuilder[Self <: EMoneyData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCreditedEMoney(value: MoneyData): Self = StObject.set(x, "CreditedEMoney", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDebitedEMoney(value: MoneyData): Self = StObject.set(x, "DebitedEMoney", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserId(value: String): Self = StObject.set(x, "UserId", value.asInstanceOf[js.Any])
    }
  }
}
