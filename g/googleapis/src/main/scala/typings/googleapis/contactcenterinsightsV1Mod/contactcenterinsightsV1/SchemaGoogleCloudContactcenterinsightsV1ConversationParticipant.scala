package typings.googleapis.contactcenterinsightsV1Mod.contactcenterinsightsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudContactcenterinsightsV1ConversationParticipant extends StObject {
  
  /**
    * Deprecated. Use `dialogflow_participant_name` instead. The name of the Dialogflow participant. Format: projects/{project\}/locations/{location\}/conversations/{conversation\}/participants/{participant\}
    */
  var dialogflowParticipant: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The name of the participant provided by Dialogflow. Format: projects/{project\}/locations/{location\}/conversations/{conversation\}/participants/{participant\}
    */
  var dialogflowParticipantName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Obfuscated user ID from Dialogflow.
    */
  var obfuscatedExternalUserId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The role of the participant.
    */
  var role: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A user-specified ID representing the participant.
    */
  var userId: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudContactcenterinsightsV1ConversationParticipant {
  
  inline def apply(): SchemaGoogleCloudContactcenterinsightsV1ConversationParticipant = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudContactcenterinsightsV1ConversationParticipant]
  }
  
  extension [Self <: SchemaGoogleCloudContactcenterinsightsV1ConversationParticipant](x: Self) {
    
    inline def setDialogflowParticipant(value: String): Self = StObject.set(x, "dialogflowParticipant", value.asInstanceOf[js.Any])
    
    inline def setDialogflowParticipantName(value: String): Self = StObject.set(x, "dialogflowParticipantName", value.asInstanceOf[js.Any])
    
    inline def setDialogflowParticipantNameNull: Self = StObject.set(x, "dialogflowParticipantName", null)
    
    inline def setDialogflowParticipantNameUndefined: Self = StObject.set(x, "dialogflowParticipantName", js.undefined)
    
    inline def setDialogflowParticipantNull: Self = StObject.set(x, "dialogflowParticipant", null)
    
    inline def setDialogflowParticipantUndefined: Self = StObject.set(x, "dialogflowParticipant", js.undefined)
    
    inline def setObfuscatedExternalUserId(value: String): Self = StObject.set(x, "obfuscatedExternalUserId", value.asInstanceOf[js.Any])
    
    inline def setObfuscatedExternalUserIdNull: Self = StObject.set(x, "obfuscatedExternalUserId", null)
    
    inline def setObfuscatedExternalUserIdUndefined: Self = StObject.set(x, "obfuscatedExternalUserId", js.undefined)
    
    inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    inline def setRoleNull: Self = StObject.set(x, "role", null)
    
    inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
    
    inline def setUserId(value: String): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
    
    inline def setUserIdNull: Self = StObject.set(x, "userId", null)
    
    inline def setUserIdUndefined: Self = StObject.set(x, "userId", js.undefined)
  }
}
