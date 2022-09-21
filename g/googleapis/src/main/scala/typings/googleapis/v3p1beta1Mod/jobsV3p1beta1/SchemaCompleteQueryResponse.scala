package typings.googleapis.v3p1beta1Mod.jobsV3p1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCompleteQueryResponse extends StObject {
  
  /**
    * Results of the matching job/company candidates.
    */
  var completionResults: js.UndefOr[js.Array[SchemaCompletionResult]] = js.undefined
  
  /**
    * Additional information for the API invocation, such as the request tracking id.
    */
  var metadata: js.UndefOr[SchemaResponseMetadata] = js.undefined
}
object SchemaCompleteQueryResponse {
  
  inline def apply(): SchemaCompleteQueryResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCompleteQueryResponse]
  }
  
  extension [Self <: SchemaCompleteQueryResponse](x: Self) {
    
    inline def setCompletionResults(value: js.Array[SchemaCompletionResult]): Self = StObject.set(x, "completionResults", value.asInstanceOf[js.Any])
    
    inline def setCompletionResultsUndefined: Self = StObject.set(x, "completionResults", js.undefined)
    
    inline def setCompletionResultsVarargs(value: SchemaCompletionResult*): Self = StObject.set(x, "completionResults", js.Array(value*))
    
    inline def setMetadata(value: SchemaResponseMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
  }
}
