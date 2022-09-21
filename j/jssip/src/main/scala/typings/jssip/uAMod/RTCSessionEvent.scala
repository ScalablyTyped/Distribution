package typings.jssip.uAMod

import typings.jssip.rtcsessionMod.Originator.LOCAL
import typings.jssip.rtcsessionMod.Originator.REMOTE
import typings.jssip.rtcsessionMod.RTCSession
import typings.jssip.sipmessageMod.IncomingRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.jssip.uAMod.IncomingRTCSessionEvent
  - typings.jssip.uAMod.OutgoingRTCSessionEvent
*/
trait RTCSessionEvent extends StObject
object RTCSessionEvent {
  
  inline def IncomingRTCSessionEvent(originator: REMOTE, request: IncomingRequest, session: RTCSession): typings.jssip.uAMod.IncomingRTCSessionEvent = {
    val __obj = js.Dynamic.literal(originator = originator.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], session = session.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.jssip.uAMod.IncomingRTCSessionEvent]
  }
  
  inline def OutgoingRTCSessionEvent(originator: LOCAL, request: IncomingRequest, session: RTCSession): typings.jssip.uAMod.OutgoingRTCSessionEvent = {
    val __obj = js.Dynamic.literal(originator = originator.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], session = session.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.jssip.uAMod.OutgoingRTCSessionEvent]
  }
}
