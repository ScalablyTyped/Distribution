package typings.libraCore.getWithProofPbMod.GetTransactionsResponse

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AsObject extends js.Object {
  
  var txnListWithProof: js.UndefOr[typings.libraCore.transactionPbMod.TransactionListWithProof.AsObject] = js.native
}
object AsObject {
  
  @scala.inline
  def apply(): AsObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AsObject]
  }
  
  @scala.inline
  implicit class AsObjectOps[Self <: AsObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setTxnListWithProof(value: typings.libraCore.transactionPbMod.TransactionListWithProof.AsObject): Self = this.set("txnListWithProof", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTxnListWithProof: Self = this.set("txnListWithProof", js.undefined)
  }
}
