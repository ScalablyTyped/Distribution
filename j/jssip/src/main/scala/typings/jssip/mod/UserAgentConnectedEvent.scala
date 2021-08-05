package typings.jssip.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UserAgentConnectedEvent extends StObject {
  
  var socket: Socket
}
object UserAgentConnectedEvent {
  
  inline def apply(socket: Socket): UserAgentConnectedEvent = {
    val __obj = js.Dynamic.literal(socket = socket.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserAgentConnectedEvent]
  }
  
  extension [Self <: UserAgentConnectedEvent](x: Self) {
    
    inline def setSocket(value: Socket): Self = StObject.set(x, "socket", value.asInstanceOf[js.Any])
  }
}
