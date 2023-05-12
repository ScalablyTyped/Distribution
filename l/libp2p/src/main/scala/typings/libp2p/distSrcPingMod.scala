package typings.libp2p

import typings.libp2pInterfaceConnectionManager.mod.ConnectionManager
import typings.libp2pInterfacePeerId.mod.PeerId
import typings.libp2pInterfaceRegistrar.mod.Registrar
import typings.libp2pInterfaces.mod.AbortOptions
import typings.multiformatsMultiaddr.mod.Multiaddr_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcPingMod {
  
  @JSImport("libp2p/dist/src/ping", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def pingService(): js.Function1[/* components */ PingServiceComponents, PingService_] = ^.asInstanceOf[js.Dynamic].applyDynamic("pingService")().asInstanceOf[js.Function1[/* components */ PingServiceComponents, PingService_]]
  inline def pingService(init: PingServiceInit): js.Function1[/* components */ PingServiceComponents, PingService_] = ^.asInstanceOf[js.Dynamic].applyDynamic("pingService")(init.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* components */ PingServiceComponents, PingService_]]
  
  trait PingServiceComponents extends StObject {
    
    var connectionManager: ConnectionManager
    
    var registrar: Registrar
  }
  object PingServiceComponents {
    
    inline def apply(connectionManager: ConnectionManager, registrar: Registrar): PingServiceComponents = {
      val __obj = js.Dynamic.literal(connectionManager = connectionManager.asInstanceOf[js.Any], registrar = registrar.asInstanceOf[js.Any])
      __obj.asInstanceOf[PingServiceComponents]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PingServiceComponents] (val x: Self) extends AnyVal {
      
      inline def setConnectionManager(value: ConnectionManager): Self = StObject.set(x, "connectionManager", value.asInstanceOf[js.Any])
      
      inline def setRegistrar(value: Registrar): Self = StObject.set(x, "registrar", value.asInstanceOf[js.Any])
    }
  }
  
  trait PingServiceInit extends StObject {
    
    var maxInboundStreams: js.UndefOr[Double] = js.undefined
    
    var maxOutboundStreams: js.UndefOr[Double] = js.undefined
    
    var protocolPrefix: js.UndefOr[String] = js.undefined
    
    /**
      * How long we should wait for a ping response
      */
    var timeout: js.UndefOr[Double] = js.undefined
  }
  object PingServiceInit {
    
    inline def apply(): PingServiceInit = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PingServiceInit]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PingServiceInit] (val x: Self) extends AnyVal {
      
      inline def setMaxInboundStreams(value: Double): Self = StObject.set(x, "maxInboundStreams", value.asInstanceOf[js.Any])
      
      inline def setMaxInboundStreamsUndefined: Self = StObject.set(x, "maxInboundStreams", js.undefined)
      
      inline def setMaxOutboundStreams(value: Double): Self = StObject.set(x, "maxOutboundStreams", value.asInstanceOf[js.Any])
      
      inline def setMaxOutboundStreamsUndefined: Self = StObject.set(x, "maxOutboundStreams", js.undefined)
      
      inline def setProtocolPrefix(value: String): Self = StObject.set(x, "protocolPrefix", value.asInstanceOf[js.Any])
      
      inline def setProtocolPrefixUndefined: Self = StObject.set(x, "protocolPrefix", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
  
  @js.native
  trait PingService_ extends StObject {
    
    def ping(peer: js.Array[Multiaddr_]): js.Promise[Double] = js.native
    def ping(peer: js.Array[Multiaddr_], options: AbortOptions): js.Promise[Double] = js.native
    def ping(peer: PeerId): js.Promise[Double] = js.native
    def ping(peer: PeerId, options: AbortOptions): js.Promise[Double] = js.native
    def ping(peer: Multiaddr_): js.Promise[Double] = js.native
    def ping(peer: Multiaddr_, options: AbortOptions): js.Promise[Double] = js.native
  }
}
