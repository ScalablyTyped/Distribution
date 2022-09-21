package typings.jssip.rtcsessionMod

import typings.jssip.sipmessageMod.OutgoingRequest
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
  
  extension [Self <: SendingEvent](x: Self) {
    
    inline def setRequest(value: OutgoingRequest): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
  }
}
