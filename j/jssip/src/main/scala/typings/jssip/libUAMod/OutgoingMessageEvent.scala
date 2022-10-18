package typings.jssip.libUAMod

import typings.jssip.libMessageMod.Message
import typings.jssip.libRtcsessionMod.Originator.LOCAL
import typings.jssip.libSipmessageMod.OutgoingRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OutgoingMessageEvent extends StObject {
  
  var message: Message
  
  var originator: LOCAL
  
  var request: OutgoingRequest
}
object OutgoingMessageEvent {
  
  inline def apply(message: Message, originator: LOCAL, request: OutgoingRequest): OutgoingMessageEvent = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], originator = originator.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any])
    __obj.asInstanceOf[OutgoingMessageEvent]
  }
  
  extension [Self <: OutgoingMessageEvent](x: Self) {
    
    inline def setMessage(value: Message): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setOriginator(value: LOCAL): Self = StObject.set(x, "originator", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: OutgoingRequest): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
  }
}
