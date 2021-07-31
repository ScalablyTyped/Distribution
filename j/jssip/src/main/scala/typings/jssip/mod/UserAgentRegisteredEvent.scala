package typings.jssip.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UserAgentRegisteredEvent extends StObject {
  
  var response: IncomingResponse
}
object UserAgentRegisteredEvent {
  
  @scala.inline
  def apply(response: IncomingResponse): UserAgentRegisteredEvent = {
    val __obj = js.Dynamic.literal(response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserAgentRegisteredEvent]
  }
  
  @scala.inline
  implicit class UserAgentRegisteredEventMutableBuilder[Self <: UserAgentRegisteredEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResponse(value: IncomingResponse): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
