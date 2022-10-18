package typings.jssip.libUAMod

import typings.jssip.libRtcsessionMod.Originator.REMOTE
import typings.jssip.libRtcsessionMod.RTCSession
import typings.jssip.libSipmessageMod.IncomingRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IncomingRTCSessionEvent
  extends StObject
     with RTCSessionEvent {
  
  var originator: REMOTE
  
  var request: IncomingRequest
  
  var session: RTCSession
}
object IncomingRTCSessionEvent {
  
  inline def apply(originator: REMOTE, request: IncomingRequest, session: RTCSession): IncomingRTCSessionEvent = {
    val __obj = js.Dynamic.literal(originator = originator.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], session = session.asInstanceOf[js.Any])
    __obj.asInstanceOf[IncomingRTCSessionEvent]
  }
  
  extension [Self <: IncomingRTCSessionEvent](x: Self) {
    
    inline def setOriginator(value: REMOTE): Self = StObject.set(x, "originator", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: IncomingRequest): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setSession(value: RTCSession): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
  }
}
