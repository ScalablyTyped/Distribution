package typings.googleapis.dialogflowV2Mod.dialogflowV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowV2ConversationModelEvaluation extends StObject {
  
  /**
    * Output only. Creation time of this model.
    */
  var createTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. The display name of the model evaluation. At most 64 bytes long.
    */
  var displayName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. The configuration of the evaluation task.
    */
  var evaluationConfig: js.UndefOr[SchemaGoogleCloudDialogflowV2EvaluationConfig] = js.undefined
  
  /**
    * The resource name of the evaluation. Format: `projects//conversationModels//evaluations/`
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Only available when model is for smart reply.
    */
  var smartReplyMetrics: js.UndefOr[SchemaGoogleCloudDialogflowV2SmartReplyMetrics] = js.undefined
}
object SchemaGoogleCloudDialogflowV2ConversationModelEvaluation {
  
  inline def apply(): SchemaGoogleCloudDialogflowV2ConversationModelEvaluation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2ConversationModelEvaluation]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowV2ConversationModelEvaluation](x: Self) {
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeNull: Self = StObject.set(x, "createTime", null)
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setEvaluationConfig(value: SchemaGoogleCloudDialogflowV2EvaluationConfig): Self = StObject.set(x, "evaluationConfig", value.asInstanceOf[js.Any])
    
    inline def setEvaluationConfigUndefined: Self = StObject.set(x, "evaluationConfig", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setSmartReplyMetrics(value: SchemaGoogleCloudDialogflowV2SmartReplyMetrics): Self = StObject.set(x, "smartReplyMetrics", value.asInstanceOf[js.Any])
    
    inline def setSmartReplyMetricsUndefined: Self = StObject.set(x, "smartReplyMetrics", js.undefined)
  }
}
