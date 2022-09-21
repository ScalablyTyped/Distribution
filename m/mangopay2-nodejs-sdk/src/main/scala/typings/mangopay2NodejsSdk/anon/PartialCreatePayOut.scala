package typings.mangopay2NodejsSdk.anon

import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BANK_WIRE
import typings.mangopay2NodejsSdk.moneyMod.money.MoneyData
import typings.mangopay2NodejsSdk.payOutMod.payOut.PayoutModeRequestedType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<mangopay2-nodejs-sdk.mangopay2-nodejs-sdk/typings/models/payOut.payOut.CreatePayOut> */
trait PartialCreatePayOut extends StObject {
  
  var AuthorId: js.UndefOr[String] = js.undefined
  
  var BankAccountId: js.UndefOr[String] = js.undefined
  
  var BankWireRef: js.UndefOr[String] = js.undefined
  
  var DebitedFunds: js.UndefOr[MoneyData] = js.undefined
  
  var DebitedWalletId: js.UndefOr[String] = js.undefined
  
  var Fees: js.UndefOr[MoneyData] = js.undefined
  
  var PaymentType: js.UndefOr[BANK_WIRE] = js.undefined
  
  var PayoutModeRequested: js.UndefOr[PayoutModeRequestedType] = js.undefined
  
  var Tag: js.UndefOr[String] = js.undefined
}
object PartialCreatePayOut {
  
  inline def apply(): PartialCreatePayOut = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialCreatePayOut]
  }
  
  extension [Self <: PartialCreatePayOut](x: Self) {
    
    inline def setAuthorId(value: String): Self = StObject.set(x, "AuthorId", value.asInstanceOf[js.Any])
    
    inline def setAuthorIdUndefined: Self = StObject.set(x, "AuthorId", js.undefined)
    
    inline def setBankAccountId(value: String): Self = StObject.set(x, "BankAccountId", value.asInstanceOf[js.Any])
    
    inline def setBankAccountIdUndefined: Self = StObject.set(x, "BankAccountId", js.undefined)
    
    inline def setBankWireRef(value: String): Self = StObject.set(x, "BankWireRef", value.asInstanceOf[js.Any])
    
    inline def setBankWireRefUndefined: Self = StObject.set(x, "BankWireRef", js.undefined)
    
    inline def setDebitedFunds(value: MoneyData): Self = StObject.set(x, "DebitedFunds", value.asInstanceOf[js.Any])
    
    inline def setDebitedFundsUndefined: Self = StObject.set(x, "DebitedFunds", js.undefined)
    
    inline def setDebitedWalletId(value: String): Self = StObject.set(x, "DebitedWalletId", value.asInstanceOf[js.Any])
    
    inline def setDebitedWalletIdUndefined: Self = StObject.set(x, "DebitedWalletId", js.undefined)
    
    inline def setFees(value: MoneyData): Self = StObject.set(x, "Fees", value.asInstanceOf[js.Any])
    
    inline def setFeesUndefined: Self = StObject.set(x, "Fees", js.undefined)
    
    inline def setPaymentType(value: BANK_WIRE): Self = StObject.set(x, "PaymentType", value.asInstanceOf[js.Any])
    
    inline def setPaymentTypeUndefined: Self = StObject.set(x, "PaymentType", js.undefined)
    
    inline def setPayoutModeRequested(value: PayoutModeRequestedType): Self = StObject.set(x, "PayoutModeRequested", value.asInstanceOf[js.Any])
    
    inline def setPayoutModeRequestedUndefined: Self = StObject.set(x, "PayoutModeRequested", js.undefined)
    
    inline def setTag(value: String): Self = StObject.set(x, "Tag", value.asInstanceOf[js.Any])
    
    inline def setTagUndefined: Self = StObject.set(x, "Tag", js.undefined)
  }
}
