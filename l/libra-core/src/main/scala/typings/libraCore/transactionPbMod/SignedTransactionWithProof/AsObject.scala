package typings.libraCore.transactionPbMod.SignedTransactionWithProof

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AsObject extends js.Object {
  
  var events: js.UndefOr[typings.libraCore.eventsPbMod.EventsList.AsObject] = js.native
  
  var proof: js.UndefOr[typings.libraCore.proofPbMod.SignedTransactionProof.AsObject] = js.native
  
  var signedTransaction: js.UndefOr[typings.libraCore.transactionPbMod.SignedTransaction.AsObject] = js.native
  
  var version: String = js.native
}
object AsObject {
  
  @scala.inline
  def apply(version: String): AsObject = {
    val __obj = js.Dynamic.literal(version = version.asInstanceOf[js.Any])
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
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEvents(value: typings.libraCore.eventsPbMod.EventsList.AsObject): Self = this.set("events", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEvents: Self = this.set("events", js.undefined)
    
    @scala.inline
    def setProof(value: typings.libraCore.proofPbMod.SignedTransactionProof.AsObject): Self = this.set("proof", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProof: Self = this.set("proof", js.undefined)
    
    @scala.inline
    def setSignedTransaction(value: typings.libraCore.transactionPbMod.SignedTransaction.AsObject): Self = this.set("signedTransaction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSignedTransaction: Self = this.set("signedTransaction", js.undefined)
  }
}
