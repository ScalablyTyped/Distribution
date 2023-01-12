package typings.maximMazurokGapiClientCivicinfo.gapi.client.civicinfo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DivisionSearchResponse extends StObject {
  
  /** Identifies what kind of resource this is. Value: the fixed string "civicinfo#divisionSearchResponse". */
  var kind: js.UndefOr[String] = js.undefined
  
  var results: js.UndefOr[js.Array[DivisionSearchResult]] = js.undefined
}
object DivisionSearchResponse {
  
  inline def apply(): DivisionSearchResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DivisionSearchResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DivisionSearchResponse] (val x: Self) extends AnyVal {
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setResults(value: js.Array[DivisionSearchResult]): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
    
    inline def setResultsUndefined: Self = StObject.set(x, "results", js.undefined)
    
    inline def setResultsVarargs(value: DivisionSearchResult*): Self = StObject.set(x, "results", js.Array(value*))
  }
}
