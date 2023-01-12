package typings.jssip.libUAMod

import typings.jssip.libRtcsessionMod.Originator.REMOTE
import typings.jssip.libSipmessageMod.IncomingRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IncomingOptionsEvent extends StObject {
  
  var originator: REMOTE
  
  var request: IncomingRequest
}
object IncomingOptionsEvent {
  
  inline def apply(originator: REMOTE, request: IncomingRequest): IncomingOptionsEvent = {
    val __obj = js.Dynamic.literal(originator = originator.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any])
    __obj.asInstanceOf[IncomingOptionsEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IncomingOptionsEvent] (val x: Self) extends AnyVal {
    
    inline def setOriginator(value: REMOTE): Self = StObject.set(x, "originator", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: IncomingRequest): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
  }
}
