package typings.googlemaps.google.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GeocoderResult extends StObject {
  
  var address_components: js.Array[GeocoderAddressComponent]
  
  var formatted_address: String
  
  var geometry: GeocoderGeometry
  
  var partial_match: Boolean
  
  var place_id: String
  
  var postcode_localities: js.Array[String]
  
  var types: js.Array[String]
}
object GeocoderResult {
  
  inline def apply(
    address_components: js.Array[GeocoderAddressComponent],
    formatted_address: String,
    geometry: GeocoderGeometry,
    partial_match: Boolean,
    place_id: String,
    postcode_localities: js.Array[String],
    types: js.Array[String]
  ): GeocoderResult = {
    val __obj = js.Dynamic.literal(address_components = address_components.asInstanceOf[js.Any], formatted_address = formatted_address.asInstanceOf[js.Any], geometry = geometry.asInstanceOf[js.Any], partial_match = partial_match.asInstanceOf[js.Any], place_id = place_id.asInstanceOf[js.Any], postcode_localities = postcode_localities.asInstanceOf[js.Any], types = types.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeocoderResult]
  }
  
  extension [Self <: GeocoderResult](x: Self) {
    
    inline def setAddress_components(value: js.Array[GeocoderAddressComponent]): Self = StObject.set(x, "address_components", value.asInstanceOf[js.Any])
    
    inline def setAddress_componentsVarargs(value: GeocoderAddressComponent*): Self = StObject.set(x, "address_components", js.Array(value :_*))
    
    inline def setFormatted_address(value: String): Self = StObject.set(x, "formatted_address", value.asInstanceOf[js.Any])
    
    inline def setGeometry(value: GeocoderGeometry): Self = StObject.set(x, "geometry", value.asInstanceOf[js.Any])
    
    inline def setPartial_match(value: Boolean): Self = StObject.set(x, "partial_match", value.asInstanceOf[js.Any])
    
    inline def setPlace_id(value: String): Self = StObject.set(x, "place_id", value.asInstanceOf[js.Any])
    
    inline def setPostcode_localities(value: js.Array[String]): Self = StObject.set(x, "postcode_localities", value.asInstanceOf[js.Any])
    
    inline def setPostcode_localitiesVarargs(value: String*): Self = StObject.set(x, "postcode_localities", js.Array(value :_*))
    
    inline def setTypes(value: js.Array[String]): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
    
    inline def setTypesVarargs(value: String*): Self = StObject.set(x, "types", js.Array(value :_*))
  }
}
