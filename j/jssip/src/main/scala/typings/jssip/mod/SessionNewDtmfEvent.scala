package typings.jssip.mod

import typings.jssip.mod.RTCSession.DTMF
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SessionNewDtmfEvent extends StObject {
  
  var dtmf: DTMF = js.native
  
  var originator: String = js.native
  
  var request: IncomingRequest | OutgoingRequest = js.native
}
object SessionNewDtmfEvent {
  
  @scala.inline
  def apply(dtmf: DTMF, originator: String, request: IncomingRequest | OutgoingRequest): SessionNewDtmfEvent = {
    val __obj = js.Dynamic.literal(dtmf = dtmf.asInstanceOf[js.Any], originator = originator.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any])
    __obj.asInstanceOf[SessionNewDtmfEvent]
  }
  
  @scala.inline
  implicit class SessionNewDtmfEventMutableBuilder[Self <: SessionNewDtmfEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDtmf(value: DTMF): Self = StObject.set(x, "dtmf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginator(value: String): Self = StObject.set(x, "originator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: IncomingRequest | OutgoingRequest): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
  }
}
