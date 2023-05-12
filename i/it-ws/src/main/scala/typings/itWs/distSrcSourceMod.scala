package typings.itWs

import typings.std.AsyncGenerator
import typings.ws.mod.WebSocket
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcSourceMod {
  
  @JSImport("it-ws/dist/src/source", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(socket: WebSocket): ConnectedSource = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(socket.asInstanceOf[js.Any]).asInstanceOf[ConnectedSource]
  
  @js.native
  trait ConnectedSource
    extends StObject
       with AsyncGenerator[js.typedarray.Uint8Array, Any, Any] {
    
    def connected(): js.Promise[Unit] = js.native
  }
}
