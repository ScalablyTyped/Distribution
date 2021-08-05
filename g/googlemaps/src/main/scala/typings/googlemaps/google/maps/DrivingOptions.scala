package typings.googlemaps.google.maps

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DrivingOptions extends StObject {
  
  var departureTime: Date
  
  var trafficModel: js.UndefOr[TrafficModel] = js.undefined
}
object DrivingOptions {
  
  inline def apply(departureTime: Date): DrivingOptions = {
    val __obj = js.Dynamic.literal(departureTime = departureTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[DrivingOptions]
  }
  
  extension [Self <: DrivingOptions](x: Self) {
    
    inline def setDepartureTime(value: Date): Self = StObject.set(x, "departureTime", value.asInstanceOf[js.Any])
    
    inline def setTrafficModel(value: TrafficModel): Self = StObject.set(x, "trafficModel", value.asInstanceOf[js.Any])
    
    inline def setTrafficModelUndefined: Self = StObject.set(x, "trafficModel", js.undefined)
  }
}
