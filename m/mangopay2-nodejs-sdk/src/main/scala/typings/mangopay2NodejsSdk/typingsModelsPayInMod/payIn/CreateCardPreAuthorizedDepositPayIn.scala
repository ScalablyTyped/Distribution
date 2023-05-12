package typings.mangopay2NodejsSdk.typingsModelsPayInMod.payIn

import typings.mangopay2NodejsSdk.typingsModelsMoneyMod.money.MoneyData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateCardPreAuthorizedDepositPayIn extends StObject {
  
  var AuthorId: js.UndefOr[String] = js.undefined
  
  var CreditedWalletId: String
  
  var DebitedFunds: MoneyData
  
  var DepositId: String
  
  var Fees: MoneyData
  
  var Tag: js.UndefOr[String] = js.undefined
}
object CreateCardPreAuthorizedDepositPayIn {
  
  inline def apply(CreditedWalletId: String, DebitedFunds: MoneyData, DepositId: String, Fees: MoneyData): CreateCardPreAuthorizedDepositPayIn = {
    val __obj = js.Dynamic.literal(CreditedWalletId = CreditedWalletId.asInstanceOf[js.Any], DebitedFunds = DebitedFunds.asInstanceOf[js.Any], DepositId = DepositId.asInstanceOf[js.Any], Fees = Fees.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateCardPreAuthorizedDepositPayIn]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateCardPreAuthorizedDepositPayIn] (val x: Self) extends AnyVal {
    
    inline def setAuthorId(value: String): Self = StObject.set(x, "AuthorId", value.asInstanceOf[js.Any])
    
    inline def setAuthorIdUndefined: Self = StObject.set(x, "AuthorId", js.undefined)
    
    inline def setCreditedWalletId(value: String): Self = StObject.set(x, "CreditedWalletId", value.asInstanceOf[js.Any])
    
    inline def setDebitedFunds(value: MoneyData): Self = StObject.set(x, "DebitedFunds", value.asInstanceOf[js.Any])
    
    inline def setDepositId(value: String): Self = StObject.set(x, "DepositId", value.asInstanceOf[js.Any])
    
    inline def setFees(value: MoneyData): Self = StObject.set(x, "Fees", value.asInstanceOf[js.Any])
    
    inline def setTag(value: String): Self = StObject.set(x, "Tag", value.asInstanceOf[js.Any])
    
    inline def setTagUndefined: Self = StObject.set(x, "Tag", js.undefined)
  }
}
