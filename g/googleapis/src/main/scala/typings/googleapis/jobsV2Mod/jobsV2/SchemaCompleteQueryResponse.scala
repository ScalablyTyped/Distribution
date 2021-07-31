package typings.googleapis.jobsV2Mod.jobsV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Output only.  Response of auto-complete query.
  */
trait SchemaCompleteQueryResponse extends StObject {
  
  /**
    * Results of the matching job/company candidates.
    */
  var completionResults: js.UndefOr[js.Array[SchemaCompletionResult]] = js.undefined
  
  /**
    * Additional information for the API invocation, such as the request
    * tracking id.
    */
  var metadata: js.UndefOr[SchemaResponseMetadata] = js.undefined
}
object SchemaCompleteQueryResponse {
  
  @scala.inline
  def apply(): SchemaCompleteQueryResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCompleteQueryResponse]
  }
  
  @scala.inline
  implicit class SchemaCompleteQueryResponseMutableBuilder[Self <: SchemaCompleteQueryResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCompletionResults(value: js.Array[SchemaCompletionResult]): Self = StObject.set(x, "completionResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompletionResultsUndefined: Self = StObject.set(x, "completionResults", js.undefined)
    
    @scala.inline
    def setCompletionResultsVarargs(value: SchemaCompletionResult*): Self = StObject.set(x, "completionResults", js.Array(value :_*))
    
    @scala.inline
    def setMetadata(value: SchemaResponseMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
  }
}
