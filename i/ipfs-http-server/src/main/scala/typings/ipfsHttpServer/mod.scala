package typings.ipfsHttpServer

import typings.hapiHapi.mod.Server_
import typings.libp2p.mod.Libp2p
import typings.libp2pLogger.mod.Logger_
import typings.multiformatsMultiaddr.mod.Multiaddr_
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("ipfs-http-server", "HttpApi")
  @js.native
  open class HttpApi protected () extends StObject {
    /**
      * @param {IPFS} ipfs
      */
    def this(ipfs: IPFS) = this()
    
    /** @type {Server[]} */
    var _apiServers: js.Array[Server] = js.native
    
    /**
      * @param {string} host
      * @param {string} port
      * @param {IPFS} ipfs
      * @param {Record<string, any>} cors
      */
    def _createApiServer(host: String, port: String, ipfs: IPFS, cors: Record[String, Any]): js.Promise[Server_] = js.native
    
    var _ipfs: typings.ipfsCoreTypes.mod.IPFS[Any] = js.native
    
    def _log(formatter: Any, args: Any*): Unit = js.native
    @JSName("_log")
    var _log_Original: Logger_ = js.native
    
    def apiAddr: Multiaddr_ = js.native
    
    /**
      * Starts the IPFS HTTP server
      */
    def start(): js.Promise[Unit] = js.native
    
    def stop(): js.Promise[Unit] = js.native
  }
  
  type IPFS = typings.ipfsCoreTypes.mod.IPFS[js.Object]
  
  type Server = typings.ipfsHttpServer.distSrcTypesMod.Server
  
  type libp2p = Libp2p
}
