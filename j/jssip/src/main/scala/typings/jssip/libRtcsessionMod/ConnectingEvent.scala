package typings.jssip.libRtcsessionMod

import typings.jssip.libSipmessageMod.IncomingRequest
import typings.jssip.libSipmessageMod.OutgoingRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConnectingEvent extends StObject {
  
  var request: IncomingRequest | OutgoingRequest
}
object ConnectingEvent {
  
  inline def apply(request: IncomingRequest | OutgoingRequest): ConnectingEvent = {
    val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectingEvent]
  }
  
  extension [Self <: ConnectingEvent](x: Self) {
    
    inline def setRequest(value: IncomingRequest | OutgoingRequest): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
  }
}
