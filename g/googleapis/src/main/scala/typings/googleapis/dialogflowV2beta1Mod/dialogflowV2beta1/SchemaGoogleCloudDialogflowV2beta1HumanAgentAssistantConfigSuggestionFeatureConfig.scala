package typings.googleapis.dialogflowV2beta1Mod.dialogflowV2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowV2beta1HumanAgentAssistantConfigSuggestionFeatureConfig extends StObject {
  
  /**
    * Configs of custom conversation model.
    */
  var conversationModelConfig: js.UndefOr[
    SchemaGoogleCloudDialogflowV2beta1HumanAgentAssistantConfigConversationModelConfig
  ] = js.undefined
  
  /**
    * Configs for processing conversation.
    */
  var conversationProcessConfig: js.UndefOr[
    SchemaGoogleCloudDialogflowV2beta1HumanAgentAssistantConfigConversationProcessConfig
  ] = js.undefined
  
  /**
    * Automatically iterates all participants and tries to compile suggestions. Supported features: ARTICLE_SUGGESTION, FAQ, DIALOGFLOW_ASSIST.
    */
  var enableEventBasedSuggestion: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Configs of query.
    */
  var queryConfig: js.UndefOr[SchemaGoogleCloudDialogflowV2beta1HumanAgentAssistantConfigSuggestionQueryConfig] = js.undefined
  
  /**
    * The suggestion feature.
    */
  var suggestionFeature: js.UndefOr[SchemaGoogleCloudDialogflowV2beta1SuggestionFeature] = js.undefined
  
  /**
    * Settings of suggestion trigger. Currently, only ARTICLE_SUGGESTION, FAQ, and DIALOGFLOW_ASSIST will use this field.
    */
  var suggestionTriggerSettings: js.UndefOr[
    SchemaGoogleCloudDialogflowV2beta1HumanAgentAssistantConfigSuggestionTriggerSettings
  ] = js.undefined
}
object SchemaGoogleCloudDialogflowV2beta1HumanAgentAssistantConfigSuggestionFeatureConfig {
  
  inline def apply(): SchemaGoogleCloudDialogflowV2beta1HumanAgentAssistantConfigSuggestionFeatureConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2beta1HumanAgentAssistantConfigSuggestionFeatureConfig]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowV2beta1HumanAgentAssistantConfigSuggestionFeatureConfig](x: Self) {
    
    inline def setConversationModelConfig(value: SchemaGoogleCloudDialogflowV2beta1HumanAgentAssistantConfigConversationModelConfig): Self = StObject.set(x, "conversationModelConfig", value.asInstanceOf[js.Any])
    
    inline def setConversationModelConfigUndefined: Self = StObject.set(x, "conversationModelConfig", js.undefined)
    
    inline def setConversationProcessConfig(value: SchemaGoogleCloudDialogflowV2beta1HumanAgentAssistantConfigConversationProcessConfig): Self = StObject.set(x, "conversationProcessConfig", value.asInstanceOf[js.Any])
    
    inline def setConversationProcessConfigUndefined: Self = StObject.set(x, "conversationProcessConfig", js.undefined)
    
    inline def setEnableEventBasedSuggestion(value: Boolean): Self = StObject.set(x, "enableEventBasedSuggestion", value.asInstanceOf[js.Any])
    
    inline def setEnableEventBasedSuggestionNull: Self = StObject.set(x, "enableEventBasedSuggestion", null)
    
    inline def setEnableEventBasedSuggestionUndefined: Self = StObject.set(x, "enableEventBasedSuggestion", js.undefined)
    
    inline def setQueryConfig(value: SchemaGoogleCloudDialogflowV2beta1HumanAgentAssistantConfigSuggestionQueryConfig): Self = StObject.set(x, "queryConfig", value.asInstanceOf[js.Any])
    
    inline def setQueryConfigUndefined: Self = StObject.set(x, "queryConfig", js.undefined)
    
    inline def setSuggestionFeature(value: SchemaGoogleCloudDialogflowV2beta1SuggestionFeature): Self = StObject.set(x, "suggestionFeature", value.asInstanceOf[js.Any])
    
    inline def setSuggestionFeatureUndefined: Self = StObject.set(x, "suggestionFeature", js.undefined)
    
    inline def setSuggestionTriggerSettings(value: SchemaGoogleCloudDialogflowV2beta1HumanAgentAssistantConfigSuggestionTriggerSettings): Self = StObject.set(x, "suggestionTriggerSettings", value.asInstanceOf[js.Any])
    
    inline def setSuggestionTriggerSettingsUndefined: Self = StObject.set(x, "suggestionTriggerSettings", js.undefined)
  }
}
