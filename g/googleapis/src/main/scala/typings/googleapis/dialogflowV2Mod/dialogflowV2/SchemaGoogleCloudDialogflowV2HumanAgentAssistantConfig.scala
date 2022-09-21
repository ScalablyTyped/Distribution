package typings.googleapis.dialogflowV2Mod.dialogflowV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowV2HumanAgentAssistantConfig extends StObject {
  
  /**
    * Configuration for agent assistance of end user participant. Currently, this feature is not general available, please contact Google to get access.
    */
  var endUserSuggestionConfig: js.UndefOr[SchemaGoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionConfig] = js.undefined
  
  /**
    * Configuration for agent assistance of human agent participant.
    */
  var humanAgentSuggestionConfig: js.UndefOr[SchemaGoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionConfig] = js.undefined
  
  /**
    * Configuration for message analysis.
    */
  var messageAnalysisConfig: js.UndefOr[SchemaGoogleCloudDialogflowV2HumanAgentAssistantConfigMessageAnalysisConfig] = js.undefined
  
  /**
    * Pub/Sub topic on which to publish new agent assistant events.
    */
  var notificationConfig: js.UndefOr[SchemaGoogleCloudDialogflowV2NotificationConfig] = js.undefined
}
object SchemaGoogleCloudDialogflowV2HumanAgentAssistantConfig {
  
  inline def apply(): SchemaGoogleCloudDialogflowV2HumanAgentAssistantConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2HumanAgentAssistantConfig]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowV2HumanAgentAssistantConfig](x: Self) {
    
    inline def setEndUserSuggestionConfig(value: SchemaGoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionConfig): Self = StObject.set(x, "endUserSuggestionConfig", value.asInstanceOf[js.Any])
    
    inline def setEndUserSuggestionConfigUndefined: Self = StObject.set(x, "endUserSuggestionConfig", js.undefined)
    
    inline def setHumanAgentSuggestionConfig(value: SchemaGoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionConfig): Self = StObject.set(x, "humanAgentSuggestionConfig", value.asInstanceOf[js.Any])
    
    inline def setHumanAgentSuggestionConfigUndefined: Self = StObject.set(x, "humanAgentSuggestionConfig", js.undefined)
    
    inline def setMessageAnalysisConfig(value: SchemaGoogleCloudDialogflowV2HumanAgentAssistantConfigMessageAnalysisConfig): Self = StObject.set(x, "messageAnalysisConfig", value.asInstanceOf[js.Any])
    
    inline def setMessageAnalysisConfigUndefined: Self = StObject.set(x, "messageAnalysisConfig", js.undefined)
    
    inline def setNotificationConfig(value: SchemaGoogleCloudDialogflowV2NotificationConfig): Self = StObject.set(x, "notificationConfig", value.asInstanceOf[js.Any])
    
    inline def setNotificationConfigUndefined: Self = StObject.set(x, "notificationConfig", js.undefined)
  }
}
