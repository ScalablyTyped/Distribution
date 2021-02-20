package typings.googlemaps.google.maps.places

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ComponentRestrictions extends StObject {
  
  var country: String | js.Array[String] = js.native
}
object ComponentRestrictions {
  
  @scala.inline
  def apply(country: String | js.Array[String]): ComponentRestrictions = {
    val __obj = js.Dynamic.literal(country = country.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentRestrictions]
  }
  
  @scala.inline
  implicit class ComponentRestrictionsMutableBuilder[Self <: ComponentRestrictions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCountry(value: String | js.Array[String]): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountryVarargs(value: String*): Self = StObject.set(x, "country", js.Array(value :_*))
  }
}
