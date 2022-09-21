package typings.googleapis.dialogflowV2beta1Mod.dialogflowV2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowV2beta1ConversationProfile extends StObject {
  
  /**
    * Configuration for an automated agent to use with this profile.
    */
  var automatedAgentConfig: js.UndefOr[SchemaGoogleCloudDialogflowV2beta1AutomatedAgentConfig] = js.undefined
  
  /**
    * Output only. Create time of the conversation profile.
    */
  var createTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. Human readable name for this profile. Max length 1024 bytes.
    */
  var displayName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Configuration for agent assistance to use with this profile.
    */
  var humanAgentAssistantConfig: js.UndefOr[SchemaGoogleCloudDialogflowV2beta1HumanAgentAssistantConfig] = js.undefined
  
  /**
    * Configuration for connecting to a live agent. Currently, this feature is not general available, please contact Google to get access.
    */
  var humanAgentHandoffConfig: js.UndefOr[SchemaGoogleCloudDialogflowV2beta1HumanAgentHandoffConfig] = js.undefined
  
  /**
    * Language code for the conversation profile. If not specified, the language is en-US. Language at ConversationProfile should be set for all non en-us languages. This should be a [BCP-47](https://www.rfc-editor.org/rfc/bcp/bcp47.txt) language tag. Example: "en-US".
    */
  var languageCode: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Configuration for logging conversation lifecycle events.
    */
  var loggingConfig: js.UndefOr[SchemaGoogleCloudDialogflowV2beta1LoggingConfig] = js.undefined
  
  /**
    * The unique identifier of this conversation profile. Format: `projects//locations//conversationProfiles/`.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Configuration for publishing new message events. Event will be sent in format of ConversationEvent
    */
  var newMessageEventNotificationConfig: js.UndefOr[SchemaGoogleCloudDialogflowV2beta1NotificationConfig] = js.undefined
  
  /**
    * Configuration for publishing conversation lifecycle events.
    */
  var notificationConfig: js.UndefOr[SchemaGoogleCloudDialogflowV2beta1NotificationConfig] = js.undefined
  
  /**
    * Name of the CX SecuritySettings reference for the agent. Format: `projects//locations//securitySettings/`.
    */
  var securitySettings: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Settings for speech transcription.
    */
  var sttConfig: js.UndefOr[SchemaGoogleCloudDialogflowV2beta1SpeechToTextConfig] = js.undefined
  
  /**
    * The time zone of this conversational profile from the [time zone database](https://www.iana.org/time-zones), e.g., America/New_York, Europe/Paris. Defaults to America/New_York.
    */
  var timeZone: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Update time of the conversation profile.
    */
  var updateTime: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDialogflowV2beta1ConversationProfile {
  
  inline def apply(): SchemaGoogleCloudDialogflowV2beta1ConversationProfile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2beta1ConversationProfile]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowV2beta1ConversationProfile](x: Self) {
    
    inline def setAutomatedAgentConfig(value: SchemaGoogleCloudDialogflowV2beta1AutomatedAgentConfig): Self = StObject.set(x, "automatedAgentConfig", value.asInstanceOf[js.Any])
    
    inline def setAutomatedAgentConfigUndefined: Self = StObject.set(x, "automatedAgentConfig", js.undefined)
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeNull: Self = StObject.set(x, "createTime", null)
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setHumanAgentAssistantConfig(value: SchemaGoogleCloudDialogflowV2beta1HumanAgentAssistantConfig): Self = StObject.set(x, "humanAgentAssistantConfig", value.asInstanceOf[js.Any])
    
    inline def setHumanAgentAssistantConfigUndefined: Self = StObject.set(x, "humanAgentAssistantConfig", js.undefined)
    
    inline def setHumanAgentHandoffConfig(value: SchemaGoogleCloudDialogflowV2beta1HumanAgentHandoffConfig): Self = StObject.set(x, "humanAgentHandoffConfig", value.asInstanceOf[js.Any])
    
    inline def setHumanAgentHandoffConfigUndefined: Self = StObject.set(x, "humanAgentHandoffConfig", js.undefined)
    
    inline def setLanguageCode(value: String): Self = StObject.set(x, "languageCode", value.asInstanceOf[js.Any])
    
    inline def setLanguageCodeNull: Self = StObject.set(x, "languageCode", null)
    
    inline def setLanguageCodeUndefined: Self = StObject.set(x, "languageCode", js.undefined)
    
    inline def setLoggingConfig(value: SchemaGoogleCloudDialogflowV2beta1LoggingConfig): Self = StObject.set(x, "loggingConfig", value.asInstanceOf[js.Any])
    
    inline def setLoggingConfigUndefined: Self = StObject.set(x, "loggingConfig", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNewMessageEventNotificationConfig(value: SchemaGoogleCloudDialogflowV2beta1NotificationConfig): Self = StObject.set(x, "newMessageEventNotificationConfig", value.asInstanceOf[js.Any])
    
    inline def setNewMessageEventNotificationConfigUndefined: Self = StObject.set(x, "newMessageEventNotificationConfig", js.undefined)
    
    inline def setNotificationConfig(value: SchemaGoogleCloudDialogflowV2beta1NotificationConfig): Self = StObject.set(x, "notificationConfig", value.asInstanceOf[js.Any])
    
    inline def setNotificationConfigUndefined: Self = StObject.set(x, "notificationConfig", js.undefined)
    
    inline def setSecuritySettings(value: String): Self = StObject.set(x, "securitySettings", value.asInstanceOf[js.Any])
    
    inline def setSecuritySettingsNull: Self = StObject.set(x, "securitySettings", null)
    
    inline def setSecuritySettingsUndefined: Self = StObject.set(x, "securitySettings", js.undefined)
    
    inline def setSttConfig(value: SchemaGoogleCloudDialogflowV2beta1SpeechToTextConfig): Self = StObject.set(x, "sttConfig", value.asInstanceOf[js.Any])
    
    inline def setSttConfigUndefined: Self = StObject.set(x, "sttConfig", js.undefined)
    
    inline def setTimeZone(value: String): Self = StObject.set(x, "timeZone", value.asInstanceOf[js.Any])
    
    inline def setTimeZoneNull: Self = StObject.set(x, "timeZone", null)
    
    inline def setTimeZoneUndefined: Self = StObject.set(x, "timeZone", js.undefined)
    
    inline def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    inline def setUpdateTimeNull: Self = StObject.set(x, "updateTime", null)
    
    inline def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
  }
}
