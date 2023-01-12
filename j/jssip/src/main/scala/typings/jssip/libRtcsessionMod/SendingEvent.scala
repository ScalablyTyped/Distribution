package typings.jssip.libRtcsessionMod

import typings.jssip.libSipmessageMod.OutgoingRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SendingEvent extends StObject {
  
  var request: OutgoingRequest
}
object SendingEvent {
  
  inline def apply(request: OutgoingRequest): SendingEvent = {
    val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendingEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SendingEvent] (val x: Self) extends AnyVal {
    
    inline def setRequest(value: OutgoingRequest): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
  }
}
