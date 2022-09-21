package typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CountriesListResponse extends StObject {
  
  /** Country collection. */
  var countries: js.UndefOr[js.Array[Country]] = js.undefined
  
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#countriesListResponse". */
  var kind: js.UndefOr[String] = js.undefined
}
object CountriesListResponse {
  
  inline def apply(): CountriesListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CountriesListResponse]
  }
  
  extension [Self <: CountriesListResponse](x: Self) {
    
    inline def setCountries(value: js.Array[Country]): Self = StObject.set(x, "countries", value.asInstanceOf[js.Any])
    
    inline def setCountriesUndefined: Self = StObject.set(x, "countries", js.undefined)
    
    inline def setCountriesVarargs(value: Country*): Self = StObject.set(x, "countries", js.Array(value*))
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
