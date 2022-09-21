package typings.googleapis.dialogflowV2Mod.dialogflowV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowV2SetSuggestionFeatureConfigRequest extends StObject {
  
  /**
    * Required. The participant role to add or update the suggestion feature config. Only HUMAN_AGENT or END_USER can be used.
    */
  var participantRole: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. The suggestion feature config to add or update.
    */
  var suggestionFeatureConfig: js.UndefOr[SchemaGoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionFeatureConfig] = js.undefined
}
object SchemaGoogleCloudDialogflowV2SetSuggestionFeatureConfigRequest {
  
  inline def apply(): SchemaGoogleCloudDialogflowV2SetSuggestionFeatureConfigRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2SetSuggestionFeatureConfigRequest]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowV2SetSuggestionFeatureConfigRequest](x: Self) {
    
    inline def setParticipantRole(value: String): Self = StObject.set(x, "participantRole", value.asInstanceOf[js.Any])
    
    inline def setParticipantRoleNull: Self = StObject.set(x, "participantRole", null)
    
    inline def setParticipantRoleUndefined: Self = StObject.set(x, "participantRole", js.undefined)
    
    inline def setSuggestionFeatureConfig(value: SchemaGoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionFeatureConfig): Self = StObject.set(x, "suggestionFeatureConfig", value.asInstanceOf[js.Any])
    
    inline def setSuggestionFeatureConfigUndefined: Self = StObject.set(x, "suggestionFeatureConfig", js.undefined)
  }
}
