package typings.jssip.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UserAgentNewMessageEvent extends StObject {
  
  var message: Message = js.native
  
  var originator: String = js.native
  
  var request: IncomingRequest | OutgoingRequest = js.native
}
object UserAgentNewMessageEvent {
  
  @scala.inline
  def apply(message: Message, originator: String, request: IncomingRequest | OutgoingRequest): UserAgentNewMessageEvent = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], originator = originator.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserAgentNewMessageEvent]
  }
  
  @scala.inline
  implicit class UserAgentNewMessageEventMutableBuilder[Self <: UserAgentNewMessageEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMessage(value: Message): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginator(value: String): Self = StObject.set(x, "originator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: IncomingRequest | OutgoingRequest): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
  }
}
