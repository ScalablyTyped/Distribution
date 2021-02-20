package typings.jssip.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SessionSendingEvent extends StObject {
  
  var request: OutgoingRequest = js.native
}
object SessionSendingEvent {
  
  @scala.inline
  def apply(request: OutgoingRequest): SessionSendingEvent = {
    val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any])
    __obj.asInstanceOf[SessionSendingEvent]
  }
  
  @scala.inline
  implicit class SessionSendingEventMutableBuilder[Self <: SessionSendingEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRequest(value: OutgoingRequest): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
  }
}
