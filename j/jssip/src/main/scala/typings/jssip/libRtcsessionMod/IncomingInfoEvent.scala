package typings.jssip.libRtcsessionMod

import typings.jssip.libRtcsessionMod.Originator.REMOTE
import typings.jssip.libSipmessageMod.IncomingRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IncomingInfoEvent extends StObject {
  
  var info: Info
  
  var originator: REMOTE
  
  var request: IncomingRequest
}
object IncomingInfoEvent {
  
  inline def apply(info: Info, originator: REMOTE, request: IncomingRequest): IncomingInfoEvent = {
    val __obj = js.Dynamic.literal(info = info.asInstanceOf[js.Any], originator = originator.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any])
    __obj.asInstanceOf[IncomingInfoEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IncomingInfoEvent] (val x: Self) extends AnyVal {
    
    inline def setInfo(value: Info): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
    
    inline def setOriginator(value: REMOTE): Self = StObject.set(x, "originator", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: IncomingRequest): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
  }
}
