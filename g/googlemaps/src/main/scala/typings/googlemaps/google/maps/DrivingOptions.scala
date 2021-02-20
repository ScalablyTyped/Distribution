package typings.googlemaps.google.maps

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DrivingOptions extends StObject {
  
  var departureTime: Date = js.native
  
  var trafficModel: js.UndefOr[TrafficModel] = js.native
}
object DrivingOptions {
  
  @scala.inline
  def apply(departureTime: Date): DrivingOptions = {
    val __obj = js.Dynamic.literal(departureTime = departureTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[DrivingOptions]
  }
  
  @scala.inline
  implicit class DrivingOptionsMutableBuilder[Self <: DrivingOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDepartureTime(value: Date): Self = StObject.set(x, "departureTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrafficModel(value: TrafficModel): Self = StObject.set(x, "trafficModel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrafficModelUndefined: Self = StObject.set(x, "trafficModel", js.undefined)
  }
}
