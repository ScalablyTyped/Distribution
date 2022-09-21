package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDialogflowV2beta1SuggestArticlesResponse extends StObject {
  
  /** Output only. Articles ordered by score in descending order. */
  var articleAnswers: js.UndefOr[js.Array[GoogleCloudDialogflowV2beta1ArticleAnswer]] = js.undefined
  
  /**
    * Number of messages prior to and including latest_message to compile the suggestion. It may be smaller than the SuggestArticlesResponse.context_size field in the request if there
    * aren't that many messages in the conversation.
    */
  var contextSize: js.UndefOr[Double] = js.undefined
  
  /** The name of the latest conversation message used to compile suggestion for. Format: `projects//locations//conversations//messages/`. */
  var latestMessage: js.UndefOr[String] = js.undefined
}
object GoogleCloudDialogflowV2beta1SuggestArticlesResponse {
  
  inline def apply(): GoogleCloudDialogflowV2beta1SuggestArticlesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowV2beta1SuggestArticlesResponse]
  }
  
  extension [Self <: GoogleCloudDialogflowV2beta1SuggestArticlesResponse](x: Self) {
    
    inline def setArticleAnswers(value: js.Array[GoogleCloudDialogflowV2beta1ArticleAnswer]): Self = StObject.set(x, "articleAnswers", value.asInstanceOf[js.Any])
    
    inline def setArticleAnswersUndefined: Self = StObject.set(x, "articleAnswers", js.undefined)
    
    inline def setArticleAnswersVarargs(value: GoogleCloudDialogflowV2beta1ArticleAnswer*): Self = StObject.set(x, "articleAnswers", js.Array(value*))
    
    inline def setContextSize(value: Double): Self = StObject.set(x, "contextSize", value.asInstanceOf[js.Any])
    
    inline def setContextSizeUndefined: Self = StObject.set(x, "contextSize", js.undefined)
    
    inline def setLatestMessage(value: String): Self = StObject.set(x, "latestMessage", value.asInstanceOf[js.Any])
    
    inline def setLatestMessageUndefined: Self = StObject.set(x, "latestMessage", js.undefined)
  }
}
