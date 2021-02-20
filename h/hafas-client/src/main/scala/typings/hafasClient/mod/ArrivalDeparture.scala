package typings.hafasClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ArrivalDeparture extends StObject {
  
  var arrival: js.UndefOr[Double] = js.native
  
  var departure: js.UndefOr[Double] = js.native
}
object ArrivalDeparture {
  
  @scala.inline
  def apply(): ArrivalDeparture = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ArrivalDeparture]
  }
  
  @scala.inline
  implicit class ArrivalDepartureMutableBuilder[Self <: ArrivalDeparture] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArrival(value: Double): Self = StObject.set(x, "arrival", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArrivalUndefined: Self = StObject.set(x, "arrival", js.undefined)
    
    @scala.inline
    def setDeparture(value: Double): Self = StObject.set(x, "departure", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDepartureUndefined: Self = StObject.set(x, "departure", js.undefined)
  }
}
