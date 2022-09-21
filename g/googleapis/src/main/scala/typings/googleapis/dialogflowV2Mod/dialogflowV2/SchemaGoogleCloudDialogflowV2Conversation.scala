package typings.googleapis.dialogflowV2Mod.dialogflowV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowV2Conversation extends StObject {
  
  /**
    * Required. The Conversation Profile to be used to configure this Conversation. This field cannot be updated. Format: `projects//locations//conversationProfiles/`.
    */
  var conversationProfile: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The stage of a conversation. It indicates whether the virtual agent or a human agent is handling the conversation. If the conversation is created with the conversation profile that has Dialogflow config set, defaults to ConversationStage.VIRTUAL_AGENT_STAGE; Otherwise, defaults to ConversationStage.HUMAN_ASSIST_STAGE. If the conversation is created with the conversation profile that has Dialogflow config set but explicitly sets conversation_stage to ConversationStage.HUMAN_ASSIST_STAGE, it skips ConversationStage.VIRTUAL_AGENT_STAGE stage and directly goes to ConversationStage.HUMAN_ASSIST_STAGE.
    */
  var conversationStage: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The time the conversation was finished.
    */
  var endTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The current state of the Conversation.
    */
  var lifecycleState: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The unique identifier of this conversation. Format: `projects//locations//conversations/`.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. It will not be empty if the conversation is to be connected over telephony.
    */
  var phoneNumber: js.UndefOr[SchemaGoogleCloudDialogflowV2ConversationPhoneNumber] = js.undefined
  
  /**
    * Output only. The time the conversation was started.
    */
  var startTime: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDialogflowV2Conversation {
  
  inline def apply(): SchemaGoogleCloudDialogflowV2Conversation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2Conversation]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowV2Conversation](x: Self) {
    
    inline def setConversationProfile(value: String): Self = StObject.set(x, "conversationProfile", value.asInstanceOf[js.Any])
    
    inline def setConversationProfileNull: Self = StObject.set(x, "conversationProfile", null)
    
    inline def setConversationProfileUndefined: Self = StObject.set(x, "conversationProfile", js.undefined)
    
    inline def setConversationStage(value: String): Self = StObject.set(x, "conversationStage", value.asInstanceOf[js.Any])
    
    inline def setConversationStageNull: Self = StObject.set(x, "conversationStage", null)
    
    inline def setConversationStageUndefined: Self = StObject.set(x, "conversationStage", js.undefined)
    
    inline def setEndTime(value: String): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeNull: Self = StObject.set(x, "endTime", null)
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    inline def setLifecycleState(value: String): Self = StObject.set(x, "lifecycleState", value.asInstanceOf[js.Any])
    
    inline def setLifecycleStateNull: Self = StObject.set(x, "lifecycleState", null)
    
    inline def setLifecycleStateUndefined: Self = StObject.set(x, "lifecycleState", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPhoneNumber(value: SchemaGoogleCloudDialogflowV2ConversationPhoneNumber): Self = StObject.set(x, "phoneNumber", value.asInstanceOf[js.Any])
    
    inline def setPhoneNumberUndefined: Self = StObject.set(x, "phoneNumber", js.undefined)
    
    inline def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeNull: Self = StObject.set(x, "startTime", null)
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
  }
}
