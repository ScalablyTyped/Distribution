package typings.googleapis.v3beta1Mod.dialogflowV3beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowV2SuggestFaqAnswersResponse extends StObject {
  
  /**
    * Number of messages prior to and including latest_message to compile the suggestion. It may be smaller than the SuggestFaqAnswersRequest.context_size field in the request if there aren't that many messages in the conversation.
    */
  var contextSize: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Answers extracted from FAQ documents.
    */
  var faqAnswers: js.UndefOr[js.Array[SchemaGoogleCloudDialogflowV2FaqAnswer]] = js.undefined
  
  /**
    * The name of the latest conversation message used to compile suggestion for. Format: `projects//locations//conversations//messages/`.
    */
  var latestMessage: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDialogflowV2SuggestFaqAnswersResponse {
  
  inline def apply(): SchemaGoogleCloudDialogflowV2SuggestFaqAnswersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2SuggestFaqAnswersResponse]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowV2SuggestFaqAnswersResponse](x: Self) {
    
    inline def setContextSize(value: Double): Self = StObject.set(x, "contextSize", value.asInstanceOf[js.Any])
    
    inline def setContextSizeNull: Self = StObject.set(x, "contextSize", null)
    
    inline def setContextSizeUndefined: Self = StObject.set(x, "contextSize", js.undefined)
    
    inline def setFaqAnswers(value: js.Array[SchemaGoogleCloudDialogflowV2FaqAnswer]): Self = StObject.set(x, "faqAnswers", value.asInstanceOf[js.Any])
    
    inline def setFaqAnswersUndefined: Self = StObject.set(x, "faqAnswers", js.undefined)
    
    inline def setFaqAnswersVarargs(value: SchemaGoogleCloudDialogflowV2FaqAnswer*): Self = StObject.set(x, "faqAnswers", js.Array(value*))
    
    inline def setLatestMessage(value: String): Self = StObject.set(x, "latestMessage", value.asInstanceOf[js.Any])
    
    inline def setLatestMessageNull: Self = StObject.set(x, "latestMessage", null)
    
    inline def setLatestMessageUndefined: Self = StObject.set(x, "latestMessage", js.undefined)
  }
}
