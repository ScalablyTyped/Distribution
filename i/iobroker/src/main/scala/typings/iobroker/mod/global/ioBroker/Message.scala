package typings.iobroker.mod.global.ioBroker

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A message being passed between adapter instances */
trait Message extends StObject {
  
  /** ID of this message */
  var _id: Double
  
  /** Callback information. This is set when the source expects a response */
  var callback: MessageCallbackInfo
  
  /** The command to be executed */
  var command: String
  
  /** The source of this message */
  var from: String
  
  /** The message payload */
  var message: MessagePayload
}
object Message {
  
  @scala.inline
  def apply(_id: Double, callback: MessageCallbackInfo, command: String, from: String, message: MessagePayload): Message = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], callback = callback.asInstanceOf[js.Any], command = command.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[Message]
  }
  
  @scala.inline
  implicit class MessageMutableBuilder[Self <: Message] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCallback(value: MessageCallbackInfo): Self = StObject.set(x, "callback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommand(value: String): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage(value: MessagePayload): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_id(value: Double): Self = StObject.set(x, "_id", value.asInstanceOf[js.Any])
  }
}
