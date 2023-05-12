package typings.libp2p.anon

import typings.libp2p.distSrcCircuitRelayServerReservationStoreMod.ReservationStatus
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Expire extends StObject {
  
  var expire: js.UndefOr[Double] = js.undefined
  
  var status: ReservationStatus
}
object Expire {
  
  inline def apply(status: ReservationStatus): Expire = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Expire]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Expire] (val x: Self) extends AnyVal {
    
    inline def setExpire(value: Double): Self = StObject.set(x, "expire", value.asInstanceOf[js.Any])
    
    inline def setExpireUndefined: Self = StObject.set(x, "expire", js.undefined)
    
    inline def setStatus(value: ReservationStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
