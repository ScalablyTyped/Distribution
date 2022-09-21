package typings.googleapis.dialogflowV2Mod.dialogflowV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowV2HumanAgentAssistantConfigConversationModelConfig extends StObject {
  
  /**
    * Conversation model resource name. Format: `projects//conversationModels/`.
    */
  var model: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDialogflowV2HumanAgentAssistantConfigConversationModelConfig {
  
  inline def apply(): SchemaGoogleCloudDialogflowV2HumanAgentAssistantConfigConversationModelConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2HumanAgentAssistantConfigConversationModelConfig]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowV2HumanAgentAssistantConfigConversationModelConfig](x: Self) {
    
    inline def setModel(value: String): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    inline def setModelNull: Self = StObject.set(x, "model", null)
    
    inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
  }
}
