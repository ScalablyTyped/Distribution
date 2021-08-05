package typings.jssip.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SessionAcceptedEvent extends StObject {
  
  var originator: String
  
  var response: js.UndefOr[IncomingResponse] = js.undefined
}
object SessionAcceptedEvent {
  
  inline def apply(originator: String): SessionAcceptedEvent = {
    val __obj = js.Dynamic.literal(originator = originator.asInstanceOf[js.Any])
    __obj.asInstanceOf[SessionAcceptedEvent]
  }
  
  extension [Self <: SessionAcceptedEvent](x: Self) {
    
    inline def setOriginator(value: String): Self = StObject.set(x, "originator", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: IncomingResponse): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
    
    inline def setResponseUndefined: Self = StObject.set(x, "response", js.undefined)
  }
}
