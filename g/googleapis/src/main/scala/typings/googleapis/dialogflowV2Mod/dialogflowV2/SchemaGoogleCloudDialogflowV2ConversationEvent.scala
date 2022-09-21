package typings.googleapis.dialogflowV2Mod.dialogflowV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowV2ConversationEvent extends StObject {
  
  /**
    * The unique identifier of the conversation this notification refers to. Format: `projects//conversations/`.
    */
  var conversation: js.UndefOr[String | Null] = js.undefined
  
  /**
    * More detailed information about an error. Only set for type UNRECOVERABLE_ERROR_IN_PHONE_CALL.
    */
  var errorStatus: js.UndefOr[SchemaGoogleRpcStatus] = js.undefined
  
  /**
    * Payload of NEW_MESSAGE event.
    */
  var newMessagePayload: js.UndefOr[SchemaGoogleCloudDialogflowV2Message] = js.undefined
  
  /**
    * The type of the event that this notification refers to.
    */
  var `type`: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDialogflowV2ConversationEvent {
  
  inline def apply(): SchemaGoogleCloudDialogflowV2ConversationEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2ConversationEvent]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowV2ConversationEvent](x: Self) {
    
    inline def setConversation(value: String): Self = StObject.set(x, "conversation", value.asInstanceOf[js.Any])
    
    inline def setConversationNull: Self = StObject.set(x, "conversation", null)
    
    inline def setConversationUndefined: Self = StObject.set(x, "conversation", js.undefined)
    
    inline def setErrorStatus(value: SchemaGoogleRpcStatus): Self = StObject.set(x, "errorStatus", value.asInstanceOf[js.Any])
    
    inline def setErrorStatusUndefined: Self = StObject.set(x, "errorStatus", js.undefined)
    
    inline def setNewMessagePayload(value: SchemaGoogleCloudDialogflowV2Message): Self = StObject.set(x, "newMessagePayload", value.asInstanceOf[js.Any])
    
    inline def setNewMessagePayloadUndefined: Self = StObject.set(x, "newMessagePayload", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
