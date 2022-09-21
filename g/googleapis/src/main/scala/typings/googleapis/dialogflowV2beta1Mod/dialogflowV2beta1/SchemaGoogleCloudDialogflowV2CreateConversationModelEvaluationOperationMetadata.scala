package typings.googleapis.dialogflowV2beta1Mod.dialogflowV2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowV2CreateConversationModelEvaluationOperationMetadata extends StObject {
  
  /**
    * The resource name of the conversation model. Format: `projects//locations//conversationModels/`
    */
  var conversationModel: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The resource name of the conversation model. Format: `projects//locations//conversationModels//evaluations/`
    */
  var conversationModelEvaluation: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Timestamp when the request to create conversation model was submitted. The time is measured on server side.
    */
  var createTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * State of CreateConversationModel operation.
    */
  var state: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDialogflowV2CreateConversationModelEvaluationOperationMetadata {
  
  inline def apply(): SchemaGoogleCloudDialogflowV2CreateConversationModelEvaluationOperationMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2CreateConversationModelEvaluationOperationMetadata]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowV2CreateConversationModelEvaluationOperationMetadata](x: Self) {
    
    inline def setConversationModel(value: String): Self = StObject.set(x, "conversationModel", value.asInstanceOf[js.Any])
    
    inline def setConversationModelEvaluation(value: String): Self = StObject.set(x, "conversationModelEvaluation", value.asInstanceOf[js.Any])
    
    inline def setConversationModelEvaluationNull: Self = StObject.set(x, "conversationModelEvaluation", null)
    
    inline def setConversationModelEvaluationUndefined: Self = StObject.set(x, "conversationModelEvaluation", js.undefined)
    
    inline def setConversationModelNull: Self = StObject.set(x, "conversationModel", null)
    
    inline def setConversationModelUndefined: Self = StObject.set(x, "conversationModel", js.undefined)
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeNull: Self = StObject.set(x, "createTime", null)
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateNull: Self = StObject.set(x, "state", null)
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
