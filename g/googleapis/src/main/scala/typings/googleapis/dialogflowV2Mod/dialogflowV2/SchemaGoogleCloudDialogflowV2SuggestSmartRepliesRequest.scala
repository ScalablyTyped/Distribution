package typings.googleapis.dialogflowV2Mod.dialogflowV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowV2SuggestSmartRepliesRequest extends StObject {
  
  /**
    * Max number of messages prior to and including [latest_message] to use as context when compiling the suggestion. By default 20 and at most 50.
    */
  var contextSize: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The current natural language text segment to compile suggestion for. This provides a way for user to get follow up smart reply suggestion after a smart reply selection, without sending a text message.
    */
  var currentTextInput: js.UndefOr[SchemaGoogleCloudDialogflowV2TextInput] = js.undefined
  
  /**
    * The name of the latest conversation message to compile suggestion for. If empty, it will be the latest message of the conversation. Format: `projects//locations//conversations//messages/`.
    */
  var latestMessage: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDialogflowV2SuggestSmartRepliesRequest {
  
  inline def apply(): SchemaGoogleCloudDialogflowV2SuggestSmartRepliesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2SuggestSmartRepliesRequest]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowV2SuggestSmartRepliesRequest](x: Self) {
    
    inline def setContextSize(value: Double): Self = StObject.set(x, "contextSize", value.asInstanceOf[js.Any])
    
    inline def setContextSizeNull: Self = StObject.set(x, "contextSize", null)
    
    inline def setContextSizeUndefined: Self = StObject.set(x, "contextSize", js.undefined)
    
    inline def setCurrentTextInput(value: SchemaGoogleCloudDialogflowV2TextInput): Self = StObject.set(x, "currentTextInput", value.asInstanceOf[js.Any])
    
    inline def setCurrentTextInputUndefined: Self = StObject.set(x, "currentTextInput", js.undefined)
    
    inline def setLatestMessage(value: String): Self = StObject.set(x, "latestMessage", value.asInstanceOf[js.Any])
    
    inline def setLatestMessageNull: Self = StObject.set(x, "latestMessage", null)
    
    inline def setLatestMessageUndefined: Self = StObject.set(x, "latestMessage", js.undefined)
  }
}
