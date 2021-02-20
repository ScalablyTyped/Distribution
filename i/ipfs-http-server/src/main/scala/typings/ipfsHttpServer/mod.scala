package typings.ipfsHttpServer

import typings.ipfsHttpServer.anon.DebuggererrorDebugger
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("ipfs-http-server/dist/src", JSImport.Namespace)
  @js.native
  class ^ protected () extends HttpApi {
    def this(ipfs: js.Any) = this()
    def this(ipfs: js.Any, options: js.Object) = this()
  }
  
  @js.native
  trait HttpApi extends StObject {
    
    var _apiServers: js.UndefOr[js.Array[_]] = js.native
    
    def _createApiServer(host: js.Any, port: js.Any, ipfs: js.Any, cors: js.Any): js.Promise[_] = js.native
    
    var _ipfs: js.Any = js.native
    
    def _log(formatter: js.Any, args: js.Any*): Unit = js.native
    @JSName("_log")
    var _log_Original: DebuggererrorDebugger = js.native
    
    def apiAddr: typings.multiaddr.mod.^ = js.native
    
    /**
      * Starts the IPFS HTTP server
      *
      * @returns {Promise<HttpApi>}
      */
    def start(): js.Promise[HttpApi] = js.native
    
    def stop(): js.Promise[HttpApi] = js.native
  }
}
