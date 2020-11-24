package typings.keepNetworkTbtcJs.redemptionMod

import typings.keepNetworkTbtcJs.anon.RequiredConfirmationsTransactionID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AutoSubmitState extends js.Object {
  
  var broadcastTransactionID: js.Promise[String] = js.native
  
  var confirmations: js.Promise[RequiredConfirmationsTransactionID] = js.native
  
  var proofTransaction: js.Promise[Unit] = js.native
}
object AutoSubmitState {
  
  @scala.inline
  def apply(
    broadcastTransactionID: js.Promise[String],
    confirmations: js.Promise[RequiredConfirmationsTransactionID],
    proofTransaction: js.Promise[Unit]
  ): AutoSubmitState = {
    val __obj = js.Dynamic.literal(broadcastTransactionID = broadcastTransactionID.asInstanceOf[js.Any], confirmations = confirmations.asInstanceOf[js.Any], proofTransaction = proofTransaction.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoSubmitState]
  }
  
  @scala.inline
  implicit class AutoSubmitStateOps[Self <: AutoSubmitState] (val x: Self) extends AnyVal {
    
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
    def setBroadcastTransactionID(value: js.Promise[String]): Self = this.set("broadcastTransactionID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfirmations(value: js.Promise[RequiredConfirmationsTransactionID]): Self = this.set("confirmations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProofTransaction(value: js.Promise[Unit]): Self = this.set("proofTransaction", value.asInstanceOf[js.Any])
  }
}
