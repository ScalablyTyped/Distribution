package typings.googleapis.websecurityscannerV1alphaMod.websecurityscannerV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListScanRunsResponse extends StObject {
  
  /**
    * Token to retrieve the next page of results, or empty if there are no more results in the list.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The list of ScanRuns returned.
    */
  var scanRuns: js.UndefOr[js.Array[SchemaScanRun]] = js.undefined
}
object SchemaListScanRunsResponse {
  
  inline def apply(): SchemaListScanRunsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListScanRunsResponse]
  }
  
  extension [Self <: SchemaListScanRunsResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setScanRuns(value: js.Array[SchemaScanRun]): Self = StObject.set(x, "scanRuns", value.asInstanceOf[js.Any])
    
    inline def setScanRunsUndefined: Self = StObject.set(x, "scanRuns", js.undefined)
    
    inline def setScanRunsVarargs(value: SchemaScanRun*): Self = StObject.set(x, "scanRuns", js.Array(value*))
  }
}
