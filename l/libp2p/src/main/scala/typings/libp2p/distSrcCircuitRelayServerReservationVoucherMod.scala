package typings.libp2p

import typings.libp2pInterfacePeerId.mod.PeerId
import typings.libp2pInterfaceRecord.mod.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcCircuitRelayServerReservationVoucherMod {
  
  @JSImport("libp2p/dist/src/circuit-relay/server/reservation-voucher", "ReservationVoucherRecord")
  @js.native
  open class ReservationVoucherRecord protected ()
    extends StObject
       with Record {
    def this(param0: ReservationVoucherOptions) = this()
    
    /**
      * identifier of the type of record
      */
    /* CompleteClass */
    var codec: js.typedarray.Uint8Array = js.native
    
    /**
      * signature domain.
      */
    /* CompleteClass */
    var domain: String = js.native
    
    /**
      * Verifies if the other provided Record is identical to this one.
      */
    /* CompleteClass */
    override def equals(other: Record): Boolean = js.native
    
    /* private */ val expiration: Any = js.native
    
    /**
      * Marshal a record to be used in an envelope.
      */
    /* CompleteClass */
    override def marshal(): js.typedarray.Uint8Array = js.native
    
    /* private */ val peer: Any = js.native
    
    /* private */ val relay: Any = js.native
  }
  
  trait ReservationVoucherOptions extends StObject {
    
    var expiration: Double
    
    var peer: PeerId
    
    var relay: PeerId
  }
  object ReservationVoucherOptions {
    
    inline def apply(expiration: Double, peer: PeerId, relay: PeerId): ReservationVoucherOptions = {
      val __obj = js.Dynamic.literal(expiration = expiration.asInstanceOf[js.Any], peer = peer.asInstanceOf[js.Any], relay = relay.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReservationVoucherOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ReservationVoucherOptions] (val x: Self) extends AnyVal {
      
      inline def setExpiration(value: Double): Self = StObject.set(x, "expiration", value.asInstanceOf[js.Any])
      
      inline def setPeer(value: PeerId): Self = StObject.set(x, "peer", value.asInstanceOf[js.Any])
      
      inline def setRelay(value: PeerId): Self = StObject.set(x, "relay", value.asInstanceOf[js.Any])
    }
  }
}
