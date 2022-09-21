package typings.googleapis.dialogflowV2Mod.dialogflowV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowV2beta1SetSuggestionFeatureConfigOperationMetadata extends StObject {
  
  /**
    * The resource name of the conversation profile. Format: `projects//locations//conversationProfiles/`
    */
  var conversationProfile: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Timestamp whe the request was created. The time is measured on server side.
    */
  var createTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. The participant role to add or update the suggestion feature config. Only HUMAN_AGENT or END_USER can be used.
    */
  var participantRole: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. The type of the suggestion feature to add or update.
    */
  var suggestionFeatureType: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDialogflowV2beta1SetSuggestionFeatureConfigOperationMetadata {
  
  inline def apply(): SchemaGoogleCloudDialogflowV2beta1SetSuggestionFeatureConfigOperationMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2beta1SetSuggestionFeatureConfigOperationMetadata]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowV2beta1SetSuggestionFeatureConfigOperationMetadata](x: Self) {
    
    inline def setConversationProfile(value: String): Self = StObject.set(x, "conversationProfile", value.asInstanceOf[js.Any])
    
    inline def setConversationProfileNull: Self = StObject.set(x, "conversationProfile", null)
    
    inline def setConversationProfileUndefined: Self = StObject.set(x, "conversationProfile", js.undefined)
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeNull: Self = StObject.set(x, "createTime", null)
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setParticipantRole(value: String): Self = StObject.set(x, "participantRole", value.asInstanceOf[js.Any])
    
    inline def setParticipantRoleNull: Self = StObject.set(x, "participantRole", null)
    
    inline def setParticipantRoleUndefined: Self = StObject.set(x, "participantRole", js.undefined)
    
    inline def setSuggestionFeatureType(value: String): Self = StObject.set(x, "suggestionFeatureType", value.asInstanceOf[js.Any])
    
    inline def setSuggestionFeatureTypeNull: Self = StObject.set(x, "suggestionFeatureType", null)
    
    inline def setSuggestionFeatureTypeUndefined: Self = StObject.set(x, "suggestionFeatureType", js.undefined)
  }
}
