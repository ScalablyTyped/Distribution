package typings.itWs

import typings.itWs.distSrcServerMod.ServerOptions
import typings.itWs.distSrcServerMod.WebSocketServer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* from `exports` in `package.json` */
object serverMod {
  
  @JSImport("it-ws/server", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createServer(): WebSocketServer = ^.asInstanceOf[js.Dynamic].applyDynamic("createServer")().asInstanceOf[WebSocketServer]
  inline def createServer(opts: ServerOptions): WebSocketServer = ^.asInstanceOf[js.Dynamic].applyDynamic("createServer")(opts.asInstanceOf[js.Any]).asInstanceOf[WebSocketServer]
}
