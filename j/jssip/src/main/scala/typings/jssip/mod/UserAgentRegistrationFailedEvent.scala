package typings.jssip.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UserAgentRegistrationFailedEvent extends StObject {
  
  var cause: js.UndefOr[String] = js.native
  
  var response: IncomingResponse = js.native
}
object UserAgentRegistrationFailedEvent {
  
  @scala.inline
  def apply(response: IncomingResponse): UserAgentRegistrationFailedEvent = {
    val __obj = js.Dynamic.literal(response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserAgentRegistrationFailedEvent]
  }
  
  @scala.inline
  implicit class UserAgentRegistrationFailedEventMutableBuilder[Self <: UserAgentRegistrationFailedEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCause(value: String): Self = StObject.set(x, "cause", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCauseUndefined: Self = StObject.set(x, "cause", js.undefined)
    
    @scala.inline
    def setResponse(value: IncomingResponse): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
