package typings.iobroker.mod.global.ioBroker

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Callback information for a passed message */
trait MessageCallbackInfo extends StObject {
  
  // ???
  var ack: Boolean
  
  /** ID of this callback */
  var id: Double
  
  /** The original message payload */
  var message: MessagePayload
  
  /** Timestamp of this message */
  var time: Double
}
object MessageCallbackInfo {
  
  inline def apply(ack: Boolean, id: Double, message: MessagePayload, time: Double): MessageCallbackInfo = {
    val __obj = js.Dynamic.literal(ack = ack.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageCallbackInfo]
  }
  
  extension [Self <: MessageCallbackInfo](x: Self) {
    
    inline def setAck(value: Boolean): Self = StObject.set(x, "ack", value.asInstanceOf[js.Any])
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setMessage(value: MessagePayload): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setTime(value: Double): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
  }
}
