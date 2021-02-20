package typings.googleapis.websecurityscannerV1alphaMod.websecurityscannerV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response for the `ListScanRuns` method.
  */
@js.native
trait SchemaListScanRunsResponse extends StObject {
  
  /**
    * Token to retrieve the next page of results, or empty if there are no more
    * results in the list.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  
  /**
    * The list of ScanRuns returned.
    */
  var scanRuns: js.UndefOr[js.Array[SchemaScanRun]] = js.native
}
object SchemaListScanRunsResponse {
  
  @scala.inline
  def apply(): SchemaListScanRunsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListScanRunsResponse]
  }
  
  @scala.inline
  implicit class SchemaListScanRunsResponseMutableBuilder[Self <: SchemaListScanRunsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    @scala.inline
    def setScanRuns(value: js.Array[SchemaScanRun]): Self = StObject.set(x, "scanRuns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScanRunsUndefined: Self = StObject.set(x, "scanRuns", js.undefined)
    
    @scala.inline
    def setScanRunsVarargs(value: SchemaScanRun*): Self = StObject.set(x, "scanRuns", js.Array(value :_*))
  }
}
