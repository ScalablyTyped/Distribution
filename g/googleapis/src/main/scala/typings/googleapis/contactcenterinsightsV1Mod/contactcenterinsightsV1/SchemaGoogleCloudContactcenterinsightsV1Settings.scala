package typings.googleapis.contactcenterinsightsV1Mod.contactcenterinsightsV1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudContactcenterinsightsV1Settings extends StObject {
  
  /**
    * Default analysis settings.
    */
  var analysisConfig: js.UndefOr[SchemaGoogleCloudContactcenterinsightsV1SettingsAnalysisConfig] = js.undefined
  
  /**
    * The default TTL for newly-created conversations. If a conversation has a specified expiration, that value will be used instead. Changing this value will not change the expiration of existing conversations. Conversations with no expire time persist until they are deleted.
    */
  var conversationTtl: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The time at which the settings was created.
    */
  var createTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A language code to be applied to each transcript segment unless the segment already specifies a language code. Language code defaults to "en-US" if it is neither specified on the segment nor here.
    */
  var languageCode: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Immutable. The resource name of the settings resource. Format: projects/{project\}/locations/{location\}/settings
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A map that maps a notification trigger to a Pub/Sub topic. Each time a specified trigger occurs, Insights will notify the corresponding Pub/Sub topic. Keys are notification triggers. Supported keys are: * "all-triggers": Notify each time any of the supported triggers occurs. * "create-analysis": Notify each time an analysis is created. * "create-conversation": Notify each time a conversation is created. * "export-insights-data": Notify each time an export is complete. * "update-conversation": Notify each time a conversation is updated via UpdateConversation. Values are Pub/Sub topics. The format of each Pub/Sub topic is: projects/{project\}/topics/{topic\}
    */
  var pubsubNotificationSettings: js.UndefOr[StringDictionary[String] | Null] = js.undefined
  
  /**
    * Output only. The time at which the settings were last updated.
    */
  var updateTime: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudContactcenterinsightsV1Settings {
  
  inline def apply(): SchemaGoogleCloudContactcenterinsightsV1Settings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudContactcenterinsightsV1Settings]
  }
  
  extension [Self <: SchemaGoogleCloudContactcenterinsightsV1Settings](x: Self) {
    
    inline def setAnalysisConfig(value: SchemaGoogleCloudContactcenterinsightsV1SettingsAnalysisConfig): Self = StObject.set(x, "analysisConfig", value.asInstanceOf[js.Any])
    
    inline def setAnalysisConfigUndefined: Self = StObject.set(x, "analysisConfig", js.undefined)
    
    inline def setConversationTtl(value: String): Self = StObject.set(x, "conversationTtl", value.asInstanceOf[js.Any])
    
    inline def setConversationTtlNull: Self = StObject.set(x, "conversationTtl", null)
    
    inline def setConversationTtlUndefined: Self = StObject.set(x, "conversationTtl", js.undefined)
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeNull: Self = StObject.set(x, "createTime", null)
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setLanguageCode(value: String): Self = StObject.set(x, "languageCode", value.asInstanceOf[js.Any])
    
    inline def setLanguageCodeNull: Self = StObject.set(x, "languageCode", null)
    
    inline def setLanguageCodeUndefined: Self = StObject.set(x, "languageCode", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPubsubNotificationSettings(value: StringDictionary[String]): Self = StObject.set(x, "pubsubNotificationSettings", value.asInstanceOf[js.Any])
    
    inline def setPubsubNotificationSettingsNull: Self = StObject.set(x, "pubsubNotificationSettings", null)
    
    inline def setPubsubNotificationSettingsUndefined: Self = StObject.set(x, "pubsubNotificationSettings", js.undefined)
    
    inline def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    inline def setUpdateTimeNull: Self = StObject.set(x, "updateTime", null)
    
    inline def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
  }
}
