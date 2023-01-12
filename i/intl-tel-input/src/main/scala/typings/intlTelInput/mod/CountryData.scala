package typings.intlTelInput.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CountryData extends StObject {
  
  var dialCode: String
  
  var iso2: String
  
  var name: String
}
object CountryData {
  
  inline def apply(dialCode: String, iso2: String, name: String): CountryData = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], iso2 = iso2.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CountryData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CountryData] (val x: Self) extends AnyVal {
    
    inline def setDialCode(value: String): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setIso2(value: String): Self = StObject.set(x, "iso2", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
