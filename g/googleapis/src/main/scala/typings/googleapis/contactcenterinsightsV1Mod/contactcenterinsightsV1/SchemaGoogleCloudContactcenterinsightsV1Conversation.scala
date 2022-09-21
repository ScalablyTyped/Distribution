package typings.googleapis.contactcenterinsightsV1Mod.contactcenterinsightsV1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudContactcenterinsightsV1Conversation extends StObject {
  
  /**
    * An opaque, user-specified string representing the human agent who handled the conversation.
    */
  var agentId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Call-specific metadata.
    */
  var callMetadata: js.UndefOr[SchemaGoogleCloudContactcenterinsightsV1ConversationCallMetadata] = js.undefined
  
  /**
    * Output only. The time at which the conversation was created.
    */
  var createTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The source of the audio and transcription for the conversation.
    */
  var dataSource: js.UndefOr[SchemaGoogleCloudContactcenterinsightsV1ConversationDataSource] = js.undefined
  
  /**
    * Output only. All the matched Dialogflow intents in the call. The key corresponds to a Dialogflow intent, format: projects/{project\}/agent/{agent\}/intents/{intent\}
    */
  var dialogflowIntents: js.UndefOr[
    StringDictionary[SchemaGoogleCloudContactcenterinsightsV1DialogflowIntent] | Null
  ] = js.undefined
  
  /**
    * Output only. The duration of the conversation.
    */
  var duration: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The time at which this conversation should expire. After this time, the conversation data and any associated analyses will be deleted.
    */
  var expireTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A map for the user to specify any custom fields. A maximum of 20 labels per conversation is allowed, with a maximum of 256 characters per entry.
    */
  var labels: js.UndefOr[StringDictionary[String] | Null] = js.undefined
  
  /**
    * A user-specified language code for the conversation.
    */
  var languageCode: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The conversation's latest analysis, if one exists.
    */
  var latestAnalysis: js.UndefOr[SchemaGoogleCloudContactcenterinsightsV1Analysis] = js.undefined
  
  /**
    * Immutable. The conversation medium, if unspecified will default to PHONE_CALL.
    */
  var medium: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Immutable. The resource name of the conversation. Format: projects/{project\}/locations/{location\}/conversations/{conversation\}
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Obfuscated user ID which the customer sent to us.
    */
  var obfuscatedUserId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The annotations that were generated during the customer and agent interaction.
    */
  var runtimeAnnotations: js.UndefOr[js.Array[SchemaGoogleCloudContactcenterinsightsV1RuntimeAnnotation]] = js.undefined
  
  /**
    * The time at which the conversation started.
    */
  var startTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The conversation transcript.
    */
  var transcript: js.UndefOr[SchemaGoogleCloudContactcenterinsightsV1ConversationTranscript] = js.undefined
  
  /**
    * Input only. The TTL for this resource. If specified, then this TTL will be used to calculate the expire time.
    */
  var ttl: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The number of turns in the conversation.
    */
  var turnCount: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Output only. The most recent time at which the conversation was updated.
    */
  var updateTime: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudContactcenterinsightsV1Conversation {
  
  inline def apply(): SchemaGoogleCloudContactcenterinsightsV1Conversation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudContactcenterinsightsV1Conversation]
  }
  
  extension [Self <: SchemaGoogleCloudContactcenterinsightsV1Conversation](x: Self) {
    
    inline def setAgentId(value: String): Self = StObject.set(x, "agentId", value.asInstanceOf[js.Any])
    
    inline def setAgentIdNull: Self = StObject.set(x, "agentId", null)
    
    inline def setAgentIdUndefined: Self = StObject.set(x, "agentId", js.undefined)
    
    inline def setCallMetadata(value: SchemaGoogleCloudContactcenterinsightsV1ConversationCallMetadata): Self = StObject.set(x, "callMetadata", value.asInstanceOf[js.Any])
    
    inline def setCallMetadataUndefined: Self = StObject.set(x, "callMetadata", js.undefined)
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeNull: Self = StObject.set(x, "createTime", null)
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setDataSource(value: SchemaGoogleCloudContactcenterinsightsV1ConversationDataSource): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
    
    inline def setDataSourceUndefined: Self = StObject.set(x, "dataSource", js.undefined)
    
    inline def setDialogflowIntents(value: StringDictionary[SchemaGoogleCloudContactcenterinsightsV1DialogflowIntent]): Self = StObject.set(x, "dialogflowIntents", value.asInstanceOf[js.Any])
    
    inline def setDialogflowIntentsNull: Self = StObject.set(x, "dialogflowIntents", null)
    
    inline def setDialogflowIntentsUndefined: Self = StObject.set(x, "dialogflowIntents", js.undefined)
    
    inline def setDuration(value: String): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationNull: Self = StObject.set(x, "duration", null)
    
    inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    inline def setExpireTime(value: String): Self = StObject.set(x, "expireTime", value.asInstanceOf[js.Any])
    
    inline def setExpireTimeNull: Self = StObject.set(x, "expireTime", null)
    
    inline def setExpireTimeUndefined: Self = StObject.set(x, "expireTime", js.undefined)
    
    inline def setLabels(value: StringDictionary[String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsNull: Self = StObject.set(x, "labels", null)
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setLanguageCode(value: String): Self = StObject.set(x, "languageCode", value.asInstanceOf[js.Any])
    
    inline def setLanguageCodeNull: Self = StObject.set(x, "languageCode", null)
    
    inline def setLanguageCodeUndefined: Self = StObject.set(x, "languageCode", js.undefined)
    
    inline def setLatestAnalysis(value: SchemaGoogleCloudContactcenterinsightsV1Analysis): Self = StObject.set(x, "latestAnalysis", value.asInstanceOf[js.Any])
    
    inline def setLatestAnalysisUndefined: Self = StObject.set(x, "latestAnalysis", js.undefined)
    
    inline def setMedium(value: String): Self = StObject.set(x, "medium", value.asInstanceOf[js.Any])
    
    inline def setMediumNull: Self = StObject.set(x, "medium", null)
    
    inline def setMediumUndefined: Self = StObject.set(x, "medium", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setObfuscatedUserId(value: String): Self = StObject.set(x, "obfuscatedUserId", value.asInstanceOf[js.Any])
    
    inline def setObfuscatedUserIdNull: Self = StObject.set(x, "obfuscatedUserId", null)
    
    inline def setObfuscatedUserIdUndefined: Self = StObject.set(x, "obfuscatedUserId", js.undefined)
    
    inline def setRuntimeAnnotations(value: js.Array[SchemaGoogleCloudContactcenterinsightsV1RuntimeAnnotation]): Self = StObject.set(x, "runtimeAnnotations", value.asInstanceOf[js.Any])
    
    inline def setRuntimeAnnotationsUndefined: Self = StObject.set(x, "runtimeAnnotations", js.undefined)
    
    inline def setRuntimeAnnotationsVarargs(value: SchemaGoogleCloudContactcenterinsightsV1RuntimeAnnotation*): Self = StObject.set(x, "runtimeAnnotations", js.Array(value*))
    
    inline def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeNull: Self = StObject.set(x, "startTime", null)
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
    
    inline def setTranscript(value: SchemaGoogleCloudContactcenterinsightsV1ConversationTranscript): Self = StObject.set(x, "transcript", value.asInstanceOf[js.Any])
    
    inline def setTranscriptUndefined: Self = StObject.set(x, "transcript", js.undefined)
    
    inline def setTtl(value: String): Self = StObject.set(x, "ttl", value.asInstanceOf[js.Any])
    
    inline def setTtlNull: Self = StObject.set(x, "ttl", null)
    
    inline def setTtlUndefined: Self = StObject.set(x, "ttl", js.undefined)
    
    inline def setTurnCount(value: Double): Self = StObject.set(x, "turnCount", value.asInstanceOf[js.Any])
    
    inline def setTurnCountNull: Self = StObject.set(x, "turnCount", null)
    
    inline def setTurnCountUndefined: Self = StObject.set(x, "turnCount", js.undefined)
    
    inline def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    inline def setUpdateTimeNull: Self = StObject.set(x, "updateTime", null)
    
    inline def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
  }
}
