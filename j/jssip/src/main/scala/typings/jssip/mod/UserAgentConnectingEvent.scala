package typings.jssip.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UserAgentConnectingEvent extends StObject {
  
  var attempts: Double = js.native
  
  var socket: Socket = js.native
}
object UserAgentConnectingEvent {
  
  @scala.inline
  def apply(attempts: Double, socket: Socket): UserAgentConnectingEvent = {
    val __obj = js.Dynamic.literal(attempts = attempts.asInstanceOf[js.Any], socket = socket.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserAgentConnectingEvent]
  }
  
  @scala.inline
  implicit class UserAgentConnectingEventMutableBuilder[Self <: UserAgentConnectingEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttempts(value: Double): Self = StObject.set(x, "attempts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSocket(value: Socket): Self = StObject.set(x, "socket", value.asInstanceOf[js.Any])
  }
}
