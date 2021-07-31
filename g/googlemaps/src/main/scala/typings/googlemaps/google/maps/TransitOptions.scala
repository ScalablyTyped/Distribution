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
  
  @scala.inline
  def apply(): TransitOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransitOptions]
  }
  
  @scala.inline
  implicit class TransitOptionsMutableBuilder[Self <: TransitOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArrivalTime(value: Date): Self = StObject.set(x, "arrivalTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArrivalTimeUndefined: Self = StObject.set(x, "arrivalTime", js.undefined)
    
    @scala.inline
    def setDepartureTime(value: Date): Self = StObject.set(x, "departureTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDepartureTimeUndefined: Self = StObject.set(x, "departureTime", js.undefined)
    
    @scala.inline
    def setModes(value: js.Array[TransitMode]): Self = StObject.set(x, "modes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModesUndefined: Self = StObject.set(x, "modes", js.undefined)
    
    @scala.inline
    def setModesVarargs(value: TransitMode*): Self = StObject.set(x, "modes", js.Array(value :_*))
    
    @scala.inline
    def setRoutingPreference(value: TransitRoutePreference): Self = StObject.set(x, "routingPreference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoutingPreferenceUndefined: Self = StObject.set(x, "routingPreference", js.undefined)
  }
}
