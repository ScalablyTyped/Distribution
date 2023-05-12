package typings.hafasClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Arrivals
  extends StObject
     with RealtimeDataUpdatedAt {
  
  var arrivals: js.Array[Alternative]
}
object Arrivals {
  
  inline def apply(arrivals: js.Array[Alternative]): Arrivals = {
    val __obj = js.Dynamic.literal(arrivals = arrivals.asInstanceOf[js.Any])
    __obj.asInstanceOf[Arrivals]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Arrivals] (val x: Self) extends AnyVal {
    
    inline def setArrivals(value: js.Array[Alternative]): Self = StObject.set(x, "arrivals", value.asInstanceOf[js.Any])
    
    inline def setArrivalsVarargs(value: Alternative*): Self = StObject.set(x, "arrivals", js.Array(value*))
  }
}
