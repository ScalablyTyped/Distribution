package typings.libp2p

import typings.itPbStream.mod.ProtobufStream
import typings.libp2p.distSrcCircuitRelayMod.CircuitRelayService
import typings.libp2p.distSrcCircuitRelayMod.RelayReservation
import typings.libp2p.distSrcCircuitRelayPbMod.HopMessage
import typings.libp2p.distSrcCircuitRelayPbMod.StopMessage
import typings.libp2p.distSrcCircuitRelayServerAdvertServiceMod.AdvertServiceComponents
import typings.libp2p.distSrcCircuitRelayServerAdvertServiceMod.AdvertServiceInit
import typings.libp2p.distSrcCircuitRelayServerReservationStoreMod.ReservationStoreInit
import typings.libp2pInterfaceAddressManager.mod.AddressManager
import typings.libp2pInterfaceConnection.mod.Connection
import typings.libp2pInterfaceConnection.mod.Stream
import typings.libp2pInterfaceConnectionGater.mod.ConnectionGater
import typings.libp2pInterfaceConnectionManager.mod.ConnectionManager
import typings.libp2pInterfaceContentRouting.mod.ContentRouting_
import typings.libp2pInterfacePeerId.mod.PeerId
import typings.libp2pInterfacePeerStore.mod.PeerStore
import typings.libp2pInterfaceRegistrar.mod.Registrar
import typings.std.CustomEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcCircuitRelayServerMod {
  
  @JSImport("libp2p/dist/src/circuit-relay/server", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def circuitRelayServer(): js.Function1[/* components */ CircuitRelayServerComponents, CircuitRelayService] = ^.asInstanceOf[js.Dynamic].applyDynamic("circuitRelayServer")().asInstanceOf[js.Function1[/* components */ CircuitRelayServerComponents, CircuitRelayService]]
  inline def circuitRelayServer(init: CircuitRelayServerInit): js.Function1[/* components */ CircuitRelayServerComponents, CircuitRelayService] = ^.asInstanceOf[js.Dynamic].applyDynamic("circuitRelayServer")(init.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* components */ CircuitRelayServerComponents, CircuitRelayService]]
  
  trait CircuitRelayServerComponents
    extends StObject
       with AdvertServiceComponents {
    
    var addressManager: AddressManager
    
    var connectionGater: ConnectionGater
    
    var connectionManager: ConnectionManager
    
    var peerId: PeerId
    
    var peerStore: PeerStore
    
    var registrar: Registrar
  }
  object CircuitRelayServerComponents {
    
    inline def apply(
      addressManager: AddressManager,
      connectionGater: ConnectionGater,
      connectionManager: ConnectionManager,
      contentRouting: ContentRouting_,
      peerId: PeerId,
      peerStore: PeerStore,
      registrar: Registrar
    ): CircuitRelayServerComponents = {
      val __obj = js.Dynamic.literal(addressManager = addressManager.asInstanceOf[js.Any], connectionGater = connectionGater.asInstanceOf[js.Any], connectionManager = connectionManager.asInstanceOf[js.Any], contentRouting = contentRouting.asInstanceOf[js.Any], peerId = peerId.asInstanceOf[js.Any], peerStore = peerStore.asInstanceOf[js.Any], registrar = registrar.asInstanceOf[js.Any])
      __obj.asInstanceOf[CircuitRelayServerComponents]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CircuitRelayServerComponents] (val x: Self) extends AnyVal {
      
      inline def setAddressManager(value: AddressManager): Self = StObject.set(x, "addressManager", value.asInstanceOf[js.Any])
      
      inline def setConnectionGater(value: ConnectionGater): Self = StObject.set(x, "connectionGater", value.asInstanceOf[js.Any])
      
      inline def setConnectionManager(value: ConnectionManager): Self = StObject.set(x, "connectionManager", value.asInstanceOf[js.Any])
      
      inline def setPeerId(value: PeerId): Self = StObject.set(x, "peerId", value.asInstanceOf[js.Any])
      
      inline def setPeerStore(value: PeerStore): Self = StObject.set(x, "peerStore", value.asInstanceOf[js.Any])
      
      inline def setRegistrar(value: Registrar): Self = StObject.set(x, "registrar", value.asInstanceOf[js.Any])
    }
  }
  
  trait CircuitRelayServerInit extends StObject {
    
    /**
      * If true, advertise this service via libp2p content routing to allow
      * peers to locate us on the network (default: false)
      */
    var advertise: js.UndefOr[Boolean | AdvertServiceInit] = js.undefined
    
    /**
      * Incoming hop requests must complete within this time in ms otherwise
      * the stream will be reset (default: 30s)
      */
    var hopTimeout: js.UndefOr[Double] = js.undefined
    
    /**
      * The maximum number of simultaneous HOP inbound streams that can be open at once
      */
    var maxInboundHopStreams: js.UndefOr[Double] = js.undefined
    
    /**
      * The maximum number of simultaneous HOP outbound streams that can be open at once
      */
    var maxOutboundHopStreams: js.UndefOr[Double] = js.undefined
    
    /**
      * Configuration of reservations
      */
    var reservations: js.UndefOr[ReservationStoreInit] = js.undefined
  }
  object CircuitRelayServerInit {
    
    inline def apply(): CircuitRelayServerInit = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CircuitRelayServerInit]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CircuitRelayServerInit] (val x: Self) extends AnyVal {
      
      inline def setAdvertise(value: Boolean | AdvertServiceInit): Self = StObject.set(x, "advertise", value.asInstanceOf[js.Any])
      
      inline def setAdvertiseUndefined: Self = StObject.set(x, "advertise", js.undefined)
      
      inline def setHopTimeout(value: Double): Self = StObject.set(x, "hopTimeout", value.asInstanceOf[js.Any])
      
      inline def setHopTimeoutUndefined: Self = StObject.set(x, "hopTimeout", js.undefined)
      
      inline def setMaxInboundHopStreams(value: Double): Self = StObject.set(x, "maxInboundHopStreams", value.asInstanceOf[js.Any])
      
      inline def setMaxInboundHopStreamsUndefined: Self = StObject.set(x, "maxInboundHopStreams", js.undefined)
      
      inline def setMaxOutboundHopStreams(value: Double): Self = StObject.set(x, "maxOutboundHopStreams", value.asInstanceOf[js.Any])
      
      inline def setMaxOutboundHopStreamsUndefined: Self = StObject.set(x, "maxOutboundHopStreams", js.undefined)
      
      inline def setReservations(value: ReservationStoreInit): Self = StObject.set(x, "reservations", value.asInstanceOf[js.Any])
      
      inline def setReservationsUndefined: Self = StObject.set(x, "reservations", js.undefined)
    }
  }
  
  trait HopProtocolOptions extends StObject {
    
    var connection: Connection
    
    var request: HopMessage
    
    var stream: ProtobufStream[Stream]
  }
  object HopProtocolOptions {
    
    inline def apply(connection: Connection, request: HopMessage, stream: ProtobufStream[Stream]): HopProtocolOptions = {
      val __obj = js.Dynamic.literal(connection = connection.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], stream = stream.asInstanceOf[js.Any])
      __obj.asInstanceOf[HopProtocolOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HopProtocolOptions] (val x: Self) extends AnyVal {
      
      inline def setConnection(value: Connection): Self = StObject.set(x, "connection", value.asInstanceOf[js.Any])
      
      inline def setRequest(value: HopMessage): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
      
      inline def setStream(value: ProtobufStream[Stream]): Self = StObject.set(x, "stream", value.asInstanceOf[js.Any])
    }
  }
  
  trait RelayServerEvents extends StObject {
    
    @JSName("relay:advert:error")
    var relayColonadvertColonerror: CustomEvent[js.Error]
    
    @JSName("relay:advert:success")
    var relayColonadvertColonsuccess: CustomEvent[Any]
    
    @JSName("relay:reservation")
    var relayColonreservation: CustomEvent[RelayReservation]
  }
  object RelayServerEvents {
    
    inline def apply(
      relayColonadvertColonerror: CustomEvent[js.Error],
      relayColonadvertColonsuccess: CustomEvent[Any],
      relayColonreservation: CustomEvent[RelayReservation]
    ): RelayServerEvents = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("relay:advert:error")(relayColonadvertColonerror.asInstanceOf[js.Any])
      __obj.updateDynamic("relay:advert:success")(relayColonadvertColonsuccess.asInstanceOf[js.Any])
      __obj.updateDynamic("relay:reservation")(relayColonreservation.asInstanceOf[js.Any])
      __obj.asInstanceOf[RelayServerEvents]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RelayServerEvents] (val x: Self) extends AnyVal {
      
      inline def setRelayColonadvertColonerror(value: CustomEvent[js.Error]): Self = StObject.set(x, "relay:advert:error", value.asInstanceOf[js.Any])
      
      inline def setRelayColonadvertColonsuccess(value: CustomEvent[Any]): Self = StObject.set(x, "relay:advert:success", value.asInstanceOf[js.Any])
      
      inline def setRelayColonreservation(value: CustomEvent[RelayReservation]): Self = StObject.set(x, "relay:reservation", value.asInstanceOf[js.Any])
    }
  }
  
  trait StopOptions extends StObject {
    
    var connection: Connection
    
    var request: StopMessage
  }
  object StopOptions {
    
    inline def apply(connection: Connection, request: StopMessage): StopOptions = {
      val __obj = js.Dynamic.literal(connection = connection.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any])
      __obj.asInstanceOf[StopOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: StopOptions] (val x: Self) extends AnyVal {
      
      inline def setConnection(value: Connection): Self = StObject.set(x, "connection", value.asInstanceOf[js.Any])
      
      inline def setRequest(value: StopMessage): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    }
  }
}
