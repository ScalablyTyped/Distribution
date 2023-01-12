package typings.hafasClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArrivalDeparture extends StObject {
  
  var arrival: js.UndefOr[Double] = js.undefined
  
  var departure: js.UndefOr[Double] = js.undefined
}
object ArrivalDeparture {
  
  inline def apply(): ArrivalDeparture = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ArrivalDeparture]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ArrivalDeparture] (val x: Self) extends AnyVal {
    
    inline def setArrival(value: Double): Self = StObject.set(x, "arrival", value.asInstanceOf[js.Any])
    
    inline def setArrivalUndefined: Self = StObject.set(x, "arrival", js.undefined)
    
    inline def setDeparture(value: Double): Self = StObject.set(x, "departure", value.asInstanceOf[js.Any])
    
    inline def setDepartureUndefined: Self = StObject.set(x, "departure", js.undefined)
  }
}
