package typings.iobroker.mod.global.ioBroker

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Callback information for a passed message */
@js.native
trait MessageCallbackInfo extends StObject {
  
  // ???
  var ack: Boolean = js.native
  
  /** ID of this callback */
  var id: Double = js.native
  
  /** The original message payload */
  var message: MessagePayload = js.native
  
  /** Timestamp of this message */
  var time: Double = js.native
}
object MessageCallbackInfo {
  
  @scala.inline
  def apply(ack: Boolean, id: Double, message: MessagePayload, time: Double): MessageCallbackInfo = {
    val __obj = js.Dynamic.literal(ack = ack.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageCallbackInfo]
  }
  
  @scala.inline
  implicit class MessageCallbackInfoMutableBuilder[Self <: MessageCallbackInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAck(value: Boolean): Self = StObject.set(x, "ack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage(value: MessagePayload): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTime(value: Double): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
  }
}
