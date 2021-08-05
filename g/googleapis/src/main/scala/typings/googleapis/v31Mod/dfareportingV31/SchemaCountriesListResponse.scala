package typings.googleapis.v31Mod.dfareportingV31

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Country List Response
  */
trait SchemaCountriesListResponse extends StObject {
  
  /**
    * Country collection.
    */
  var countries: js.UndefOr[js.Array[SchemaCountry]] = js.undefined
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#countriesListResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.undefined
}
object SchemaCountriesListResponse {
  
  inline def apply(): SchemaCountriesListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCountriesListResponse]
  }
  
  extension [Self <: SchemaCountriesListResponse](x: Self) {
    
    inline def setCountries(value: js.Array[SchemaCountry]): Self = StObject.set(x, "countries", value.asInstanceOf[js.Any])
    
    inline def setCountriesUndefined: Self = StObject.set(x, "countries", js.undefined)
    
    inline def setCountriesVarargs(value: SchemaCountry*): Self = StObject.set(x, "countries", js.Array(value :_*))
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
