package typings.jssip.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UserAgentNewRtcSessionEvent extends StObject {
  
  var originator: String
  
  var request: IncomingRequest | OutgoingRequest
  
  var session: RTCSession
}
object UserAgentNewRtcSessionEvent {
  
  inline def apply(originator: String, request: IncomingRequest | OutgoingRequest, session: RTCSession): UserAgentNewRtcSessionEvent = {
    val __obj = js.Dynamic.literal(originator = originator.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], session = session.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserAgentNewRtcSessionEvent]
  }
  
  extension [Self <: UserAgentNewRtcSessionEvent](x: Self) {
    
    inline def setOriginator(value: String): Self = StObject.set(x, "originator", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: IncomingRequest | OutgoingRequest): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setSession(value: RTCSession): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
  }
}
