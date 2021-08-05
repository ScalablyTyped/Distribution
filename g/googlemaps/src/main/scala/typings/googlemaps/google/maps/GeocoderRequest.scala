package typings.googlemaps.google.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GeocoderRequest extends StObject {
  
  var address: js.UndefOr[String] = js.undefined
  
  var bounds: js.UndefOr[LatLngBounds | LatLngBoundsLiteral] = js.undefined
  
  var componentRestrictions: js.UndefOr[GeocoderComponentRestrictions] = js.undefined
  
  var location: js.UndefOr[LatLng | LatLngLiteral] = js.undefined
  
  var placeId: js.UndefOr[String] = js.undefined
  
  var region: js.UndefOr[String] = js.undefined
}
object GeocoderRequest {
  
  inline def apply(): GeocoderRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GeocoderRequest]
  }
  
  extension [Self <: GeocoderRequest](x: Self) {
    
    inline def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    inline def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
    
    inline def setBounds(value: LatLngBounds | LatLngBoundsLiteral): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
    
    inline def setBoundsUndefined: Self = StObject.set(x, "bounds", js.undefined)
    
    inline def setComponentRestrictions(value: GeocoderComponentRestrictions): Self = StObject.set(x, "componentRestrictions", value.asInstanceOf[js.Any])
    
    inline def setComponentRestrictionsUndefined: Self = StObject.set(x, "componentRestrictions", js.undefined)
    
    inline def setLocation(value: LatLng | LatLngLiteral): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setPlaceId(value: String): Self = StObject.set(x, "placeId", value.asInstanceOf[js.Any])
    
    inline def setPlaceIdUndefined: Self = StObject.set(x, "placeId", js.undefined)
    
    inline def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    inline def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
  }
}
