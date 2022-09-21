package typings.googleapis.dialogflowV3Mod.dialogflowV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowCxV3Agent extends StObject {
  
  /**
    * Hierarchical advanced settings for this agent. The settings exposed at the lower level overrides the settings exposed at the higher level.
    */
  var advancedSettings: js.UndefOr[SchemaGoogleCloudDialogflowCxV3AdvancedSettings] = js.undefined
  
  /**
    * The URI of the agent's avatar. Avatars are used throughout the Dialogflow console and in the self-hosted [Web Demo](https://cloud.google.com/dialogflow/docs/integrations/web-demo) integration.
    */
  var avatarUri: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. Immutable. The default language of the agent as a language tag. See [Language Support](https://cloud.google.com/dialogflow/cx/docs/reference/language) for a list of the currently supported language codes. This field cannot be set by the Agents.UpdateAgent method.
    */
  var defaultLanguageCode: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The description of the agent. The maximum length is 500 characters. If exceeded, the request is rejected.
    */
  var description: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. The human-readable name of the agent, unique within the location.
    */
  var displayName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Indicates if automatic spell correction is enabled in detect intent requests.
    */
  var enableSpellCorrection: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Indicates if stackdriver logging is enabled for the agent. Please use agent.advanced_settings instead.
    */
  var enableStackdriverLogging: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Indicates whether the agent is locked for changes. If the agent is locked, modifications to the agent will be rejected except for RestoreAgent.
    */
  var locked: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * The unique identifier of the agent. Required for the Agents.UpdateAgent method. Agents.CreateAgent populates the name automatically. Format: `projects//locations//agents/`.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Name of the SecuritySettings reference for the agent. Format: `projects//locations//securitySettings/`.
    */
  var securitySettings: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Speech recognition related settings.
    */
  var speechToTextSettings: js.UndefOr[SchemaGoogleCloudDialogflowCxV3SpeechToTextSettings] = js.undefined
  
  /**
    * Immutable. Name of the start flow in this agent. A start flow will be automatically created when the agent is created, and can only be deleted by deleting the agent. Format: `projects//locations//agents//flows/`.
    */
  var startFlow: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The list of all languages supported by the agent (except for the `default_language_code`).
    */
  var supportedLanguageCodes: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Required. The time zone of the agent from the [time zone database](https://www.iana.org/time-zones), e.g., America/New_York, Europe/Paris.
    */
  var timeZone: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDialogflowCxV3Agent {
  
  inline def apply(): SchemaGoogleCloudDialogflowCxV3Agent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowCxV3Agent]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowCxV3Agent](x: Self) {
    
    inline def setAdvancedSettings(value: SchemaGoogleCloudDialogflowCxV3AdvancedSettings): Self = StObject.set(x, "advancedSettings", value.asInstanceOf[js.Any])
    
    inline def setAdvancedSettingsUndefined: Self = StObject.set(x, "advancedSettings", js.undefined)
    
    inline def setAvatarUri(value: String): Self = StObject.set(x, "avatarUri", value.asInstanceOf[js.Any])
    
    inline def setAvatarUriNull: Self = StObject.set(x, "avatarUri", null)
    
    inline def setAvatarUriUndefined: Self = StObject.set(x, "avatarUri", js.undefined)
    
    inline def setDefaultLanguageCode(value: String): Self = StObject.set(x, "defaultLanguageCode", value.asInstanceOf[js.Any])
    
    inline def setDefaultLanguageCodeNull: Self = StObject.set(x, "defaultLanguageCode", null)
    
    inline def setDefaultLanguageCodeUndefined: Self = StObject.set(x, "defaultLanguageCode", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setEnableSpellCorrection(value: Boolean): Self = StObject.set(x, "enableSpellCorrection", value.asInstanceOf[js.Any])
    
    inline def setEnableSpellCorrectionNull: Self = StObject.set(x, "enableSpellCorrection", null)
    
    inline def setEnableSpellCorrectionUndefined: Self = StObject.set(x, "enableSpellCorrection", js.undefined)
    
    inline def setEnableStackdriverLogging(value: Boolean): Self = StObject.set(x, "enableStackdriverLogging", value.asInstanceOf[js.Any])
    
    inline def setEnableStackdriverLoggingNull: Self = StObject.set(x, "enableStackdriverLogging", null)
    
    inline def setEnableStackdriverLoggingUndefined: Self = StObject.set(x, "enableStackdriverLogging", js.undefined)
    
    inline def setLocked(value: Boolean): Self = StObject.set(x, "locked", value.asInstanceOf[js.Any])
    
    inline def setLockedNull: Self = StObject.set(x, "locked", null)
    
    inline def setLockedUndefined: Self = StObject.set(x, "locked", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setSecuritySettings(value: String): Self = StObject.set(x, "securitySettings", value.asInstanceOf[js.Any])
    
    inline def setSecuritySettingsNull: Self = StObject.set(x, "securitySettings", null)
    
    inline def setSecuritySettingsUndefined: Self = StObject.set(x, "securitySettings", js.undefined)
    
    inline def setSpeechToTextSettings(value: SchemaGoogleCloudDialogflowCxV3SpeechToTextSettings): Self = StObject.set(x, "speechToTextSettings", value.asInstanceOf[js.Any])
    
    inline def setSpeechToTextSettingsUndefined: Self = StObject.set(x, "speechToTextSettings", js.undefined)
    
    inline def setStartFlow(value: String): Self = StObject.set(x, "startFlow", value.asInstanceOf[js.Any])
    
    inline def setStartFlowNull: Self = StObject.set(x, "startFlow", null)
    
    inline def setStartFlowUndefined: Self = StObject.set(x, "startFlow", js.undefined)
    
    inline def setSupportedLanguageCodes(value: js.Array[String]): Self = StObject.set(x, "supportedLanguageCodes", value.asInstanceOf[js.Any])
    
    inline def setSupportedLanguageCodesNull: Self = StObject.set(x, "supportedLanguageCodes", null)
    
    inline def setSupportedLanguageCodesUndefined: Self = StObject.set(x, "supportedLanguageCodes", js.undefined)
    
    inline def setSupportedLanguageCodesVarargs(value: String*): Self = StObject.set(x, "supportedLanguageCodes", js.Array(value*))
    
    inline def setTimeZone(value: String): Self = StObject.set(x, "timeZone", value.asInstanceOf[js.Any])
    
    inline def setTimeZoneNull: Self = StObject.set(x, "timeZone", null)
    
    inline def setTimeZoneUndefined: Self = StObject.set(x, "timeZone", js.undefined)
  }
}
