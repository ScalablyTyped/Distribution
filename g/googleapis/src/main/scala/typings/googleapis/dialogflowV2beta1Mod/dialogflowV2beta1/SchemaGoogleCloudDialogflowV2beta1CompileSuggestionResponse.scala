package typings.googleapis.dialogflowV2beta1Mod.dialogflowV2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowV2beta1CompileSuggestionResponse extends StObject {
  
  /**
    * Number of messages prior to and including latest_message to compile the suggestion. It may be smaller than the CompileSuggestionRequest.context_size field in the request if there aren't that many messages in the conversation.
    */
  var contextSize: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The name of the latest conversation message used to compile suggestion for. Format: `projects//locations//conversations//messages/`.
    */
  var latestMessage: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The compiled suggestion.
    */
  var suggestion: js.UndefOr[SchemaGoogleCloudDialogflowV2beta1Suggestion] = js.undefined
}
object SchemaGoogleCloudDialogflowV2beta1CompileSuggestionResponse {
  
  inline def apply(): SchemaGoogleCloudDialogflowV2beta1CompileSuggestionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2beta1CompileSuggestionResponse]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowV2beta1CompileSuggestionResponse](x: Self) {
    
    inline def setContextSize(value: Double): Self = StObject.set(x, "contextSize", value.asInstanceOf[js.Any])
    
    inline def setContextSizeNull: Self = StObject.set(x, "contextSize", null)
    
    inline def setContextSizeUndefined: Self = StObject.set(x, "contextSize", js.undefined)
    
    inline def setLatestMessage(value: String): Self = StObject.set(x, "latestMessage", value.asInstanceOf[js.Any])
    
    inline def setLatestMessageNull: Self = StObject.set(x, "latestMessage", null)
    
    inline def setLatestMessageUndefined: Self = StObject.set(x, "latestMessage", js.undefined)
    
    inline def setSuggestion(value: SchemaGoogleCloudDialogflowV2beta1Suggestion): Self = StObject.set(x, "suggestion", value.asInstanceOf[js.Any])
    
    inline def setSuggestionUndefined: Self = StObject.set(x, "suggestion", js.undefined)
  }
}
