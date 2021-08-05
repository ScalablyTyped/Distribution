package typings.jssip.mod

import typings.jssip.mod.RTCSession.DTMF
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SessionNewDtmfEvent extends StObject {
  
  var dtmf: DTMF
  
  var originator: String
  
  var request: IncomingRequest | OutgoingRequest
}
object SessionNewDtmfEvent {
  
  inline def apply(dtmf: DTMF, originator: String, request: IncomingRequest | OutgoingRequest): SessionNewDtmfEvent = {
    val __obj = js.Dynamic.literal(dtmf = dtmf.asInstanceOf[js.Any], originator = originator.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any])
    __obj.asInstanceOf[SessionNewDtmfEvent]
  }
  
  extension [Self <: SessionNewDtmfEvent](x: Self) {
    
    inline def setDtmf(value: DTMF): Self = StObject.set(x, "dtmf", value.asInstanceOf[js.Any])
    
    inline def setOriginator(value: String): Self = StObject.set(x, "originator", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: IncomingRequest | OutgoingRequest): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
  }
}
