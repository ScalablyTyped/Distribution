package typings.libp2p

import typings.libp2pInterfaceLibp2p.mod.Libp2pEvents
import typings.libp2pInterfacePeerId.mod.PeerId
import typings.libp2pInterfacePeerStore.mod.PeerStore
import typings.libp2pInterfaceTransport.mod.TransportManager
import typings.libp2pInterfaces.distSrcEventsMod.EventEmitter
import typings.multiformatsMultiaddr.mod.Multiaddr_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcAddressManagerMod {
  
  @JSImport("libp2p/dist/src/address-manager", "DefaultAddressManager")
  @js.native
  open class DefaultAddressManager protected () extends StObject {
    /**
      * Responsible for managing the peer addresses.
      * Peers can specify their listen and announce addresses.
      * The listen addresses will be used by the libp2p transports to listen for new connections,
      * while the announce addresses will be used for the peer addresses' to other peers in the network.
      */
    def this(components: DefaultAddressManagerComponents) = this()
    def this(components: DefaultAddressManagerComponents, init: AddressManagerInit) = this()
    
    def _updatePeerStoreAddresses(): Unit = js.native
    
    /**
      * Add peer observed addresses
      */
    def addObservedAddr(addr: Multiaddr_): Unit = js.native
    
    /* private */ val announce: Any = js.native
    
    /* private */ val announceFilter: Any = js.native
    
    /* private */ val components: Any = js.native
    
    def confirmObservedAddr(addr: Multiaddr_): Unit = js.native
    
    def getAddresses(): js.Array[Multiaddr_] = js.native
    
    /**
      * Get peer announcing multiaddrs
      */
    def getAnnounceAddrs(): js.Array[Multiaddr_] = js.native
    
    /**
      * Get peer listen multiaddrs
      */
    def getListenAddrs(): js.Array[Multiaddr_] = js.native
    
    /**
      * Get observed multiaddrs
      */
    def getObservedAddrs(): js.Array[Multiaddr_] = js.native
    
    /* private */ val listen: Any = js.native
    
    /* private */ val observed: Any = js.native
    
    def removeObservedAddr(addr: Multiaddr_): Unit = js.native
  }
  
  type AddressFilter = js.Function1[/* addrs */ js.Array[Multiaddr_], js.Array[Multiaddr_]]
  
  trait AddressManagerInit extends StObject {
    
    /**
      * list of multiaddrs string representation to announce
      */
    var announce: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * Pass an function in this field to override the list of addresses
      * that are announced to the network
      */
    var announceFilter: js.UndefOr[AddressFilter] = js.undefined
    
    /**
      * list of multiaddrs string representation to listen
      */
    var listen: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * list of multiaddrs string representation to never announce
      */
    var noAnnounce: js.UndefOr[js.Array[String]] = js.undefined
  }
  object AddressManagerInit {
    
    inline def apply(): AddressManagerInit = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AddressManagerInit]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AddressManagerInit] (val x: Self) extends AnyVal {
      
      inline def setAnnounce(value: js.Array[String]): Self = StObject.set(x, "announce", value.asInstanceOf[js.Any])
      
      inline def setAnnounceFilter(value: /* addrs */ js.Array[Multiaddr_] => js.Array[Multiaddr_]): Self = StObject.set(x, "announceFilter", js.Any.fromFunction1(value))
      
      inline def setAnnounceFilterUndefined: Self = StObject.set(x, "announceFilter", js.undefined)
      
      inline def setAnnounceUndefined: Self = StObject.set(x, "announce", js.undefined)
      
      inline def setAnnounceVarargs(value: String*): Self = StObject.set(x, "announce", js.Array(value*))
      
      inline def setListen(value: js.Array[String]): Self = StObject.set(x, "listen", value.asInstanceOf[js.Any])
      
      inline def setListenUndefined: Self = StObject.set(x, "listen", js.undefined)
      
      inline def setListenVarargs(value: String*): Self = StObject.set(x, "listen", js.Array(value*))
      
      inline def setNoAnnounce(value: js.Array[String]): Self = StObject.set(x, "noAnnounce", value.asInstanceOf[js.Any])
      
      inline def setNoAnnounceUndefined: Self = StObject.set(x, "noAnnounce", js.undefined)
      
      inline def setNoAnnounceVarargs(value: String*): Self = StObject.set(x, "noAnnounce", js.Array(value*))
    }
  }
  
  trait DefaultAddressManagerComponents extends StObject {
    
    var events: EventEmitter[Libp2pEvents]
    
    var peerId: PeerId
    
    var peerStore: PeerStore
    
    var transportManager: TransportManager
  }
  object DefaultAddressManagerComponents {
    
    inline def apply(
      events: EventEmitter[Libp2pEvents],
      peerId: PeerId,
      peerStore: PeerStore,
      transportManager: TransportManager
    ): DefaultAddressManagerComponents = {
      val __obj = js.Dynamic.literal(events = events.asInstanceOf[js.Any], peerId = peerId.asInstanceOf[js.Any], peerStore = peerStore.asInstanceOf[js.Any], transportManager = transportManager.asInstanceOf[js.Any])
      __obj.asInstanceOf[DefaultAddressManagerComponents]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DefaultAddressManagerComponents] (val x: Self) extends AnyVal {
      
      inline def setEvents(value: EventEmitter[Libp2pEvents]): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
      
      inline def setPeerId(value: PeerId): Self = StObject.set(x, "peerId", value.asInstanceOf[js.Any])
      
      inline def setPeerStore(value: PeerStore): Self = StObject.set(x, "peerStore", value.asInstanceOf[js.Any])
      
      inline def setTransportManager(value: TransportManager): Self = StObject.set(x, "transportManager", value.asInstanceOf[js.Any])
    }
  }
}
