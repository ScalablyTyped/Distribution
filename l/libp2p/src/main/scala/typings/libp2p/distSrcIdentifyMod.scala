package typings.libp2p

import typings.libp2p.anon.TypeofIdentify
import typings.libp2pInterfaceAddressManager.mod.AddressManager
import typings.libp2pInterfaceConnectionManager.mod.ConnectionManager
import typings.libp2pInterfaceLibp2p.mod.Libp2pEvents
import typings.libp2pInterfacePeerId.mod.PeerId
import typings.libp2pInterfacePeerStore.mod.PeerStore
import typings.libp2pInterfaceRegistrar.mod.Registrar
import typings.libp2pInterfaces.eventsMod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcIdentifyMod {
  
  @JSImport("libp2p/dist/src/identify", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object Message {
    
    @JSImport("libp2p/dist/src/identify", "Message")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("libp2p/dist/src/identify", "Message.Identify")
    @js.native
    def Identify: TypeofIdentify = js.native
    inline def Identify_=(x: TypeofIdentify): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Identify")(x.asInstanceOf[js.Any])
  }
  
  inline def identifyService(): js.Function1[/* components */ IdentifyServiceComponents, js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("identifyService")().asInstanceOf[js.Function1[/* components */ IdentifyServiceComponents, js.Object]]
  inline def identifyService(init: IdentifyServiceInit): js.Function1[/* components */ IdentifyServiceComponents, js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("identifyService")(init.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* components */ IdentifyServiceComponents, js.Object]]
  
  object multicodecs {
    
    @JSImport("libp2p/dist/src/identify", "multicodecs")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("libp2p/dist/src/identify", "multicodecs.IDENTIFY")
    @js.native
    def IDENTIFY: String = js.native
    inline def IDENTIFY_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("IDENTIFY")(x.asInstanceOf[js.Any])
    
    @JSImport("libp2p/dist/src/identify", "multicodecs.IDENTIFY_PUSH")
    @js.native
    def IDENTIFY_PUSH: String = js.native
    inline def IDENTIFY_PUSH_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("IDENTIFY_PUSH")(x.asInstanceOf[js.Any])
  }
  
  trait IdentifyServiceComponents extends StObject {
    
    var addressManager: AddressManager
    
    var connectionManager: ConnectionManager
    
    var events: EventEmitter[Libp2pEvents]
    
    var peerId: PeerId
    
    var peerStore: PeerStore
    
    var registrar: Registrar
  }
  object IdentifyServiceComponents {
    
    inline def apply(
      addressManager: AddressManager,
      connectionManager: ConnectionManager,
      events: EventEmitter[Libp2pEvents],
      peerId: PeerId,
      peerStore: PeerStore,
      registrar: Registrar
    ): IdentifyServiceComponents = {
      val __obj = js.Dynamic.literal(addressManager = addressManager.asInstanceOf[js.Any], connectionManager = connectionManager.asInstanceOf[js.Any], events = events.asInstanceOf[js.Any], peerId = peerId.asInstanceOf[js.Any], peerStore = peerStore.asInstanceOf[js.Any], registrar = registrar.asInstanceOf[js.Any])
      __obj.asInstanceOf[IdentifyServiceComponents]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IdentifyServiceComponents] (val x: Self) extends AnyVal {
      
      inline def setAddressManager(value: AddressManager): Self = StObject.set(x, "addressManager", value.asInstanceOf[js.Any])
      
      inline def setConnectionManager(value: ConnectionManager): Self = StObject.set(x, "connectionManager", value.asInstanceOf[js.Any])
      
      inline def setEvents(value: EventEmitter[Libp2pEvents]): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
      
      inline def setPeerId(value: PeerId): Self = StObject.set(x, "peerId", value.asInstanceOf[js.Any])
      
      inline def setPeerStore(value: PeerStore): Self = StObject.set(x, "peerStore", value.asInstanceOf[js.Any])
      
      inline def setRegistrar(value: Registrar): Self = StObject.set(x, "registrar", value.asInstanceOf[js.Any])
    }
  }
  
  trait IdentifyServiceInit extends StObject {
    
    /**
      * What details we should send as part of an identify message
      */
    var agentVersion: js.UndefOr[String] = js.undefined
    
    /**
      * Identify responses larger than this in bytes will be rejected (default: 8192)
      */
    var maxIdentifyMessageSize: js.UndefOr[Double] = js.undefined
    
    var maxInboundStreams: js.UndefOr[Double] = js.undefined
    
    var maxObservedAddresses: js.UndefOr[Double] = js.undefined
    
    var maxOutboundStreams: js.UndefOr[Double] = js.undefined
    
    var maxPushIncomingStreams: js.UndefOr[Double] = js.undefined
    
    var maxPushOutgoingStreams: js.UndefOr[Double] = js.undefined
    
    /**
      * The prefix to use for the protocol (default: 'ipfs')
      */
    var protocolPrefix: js.UndefOr[String] = js.undefined
    
    /**
      * How long we should wait for a remote peer to send their identify response
      */
    var timeout: js.UndefOr[Double] = js.undefined
  }
  object IdentifyServiceInit {
    
    inline def apply(): IdentifyServiceInit = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IdentifyServiceInit]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IdentifyServiceInit] (val x: Self) extends AnyVal {
      
      inline def setAgentVersion(value: String): Self = StObject.set(x, "agentVersion", value.asInstanceOf[js.Any])
      
      inline def setAgentVersionUndefined: Self = StObject.set(x, "agentVersion", js.undefined)
      
      inline def setMaxIdentifyMessageSize(value: Double): Self = StObject.set(x, "maxIdentifyMessageSize", value.asInstanceOf[js.Any])
      
      inline def setMaxIdentifyMessageSizeUndefined: Self = StObject.set(x, "maxIdentifyMessageSize", js.undefined)
      
      inline def setMaxInboundStreams(value: Double): Self = StObject.set(x, "maxInboundStreams", value.asInstanceOf[js.Any])
      
      inline def setMaxInboundStreamsUndefined: Self = StObject.set(x, "maxInboundStreams", js.undefined)
      
      inline def setMaxObservedAddresses(value: Double): Self = StObject.set(x, "maxObservedAddresses", value.asInstanceOf[js.Any])
      
      inline def setMaxObservedAddressesUndefined: Self = StObject.set(x, "maxObservedAddresses", js.undefined)
      
      inline def setMaxOutboundStreams(value: Double): Self = StObject.set(x, "maxOutboundStreams", value.asInstanceOf[js.Any])
      
      inline def setMaxOutboundStreamsUndefined: Self = StObject.set(x, "maxOutboundStreams", js.undefined)
      
      inline def setMaxPushIncomingStreams(value: Double): Self = StObject.set(x, "maxPushIncomingStreams", value.asInstanceOf[js.Any])
      
      inline def setMaxPushIncomingStreamsUndefined: Self = StObject.set(x, "maxPushIncomingStreams", js.undefined)
      
      inline def setMaxPushOutgoingStreams(value: Double): Self = StObject.set(x, "maxPushOutgoingStreams", value.asInstanceOf[js.Any])
      
      inline def setMaxPushOutgoingStreamsUndefined: Self = StObject.set(x, "maxPushOutgoingStreams", js.undefined)
      
      inline def setProtocolPrefix(value: String): Self = StObject.set(x, "protocolPrefix", value.asInstanceOf[js.Any])
      
      inline def setProtocolPrefixUndefined: Self = StObject.set(x, "protocolPrefix", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
}
