package typings.jssip.mod

import typings.jssip.mod.RTCSession.Info
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SessionNewInfoEvent extends StObject {
  
  var info: Info
  
  var originator: String
  
  var request: IncomingRequest | OutgoingRequest
}
object SessionNewInfoEvent {
  
  @scala.inline
  def apply(info: Info, originator: String, request: IncomingRequest | OutgoingRequest): SessionNewInfoEvent = {
    val __obj = js.Dynamic.literal(info = info.asInstanceOf[js.Any], originator = originator.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any])
    __obj.asInstanceOf[SessionNewInfoEvent]
  }
  
  @scala.inline
  implicit class SessionNewInfoEventMutableBuilder[Self <: SessionNewInfoEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInfo(value: Info): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginator(value: String): Self = StObject.set(x, "originator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: IncomingRequest | OutgoingRequest): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
  }
}
