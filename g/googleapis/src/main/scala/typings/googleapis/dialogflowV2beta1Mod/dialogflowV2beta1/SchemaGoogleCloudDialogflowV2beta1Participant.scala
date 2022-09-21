package typings.googleapis.dialogflowV2beta1Mod.dialogflowV2beta1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowV2beta1Participant extends StObject {
  
  /**
    * Optional. Key-value filters on the metadata of documents returned by article suggestion. If specified, article suggestion only returns suggested documents that match all filters in their Document.metadata. Multiple values for a metadata key should be concatenated by comma. For example, filters to match all documents that have 'US' or 'CA' in their market metadata values and 'agent' in their user metadata values will be ``` documents_metadata_filters { key: "market" value: "US,CA" \} documents_metadata_filters { key: "user" value: "agent" \} ```
    */
  var documentsMetadataFilters: js.UndefOr[StringDictionary[String] | Null] = js.undefined
  
  /**
    * Optional. The unique identifier of this participant. Format: `projects//locations//conversations//participants/`.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. Obfuscated user id that should be associated with the created participant. You can specify a user id as follows: 1. If you set this field in CreateParticipantRequest or UpdateParticipantRequest, Dialogflow adds the obfuscated user id with the participant. 2. If you set this field in AnalyzeContent or StreamingAnalyzeContent, Dialogflow will update Participant.obfuscated_external_user_id. Dialogflow uses this user id for following purposes: 1) Billing and measurement. If user with the same obfuscated_external_user_id is created in a later conversation, dialogflow will know it's the same user. 2) Agent assist suggestion personalization. For example, Dialogflow can use it to provide personalized smart reply suggestions for this user. Note: * Please never pass raw user ids to Dialogflow. Always obfuscate your user id first. * Dialogflow only accepts a UTF-8 encoded string, e.g., a hex digest of a hash function like SHA-512. * The length of the user id must be <= 256 characters.
    */
  var obfuscatedExternalUserId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Immutable. The role this participant plays in the conversation. This field must be set during participant creation and is then immutable.
    */
  var role: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDialogflowV2beta1Participant {
  
  inline def apply(): SchemaGoogleCloudDialogflowV2beta1Participant = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2beta1Participant]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowV2beta1Participant](x: Self) {
    
    inline def setDocumentsMetadataFilters(value: StringDictionary[String]): Self = StObject.set(x, "documentsMetadataFilters", value.asInstanceOf[js.Any])
    
    inline def setDocumentsMetadataFiltersNull: Self = StObject.set(x, "documentsMetadataFilters", null)
    
    inline def setDocumentsMetadataFiltersUndefined: Self = StObject.set(x, "documentsMetadataFilters", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setObfuscatedExternalUserId(value: String): Self = StObject.set(x, "obfuscatedExternalUserId", value.asInstanceOf[js.Any])
    
    inline def setObfuscatedExternalUserIdNull: Self = StObject.set(x, "obfuscatedExternalUserId", null)
    
    inline def setObfuscatedExternalUserIdUndefined: Self = StObject.set(x, "obfuscatedExternalUserId", js.undefined)
    
    inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    inline def setRoleNull: Self = StObject.set(x, "role", null)
    
    inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
  }
}
