package typings.googleapis.digitalassetlinksV1Mod.digitalassetlinksV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaBulkCheckResponse extends StObject {
  
  /**
    * Error code for the entire request. Present only if the entire request failed. Individual check errors will not trigger the presence of this field.
    */
  var bulkErrorCode: js.UndefOr[String | Null] = js.undefined
  
  /**
    * List of results for each check request. Results are returned in the same order in which they were sent in the request.
    */
  var checkResults: js.UndefOr[js.Array[SchemaCheckResponse]] = js.undefined
}
object SchemaBulkCheckResponse {
  
  inline def apply(): SchemaBulkCheckResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBulkCheckResponse]
  }
  
  extension [Self <: SchemaBulkCheckResponse](x: Self) {
    
    inline def setBulkErrorCode(value: String): Self = StObject.set(x, "bulkErrorCode", value.asInstanceOf[js.Any])
    
    inline def setBulkErrorCodeNull: Self = StObject.set(x, "bulkErrorCode", null)
    
    inline def setBulkErrorCodeUndefined: Self = StObject.set(x, "bulkErrorCode", js.undefined)
    
    inline def setCheckResults(value: js.Array[SchemaCheckResponse]): Self = StObject.set(x, "checkResults", value.asInstanceOf[js.Any])
    
    inline def setCheckResultsUndefined: Self = StObject.set(x, "checkResults", js.undefined)
    
    inline def setCheckResultsVarargs(value: SchemaCheckResponse*): Self = StObject.set(x, "checkResults", js.Array(value*))
  }
}
