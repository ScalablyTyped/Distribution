package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDialogflowV2beta1SuggestFaqAnswersResponse extends StObject {
  
  /**
    * Number of messages prior to and including latest_message to compile the suggestion. It may be smaller than the SuggestFaqAnswersRequest.context_size field in the request if there
    * aren't that many messages in the conversation.
    */
  var contextSize: js.UndefOr[Double] = js.undefined
  
  /** Output only. Answers extracted from FAQ documents. */
  var faqAnswers: js.UndefOr[js.Array[GoogleCloudDialogflowV2beta1FaqAnswer]] = js.undefined
  
  /** The name of the latest conversation message used to compile suggestion for. Format: `projects//locations//conversations//messages/`. */
  var latestMessage: js.UndefOr[String] = js.undefined
}
object GoogleCloudDialogflowV2beta1SuggestFaqAnswersResponse {
  
  inline def apply(): GoogleCloudDialogflowV2beta1SuggestFaqAnswersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowV2beta1SuggestFaqAnswersResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleCloudDialogflowV2beta1SuggestFaqAnswersResponse] (val x: Self) extends AnyVal {
    
    inline def setContextSize(value: Double): Self = StObject.set(x, "contextSize", value.asInstanceOf[js.Any])
    
    inline def setContextSizeUndefined: Self = StObject.set(x, "contextSize", js.undefined)
    
    inline def setFaqAnswers(value: js.Array[GoogleCloudDialogflowV2beta1FaqAnswer]): Self = StObject.set(x, "faqAnswers", value.asInstanceOf[js.Any])
    
    inline def setFaqAnswersUndefined: Self = StObject.set(x, "faqAnswers", js.undefined)
    
    inline def setFaqAnswersVarargs(value: GoogleCloudDialogflowV2beta1FaqAnswer*): Self = StObject.set(x, "faqAnswers", js.Array(value*))
    
    inline def setLatestMessage(value: String): Self = StObject.set(x, "latestMessage", value.asInstanceOf[js.Any])
    
    inline def setLatestMessageUndefined: Self = StObject.set(x, "latestMessage", js.undefined)
  }
}
