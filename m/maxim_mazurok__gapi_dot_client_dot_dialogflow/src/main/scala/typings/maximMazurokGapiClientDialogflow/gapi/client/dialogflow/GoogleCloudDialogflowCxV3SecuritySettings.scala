package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDialogflowCxV3SecuritySettings extends StObject {
  
  /**
    * Controls audio export settings for post-conversation analytics when ingesting audio to conversations via Participants.AnalyzeContent or Participants.StreamingAnalyzeContent. If
    * retention_strategy is set to REMOVE_AFTER_CONVERSATION or audio_export_settings.gcs_bucket is empty, audio export is disabled. If audio export is enabled, audio is recorded and
    * saved to audio_export_settings.gcs_bucket, subject to retention policy of audio_export_settings.gcs_bucket. This setting won't effect audio input for implicit sessions via
    * Sessions.DetectIntent or Sessions.StreamingDetectIntent.
    */
  var audioExportSettings: js.UndefOr[GoogleCloudDialogflowCxV3SecuritySettingsAudioExportSettings] = js.undefined
  
  /**
    * [DLP](https://cloud.google.com/dlp/docs) deidentify template name. Use this template to define de-identification configuration for the content. The `DLP De-identify Templates
    * Reader` role is needed on the Dialogflow service identity service account (has the form `service-PROJECT_NUMBER@gcp-sa-dialogflow.iam.gserviceaccount.com`) for your agent's project.
    * If empty, Dialogflow replaces sensitive info with `[redacted]` text. The template name will have one of the following formats: `projects//locations//deidentifyTemplates/` OR
    * `organizations//locations//deidentifyTemplates/` Note: `deidentify_template` must be located in the same region as the `SecuritySettings`.
    */
  var deidentifyTemplate: js.UndefOr[String] = js.undefined
  
  /** Required. The human-readable name of the security settings, unique within the location. */
  var displayName: js.UndefOr[String] = js.undefined
  
  /**
    * Controls conversation exporting settings to Insights after conversation is completed. If retention_strategy is set to REMOVE_AFTER_CONVERSATION, Insights export is disabled no
    * matter what you configure here.
    */
  var insightsExportSettings: js.UndefOr[GoogleCloudDialogflowCxV3SecuritySettingsInsightsExportSettings] = js.undefined
  
  /**
    * [DLP](https://cloud.google.com/dlp/docs) inspect template name. Use this template to define inspect base settings. The `DLP Inspect Templates Reader` role is needed on the
    * Dialogflow service identity service account (has the form `service-PROJECT_NUMBER@gcp-sa-dialogflow.iam.gserviceaccount.com`) for your agent's project. If empty, we use the default
    * DLP inspect config. The template name will have one of the following formats: `projects//locations//inspectTemplates/` OR `organizations//locations//inspectTemplates/` Note:
    * `inspect_template` must be located in the same region as the `SecuritySettings`.
    */
  var inspectTemplate: js.UndefOr[String] = js.undefined
  
  /**
    * Resource name of the settings. Required for the SecuritySettingsService.UpdateSecuritySettings method. SecuritySettingsService.CreateSecuritySettings populates the name
    * automatically. Format: `projects//locations//securitySettings/`.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /** List of types of data to remove when retention settings triggers purge. */
  var purgeDataTypes: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Defines the data for which Dialogflow applies redaction. Dialogflow does not redact data that it does not have access to – for example, Cloud logging. */
  var redactionScope: js.UndefOr[String] = js.undefined
  
  /** Strategy that defines how we do redaction. */
  var redactionStrategy: js.UndefOr[String] = js.undefined
  
  /**
    * Retains data in interaction logging for the specified number of days. This does not apply to Cloud logging, which is owned by the user - not Dialogflow. User must set a value lower
    * than Dialogflow's default 365d TTL. Setting a value higher than that has no effect. A missing value or setting to 0 also means we use Dialogflow's default TTL. Note: Interaction
    * logging is a limited access feature. Talk to your Google representative to check availability for you.
    */
  var retentionWindowDays: js.UndefOr[Double] = js.undefined
}
object GoogleCloudDialogflowCxV3SecuritySettings {
  
  inline def apply(): GoogleCloudDialogflowCxV3SecuritySettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowCxV3SecuritySettings]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleCloudDialogflowCxV3SecuritySettings] (val x: Self) extends AnyVal {
    
    inline def setAudioExportSettings(value: GoogleCloudDialogflowCxV3SecuritySettingsAudioExportSettings): Self = StObject.set(x, "audioExportSettings", value.asInstanceOf[js.Any])
    
    inline def setAudioExportSettingsUndefined: Self = StObject.set(x, "audioExportSettings", js.undefined)
    
    inline def setDeidentifyTemplate(value: String): Self = StObject.set(x, "deidentifyTemplate", value.asInstanceOf[js.Any])
    
    inline def setDeidentifyTemplateUndefined: Self = StObject.set(x, "deidentifyTemplate", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setInsightsExportSettings(value: GoogleCloudDialogflowCxV3SecuritySettingsInsightsExportSettings): Self = StObject.set(x, "insightsExportSettings", value.asInstanceOf[js.Any])
    
    inline def setInsightsExportSettingsUndefined: Self = StObject.set(x, "insightsExportSettings", js.undefined)
    
    inline def setInspectTemplate(value: String): Self = StObject.set(x, "inspectTemplate", value.asInstanceOf[js.Any])
    
    inline def setInspectTemplateUndefined: Self = StObject.set(x, "inspectTemplate", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPurgeDataTypes(value: js.Array[String]): Self = StObject.set(x, "purgeDataTypes", value.asInstanceOf[js.Any])
    
    inline def setPurgeDataTypesUndefined: Self = StObject.set(x, "purgeDataTypes", js.undefined)
    
    inline def setPurgeDataTypesVarargs(value: String*): Self = StObject.set(x, "purgeDataTypes", js.Array(value*))
    
    inline def setRedactionScope(value: String): Self = StObject.set(x, "redactionScope", value.asInstanceOf[js.Any])
    
    inline def setRedactionScopeUndefined: Self = StObject.set(x, "redactionScope", js.undefined)
    
    inline def setRedactionStrategy(value: String): Self = StObject.set(x, "redactionStrategy", value.asInstanceOf[js.Any])
    
    inline def setRedactionStrategyUndefined: Self = StObject.set(x, "redactionStrategy", js.undefined)
    
    inline def setRetentionWindowDays(value: Double): Self = StObject.set(x, "retentionWindowDays", value.asInstanceOf[js.Any])
    
    inline def setRetentionWindowDaysUndefined: Self = StObject.set(x, "retentionWindowDays", js.undefined)
  }
}
