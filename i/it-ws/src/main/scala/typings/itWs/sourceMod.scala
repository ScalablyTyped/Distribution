package typings.itWs

import typings.itWs.distSrcSourceMod.ConnectedSource
import typings.ws.mod.WebSocket
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* from `exports` in `package.json` */
object sourceMod {
  
  @JSImport("it-ws/source", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(socket: WebSocket): ConnectedSource = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(socket.asInstanceOf[js.Any]).asInstanceOf[ConnectedSource]
}
