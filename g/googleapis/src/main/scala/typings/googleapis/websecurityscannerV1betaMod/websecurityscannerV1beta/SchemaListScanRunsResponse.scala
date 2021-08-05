package typings.googleapis.websecurityscannerV1betaMod.websecurityscannerV1beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response for the `ListScanRuns` method.
  */
trait SchemaListScanRunsResponse extends StObject {
  
  /**
    * Token to retrieve the next page of results, or empty if there are no more
    * results in the list.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
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
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setScanRuns(value: js.Array[SchemaScanRun]): Self = StObject.set(x, "scanRuns", value.asInstanceOf[js.Any])
    
    inline def setScanRunsUndefined: Self = StObject.set(x, "scanRuns", js.undefined)
    
    inline def setScanRunsVarargs(value: SchemaScanRun*): Self = StObject.set(x, "scanRuns", js.Array(value :_*))
  }
}
