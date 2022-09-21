package typings.googleapis.dialogflowV2Mod.dialogflowV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionConfig extends StObject {
  
  /**
    * Configuration of different suggestion features. One feature can have only one config.
    */
  var featureConfigs: js.UndefOr[
    js.Array[SchemaGoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionFeatureConfig]
  ] = js.undefined
  
  /**
    * If `group_suggestion_responses` is false, and there are multiple `feature_configs` in `event based suggestion` or StreamingAnalyzeContent, we will try to deliver suggestions to customers as soon as we get new suggestion. Different type of suggestions based on the same context will be in separate Pub/Sub event or `StreamingAnalyzeContentResponse`. If `group_suggestion_responses` set to true. All the suggestions to the same participant based on the same context will be grouped into a single Pub/Sub event or StreamingAnalyzeContentResponse.
    */
  var groupSuggestionResponses: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaGoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionConfig {
  
  inline def apply(): SchemaGoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionConfig]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionConfig](x: Self) {
    
    inline def setFeatureConfigs(value: js.Array[SchemaGoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionFeatureConfig]): Self = StObject.set(x, "featureConfigs", value.asInstanceOf[js.Any])
    
    inline def setFeatureConfigsUndefined: Self = StObject.set(x, "featureConfigs", js.undefined)
    
    inline def setFeatureConfigsVarargs(value: SchemaGoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionFeatureConfig*): Self = StObject.set(x, "featureConfigs", js.Array(value*))
    
    inline def setGroupSuggestionResponses(value: Boolean): Self = StObject.set(x, "groupSuggestionResponses", value.asInstanceOf[js.Any])
    
    inline def setGroupSuggestionResponsesNull: Self = StObject.set(x, "groupSuggestionResponses", null)
    
    inline def setGroupSuggestionResponsesUndefined: Self = StObject.set(x, "groupSuggestionResponses", js.undefined)
  }
}
