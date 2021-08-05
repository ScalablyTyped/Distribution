package typings.ipfsHttpGateway

import typings.ipfsHttpGateway.anon.DebuggererrorDebugger
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("ipfs-http-gateway/dist/src", JSImport.Namespace)
  @js.native
  class ^ protected ()
    extends StObject
       with HttpGateway {
    def this(ipfs: js.Any) = this()
    def this(ipfs: js.Any, options: js.Object) = this()
    
    /* CompleteClass */
    override def _createGatewayServer(host: js.Any, port: js.Any, ipfs: js.Any): js.Promise[js.Any] = js.native
    
    /* CompleteClass */
    var _ipfs: js.Any = js.native
    
    /* CompleteClass */
    override def _log(formatter: js.Any, args: js.Any*): Unit = js.native
    /* CompleteClass */
    @JSName("_log")
    var _log_Original: DebuggererrorDebugger = js.native
    
    /* CompleteClass */
    override def start(): js.Promise[HttpGateway] = js.native
    
    /* CompleteClass */
    override def stop(): js.Promise[HttpGateway] = js.native
  }
  
  trait HttpGateway extends StObject {
    
    def _createGatewayServer(host: js.Any, port: js.Any, ipfs: js.Any): js.Promise[js.Any]
    
    var _gatewayServers: js.UndefOr[js.Array[js.Any]] = js.undefined
    
    var _ipfs: js.Any
    
    def _log(formatter: js.Any, args: js.Any*): Unit
    @JSName("_log")
    var _log_Original: DebuggererrorDebugger
    
    def start(): js.Promise[HttpGateway]
    
    def stop(): js.Promise[HttpGateway]
  }
  object HttpGateway {
    
    inline def apply(
      _createGatewayServer: (js.Any, js.Any, js.Any) => js.Promise[js.Any],
      _ipfs: js.Any,
      _log: DebuggererrorDebugger,
      start: () => js.Promise[HttpGateway],
      stop: () => js.Promise[HttpGateway]
    ): HttpGateway = {
      val __obj = js.Dynamic.literal(_createGatewayServer = js.Any.fromFunction3(_createGatewayServer), _ipfs = _ipfs.asInstanceOf[js.Any], _log = _log.asInstanceOf[js.Any], start = js.Any.fromFunction0(start), stop = js.Any.fromFunction0(stop))
      __obj.asInstanceOf[HttpGateway]
    }
    
    extension [Self <: HttpGateway](x: Self) {
      
      inline def setStart(value: () => js.Promise[HttpGateway]): Self = StObject.set(x, "start", js.Any.fromFunction0(value))
      
      inline def setStop(value: () => js.Promise[HttpGateway]): Self = StObject.set(x, "stop", js.Any.fromFunction0(value))
      
      inline def set_createGatewayServer(value: (js.Any, js.Any, js.Any) => js.Promise[js.Any]): Self = StObject.set(x, "_createGatewayServer", js.Any.fromFunction3(value))
      
      inline def set_gatewayServers(value: js.Array[js.Any]): Self = StObject.set(x, "_gatewayServers", value.asInstanceOf[js.Any])
      
      inline def set_gatewayServersUndefined: Self = StObject.set(x, "_gatewayServers", js.undefined)
      
      inline def set_gatewayServersVarargs(value: js.Any*): Self = StObject.set(x, "_gatewayServers", js.Array(value :_*))
      
      inline def set_ipfs(value: js.Any): Self = StObject.set(x, "_ipfs", value.asInstanceOf[js.Any])
      
      inline def set_log(value: DebuggererrorDebugger): Self = StObject.set(x, "_log", value.asInstanceOf[js.Any])
    }
  }
}
