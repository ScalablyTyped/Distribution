package typings.libp2pGossipsub.messageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RPC extends js.Object {
  
  var control: js.UndefOr[ControlMessage] = js.native
  
  var msgs: js.Array[Message] = js.native
  
  var subscriptions: js.Array[SubOpts] = js.native
}
object RPC {
  
  @scala.inline
  def apply(msgs: js.Array[Message], subscriptions: js.Array[SubOpts]): RPC = {
    val __obj = js.Dynamic.literal(msgs = msgs.asInstanceOf[js.Any], subscriptions = subscriptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[RPC]
  }
  
  @scala.inline
  implicit class RPCOps[Self <: RPC] (val x: Self) extends AnyVal {
    
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
    def setMsgsVarargs(value: Message*): Self = this.set("msgs", js.Array(value :_*))
    
    @scala.inline
    def setMsgs(value: js.Array[Message]): Self = this.set("msgs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubscriptionsVarargs(value: SubOpts*): Self = this.set("subscriptions", js.Array(value :_*))
    
    @scala.inline
    def setSubscriptions(value: js.Array[SubOpts]): Self = this.set("subscriptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setControl(value: ControlMessage): Self = this.set("control", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteControl: Self = this.set("control", js.undefined)
  }
}
