package typings.googleapis.v1b3Mod.dataflowV1b3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The result of a SourceOperationRequest, specified in
  * ReportWorkItemStatusRequest.source_operation when the work item is
  * completed.
  */
trait SchemaSourceOperationResponse extends StObject {
  
  /**
    * A response to a request to get metadata about a source.
    */
  var getMetadata: js.UndefOr[SchemaSourceGetMetadataResponse] = js.undefined
  
  /**
    * A response to a request to split a source.
    */
  var split: js.UndefOr[SchemaSourceSplitResponse] = js.undefined
}
object SchemaSourceOperationResponse {
  
  inline def apply(): SchemaSourceOperationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSourceOperationResponse]
  }
  
  extension [Self <: SchemaSourceOperationResponse](x: Self) {
    
    inline def setGetMetadata(value: SchemaSourceGetMetadataResponse): Self = StObject.set(x, "getMetadata", value.asInstanceOf[js.Any])
    
    inline def setGetMetadataUndefined: Self = StObject.set(x, "getMetadata", js.undefined)
    
    inline def setSplit(value: SchemaSourceSplitResponse): Self = StObject.set(x, "split", value.asInstanceOf[js.Any])
    
    inline def setSplitUndefined: Self = StObject.set(x, "split", js.undefined)
  }
}
