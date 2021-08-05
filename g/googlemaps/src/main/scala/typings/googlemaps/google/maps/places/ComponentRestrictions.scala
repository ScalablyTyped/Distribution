package typings.googlemaps.google.maps.places

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComponentRestrictions extends StObject {
  
  var country: String | js.Array[String]
}
object ComponentRestrictions {
  
  inline def apply(country: String | js.Array[String]): ComponentRestrictions = {
    val __obj = js.Dynamic.literal(country = country.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentRestrictions]
  }
  
  extension [Self <: ComponentRestrictions](x: Self) {
    
    inline def setCountry(value: String | js.Array[String]): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
    
    inline def setCountryVarargs(value: String*): Self = StObject.set(x, "country", js.Array(value :_*))
  }
}
