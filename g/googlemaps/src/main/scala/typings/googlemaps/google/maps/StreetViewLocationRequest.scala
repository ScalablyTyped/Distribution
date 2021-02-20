package typings.googlemaps.google.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StreetViewLocationRequest extends StObject {
  
  var location: LatLng | LatLngLiteral = js.native
  
  var preference: js.UndefOr[StreetViewPreference] = js.native
  
  var radius: js.UndefOr[Double] = js.native
  
  var source: js.UndefOr[StreetViewSource] = js.native
}
object StreetViewLocationRequest {
  
  @scala.inline
  def apply(location: LatLng | LatLngLiteral): StreetViewLocationRequest = {
    val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any])
    __obj.asInstanceOf[StreetViewLocationRequest]
  }
  
  @scala.inline
  implicit class StreetViewLocationRequestMutableBuilder[Self <: StreetViewLocationRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLocation(value: LatLng | LatLngLiteral): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreference(value: StreetViewPreference): Self = StObject.set(x, "preference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreferenceUndefined: Self = StObject.set(x, "preference", js.undefined)
    
    @scala.inline
    def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRadiusUndefined: Self = StObject.set(x, "radius", js.undefined)
    
    @scala.inline
    def setSource(value: StreetViewSource): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
  }
}
