package typings.jssip.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SessionSendingEvent extends StObject {
  
  var request: OutgoingRequest
}
object SessionSendingEvent {
  
  inline def apply(request: OutgoingRequest): SessionSendingEvent = {
    val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any])
    __obj.asInstanceOf[SessionSendingEvent]
  }
  
  extension [Self <: SessionSendingEvent](x: Self) {
    
    inline def setRequest(value: OutgoingRequest): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
  }
}
