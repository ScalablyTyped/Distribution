package typings.jssip.libUAMod

import typings.jssip.libSipmessageMod.IncomingResponse
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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RegisteredEvent] (val x: Self) extends AnyVal {
    
    inline def setResponse(value: IncomingResponse): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
