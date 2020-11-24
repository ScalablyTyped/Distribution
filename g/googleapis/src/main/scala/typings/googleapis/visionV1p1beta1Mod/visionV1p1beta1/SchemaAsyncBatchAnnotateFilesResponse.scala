package typings.googleapis.visionV1p1beta1Mod.visionV1p1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response to an async batch file annotation request.
  */
@js.native
trait SchemaAsyncBatchAnnotateFilesResponse extends js.Object {
  
  /**
    * The list of file annotation responses, one for each request in
    * AsyncBatchAnnotateFilesRequest.
    */
  var responses: js.UndefOr[js.Array[SchemaAsyncAnnotateFileResponse]] = js.native
}
object SchemaAsyncBatchAnnotateFilesResponse {
  
  @scala.inline
  def apply(): SchemaAsyncBatchAnnotateFilesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAsyncBatchAnnotateFilesResponse]
  }
  
  @scala.inline
  implicit class SchemaAsyncBatchAnnotateFilesResponseOps[Self <: SchemaAsyncBatchAnnotateFilesResponse] (val x: Self) extends AnyVal {
    
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
    def setResponsesVarargs(value: SchemaAsyncAnnotateFileResponse*): Self = this.set("responses", js.Array(value :_*))
    
    @scala.inline
    def setResponses(value: js.Array[SchemaAsyncAnnotateFileResponse]): Self = this.set("responses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResponses: Self = this.set("responses", js.undefined)
  }
}
