package typings.googleapis.peopleV1Mod.peopleV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSearchResponse extends StObject {
  
  /**
    * The results of the request.
    */
  var results: js.UndefOr[js.Array[SchemaSearchResult]] = js.undefined
}
object SchemaSearchResponse {
  
  inline def apply(): SchemaSearchResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSearchResponse]
  }
  
  extension [Self <: SchemaSearchResponse](x: Self) {
    
    inline def setResults(value: js.Array[SchemaSearchResult]): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
    
    inline def setResultsUndefined: Self = StObject.set(x, "results", js.undefined)
    
    inline def setResultsVarargs(value: SchemaSearchResult*): Self = StObject.set(x, "results", js.Array(value*))
  }
}
