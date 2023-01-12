package typings.jssip.libUAMod

import typings.jssip.libWebSocketInterfaceMod.Socket
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConnectedEvent extends StObject {
  
  var socket: Socket
}
object ConnectedEvent {
  
  inline def apply(socket: Socket): ConnectedEvent = {
    val __obj = js.Dynamic.literal(socket = socket.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectedEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ConnectedEvent] (val x: Self) extends AnyVal {
    
    inline def setSocket(value: Socket): Self = StObject.set(x, "socket", value.asInstanceOf[js.Any])
  }
}
