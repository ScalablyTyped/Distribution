package typings.googleapis.v1b3Mod.dataflowV1b3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The result of a SourceOperationRequest, specified in
  * ReportWorkItemStatusRequest.source_operation when the work item is
  * completed.
  */
@js.native
trait SchemaSourceOperationResponse extends StObject {
  
  /**
    * A response to a request to get metadata about a source.
    */
  var getMetadata: js.UndefOr[SchemaSourceGetMetadataResponse] = js.native
  
  /**
    * A response to a request to split a source.
    */
  var split: js.UndefOr[SchemaSourceSplitResponse] = js.native
}
object SchemaSourceOperationResponse {
  
  @scala.inline
  def apply(): SchemaSourceOperationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSourceOperationResponse]
  }
  
  @scala.inline
  implicit class SchemaSourceOperationResponseMutableBuilder[Self <: SchemaSourceOperationResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetMetadata(value: SchemaSourceGetMetadataResponse): Self = StObject.set(x, "getMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetMetadataUndefined: Self = StObject.set(x, "getMetadata", js.undefined)
    
    @scala.inline
    def setSplit(value: SchemaSourceSplitResponse): Self = StObject.set(x, "split", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSplitUndefined: Self = StObject.set(x, "split", js.undefined)
  }
}
