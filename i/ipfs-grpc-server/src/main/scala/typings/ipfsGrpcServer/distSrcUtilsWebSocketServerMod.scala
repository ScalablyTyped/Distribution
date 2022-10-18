package typings.ipfsGrpcServer

import typings.ipfsCoreTypes.mod.IPFS
import typings.ipfsGrpcServer.distSrcTypesMod.WebsocketServer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcUtilsWebSocketServerMod {
  
  @JSImport("ipfs-grpc-server/dist/src/utils/web-socket-server", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def webSocketServer(ipfs: IPFS[js.Object]): js.Promise[WebsocketServer] = ^.asInstanceOf[js.Dynamic].applyDynamic("webSocketServer")(ipfs.asInstanceOf[js.Any]).asInstanceOf[js.Promise[WebsocketServer]]
  inline def webSocketServer(ipfs: IPFS[js.Object], options: Any): js.Promise[WebsocketServer] = (^.asInstanceOf[js.Dynamic].applyDynamic("webSocketServer")(ipfs.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[WebsocketServer]]
}
