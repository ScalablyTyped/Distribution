package typings.googlemaps.google.maps

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransitOptions extends StObject {
  
  var arrivalTime: js.UndefOr[Date] = js.undefined
  
  var departureTime: js.UndefOr[Date] = js.undefined
  
  var modes: js.UndefOr[js.Array[TransitMode]] = js.undefined
  
  var routingPreference: js.UndefOr[TransitRoutePreference] = js.undefined
}
object TransitOptions {
  
  inline def apply(): TransitOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransitOptions]
  }
  
  extension [Self <: TransitOptions](x: Self) {
    
    inline def setArrivalTime(value: Date): Self = StObject.set(x, "arrivalTime", value.asInstanceOf[js.Any])
    
    inline def setArrivalTimeUndefined: Self = StObject.set(x, "arrivalTime", js.undefined)
    
    inline def setDepartureTime(value: Date): Self = StObject.set(x, "departureTime", value.asInstanceOf[js.Any])
    
    inline def setDepartureTimeUndefined: Self = StObject.set(x, "departureTime", js.undefined)
    
    inline def setModes(value: js.Array[TransitMode]): Self = StObject.set(x, "modes", value.asInstanceOf[js.Any])
    
    inline def setModesUndefined: Self = StObject.set(x, "modes", js.undefined)
    
    inline def setModesVarargs(value: TransitMode*): Self = StObject.set(x, "modes", js.Array(value :_*))
    
    inline def setRoutingPreference(value: TransitRoutePreference): Self = StObject.set(x, "routingPreference", value.asInstanceOf[js.Any])
    
    inline def setRoutingPreferenceUndefined: Self = StObject.set(x, "routingPreference", js.undefined)
  }
}
