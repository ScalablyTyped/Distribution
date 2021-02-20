package typings.mangopay2NodejsSdk.anon

import typings.mangopay2NodejsSdk.mod.MoneyData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<mangopay2-nodejs-sdk.mangopay2-nodejs-sdk.transfer.CreateTransfer> */
@js.native
trait PartialCreateTransfer extends StObject {
  
  var AuthorId: js.UndefOr[String] = js.native
  
  var CreditedUserId: js.UndefOr[String] = js.native
  
  var CreditedWalletId: js.UndefOr[String] = js.native
  
  var DebitedFunds: js.UndefOr[MoneyData] = js.native
  
  var DebitedWalletId: js.UndefOr[String] = js.native
  
  var Fees: js.UndefOr[MoneyData] = js.native
  
  var Tag: js.UndefOr[String] = js.native
}
object PartialCreateTransfer {
  
  @scala.inline
  def apply(): PartialCreateTransfer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialCreateTransfer]
  }
  
  @scala.inline
  implicit class PartialCreateTransferMutableBuilder[Self <: PartialCreateTransfer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthorId(value: String): Self = StObject.set(x, "AuthorId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthorIdUndefined: Self = StObject.set(x, "AuthorId", js.undefined)
    
    @scala.inline
    def setCreditedUserId(value: String): Self = StObject.set(x, "CreditedUserId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreditedUserIdUndefined: Self = StObject.set(x, "CreditedUserId", js.undefined)
    
    @scala.inline
    def setCreditedWalletId(value: String): Self = StObject.set(x, "CreditedWalletId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreditedWalletIdUndefined: Self = StObject.set(x, "CreditedWalletId", js.undefined)
    
    @scala.inline
    def setDebitedFunds(value: MoneyData): Self = StObject.set(x, "DebitedFunds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDebitedFundsUndefined: Self = StObject.set(x, "DebitedFunds", js.undefined)
    
    @scala.inline
    def setDebitedWalletId(value: String): Self = StObject.set(x, "DebitedWalletId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDebitedWalletIdUndefined: Self = StObject.set(x, "DebitedWalletId", js.undefined)
    
    @scala.inline
    def setFees(value: MoneyData): Self = StObject.set(x, "Fees", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFeesUndefined: Self = StObject.set(x, "Fees", js.undefined)
    
    @scala.inline
    def setTag(value: String): Self = StObject.set(x, "Tag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagUndefined: Self = StObject.set(x, "Tag", js.undefined)
  }
}
