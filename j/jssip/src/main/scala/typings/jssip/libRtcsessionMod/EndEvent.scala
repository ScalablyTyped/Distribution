package typings.jssip.libRtcsessionMod

import typings.jssip.libSipmessageMod.IncomingRequest
import typings.jssip.libSipmessageMod.IncomingResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EndEvent extends StObject {
  
  var cause: String
  
  var message: IncomingRequest | IncomingResponse
  
  var originator: Originator
}
object EndEvent {
  
  inline def apply(cause: String, message: IncomingRequest | IncomingResponse, originator: Originator): EndEvent = {
    val __obj = js.Dynamic.literal(cause = cause.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], originator = originator.asInstanceOf[js.Any])
    __obj.asInstanceOf[EndEvent]
  }
  
  extension [Self <: EndEvent](x: Self) {
    
    inline def setCause(value: String): Self = StObject.set(x, "cause", value.asInstanceOf[js.Any])
    
    inline def setMessage(value: IncomingRequest | IncomingResponse): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setOriginator(value: Originator): Self = StObject.set(x, "originator", value.asInstanceOf[js.Any])
  }
}
