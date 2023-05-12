package typings.libp2p.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<libp2p.libp2p/dist/src/circuit-relay/pb.ReservationVoucher> */
trait PartialReservationVoucher extends StObject {
  
  var expiration: js.UndefOr[js.BigInt] = js.undefined
  
  var peer: js.UndefOr[js.typedarray.Uint8Array] = js.undefined
  
  var relay: js.UndefOr[js.typedarray.Uint8Array] = js.undefined
}
object PartialReservationVoucher {
  
  inline def apply(): PartialReservationVoucher = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialReservationVoucher]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialReservationVoucher] (val x: Self) extends AnyVal {
    
    inline def setExpiration(value: js.BigInt): Self = StObject.set(x, "expiration", value.asInstanceOf[js.Any])
    
    inline def setExpirationUndefined: Self = StObject.set(x, "expiration", js.undefined)
    
    inline def setPeer(value: js.typedarray.Uint8Array): Self = StObject.set(x, "peer", value.asInstanceOf[js.Any])
    
    inline def setPeerUndefined: Self = StObject.set(x, "peer", js.undefined)
    
    inline def setRelay(value: js.typedarray.Uint8Array): Self = StObject.set(x, "relay", value.asInstanceOf[js.Any])
    
    inline def setRelayUndefined: Self = StObject.set(x, "relay", js.undefined)
  }
}
