package typings.googleapis.dialogflowV2beta1Mod.dialogflowV2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowV2beta1SuggestArticlesRequest extends StObject {
  
  /**
    * Optional. Parameters for a human assist query.
    */
  var assistQueryParams: js.UndefOr[SchemaGoogleCloudDialogflowV2beta1AssistQueryParameters] = js.undefined
  
  /**
    * Optional. Max number of messages prior to and including latest_message to use as context when compiling the suggestion. By default 20 and at most 50.
    */
  var contextSize: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Optional. The name of the latest conversation message to compile suggestion for. If empty, it will be the latest message of the conversation. Format: `projects//locations//conversations//messages/`.
    */
  var latestMessage: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDialogflowV2beta1SuggestArticlesRequest {
  
  inline def apply(): SchemaGoogleCloudDialogflowV2beta1SuggestArticlesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2beta1SuggestArticlesRequest]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowV2beta1SuggestArticlesRequest](x: Self) {
    
    inline def setAssistQueryParams(value: SchemaGoogleCloudDialogflowV2beta1AssistQueryParameters): Self = StObject.set(x, "assistQueryParams", value.asInstanceOf[js.Any])
    
    inline def setAssistQueryParamsUndefined: Self = StObject.set(x, "assistQueryParams", js.undefined)
    
    inline def setContextSize(value: Double): Self = StObject.set(x, "contextSize", value.asInstanceOf[js.Any])
    
    inline def setContextSizeNull: Self = StObject.set(x, "contextSize", null)
    
    inline def setContextSizeUndefined: Self = StObject.set(x, "contextSize", js.undefined)
    
    inline def setLatestMessage(value: String): Self = StObject.set(x, "latestMessage", value.asInstanceOf[js.Any])
    
    inline def setLatestMessageNull: Self = StObject.set(x, "latestMessage", null)
    
    inline def setLatestMessageUndefined: Self = StObject.set(x, "latestMessage", js.undefined)
  }
}
