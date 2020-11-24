package typings.iotaLibJs.anon

import typings.iotaLibJs.mod.TransactionObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Received extends js.Object {
  
  var received: js.Array[TransactionObject] = js.native
  
  var sent: js.Array[TransactionObject] = js.native
}
object Received {
  
  @scala.inline
  def apply(received: js.Array[TransactionObject], sent: js.Array[TransactionObject]): Received = {
    val __obj = js.Dynamic.literal(received = received.asInstanceOf[js.Any], sent = sent.asInstanceOf[js.Any])
    __obj.asInstanceOf[Received]
  }
  
  @scala.inline
  implicit class ReceivedOps[Self <: Received] (val x: Self) extends AnyVal {
    
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
    def setReceivedVarargs(value: TransactionObject*): Self = this.set("received", js.Array(value :_*))
    
    @scala.inline
    def setReceived(value: js.Array[TransactionObject]): Self = this.set("received", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSentVarargs(value: TransactionObject*): Self = this.set("sent", js.Array(value :_*))
    
    @scala.inline
    def setSent(value: js.Array[TransactionObject]): Self = this.set("sent", value.asInstanceOf[js.Any])
  }
}
