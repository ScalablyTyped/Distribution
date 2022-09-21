package typings.jssip.uAMod

import typings.jssip.messageMod.Message
import typings.jssip.rtcsessionMod.Originator.REMOTE
import typings.jssip.sipmessageMod.IncomingRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IncomingMessageEvent extends StObject {
  
  var message: Message
  
  var originator: REMOTE
  
  var request: IncomingRequest
}
object IncomingMessageEvent {
  
  inline def apply(message: Message, originator: REMOTE, request: IncomingRequest): IncomingMessageEvent = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], originator = originator.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any])
    __obj.asInstanceOf[IncomingMessageEvent]
  }
  
  extension [Self <: IncomingMessageEvent](x: Self) {
    
    inline def setMessage(value: Message): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setOriginator(value: REMOTE): Self = StObject.set(x, "originator", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: IncomingRequest): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
  }
}
