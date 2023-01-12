package typings.matrixAppserviceBridge

import typings.matrixAppserviceBridge.anon.Axios
import typings.matrixAppserviceBridge.anon.HostHeader
import typings.node.dnsMod.SrvRecord
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilsMatrixHostResolverMod {
  
  @JSImport("matrix-appservice-bridge/lib/utils/matrix-host-resolver", "DefaultCacheForMs")
  @js.native
  val DefaultCacheForMs: Double = js.native
  
  @JSImport("matrix-appservice-bridge/lib/utils/matrix-host-resolver", "MatrixHostResolver")
  @js.native
  open class MatrixHostResolver () extends StObject {
    def this(opts: Axios) = this()
    
    /* private */ var axios: Any = js.native
    
    def currentTime: Double = js.native
    
    /* private */ var dns: Any = js.native
    
    /* private */ var getWellKnown: Any = js.native
    
    /* private */ val opts: Any = js.native
    
    /**
      * Resolves a Matrix serverName into the baseURL for federated requests, and the
      * `Host` header to use when serving requests.
      *
      * Results are cached by default. Please note that failures are cached, determined by
      * the constant `CacheFailureForMS`.
      * @param hostname The Matrix `hostname` to resolve. e.g. `matrix.org`
      * @param skipCache Should the request be executed regardless of the cached value? Existing cached values will
      *                 be overwritten.
      * @returns The baseurl of the Matrix server (excluding /_matrix/federation suffix), and the hostHeader to be used.
      */
    def resolveMatrixServer(hostname: String): js.Promise[HostHeader] = js.native
    def resolveMatrixServer(hostname: String, skipCache: Boolean): js.Promise[HostHeader] = js.native
    
    /**
      * Resolves a Matrix serverName, fetching any delegated information.
      * This request is NOT cached. For general use, please use `resolveMatrixServer`.
      * @param hostname The Matrix `hostname` to resolve. e.g. `matrix.org`
      * @returns An object describing the delegated details for the host.
      */
    def resolveMatrixServerName(hostname: String): js.Promise[HostResolveResult] = js.native
    
    /* private */ var resultCache: Any = js.native
  }
  /* static members */
  object MatrixHostResolver {
    
    @JSImport("matrix-appservice-bridge/lib/utils/matrix-host-resolver", "MatrixHostResolver")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("matrix-appservice-bridge/lib/utils/matrix-host-resolver", "MatrixHostResolver.determineHostType")
    @js.native
    def determineHostType: Any = js.native
    inline def determineHostType_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("determineHostType")(x.asInstanceOf[js.Any])
    
    @JSImport("matrix-appservice-bridge/lib/utils/matrix-host-resolver", "MatrixHostResolver.sortSrvRecords")
    @js.native
    def sortSrvRecords: Any = js.native
    inline def sortSrvRecords_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sortSrvRecords")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("matrix-appservice-bridge/lib/utils/matrix-host-resolver", "MaxCacheForMs")
  @js.native
  val MaxCacheForMs: Double = js.native
  
  @JSImport("matrix-appservice-bridge/lib/utils/matrix-host-resolver", "MinCacheForMs")
  @js.native
  val MinCacheForMs: Double = js.native
  
  trait DnsInterface extends StObject {
    
    def resolveSrv(hostname: String): js.Promise[js.Array[SrvRecord]]
  }
  object DnsInterface {
    
    inline def apply(resolveSrv: String => js.Promise[js.Array[SrvRecord]]): DnsInterface = {
      val __obj = js.Dynamic.literal(resolveSrv = js.Any.fromFunction1(resolveSrv))
      __obj.asInstanceOf[DnsInterface]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DnsInterface] (val x: Self) extends AnyVal {
      
      inline def setResolveSrv(value: String => js.Promise[js.Array[SrvRecord]]): Self = StObject.set(x, "resolveSrv", js.Any.fromFunction1(value))
    }
  }
  
  trait HostResolveResult extends StObject {
    
    var cacheFor: Double
    
    var host: String
    
    var hostname: String
    
    var port: Double
  }
  object HostResolveResult {
    
    inline def apply(cacheFor: Double, host: String, hostname: String, port: Double): HostResolveResult = {
      val __obj = js.Dynamic.literal(cacheFor = cacheFor.asInstanceOf[js.Any], host = host.asInstanceOf[js.Any], hostname = hostname.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any])
      __obj.asInstanceOf[HostResolveResult]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HostResolveResult] (val x: Self) extends AnyVal {
      
      inline def setCacheFor(value: Double): Self = StObject.set(x, "cacheFor", value.asInstanceOf[js.Any])
      
      inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setHostname(value: String): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
      
      inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    }
  }
}
