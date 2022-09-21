package typings.jssip.uAMod

import typings.jssip.sipmessageMod.IncomingResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RegisteredEvent extends StObject {
  
  var response: IncomingResponse
}
object RegisteredEvent {
  
  inline def apply(response: IncomingResponse): RegisteredEvent = {
    val __obj = js.Dynamic.literal(response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegisteredEvent]
  }
  
  extension [Self <: RegisteredEvent](x: Self) {
    
    inline def setResponse(value: IncomingResponse): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
