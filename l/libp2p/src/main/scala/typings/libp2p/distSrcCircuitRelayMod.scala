package typings.libp2p

import typings.libp2p.distSrcCircuitRelayPbMod.Limit
import typings.libp2p.distSrcCircuitRelayServerMod.CircuitRelayServerComponents
import typings.libp2p.distSrcCircuitRelayServerMod.CircuitRelayServerInit
import typings.libp2p.distSrcCircuitRelayTransportMod.CircuitRelayTransportComponents
import typings.libp2p.distSrcCircuitRelayTransportMod.CircuitRelayTransportInit
import typings.libp2pInterfaceTransport.mod.Transport
import typings.libp2pInterfaces.eventsMod.EventEmitter
import typings.libp2pPeerCollections.mod.PeerMap
import typings.multiformatsMultiaddr.mod.Multiaddr_
import typings.std.CustomEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcCircuitRelayMod {
  
  @JSImport("libp2p/dist/src/circuit-relay", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def circuitRelayServer(): js.Function1[/* components */ CircuitRelayServerComponents, CircuitRelayService] = ^.asInstanceOf[js.Dynamic].applyDynamic("circuitRelayServer")().asInstanceOf[js.Function1[/* components */ CircuitRelayServerComponents, CircuitRelayService]]
  inline def circuitRelayServer(init: CircuitRelayServerInit): js.Function1[/* components */ CircuitRelayServerComponents, CircuitRelayService] = ^.asInstanceOf[js.Dynamic].applyDynamic("circuitRelayServer")(init.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* components */ CircuitRelayServerComponents, CircuitRelayService]]
  
  inline def circuitRelayTransport(): js.Function1[/* components */ CircuitRelayTransportComponents, Transport] = ^.asInstanceOf[js.Dynamic].applyDynamic("circuitRelayTransport")().asInstanceOf[js.Function1[/* components */ CircuitRelayTransportComponents, Transport]]
  inline def circuitRelayTransport(init: CircuitRelayTransportInit): js.Function1[/* components */ CircuitRelayTransportComponents, Transport] = ^.asInstanceOf[js.Dynamic].applyDynamic("circuitRelayTransport")(init.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* components */ CircuitRelayTransportComponents, Transport]]
  
  @js.native
  trait CircuitRelayService extends EventEmitter[CircuitRelayServiceEvents] {
    
    var reservations: PeerMap[RelayReservation] = js.native
  }
  
  trait CircuitRelayServiceEvents extends StObject {
    
    @JSName("relay:advert:error")
    var relayColonadvertColonerror: CustomEvent[js.Error]
    
    @JSName("relay:advert:success")
    var relayColonadvertColonsuccess: CustomEvent[Any]
    
    @JSName("relay:reservation")
    var relayColonreservation: CustomEvent[RelayReservation]
  }
  object CircuitRelayServiceEvents {
    
    inline def apply(
      relayColonadvertColonerror: CustomEvent[js.Error],
      relayColonadvertColonsuccess: CustomEvent[Any],
      relayColonreservation: CustomEvent[RelayReservation]
    ): CircuitRelayServiceEvents = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("relay:advert:error")(relayColonadvertColonerror.asInstanceOf[js.Any])
      __obj.updateDynamic("relay:advert:success")(relayColonadvertColonsuccess.asInstanceOf[js.Any])
      __obj.updateDynamic("relay:reservation")(relayColonreservation.asInstanceOf[js.Any])
      __obj.asInstanceOf[CircuitRelayServiceEvents]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CircuitRelayServiceEvents] (val x: Self) extends AnyVal {
      
      inline def setRelayColonadvertColonerror(value: CustomEvent[js.Error]): Self = StObject.set(x, "relay:advert:error", value.asInstanceOf[js.Any])
      
      inline def setRelayColonadvertColonsuccess(value: CustomEvent[Any]): Self = StObject.set(x, "relay:advert:success", value.asInstanceOf[js.Any])
      
      inline def setRelayColonreservation(value: CustomEvent[RelayReservation]): Self = StObject.set(x, "relay:reservation", value.asInstanceOf[js.Any])
    }
  }
  
  trait RelayReservation extends StObject {
    
    var addr: Multiaddr_
    
    var expire: js.Date
    
    var limit: js.UndefOr[Limit] = js.undefined
  }
  object RelayReservation {
    
    inline def apply(addr: Multiaddr_, expire: js.Date): RelayReservation = {
      val __obj = js.Dynamic.literal(addr = addr.asInstanceOf[js.Any], expire = expire.asInstanceOf[js.Any])
      __obj.asInstanceOf[RelayReservation]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RelayReservation] (val x: Self) extends AnyVal {
      
      inline def setAddr(value: Multiaddr_): Self = StObject.set(x, "addr", value.asInstanceOf[js.Any])
      
      inline def setExpire(value: js.Date): Self = StObject.set(x, "expire", value.asInstanceOf[js.Any])
      
      inline def setLimit(value: Limit): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
    }
  }
}
