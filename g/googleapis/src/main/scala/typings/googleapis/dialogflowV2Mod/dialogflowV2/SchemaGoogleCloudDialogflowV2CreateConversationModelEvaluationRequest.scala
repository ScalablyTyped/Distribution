package typings.googleapis.dialogflowV2Mod.dialogflowV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowV2CreateConversationModelEvaluationRequest extends StObject {
  
  /**
    * Required. The conversation model evaluation to be created.
    */
  var conversationModelEvaluation: js.UndefOr[SchemaGoogleCloudDialogflowV2ConversationModelEvaluation] = js.undefined
}
object SchemaGoogleCloudDialogflowV2CreateConversationModelEvaluationRequest {
  
  inline def apply(): SchemaGoogleCloudDialogflowV2CreateConversationModelEvaluationRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2CreateConversationModelEvaluationRequest]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowV2CreateConversationModelEvaluationRequest](x: Self) {
    
    inline def setConversationModelEvaluation(value: SchemaGoogleCloudDialogflowV2ConversationModelEvaluation): Self = StObject.set(x, "conversationModelEvaluation", value.asInstanceOf[js.Any])
    
    inline def setConversationModelEvaluationUndefined: Self = StObject.set(x, "conversationModelEvaluation", js.undefined)
  }
}
