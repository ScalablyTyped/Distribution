package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDialogflowV2SmartReplyModelMetadata extends StObject {
  
  /** Optional. Type of the smart reply model. If not provided, model_type is used. */
  var trainingModelType: js.UndefOr[String] = js.undefined
}
object GoogleCloudDialogflowV2SmartReplyModelMetadata {
  
  inline def apply(): GoogleCloudDialogflowV2SmartReplyModelMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowV2SmartReplyModelMetadata]
  }
  
  extension [Self <: GoogleCloudDialogflowV2SmartReplyModelMetadata](x: Self) {
    
    inline def setTrainingModelType(value: String): Self = StObject.set(x, "trainingModelType", value.asInstanceOf[js.Any])
    
    inline def setTrainingModelTypeUndefined: Self = StObject.set(x, "trainingModelType", js.undefined)
  }
}
