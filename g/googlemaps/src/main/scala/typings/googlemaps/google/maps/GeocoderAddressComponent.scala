package typings.googlemaps.google.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GeocoderAddressComponent extends StObject {
  
  var long_name: String
  
  var short_name: String
  
  var types: js.Array[String]
}
object GeocoderAddressComponent {
  
  @scala.inline
  def apply(long_name: String, short_name: String, types: js.Array[String]): GeocoderAddressComponent = {
    val __obj = js.Dynamic.literal(long_name = long_name.asInstanceOf[js.Any], short_name = short_name.asInstanceOf[js.Any], types = types.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeocoderAddressComponent]
  }
  
  @scala.inline
  implicit class GeocoderAddressComponentMutableBuilder[Self <: GeocoderAddressComponent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLong_name(value: String): Self = StObject.set(x, "long_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShort_name(value: String): Self = StObject.set(x, "short_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypes(value: js.Array[String]): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypesVarargs(value: String*): Self = StObject.set(x, "types", js.Array(value :_*))
  }
}
