package typings.ipfsHttpGateway

import typings.ipfsHttpGateway.anon.DebuggererrorDebugger
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("ipfs-http-gateway/dist/src", JSImport.Namespace)
  @js.native
  class ^ protected () extends HttpGateway {
    def this(ipfs: js.Any) = this()
    def this(ipfs: js.Any, options: js.Object) = this()
  }
  
  @js.native
  trait HttpGateway extends StObject {
    
    def _createGatewayServer(host: js.Any, port: js.Any, ipfs: js.Any): js.Promise[_] = js.native
    
    var _gatewayServers: js.UndefOr[js.Array[_]] = js.native
    
    var _ipfs: js.Any = js.native
    
    def _log(formatter: js.Any, args: js.Any*): Unit = js.native
    @JSName("_log")
    var _log_Original: DebuggererrorDebugger = js.native
    
    def start(): js.Promise[HttpGateway] = js.native
    
    def stop(): js.Promise[HttpGateway] = js.native
  }
}
