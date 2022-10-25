package typings.itWs

import typings.itWs.distSrcClientMod.WebSocketOptions
import typings.itWs.distSrcDuplexMod.DuplexWebSocket
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* from `exports` in `package.json` */
object clientMod {
  
  @JSImport("it-ws/client", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def connect(addr: String): DuplexWebSocket = ^.asInstanceOf[js.Dynamic].applyDynamic("connect")(addr.asInstanceOf[js.Any]).asInstanceOf[DuplexWebSocket]
  inline def connect(addr: String, opts: WebSocketOptions): DuplexWebSocket = (^.asInstanceOf[js.Dynamic].applyDynamic("connect")(addr.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[DuplexWebSocket]
}
