package typings.jssip.libRtcsessionMod

import typings.jssip.libRtcsessionMod.Originator.REMOTE
import typings.jssip.libSipmessageMod.IncomingRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IncomingDTMFEvent extends StObject {
  
  var dtmf: DTMF
  
  var originator: REMOTE
  
  var request: IncomingRequest
}
object IncomingDTMFEvent {
  
  inline def apply(dtmf: DTMF, originator: REMOTE, request: IncomingRequest): IncomingDTMFEvent = {
    val __obj = js.Dynamic.literal(dtmf = dtmf.asInstanceOf[js.Any], originator = originator.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any])
    __obj.asInstanceOf[IncomingDTMFEvent]
  }
  
  extension [Self <: IncomingDTMFEvent](x: Self) {
    
    inline def setDtmf(value: DTMF): Self = StObject.set(x, "dtmf", value.asInstanceOf[js.Any])
    
    inline def setOriginator(value: REMOTE): Self = StObject.set(x, "originator", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: IncomingRequest): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
  }
}
