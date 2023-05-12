package typings.libp2p

import typings.libp2pInterfaceAddressManager.mod.AddressManager
import typings.libp2pInterfaceConnectionManager.mod.ConnectionManager
import typings.libp2pInterfacePeerId.mod.PeerId
import typings.libp2pInterfacePeerRouting.mod.PeerRouting_
import typings.libp2pInterfaceRegistrar.mod.Registrar
import typings.libp2pInterfaceTransport.mod.TransportManager
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcAutonatMod {
  
  @JSImport("libp2p/dist/src/autonat", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def autoNATService(): js.Function1[/* components */ AutoNATComponents, js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("autoNATService")().asInstanceOf[js.Function1[/* components */ AutoNATComponents, js.Object]]
  inline def autoNATService(init: AutoNATServiceInit): js.Function1[/* components */ AutoNATComponents, js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("autoNATService")(init.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* components */ AutoNATComponents, js.Object]]
  
  trait AutoNATComponents extends StObject {
    
    var addressManager: AddressManager
    
    var connectionManager: ConnectionManager
    
    var peerId: PeerId
    
    var peerRouting: PeerRouting_
    
    var registrar: Registrar
    
    var transportManager: TransportManager
  }
  object AutoNATComponents {
    
    inline def apply(
      addressManager: AddressManager,
      connectionManager: ConnectionManager,
      peerId: PeerId,
      peerRouting: PeerRouting_,
      registrar: Registrar,
      transportManager: TransportManager
    ): AutoNATComponents = {
      val __obj = js.Dynamic.literal(addressManager = addressManager.asInstanceOf[js.Any], connectionManager = connectionManager.asInstanceOf[js.Any], peerId = peerId.asInstanceOf[js.Any], peerRouting = peerRouting.asInstanceOf[js.Any], registrar = registrar.asInstanceOf[js.Any], transportManager = transportManager.asInstanceOf[js.Any])
      __obj.asInstanceOf[AutoNATComponents]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AutoNATComponents] (val x: Self) extends AnyVal {
      
      inline def setAddressManager(value: AddressManager): Self = StObject.set(x, "addressManager", value.asInstanceOf[js.Any])
      
      inline def setConnectionManager(value: ConnectionManager): Self = StObject.set(x, "connectionManager", value.asInstanceOf[js.Any])
      
      inline def setPeerId(value: PeerId): Self = StObject.set(x, "peerId", value.asInstanceOf[js.Any])
      
      inline def setPeerRouting(value: PeerRouting_): Self = StObject.set(x, "peerRouting", value.asInstanceOf[js.Any])
      
      inline def setRegistrar(value: Registrar): Self = StObject.set(x, "registrar", value.asInstanceOf[js.Any])
      
      inline def setTransportManager(value: TransportManager): Self = StObject.set(x, "transportManager", value.asInstanceOf[js.Any])
    }
  }
  
  trait AutoNATServiceInit extends StObject {
    
    /**
      * How many parallel inbound autoNAT streams we allow per-connection
      */
    var maxInboundStreams: js.UndefOr[Double] = js.undefined
    
    /**
      * How many parallel outbound autoNAT streams we allow per-connection
      */
    var maxOutboundStreams: js.UndefOr[Double] = js.undefined
    
    /**
      * Allows overriding the protocol prefix used
      */
    var protocolPrefix: js.UndefOr[String] = js.undefined
    
    /**
      * Verify our external addresses this often
      */
    var refreshInterval: js.UndefOr[Double] = js.undefined
    
    /**
      * How long to wait after startup before trying to verify our external address
      */
    var startupDelay: js.UndefOr[Double] = js.undefined
    
    /**
      * How long we should wait for a remote peer to verify our external address
      */
    var timeout: js.UndefOr[Double] = js.undefined
  }
  object AutoNATServiceInit {
    
    inline def apply(): AutoNATServiceInit = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AutoNATServiceInit]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AutoNATServiceInit] (val x: Self) extends AnyVal {
      
      inline def setMaxInboundStreams(value: Double): Self = StObject.set(x, "maxInboundStreams", value.asInstanceOf[js.Any])
      
      inline def setMaxInboundStreamsUndefined: Self = StObject.set(x, "maxInboundStreams", js.undefined)
      
      inline def setMaxOutboundStreams(value: Double): Self = StObject.set(x, "maxOutboundStreams", value.asInstanceOf[js.Any])
      
      inline def setMaxOutboundStreamsUndefined: Self = StObject.set(x, "maxOutboundStreams", js.undefined)
      
      inline def setProtocolPrefix(value: String): Self = StObject.set(x, "protocolPrefix", value.asInstanceOf[js.Any])
      
      inline def setProtocolPrefixUndefined: Self = StObject.set(x, "protocolPrefix", js.undefined)
      
      inline def setRefreshInterval(value: Double): Self = StObject.set(x, "refreshInterval", value.asInstanceOf[js.Any])
      
      inline def setRefreshIntervalUndefined: Self = StObject.set(x, "refreshInterval", js.undefined)
      
      inline def setStartupDelay(value: Double): Self = StObject.set(x, "startupDelay", value.asInstanceOf[js.Any])
      
      inline def setStartupDelayUndefined: Self = StObject.set(x, "startupDelay", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
}
