package typings.jssip.libRtcsessionMod

import typings.jssip.libRtcsessionMod.Originator.LOCAL
import typings.jssip.libSipmessageMod.OutgoingRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OutgoingInfoEvent extends StObject {
  
  var info: Info
  
  var originator: LOCAL
  
  var request: OutgoingRequest
}
object OutgoingInfoEvent {
  
  inline def apply(info: Info, originator: LOCAL, request: OutgoingRequest): OutgoingInfoEvent = {
    val __obj = js.Dynamic.literal(info = info.asInstanceOf[js.Any], originator = originator.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any])
    __obj.asInstanceOf[OutgoingInfoEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OutgoingInfoEvent] (val x: Self) extends AnyVal {
    
    inline def setInfo(value: Info): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
    
    inline def setOriginator(value: LOCAL): Self = StObject.set(x, "originator", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: OutgoingRequest): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
  }
}
