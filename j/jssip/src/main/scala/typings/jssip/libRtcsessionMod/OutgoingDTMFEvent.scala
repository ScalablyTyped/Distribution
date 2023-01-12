package typings.jssip.libRtcsessionMod

import typings.jssip.libRtcsessionMod.Originator.LOCAL
import typings.jssip.libSipmessageMod.OutgoingRequest
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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OutgoingDTMFEvent] (val x: Self) extends AnyVal {
    
    inline def setDtmf(value: DTMF): Self = StObject.set(x, "dtmf", value.asInstanceOf[js.Any])
    
    inline def setOriginator(value: LOCAL): Self = StObject.set(x, "originator", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: OutgoingRequest): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
  }
}
