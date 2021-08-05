package typings.jssip.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UserAgentRegistrationFailedEvent extends StObject {
  
  var cause: js.UndefOr[String] = js.undefined
  
  var response: IncomingResponse
}
object UserAgentRegistrationFailedEvent {
  
  inline def apply(response: IncomingResponse): UserAgentRegistrationFailedEvent = {
    val __obj = js.Dynamic.literal(response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserAgentRegistrationFailedEvent]
  }
  
  extension [Self <: UserAgentRegistrationFailedEvent](x: Self) {
    
    inline def setCause(value: String): Self = StObject.set(x, "cause", value.asInstanceOf[js.Any])
    
    inline def setCauseUndefined: Self = StObject.set(x, "cause", js.undefined)
    
    inline def setResponse(value: IncomingResponse): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
