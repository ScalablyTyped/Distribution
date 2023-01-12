package typings.invityApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CountryInfo extends StObject {
  
  var country: String
  
  var fiatCurrency: js.UndefOr[String] = js.undefined
}
object CountryInfo {
  
  inline def apply(country: String): CountryInfo = {
    val __obj = js.Dynamic.literal(country = country.asInstanceOf[js.Any])
    __obj.asInstanceOf[CountryInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CountryInfo] (val x: Self) extends AnyVal {
    
    inline def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
    
    inline def setFiatCurrency(value: String): Self = StObject.set(x, "fiatCurrency", value.asInstanceOf[js.Any])
    
    inline def setFiatCurrencyUndefined: Self = StObject.set(x, "fiatCurrency", js.undefined)
  }
}
