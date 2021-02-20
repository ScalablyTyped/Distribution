package typings.jssip.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UserAgentNewRtcSessionEvent extends StObject {
  
  var originator: String = js.native
  
  var request: IncomingRequest | OutgoingRequest = js.native
  
  var session: RTCSession = js.native
}
object UserAgentNewRtcSessionEvent {
  
  @scala.inline
  def apply(originator: String, request: IncomingRequest | OutgoingRequest, session: RTCSession): UserAgentNewRtcSessionEvent = {
    val __obj = js.Dynamic.literal(originator = originator.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], session = session.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserAgentNewRtcSessionEvent]
  }
  
  @scala.inline
  implicit class UserAgentNewRtcSessionEventMutableBuilder[Self <: UserAgentNewRtcSessionEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOriginator(value: String): Self = StObject.set(x, "originator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: IncomingRequest | OutgoingRequest): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSession(value: RTCSession): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
  }
}
