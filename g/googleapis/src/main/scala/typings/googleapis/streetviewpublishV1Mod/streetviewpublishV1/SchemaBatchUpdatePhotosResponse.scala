package typings.googleapis.streetviewpublishV1Mod.streetviewpublishV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaBatchUpdatePhotosResponse extends StObject {
  
  /**
    * List of results for each individual Photo updated, in the same order as the request.
    */
  var results: js.UndefOr[js.Array[SchemaPhotoResponse]] = js.undefined
}
object SchemaBatchUpdatePhotosResponse {
  
  inline def apply(): SchemaBatchUpdatePhotosResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBatchUpdatePhotosResponse]
  }
  
  extension [Self <: SchemaBatchUpdatePhotosResponse](x: Self) {
    
    inline def setResults(value: js.Array[SchemaPhotoResponse]): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
    
    inline def setResultsUndefined: Self = StObject.set(x, "results", js.undefined)
    
    inline def setResultsVarargs(value: SchemaPhotoResponse*): Self = StObject.set(x, "results", js.Array(value*))
  }
}
