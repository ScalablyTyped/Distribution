package typings.itWs

import typings.itWs.distSrcDuplexMod.DuplexWebSocket
import typings.itWs.distSrcDuplexMod.DuplexWebSocketOptions
import typings.ws.mod.WebSocket
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* from `exports` in `package.json` */
object duplexMod {
  
  @JSImport("it-ws/duplex", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(socket: WebSocket): DuplexWebSocket = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(socket.asInstanceOf[js.Any]).asInstanceOf[DuplexWebSocket]
  inline def default(socket: WebSocket, options: DuplexWebSocketOptions): DuplexWebSocket = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(socket.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[DuplexWebSocket]
}
