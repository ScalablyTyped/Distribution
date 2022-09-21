package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDialogflowV2ArticleSuggestionModelMetadata extends StObject {
  
  /** Optional. Type of the article suggestion model. If not provided, model_type is used. */
  var trainingModelType: js.UndefOr[String] = js.undefined
}
object GoogleCloudDialogflowV2ArticleSuggestionModelMetadata {
  
  inline def apply(): GoogleCloudDialogflowV2ArticleSuggestionModelMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowV2ArticleSuggestionModelMetadata]
  }
  
  extension [Self <: GoogleCloudDialogflowV2ArticleSuggestionModelMetadata](x: Self) {
    
    inline def setTrainingModelType(value: String): Self = StObject.set(x, "trainingModelType", value.asInstanceOf[js.Any])
    
    inline def setTrainingModelTypeUndefined: Self = StObject.set(x, "trainingModelType", js.undefined)
  }
}
