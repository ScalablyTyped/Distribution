package typings.googleapis.jobsV2Mod.jobsV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Output only.  Response of auto-complete query.
  */
@js.native
trait SchemaCompleteQueryResponse extends js.Object {
  
  /**
    * Results of the matching job/company candidates.
    */
  var completionResults: js.UndefOr[js.Array[SchemaCompletionResult]] = js.native
  
  /**
    * Additional information for the API invocation, such as the request
    * tracking id.
    */
  var metadata: js.UndefOr[SchemaResponseMetadata] = js.native
}
object SchemaCompleteQueryResponse {
  
  @scala.inline
  def apply(): SchemaCompleteQueryResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCompleteQueryResponse]
  }
  
  @scala.inline
  implicit class SchemaCompleteQueryResponseOps[Self <: SchemaCompleteQueryResponse] (val x: Self) extends AnyVal {
    
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
    def setCompletionResultsVarargs(value: SchemaCompletionResult*): Self = this.set("completionResults", js.Array(value :_*))
    
    @scala.inline
    def setCompletionResults(value: js.Array[SchemaCompletionResult]): Self = this.set("completionResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompletionResults: Self = this.set("completionResults", js.undefined)
    
    @scala.inline
    def setMetadata(value: SchemaResponseMetadata): Self = this.set("metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetadata: Self = this.set("metadata", js.undefined)
  }
}
