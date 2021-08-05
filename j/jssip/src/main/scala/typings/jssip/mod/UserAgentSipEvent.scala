package typings.jssip.mod

import typings.jssip.anon.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UserAgentSipEvent extends StObject {
  
  var event: Event
  
  var request: IncomingRequest
}
object UserAgentSipEvent {
  
  inline def apply(event: Event, request: IncomingRequest): UserAgentSipEvent = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserAgentSipEvent]
  }
  
  extension [Self <: UserAgentSipEvent](x: Self) {
    
    inline def setEvent(value: Event): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: IncomingRequest): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
  }
}
