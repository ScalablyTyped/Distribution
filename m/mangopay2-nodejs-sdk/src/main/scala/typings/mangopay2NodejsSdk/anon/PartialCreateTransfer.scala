package typings.mangopay2NodejsSdk.anon

import typings.mangopay2NodejsSdk.moneyMod.money.MoneyData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<mangopay2-nodejs-sdk.mangopay2-nodejs-sdk/typings/models/transfer.transfer.CreateTransfer> */
trait PartialCreateTransfer extends StObject {
  
  var AuthorId: js.UndefOr[String] = js.undefined
  
  var CreditedUserId: js.UndefOr[String] = js.undefined
  
  var CreditedWalletId: js.UndefOr[String] = js.undefined
  
  var DebitedFunds: js.UndefOr[MoneyData] = js.undefined
  
  var DebitedWalletId: js.UndefOr[String] = js.undefined
  
  var Fees: js.UndefOr[MoneyData] = js.undefined
  
  var Tag: js.UndefOr[String] = js.undefined
}
object PartialCreateTransfer {
  
  inline def apply(): PartialCreateTransfer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialCreateTransfer]
  }
  
  extension [Self <: PartialCreateTransfer](x: Self) {
    
    inline def setAuthorId(value: String): Self = StObject.set(x, "AuthorId", value.asInstanceOf[js.Any])
    
    inline def setAuthorIdUndefined: Self = StObject.set(x, "AuthorId", js.undefined)
    
    inline def setCreditedUserId(value: String): Self = StObject.set(x, "CreditedUserId", value.asInstanceOf[js.Any])
    
    inline def setCreditedUserIdUndefined: Self = StObject.set(x, "CreditedUserId", js.undefined)
    
    inline def setCreditedWalletId(value: String): Self = StObject.set(x, "CreditedWalletId", value.asInstanceOf[js.Any])
    
    inline def setCreditedWalletIdUndefined: Self = StObject.set(x, "CreditedWalletId", js.undefined)
    
    inline def setDebitedFunds(value: MoneyData): Self = StObject.set(x, "DebitedFunds", value.asInstanceOf[js.Any])
    
    inline def setDebitedFundsUndefined: Self = StObject.set(x, "DebitedFunds", js.undefined)
    
    inline def setDebitedWalletId(value: String): Self = StObject.set(x, "DebitedWalletId", value.asInstanceOf[js.Any])
    
    inline def setDebitedWalletIdUndefined: Self = StObject.set(x, "DebitedWalletId", js.undefined)
    
    inline def setFees(value: MoneyData): Self = StObject.set(x, "Fees", value.asInstanceOf[js.Any])
    
    inline def setFeesUndefined: Self = StObject.set(x, "Fees", js.undefined)
    
    inline def setTag(value: String): Self = StObject.set(x, "Tag", value.asInstanceOf[js.Any])
    
    inline def setTagUndefined: Self = StObject.set(x, "Tag", js.undefined)
  }
}
