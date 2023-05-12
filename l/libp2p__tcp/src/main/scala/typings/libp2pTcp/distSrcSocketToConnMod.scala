package typings.libp2pTcp

import typings.libp2pInterfaceConnection.mod.MultiaddrConnection
import typings.libp2pInterfaceMetrics.mod.CounterGroup
import typings.multiformatsMultiaddr.mod.Multiaddr_
import typings.node.netMod.Socket
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcSocketToConnMod {
  
  @JSImport("@libp2p/tcp/dist/src/socket-to-conn", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def toMultiaddrConnection(socket: Socket, options: ToConnectionOptions): MultiaddrConnection = (^.asInstanceOf[js.Dynamic].applyDynamic("toMultiaddrConnection")(socket.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[MultiaddrConnection]
  
  trait ToConnectionOptions extends StObject {
    
    var listeningAddr: js.UndefOr[Multiaddr_] = js.undefined
    
    var localAddr: js.UndefOr[Multiaddr_] = js.undefined
    
    var metricPrefix: js.UndefOr[String] = js.undefined
    
    var metrics: js.UndefOr[CounterGroup] = js.undefined
    
    var remoteAddr: js.UndefOr[Multiaddr_] = js.undefined
    
    var socketCloseTimeout: js.UndefOr[Double] = js.undefined
    
    var socketInactivityTimeout: js.UndefOr[Double] = js.undefined
  }
  object ToConnectionOptions {
    
    inline def apply(): ToConnectionOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ToConnectionOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ToConnectionOptions] (val x: Self) extends AnyVal {
      
      inline def setListeningAddr(value: Multiaddr_): Self = StObject.set(x, "listeningAddr", value.asInstanceOf[js.Any])
      
      inline def setListeningAddrUndefined: Self = StObject.set(x, "listeningAddr", js.undefined)
      
      inline def setLocalAddr(value: Multiaddr_): Self = StObject.set(x, "localAddr", value.asInstanceOf[js.Any])
      
      inline def setLocalAddrUndefined: Self = StObject.set(x, "localAddr", js.undefined)
      
      inline def setMetricPrefix(value: String): Self = StObject.set(x, "metricPrefix", value.asInstanceOf[js.Any])
      
      inline def setMetricPrefixUndefined: Self = StObject.set(x, "metricPrefix", js.undefined)
      
      inline def setMetrics(value: CounterGroup): Self = StObject.set(x, "metrics", value.asInstanceOf[js.Any])
      
      inline def setMetricsUndefined: Self = StObject.set(x, "metrics", js.undefined)
      
      inline def setRemoteAddr(value: Multiaddr_): Self = StObject.set(x, "remoteAddr", value.asInstanceOf[js.Any])
      
      inline def setRemoteAddrUndefined: Self = StObject.set(x, "remoteAddr", js.undefined)
      
      inline def setSocketCloseTimeout(value: Double): Self = StObject.set(x, "socketCloseTimeout", value.asInstanceOf[js.Any])
      
      inline def setSocketCloseTimeoutUndefined: Self = StObject.set(x, "socketCloseTimeout", js.undefined)
      
      inline def setSocketInactivityTimeout(value: Double): Self = StObject.set(x, "socketInactivityTimeout", value.asInstanceOf[js.Any])
      
      inline def setSocketInactivityTimeoutUndefined: Self = StObject.set(x, "socketInactivityTimeout", js.undefined)
    }
  }
}
