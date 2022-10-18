package typings.jssip.libUAMod

import typings.jssip.libRtcsessionMod.Originator.LOCAL
import typings.jssip.libRtcsessionMod.Originator.REMOTE
import typings.jssip.libRtcsessionMod.RTCSession
import typings.jssip.libSipmessageMod.IncomingRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.jssip.libUAMod.IncomingRTCSessionEvent
  - typings.jssip.libUAMod.OutgoingRTCSessionEvent
*/
trait RTCSessionEvent extends StObject
object RTCSessionEvent {
  
  inline def IncomingRTCSessionEvent(originator: REMOTE, request: IncomingRequest, session: RTCSession): typings.jssip.libUAMod.IncomingRTCSessionEvent = {
    val __obj = js.Dynamic.literal(originator = originator.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], session = session.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.jssip.libUAMod.IncomingRTCSessionEvent]
  }
  
  inline def OutgoingRTCSessionEvent(originator: LOCAL, request: IncomingRequest, session: RTCSession): typings.jssip.libUAMod.OutgoingRTCSessionEvent = {
    val __obj = js.Dynamic.literal(originator = originator.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], session = session.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.jssip.libUAMod.OutgoingRTCSessionEvent]
  }
}
