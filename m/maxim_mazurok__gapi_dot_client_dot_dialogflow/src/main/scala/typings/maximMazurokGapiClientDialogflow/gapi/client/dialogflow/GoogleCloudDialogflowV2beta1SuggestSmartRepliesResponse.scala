package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDialogflowV2beta1SuggestSmartRepliesResponse extends StObject {
  
  /**
    * Number of messages prior to and including latest_message to compile the suggestion. It may be smaller than the SuggestSmartRepliesRequest.context_size field in the request if there
    * aren't that many messages in the conversation.
    */
  var contextSize: js.UndefOr[Double] = js.undefined
  
  /** The name of the latest conversation message used to compile suggestion for. Format: `projects//locations//conversations//messages/`. */
  var latestMessage: js.UndefOr[String] = js.undefined
  
  /**
    * Output only. Multiple reply options provided by smart reply service. The order is based on the rank of the model prediction. The maximum number of the returned replies is set in
    * SmartReplyConfig.
    */
  var smartReplyAnswers: js.UndefOr[js.Array[GoogleCloudDialogflowV2beta1SmartReplyAnswer]] = js.undefined
}
object GoogleCloudDialogflowV2beta1SuggestSmartRepliesResponse {
  
  inline def apply(): GoogleCloudDialogflowV2beta1SuggestSmartRepliesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowV2beta1SuggestSmartRepliesResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleCloudDialogflowV2beta1SuggestSmartRepliesResponse] (val x: Self) extends AnyVal {
    
    inline def setContextSize(value: Double): Self = StObject.set(x, "contextSize", value.asInstanceOf[js.Any])
    
    inline def setContextSizeUndefined: Self = StObject.set(x, "contextSize", js.undefined)
    
    inline def setLatestMessage(value: String): Self = StObject.set(x, "latestMessage", value.asInstanceOf[js.Any])
    
    inline def setLatestMessageUndefined: Self = StObject.set(x, "latestMessage", js.undefined)
    
    inline def setSmartReplyAnswers(value: js.Array[GoogleCloudDialogflowV2beta1SmartReplyAnswer]): Self = StObject.set(x, "smartReplyAnswers", value.asInstanceOf[js.Any])
    
    inline def setSmartReplyAnswersUndefined: Self = StObject.set(x, "smartReplyAnswers", js.undefined)
    
    inline def setSmartReplyAnswersVarargs(value: GoogleCloudDialogflowV2beta1SmartReplyAnswer*): Self = StObject.set(x, "smartReplyAnswers", js.Array(value*))
  }
}
