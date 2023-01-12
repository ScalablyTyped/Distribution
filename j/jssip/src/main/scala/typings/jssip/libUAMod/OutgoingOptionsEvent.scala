package typings.jssip.libUAMod

import typings.jssip.libRtcsessionMod.Originator.LOCAL
import typings.jssip.libSipmessageMod.OutgoingRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OutgoingOptionsEvent extends StObject {
  
  var originator: LOCAL
  
  var request: OutgoingRequest
}
object OutgoingOptionsEvent {
  
  inline def apply(originator: LOCAL, request: OutgoingRequest): OutgoingOptionsEvent = {
    val __obj = js.Dynamic.literal(originator = originator.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any])
    __obj.asInstanceOf[OutgoingOptionsEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OutgoingOptionsEvent] (val x: Self) extends AnyVal {
    
    inline def setOriginator(value: LOCAL): Self = StObject.set(x, "originator", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: OutgoingRequest): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
  }
}
