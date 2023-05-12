package typings.ipfsHttpServer

import typings.hapiHapi.libTypesServerServerMod.ServerApplicationState
import typings.ipfsHttpServer.distSrcTypesMod.Server
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcErrorHandlerMod {
  
  @JSImport("ipfs-http-server/dist/src/error-handler", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def errorHandler(server: Server[ServerApplicationState]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("errorHandler")(server.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
