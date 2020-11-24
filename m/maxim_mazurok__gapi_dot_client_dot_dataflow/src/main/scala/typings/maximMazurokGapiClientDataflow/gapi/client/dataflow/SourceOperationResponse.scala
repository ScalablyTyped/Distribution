package typings.maximMazurokGapiClientDataflow.gapi.client.dataflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SourceOperationResponse extends js.Object {
  
  /** A response to a request to get metadata about a source. */
  var getMetadata: js.UndefOr[SourceGetMetadataResponse] = js.native
  
  /** A response to a request to split a source. */
  var split: js.UndefOr[SourceSplitResponse] = js.native
}
object SourceOperationResponse {
  
  @scala.inline
  def apply(): SourceOperationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SourceOperationResponse]
  }
  
  @scala.inline
  implicit class SourceOperationResponseOps[Self <: SourceOperationResponse] (val x: Self) extends AnyVal {
    
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
    def setGetMetadata(value: SourceGetMetadataResponse): Self = this.set("getMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGetMetadata: Self = this.set("getMetadata", js.undefined)
    
    @scala.inline
    def setSplit(value: SourceSplitResponse): Self = this.set("split", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSplit: Self = this.set("split", js.undefined)
  }
}
