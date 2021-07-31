package typings.instagramPrivateApi.anon

import typings.instagramPrivateApi.instagramPrivateApiStrings.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Countrycode extends StObject {
  
  var country_code: String
  
  var source: js.Array[String | default]
}
object Countrycode {
  
  @scala.inline
  def apply(country_code: String, source: js.Array[String | default]): Countrycode = {
    val __obj = js.Dynamic.literal(country_code = country_code.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[Countrycode]
  }
  
  @scala.inline
  implicit class CountrycodeMutableBuilder[Self <: Countrycode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCountry_code(value: String): Self = StObject.set(x, "country_code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSource(value: js.Array[String | default]): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceVarargs(value: (String | default)*): Self = StObject.set(x, "source", js.Array(value :_*))
  }
}
