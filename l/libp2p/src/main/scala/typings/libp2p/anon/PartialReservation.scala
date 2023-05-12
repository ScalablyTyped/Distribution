package typings.libp2p.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<libp2p.libp2p/dist/src/circuit-relay/pb.Reservation> */
trait PartialReservation extends StObject {
  
  var addrs: js.UndefOr[js.Array[js.typedarray.Uint8Array]] = js.undefined
  
  var expire: js.UndefOr[js.BigInt] = js.undefined
  
  var voucher: js.UndefOr[js.typedarray.Uint8Array] = js.undefined
}
object PartialReservation {
  
  inline def apply(): PartialReservation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialReservation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialReservation] (val x: Self) extends AnyVal {
    
    inline def setAddrs(value: js.Array[js.typedarray.Uint8Array]): Self = StObject.set(x, "addrs", value.asInstanceOf[js.Any])
    
    inline def setAddrsUndefined: Self = StObject.set(x, "addrs", js.undefined)
    
    inline def setAddrsVarargs(value: js.typedarray.Uint8Array*): Self = StObject.set(x, "addrs", js.Array(value*))
    
    inline def setExpire(value: js.BigInt): Self = StObject.set(x, "expire", value.asInstanceOf[js.Any])
    
    inline def setExpireUndefined: Self = StObject.set(x, "expire", js.undefined)
    
    inline def setVoucher(value: js.typedarray.Uint8Array): Self = StObject.set(x, "voucher", value.asInstanceOf[js.Any])
    
    inline def setVoucherUndefined: Self = StObject.set(x, "voucher", js.undefined)
  }
}
