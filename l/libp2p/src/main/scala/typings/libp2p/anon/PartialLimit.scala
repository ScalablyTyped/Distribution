package typings.libp2p.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<libp2p.libp2p/dist/src/circuit-relay/pb.Limit> */
trait PartialLimit extends StObject {
  
  var data: js.UndefOr[js.BigInt] = js.undefined
  
  var duration: js.UndefOr[Double] = js.undefined
}
object PartialLimit {
  
  inline def apply(): PartialLimit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialLimit]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialLimit] (val x: Self) extends AnyVal {
    
    inline def setData(value: js.BigInt): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
  }
}
