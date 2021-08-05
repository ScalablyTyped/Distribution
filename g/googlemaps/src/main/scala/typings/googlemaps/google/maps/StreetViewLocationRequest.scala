package typings.googlemaps.google.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StreetViewLocationRequest extends StObject {
  
  var location: LatLng | LatLngLiteral
  
  var preference: js.UndefOr[StreetViewPreference] = js.undefined
  
  var radius: js.UndefOr[Double] = js.undefined
  
  var source: js.UndefOr[StreetViewSource] = js.undefined
}
object StreetViewLocationRequest {
  
  inline def apply(location: LatLng | LatLngLiteral): StreetViewLocationRequest = {
    val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any])
    __obj.asInstanceOf[StreetViewLocationRequest]
  }
  
  extension [Self <: StreetViewLocationRequest](x: Self) {
    
    inline def setLocation(value: LatLng | LatLngLiteral): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setPreference(value: StreetViewPreference): Self = StObject.set(x, "preference", value.asInstanceOf[js.Any])
    
    inline def setPreferenceUndefined: Self = StObject.set(x, "preference", js.undefined)
    
    inline def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
    
    inline def setRadiusUndefined: Self = StObject.set(x, "radius", js.undefined)
    
    inline def setSource(value: StreetViewSource): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
  }
}
