package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDialogflowV2ClearSuggestionFeatureConfigOperationMetadata extends StObject {
  
  /** The resource name of the conversation profile. Format: `projects//locations//conversationProfiles/` */
  var conversationProfile: js.UndefOr[String] = js.undefined
  
  /** Timestamp whe the request was created. The time is measured on server side. */
  var createTime: js.UndefOr[String] = js.undefined
  
  /** Required. The participant role to remove the suggestion feature config. Only HUMAN_AGENT or END_USER can be used. */
  var participantRole: js.UndefOr[String] = js.undefined
  
  /** Required. The type of the suggestion feature to remove. */
  var suggestionFeatureType: js.UndefOr[String] = js.undefined
}
object GoogleCloudDialogflowV2ClearSuggestionFeatureConfigOperationMetadata {
  
  inline def apply(): GoogleCloudDialogflowV2ClearSuggestionFeatureConfigOperationMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowV2ClearSuggestionFeatureConfigOperationMetadata]
  }
  
  extension [Self <: GoogleCloudDialogflowV2ClearSuggestionFeatureConfigOperationMetadata](x: Self) {
    
    inline def setConversationProfile(value: String): Self = StObject.set(x, "conversationProfile", value.asInstanceOf[js.Any])
    
    inline def setConversationProfileUndefined: Self = StObject.set(x, "conversationProfile", js.undefined)
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setParticipantRole(value: String): Self = StObject.set(x, "participantRole", value.asInstanceOf[js.Any])
    
    inline def setParticipantRoleUndefined: Self = StObject.set(x, "participantRole", js.undefined)
    
    inline def setSuggestionFeatureType(value: String): Self = StObject.set(x, "suggestionFeatureType", value.asInstanceOf[js.Any])
    
    inline def setSuggestionFeatureTypeUndefined: Self = StObject.set(x, "suggestionFeatureType", js.undefined)
  }
}
