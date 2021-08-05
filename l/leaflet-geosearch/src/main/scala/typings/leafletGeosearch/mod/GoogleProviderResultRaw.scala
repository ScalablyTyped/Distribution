package typings.leafletGeosearch.mod

import typings.leafletGeosearch.anon.Location
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleProviderResultRaw extends StObject {
  
  var address_components: js.Array[GoogleProviderResultAddressComponent]
  
  var formatted_address: String
  
  var geometry: Location
  
  var place_id: String
  
  var types: js.Array[String]
}
object GoogleProviderResultRaw {
  
  inline def apply(
    address_components: js.Array[GoogleProviderResultAddressComponent],
    formatted_address: String,
    geometry: Location,
    place_id: String,
    types: js.Array[String]
  ): GoogleProviderResultRaw = {
    val __obj = js.Dynamic.literal(address_components = address_components.asInstanceOf[js.Any], formatted_address = formatted_address.asInstanceOf[js.Any], geometry = geometry.asInstanceOf[js.Any], place_id = place_id.asInstanceOf[js.Any], types = types.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoogleProviderResultRaw]
  }
  
  extension [Self <: GoogleProviderResultRaw](x: Self) {
    
    inline def setAddress_components(value: js.Array[GoogleProviderResultAddressComponent]): Self = StObject.set(x, "address_components", value.asInstanceOf[js.Any])
    
    inline def setAddress_componentsVarargs(value: GoogleProviderResultAddressComponent*): Self = StObject.set(x, "address_components", js.Array(value :_*))
    
    inline def setFormatted_address(value: String): Self = StObject.set(x, "formatted_address", value.asInstanceOf[js.Any])
    
    inline def setGeometry(value: Location): Self = StObject.set(x, "geometry", value.asInstanceOf[js.Any])
    
    inline def setPlace_id(value: String): Self = StObject.set(x, "place_id", value.asInstanceOf[js.Any])
    
    inline def setTypes(value: js.Array[String]): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
    
    inline def setTypesVarargs(value: String*): Self = StObject.set(x, "types", js.Array(value :_*))
  }
}
