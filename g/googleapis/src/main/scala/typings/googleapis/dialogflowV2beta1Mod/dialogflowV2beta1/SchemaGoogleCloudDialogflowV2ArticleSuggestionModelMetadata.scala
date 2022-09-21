package typings.googleapis.dialogflowV2beta1Mod.dialogflowV2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowV2ArticleSuggestionModelMetadata extends StObject {
  
  /**
    * Optional. Type of the article suggestion model. If not provided, model_type is used.
    */
  var trainingModelType: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDialogflowV2ArticleSuggestionModelMetadata {
  
  inline def apply(): SchemaGoogleCloudDialogflowV2ArticleSuggestionModelMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2ArticleSuggestionModelMetadata]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowV2ArticleSuggestionModelMetadata](x: Self) {
    
    inline def setTrainingModelType(value: String): Self = StObject.set(x, "trainingModelType", value.asInstanceOf[js.Any])
    
    inline def setTrainingModelTypeNull: Self = StObject.set(x, "trainingModelType", null)
    
    inline def setTrainingModelTypeUndefined: Self = StObject.set(x, "trainingModelType", js.undefined)
  }
}
