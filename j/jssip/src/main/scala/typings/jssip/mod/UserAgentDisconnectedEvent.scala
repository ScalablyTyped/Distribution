package typings.jssip.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UserAgentDisconnectedEvent extends StObject {
  
  var code: Double
  
  var error: Boolean
  
  var reason: String
  
  var socket: Socket
}
object UserAgentDisconnectedEvent {
  
  @scala.inline
  def apply(code: Double, error: Boolean, reason: String, socket: Socket): UserAgentDisconnectedEvent = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], socket = socket.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserAgentDisconnectedEvent]
  }
  
  @scala.inline
  implicit class UserAgentDisconnectedEventMutableBuilder[Self <: UserAgentDisconnectedEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setError(value: Boolean): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSocket(value: Socket): Self = StObject.set(x, "socket", value.asInstanceOf[js.Any])
  }
}
