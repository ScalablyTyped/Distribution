package typings.jssip.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SessionEndedEvent extends StObject {
  
  var cause: String
  
  var message: js.UndefOr[IncomingResponse] = js.undefined
  
  var originator: String
}
object SessionEndedEvent {
  
  inline def apply(cause: String, originator: String): SessionEndedEvent = {
    val __obj = js.Dynamic.literal(cause = cause.asInstanceOf[js.Any], originator = originator.asInstanceOf[js.Any])
    __obj.asInstanceOf[SessionEndedEvent]
  }
  
  extension [Self <: SessionEndedEvent](x: Self) {
    
    inline def setCause(value: String): Self = StObject.set(x, "cause", value.asInstanceOf[js.Any])
    
    inline def setMessage(value: IncomingResponse): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    inline def setOriginator(value: String): Self = StObject.set(x, "originator", value.asInstanceOf[js.Any])
  }
}
