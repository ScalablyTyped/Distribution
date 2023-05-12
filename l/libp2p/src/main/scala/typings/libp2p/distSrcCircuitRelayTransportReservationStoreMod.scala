package typings.libp2p

import typings.libp2p.distSrcCircuitRelayPbMod.Reservation
import typings.libp2pInterfaceConnectionManager.mod.ConnectionManager
import typings.libp2pInterfaceLibp2p.mod.Libp2pEvents
import typings.libp2pInterfacePeerId.mod.PeerId
import typings.libp2pInterfacePeerStore.mod.PeerStore
import typings.libp2pInterfaceTransport.mod.TransportManager
import typings.libp2pInterfaces.distSrcStartableMod.Startable
import typings.libp2pInterfaces.eventsMod.EventEmitter
import typings.std.CustomEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcCircuitRelayTransportReservationStoreMod {
  
  @JSImport("libp2p/dist/src/circuit-relay/transport/reservation-store", "ReservationStore")
  @js.native
  open class ReservationStore protected ()
    extends EventEmitter[ReservationStoreEvents]
       with Startable {
    def this(components: RelayStoreComponents) = this()
    def this(components: RelayStoreComponents, init: RelayStoreInit) = this()
    
    /**
      * If the number of current relays is beneath the configured `maxReservations`
      * value, and the passed peer id is not our own, and we have a non-relayed connection
      * to the remote, and the remote peer speaks the hop protocol, try to reserve a slot
      * on the remote peer
      */
    def addRelay(peerId: PeerId, `type`: RelayType): js.Promise[Unit] = js.native
    
    /* private */ val connectionManager: Any = js.native
    
    /* private */ val events: Any = js.native
    
    def getReservation(peerId: PeerId): js.UndefOr[Reservation] = js.native
    
    def hasReservation(peerId: PeerId): Boolean = js.native
    
    /* CompleteClass */
    override def isStarted(): Boolean = js.native
    
    /* private */ val maxDiscoveredRelays: Any = js.native
    
    /* private */ val peerId: Any = js.native
    
    /* private */ val peerStore: Any = js.native
    
    /* private */ val reservations: Any = js.native
    
    /* private */ val reserveQueue: Any = js.native
    
    /**
      * This method will be invoked to start the component.
      *
      * It should not assume that any other components have been started.
      */
    /* CompleteClass */
    override def start(): Unit | js.Promise[Unit] = js.native
    
    /* private */ var started: Any = js.native
    
    /**
      * This method will be invoked to stop the component.
      *
      * It should not assume any other components are running when it is called.
      */
    /* CompleteClass */
    override def stop(): Unit | js.Promise[Unit] = js.native
    
    /* private */ val transportManager: Any = js.native
  }
  
  trait RelayStoreComponents extends StObject {
    
    var connectionManager: ConnectionManager
    
    var events: EventEmitter[Libp2pEvents]
    
    var peerId: PeerId
    
    var peerStore: PeerStore
    
    var transportManager: TransportManager
  }
  object RelayStoreComponents {
    
    inline def apply(
      connectionManager: ConnectionManager,
      events: EventEmitter[Libp2pEvents],
      peerId: PeerId,
      peerStore: PeerStore,
      transportManager: TransportManager
    ): RelayStoreComponents = {
      val __obj = js.Dynamic.literal(connectionManager = connectionManager.asInstanceOf[js.Any], events = events.asInstanceOf[js.Any], peerId = peerId.asInstanceOf[js.Any], peerStore = peerStore.asInstanceOf[js.Any], transportManager = transportManager.asInstanceOf[js.Any])
      __obj.asInstanceOf[RelayStoreComponents]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RelayStoreComponents] (val x: Self) extends AnyVal {
      
      inline def setConnectionManager(value: ConnectionManager): Self = StObject.set(x, "connectionManager", value.asInstanceOf[js.Any])
      
      inline def setEvents(value: EventEmitter[Libp2pEvents]): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
      
      inline def setPeerId(value: PeerId): Self = StObject.set(x, "peerId", value.asInstanceOf[js.Any])
      
      inline def setPeerStore(value: PeerStore): Self = StObject.set(x, "peerStore", value.asInstanceOf[js.Any])
      
      inline def setTransportManager(value: TransportManager): Self = StObject.set(x, "transportManager", value.asInstanceOf[js.Any])
    }
  }
  
  trait RelayStoreInit extends StObject {
    
    /**
      * How many discovered relays to allow in the reservation store
      */
    var discoverRelays: js.UndefOr[Double] = js.undefined
    
    /**
      * Multiple relays may be discovered simultaneously - to prevent listening
      * on too many relays, this value controls how many to attempt to reserve a
      * slot on at once. If set to more than one, we may end up listening on
      * more relays than the `maxReservations` value, but on networks with poor
      * connectivity the user may wish to attempt to reserve on multiple relays
      * simultaneously. (default: 1)
      */
    var reservationConcurrency: js.UndefOr[Double] = js.undefined
  }
  object RelayStoreInit {
    
    inline def apply(): RelayStoreInit = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RelayStoreInit]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RelayStoreInit] (val x: Self) extends AnyVal {
      
      inline def setDiscoverRelays(value: Double): Self = StObject.set(x, "discoverRelays", value.asInstanceOf[js.Any])
      
      inline def setDiscoverRelaysUndefined: Self = StObject.set(x, "discoverRelays", js.undefined)
      
      inline def setReservationConcurrency(value: Double): Self = StObject.set(x, "reservationConcurrency", value.asInstanceOf[js.Any])
      
      inline def setReservationConcurrencyUndefined: Self = StObject.set(x, "reservationConcurrency", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.libp2p.libp2pStrings.discovered
    - typings.libp2p.libp2pStrings.configured
  */
  trait RelayType extends StObject
  object RelayType {
    
    inline def configured: typings.libp2p.libp2pStrings.configured = "configured".asInstanceOf[typings.libp2p.libp2pStrings.configured]
    
    inline def discovered: typings.libp2p.libp2pStrings.discovered = "discovered".asInstanceOf[typings.libp2p.libp2pStrings.discovered]
  }
  
  trait ReservationStoreEvents extends StObject {
    
    @JSName("relay:not-enough-relays")
    var `relayColonnot-enough-relays`: CustomEvent[Any]
    
    @JSName("relay:removed")
    var relayColonremoved: CustomEvent[PeerId]
  }
  object ReservationStoreEvents {
    
    inline def apply(`relayColonnot-enough-relays`: CustomEvent[Any], relayColonremoved: CustomEvent[PeerId]): ReservationStoreEvents = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("relay:not-enough-relays")(`relayColonnot-enough-relays`.asInstanceOf[js.Any])
      __obj.updateDynamic("relay:removed")(relayColonremoved.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReservationStoreEvents]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ReservationStoreEvents] (val x: Self) extends AnyVal {
      
      inline def `setRelayColonnot-enough-relays`(value: CustomEvent[Any]): Self = StObject.set(x, "relay:not-enough-relays", value.asInstanceOf[js.Any])
      
      inline def setRelayColonremoved(value: CustomEvent[PeerId]): Self = StObject.set(x, "relay:removed", value.asInstanceOf[js.Any])
    }
  }
}
