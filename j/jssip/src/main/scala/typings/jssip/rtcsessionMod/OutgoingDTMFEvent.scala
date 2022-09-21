package typings.jssip.rtcsessionMod

import typings.jssip.rtcsessionMod.Originator.LOCAL
import typings.jssip.sipmessageMod.OutgoingRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OutgoingDTMFEvent extends StObject {
  
  var dtmf: DTMF
  
  var originator: LOCAL
  
  var request: OutgoingRequest
}
object OutgoingDTMFEvent {
  
  inline def apply(dtmf: DTMF, originator: LOCAL, request: OutgoingRequest): OutgoingDTMFEvent = {
    val __obj = js.Dynamic.literal(dtmf = dtmf.asInstanceOf[js.Any], originator = originator.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any])
    __obj.asInstanceOf[OutgoingDTMFEvent]
  }
  
  extension [Self <: OutgoingDTMFEvent](x: Self) {
    
    inline def setDtmf(value: DTMF): Self = StObject.set(x, "dtmf", value.asInstanceOf[js.Any])
    
    inline def setOriginator(value: LOCAL): Self = StObject.set(x, "originator", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: OutgoingRequest): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
  }
}
