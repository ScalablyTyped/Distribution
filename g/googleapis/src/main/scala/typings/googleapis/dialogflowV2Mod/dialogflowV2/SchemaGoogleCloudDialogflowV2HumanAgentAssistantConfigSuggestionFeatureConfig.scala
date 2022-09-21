package typings.googleapis.dialogflowV2Mod.dialogflowV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionFeatureConfig extends StObject {
  
  /**
    * Configs of custom conversation model.
    */
  var conversationModelConfig: js.UndefOr[SchemaGoogleCloudDialogflowV2HumanAgentAssistantConfigConversationModelConfig] = js.undefined
  
  /**
    * Configs for processing conversation.
    */
  var conversationProcessConfig: js.UndefOr[SchemaGoogleCloudDialogflowV2HumanAgentAssistantConfigConversationProcessConfig] = js.undefined
  
  /**
    * Automatically iterates all participants and tries to compile suggestions. Supported features: ARTICLE_SUGGESTION, FAQ, DIALOGFLOW_ASSIST.
    */
  var enableEventBasedSuggestion: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Configs of query.
    */
  var queryConfig: js.UndefOr[SchemaGoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionQueryConfig] = js.undefined
  
  /**
    * The suggestion feature.
    */
  var suggestionFeature: js.UndefOr[SchemaGoogleCloudDialogflowV2SuggestionFeature] = js.undefined
  
  /**
    * Settings of suggestion trigger. Currently, only ARTICLE_SUGGESTION and FAQ will use this field.
    */
  var suggestionTriggerSettings: js.UndefOr[SchemaGoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionTriggerSettings] = js.undefined
}
object SchemaGoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionFeatureConfig {
  
  inline def apply(): SchemaGoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionFeatureConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionFeatureConfig]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionFeatureConfig](x: Self) {
    
    inline def setConversationModelConfig(value: SchemaGoogleCloudDialogflowV2HumanAgentAssistantConfigConversationModelConfig): Self = StObject.set(x, "conversationModelConfig", value.asInstanceOf[js.Any])
    
    inline def setConversationModelConfigUndefined: Self = StObject.set(x, "conversationModelConfig", js.undefined)
    
    inline def setConversationProcessConfig(value: SchemaGoogleCloudDialogflowV2HumanAgentAssistantConfigConversationProcessConfig): Self = StObject.set(x, "conversationProcessConfig", value.asInstanceOf[js.Any])
    
    inline def setConversationProcessConfigUndefined: Self = StObject.set(x, "conversationProcessConfig", js.undefined)
    
    inline def setEnableEventBasedSuggestion(value: Boolean): Self = StObject.set(x, "enableEventBasedSuggestion", value.asInstanceOf[js.Any])
    
    inline def setEnableEventBasedSuggestionNull: Self = StObject.set(x, "enableEventBasedSuggestion", null)
    
    inline def setEnableEventBasedSuggestionUndefined: Self = StObject.set(x, "enableEventBasedSuggestion", js.undefined)
    
    inline def setQueryConfig(value: SchemaGoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionQueryConfig): Self = StObject.set(x, "queryConfig", value.asInstanceOf[js.Any])
    
    inline def setQueryConfigUndefined: Self = StObject.set(x, "queryConfig", js.undefined)
    
    inline def setSuggestionFeature(value: SchemaGoogleCloudDialogflowV2SuggestionFeature): Self = StObject.set(x, "suggestionFeature", value.asInstanceOf[js.Any])
    
    inline def setSuggestionFeatureUndefined: Self = StObject.set(x, "suggestionFeature", js.undefined)
    
    inline def setSuggestionTriggerSettings(value: SchemaGoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionTriggerSettings): Self = StObject.set(x, "suggestionTriggerSettings", value.asInstanceOf[js.Any])
    
    inline def setSuggestionTriggerSettingsUndefined: Self = StObject.set(x, "suggestionTriggerSettings", js.undefined)
  }
}
