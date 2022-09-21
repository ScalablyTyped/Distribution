package typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CitiesListResponse extends StObject {
  
  /** City collection. */
  var cities: js.UndefOr[js.Array[City]] = js.undefined
  
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#citiesListResponse". */
  var kind: js.UndefOr[String] = js.undefined
}
object CitiesListResponse {
  
  inline def apply(): CitiesListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CitiesListResponse]
  }
  
  extension [Self <: CitiesListResponse](x: Self) {
    
    inline def setCities(value: js.Array[City]): Self = StObject.set(x, "cities", value.asInstanceOf[js.Any])
    
    inline def setCitiesUndefined: Self = StObject.set(x, "cities", js.undefined)
    
    inline def setCitiesVarargs(value: City*): Self = StObject.set(x, "cities", js.Array(value*))
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
