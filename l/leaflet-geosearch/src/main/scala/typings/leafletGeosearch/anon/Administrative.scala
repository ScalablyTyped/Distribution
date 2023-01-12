package typings.leafletGeosearch.anon

import typings.leafletGeosearch.distProvidersAlgoliaProviderMod.ValueMatch
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Administrative extends StObject {
  
  var administrative: js.Array[ValueMatch]
  
  var city: DictkeyDefault
  
  var country: Dictkey
  
  var locale_names: DefaultArray
  
  var postcode: js.Array[ValueMatch]
}
object Administrative {
  
  inline def apply(
    administrative: js.Array[ValueMatch],
    city: DictkeyDefault,
    country: Dictkey,
    locale_names: DefaultArray,
    postcode: js.Array[ValueMatch]
  ): Administrative = {
    val __obj = js.Dynamic.literal(administrative = administrative.asInstanceOf[js.Any], city = city.asInstanceOf[js.Any], country = country.asInstanceOf[js.Any], locale_names = locale_names.asInstanceOf[js.Any], postcode = postcode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Administrative]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Administrative] (val x: Self) extends AnyVal {
    
    inline def setAdministrative(value: js.Array[ValueMatch]): Self = StObject.set(x, "administrative", value.asInstanceOf[js.Any])
    
    inline def setAdministrativeVarargs(value: ValueMatch*): Self = StObject.set(x, "administrative", js.Array(value*))
    
    inline def setCity(value: DictkeyDefault): Self = StObject.set(x, "city", value.asInstanceOf[js.Any])
    
    inline def setCountry(value: Dictkey): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
    
    inline def setLocale_names(value: DefaultArray): Self = StObject.set(x, "locale_names", value.asInstanceOf[js.Any])
    
    inline def setPostcode(value: js.Array[ValueMatch]): Self = StObject.set(x, "postcode", value.asInstanceOf[js.Any])
    
    inline def setPostcodeVarargs(value: ValueMatch*): Self = StObject.set(x, "postcode", js.Array(value*))
  }
}
