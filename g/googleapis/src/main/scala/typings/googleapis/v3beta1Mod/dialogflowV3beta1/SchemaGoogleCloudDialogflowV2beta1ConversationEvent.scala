package typings.googleapis.v3beta1Mod.dialogflowV3beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowV2beta1ConversationEvent extends StObject {
  
  /**
    * Required. The unique identifier of the conversation this notification refers to. Format: `projects//conversations/`.
    */
  var conversation: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. More detailed information about an error. Only set for type UNRECOVERABLE_ERROR_IN_PHONE_CALL.
    */
  var errorStatus: js.UndefOr[SchemaGoogleRpcStatus] = js.undefined
  
  /**
    * Payload of NEW_MESSAGE event.
    */
  var newMessagePayload: js.UndefOr[SchemaGoogleCloudDialogflowV2beta1Message] = js.undefined
  
  /**
    * Required. The type of the event that this notification refers to.
    */
  var `type`: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDialogflowV2beta1ConversationEvent {
  
  inline def apply(): SchemaGoogleCloudDialogflowV2beta1ConversationEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2beta1ConversationEvent]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowV2beta1ConversationEvent](x: Self) {
    
    inline def setConversation(value: String): Self = StObject.set(x, "conversation", value.asInstanceOf[js.Any])
    
    inline def setConversationNull: Self = StObject.set(x, "conversation", null)
    
    inline def setConversationUndefined: Self = StObject.set(x, "conversation", js.undefined)
    
    inline def setErrorStatus(value: SchemaGoogleRpcStatus): Self = StObject.set(x, "errorStatus", value.asInstanceOf[js.Any])
    
    inline def setErrorStatusUndefined: Self = StObject.set(x, "errorStatus", js.undefined)
    
    inline def setNewMessagePayload(value: SchemaGoogleCloudDialogflowV2beta1Message): Self = StObject.set(x, "newMessagePayload", value.asInstanceOf[js.Any])
    
    inline def setNewMessagePayloadUndefined: Self = StObject.set(x, "newMessagePayload", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
