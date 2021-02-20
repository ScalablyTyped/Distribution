package typings.jssip.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SessionConnectingEvent extends StObject {
  
  var request: IncomingRequest | OutgoingRequest = js.native
}
object SessionConnectingEvent {
  
  @scala.inline
  def apply(request: IncomingRequest | OutgoingRequest): SessionConnectingEvent = {
    val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any])
    __obj.asInstanceOf[SessionConnectingEvent]
  }
  
  @scala.inline
  implicit class SessionConnectingEventMutableBuilder[Self <: SessionConnectingEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRequest(value: IncomingRequest | OutgoingRequest): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
  }
}
