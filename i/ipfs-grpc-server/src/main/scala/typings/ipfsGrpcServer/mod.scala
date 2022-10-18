package typings.ipfsGrpcServer

import typings.ipfsCoreTypes.mod.IPFS
import typings.ipfsGrpcServer.distSrcTypesMod.Options
import typings.ipfsGrpcServer.distSrcTypesMod.WebsocketServer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("ipfs-grpc-server", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createServer(ipfs: IPFS[js.Object]): js.Promise[WebsocketServer] = ^.asInstanceOf[js.Dynamic].applyDynamic("createServer")(ipfs.asInstanceOf[js.Any]).asInstanceOf[js.Promise[WebsocketServer]]
  inline def createServer(ipfs: IPFS[js.Object], options: Options): js.Promise[WebsocketServer] = (^.asInstanceOf[js.Dynamic].applyDynamic("createServer")(ipfs.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[WebsocketServer]]
}
