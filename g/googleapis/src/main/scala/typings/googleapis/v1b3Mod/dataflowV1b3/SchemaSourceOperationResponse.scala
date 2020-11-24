package typings.googleapis.v1b3Mod.dataflowV1b3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The result of a SourceOperationRequest, specified in
  * ReportWorkItemStatusRequest.source_operation when the work item is
  * completed.
  */
@js.native
trait SchemaSourceOperationResponse extends js.Object {
  
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
  implicit class SchemaSourceOperationResponseOps[Self <: SchemaSourceOperationResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setGetMetadata(value: SchemaSourceGetMetadataResponse): Self = this.set("getMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGetMetadata: Self = this.set("getMetadata", js.undefined)
    
    @scala.inline
    def setSplit(value: SchemaSourceSplitResponse): Self = this.set("split", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSplit: Self = this.set("split", js.undefined)
  }
}
