package typings.jssip.libUAMod

import typings.jssip.libRtcsessionMod.Originator.LOCAL
import typings.jssip.libRtcsessionMod.RTCSession
import typings.jssip.libSipmessageMod.IncomingRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OutgoingRTCSessionEvent
  extends StObject
     with RTCSessionEvent {
  
  var originator: LOCAL
  
  var request: IncomingRequest
  
  var session: RTCSession
}
object OutgoingRTCSessionEvent {
  
  inline def apply(originator: LOCAL, request: IncomingRequest, session: RTCSession): OutgoingRTCSessionEvent = {
    val __obj = js.Dynamic.literal(originator = originator.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], session = session.asInstanceOf[js.Any])
    __obj.asInstanceOf[OutgoingRTCSessionEvent]
  }
  
  extension [Self <: OutgoingRTCSessionEvent](x: Self) {
    
    inline def setOriginator(value: LOCAL): Self = StObject.set(x, "originator", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: IncomingRequest): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setSession(value: RTCSession): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
  }
}
