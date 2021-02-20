package typings.googlemaps.google.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GeocoderRequest extends StObject {
  
  var address: js.UndefOr[String] = js.native
  
  var bounds: js.UndefOr[LatLngBounds | LatLngBoundsLiteral] = js.native
  
  var componentRestrictions: js.UndefOr[GeocoderComponentRestrictions] = js.native
  
  var location: js.UndefOr[LatLng | LatLngLiteral] = js.native
  
  var placeId: js.UndefOr[String] = js.native
  
  var region: js.UndefOr[String] = js.native
}
object GeocoderRequest {
  
  @scala.inline
  def apply(): GeocoderRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GeocoderRequest]
  }
  
  @scala.inline
  implicit class GeocoderRequestMutableBuilder[Self <: GeocoderRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
    
    @scala.inline
    def setBounds(value: LatLngBounds | LatLngBoundsLiteral): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBoundsUndefined: Self = StObject.set(x, "bounds", js.undefined)
    
    @scala.inline
    def setComponentRestrictions(value: GeocoderComponentRestrictions): Self = StObject.set(x, "componentRestrictions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComponentRestrictionsUndefined: Self = StObject.set(x, "componentRestrictions", js.undefined)
    
    @scala.inline
    def setLocation(value: LatLng | LatLngLiteral): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    @scala.inline
    def setPlaceId(value: String): Self = StObject.set(x, "placeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlaceIdUndefined: Self = StObject.set(x, "placeId", js.undefined)
    
    @scala.inline
    def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
  }
}
