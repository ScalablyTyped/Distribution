package typings.jssip.uAMod

import typings.jssip.constantsMod.causes
import typings.jssip.sipmessageMod.IncomingResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UnRegisteredEvent extends StObject {
  
  var cause: js.UndefOr[causes] = js.undefined
  
  var response: IncomingResponse
}
object UnRegisteredEvent {
  
  inline def apply(response: IncomingResponse): UnRegisteredEvent = {
    val __obj = js.Dynamic.literal(response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnRegisteredEvent]
  }
  
  extension [Self <: UnRegisteredEvent](x: Self) {
    
    inline def setCause(value: causes): Self = StObject.set(x, "cause", value.asInstanceOf[js.Any])
    
    inline def setCauseUndefined: Self = StObject.set(x, "cause", js.undefined)
    
    inline def setResponse(value: IncomingResponse): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
