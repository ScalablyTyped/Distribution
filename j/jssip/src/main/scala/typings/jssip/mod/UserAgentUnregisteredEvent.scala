package typings.jssip.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UserAgentUnregisteredEvent extends StObject {
  
  var cause: js.UndefOr[String] = js.undefined
  
  var response: IncomingResponse
}
object UserAgentUnregisteredEvent {
  
  inline def apply(response: IncomingResponse): UserAgentUnregisteredEvent = {
    val __obj = js.Dynamic.literal(response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserAgentUnregisteredEvent]
  }
  
  extension [Self <: UserAgentUnregisteredEvent](x: Self) {
    
    inline def setCause(value: String): Self = StObject.set(x, "cause", value.asInstanceOf[js.Any])
    
    inline def setCauseUndefined: Self = StObject.set(x, "cause", js.undefined)
    
    inline def setResponse(value: IncomingResponse): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
