package typings.jssip.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SessionConnectingEvent extends StObject {
  
  var request: IncomingRequest | OutgoingRequest
}
object SessionConnectingEvent {
  
  inline def apply(request: IncomingRequest | OutgoingRequest): SessionConnectingEvent = {
    val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any])
    __obj.asInstanceOf[SessionConnectingEvent]
  }
  
  extension [Self <: SessionConnectingEvent](x: Self) {
    
    inline def setRequest(value: IncomingRequest | OutgoingRequest): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
  }
}
