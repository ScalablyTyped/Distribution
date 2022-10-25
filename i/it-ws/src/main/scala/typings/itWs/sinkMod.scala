package typings.itWs

import typings.itStreamTypes.mod.Sink
import typings.itWs.distSrcSinkMod.SinkOptions
import typings.ws.mod.WebSocket
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* from `exports` in `package.json` */
object sinkMod {
  
  @JSImport("it-ws/sink", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(socket: WebSocket, options: SinkOptions): Sink[js.typedarray.Uint8Array, js.Promise[Unit]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(socket.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Sink[js.typedarray.Uint8Array, js.Promise[Unit]]]
}
