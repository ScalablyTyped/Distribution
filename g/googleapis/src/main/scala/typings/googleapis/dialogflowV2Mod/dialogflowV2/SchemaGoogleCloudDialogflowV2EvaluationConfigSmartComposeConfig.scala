package typings.googleapis.dialogflowV2Mod.dialogflowV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowV2EvaluationConfigSmartComposeConfig extends StObject {
  
  /**
    * The allowlist document resource name. Format: `projects//knowledgeBases//documents/`. Only used for smart compose model.
    */
  var allowlistDocument: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. The model to be evaluated can return multiple results with confidence score on each query. These results will be sorted by the descending order of the scores and we only keep the first max_result_count results as the final results to evaluate.
    */
  var maxResultCount: js.UndefOr[Double | Null] = js.undefined
}
object SchemaGoogleCloudDialogflowV2EvaluationConfigSmartComposeConfig {
  
  inline def apply(): SchemaGoogleCloudDialogflowV2EvaluationConfigSmartComposeConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2EvaluationConfigSmartComposeConfig]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowV2EvaluationConfigSmartComposeConfig](x: Self) {
    
    inline def setAllowlistDocument(value: String): Self = StObject.set(x, "allowlistDocument", value.asInstanceOf[js.Any])
    
    inline def setAllowlistDocumentNull: Self = StObject.set(x, "allowlistDocument", null)
    
    inline def setAllowlistDocumentUndefined: Self = StObject.set(x, "allowlistDocument", js.undefined)
    
    inline def setMaxResultCount(value: Double): Self = StObject.set(x, "maxResultCount", value.asInstanceOf[js.Any])
    
    inline def setMaxResultCountNull: Self = StObject.set(x, "maxResultCount", null)
    
    inline def setMaxResultCountUndefined: Self = StObject.set(x, "maxResultCount", js.undefined)
  }
}
