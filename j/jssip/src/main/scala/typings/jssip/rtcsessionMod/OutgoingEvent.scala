package typings.jssip.rtcsessionMod

import typings.jssip.rtcsessionMod.Originator.REMOTE
import typings.jssip.sipmessageMod.IncomingResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OutgoingEvent extends StObject {
  
  var originator: REMOTE
  
  var response: IncomingResponse
}
object OutgoingEvent {
  
  inline def apply(originator: REMOTE, response: IncomingResponse): OutgoingEvent = {
    val __obj = js.Dynamic.literal(originator = originator.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[OutgoingEvent]
  }
  
  extension [Self <: OutgoingEvent](x: Self) {
    
    inline def setOriginator(value: REMOTE): Self = StObject.set(x, "originator", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: IncomingResponse): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
