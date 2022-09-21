package typings.googleapis.dialogflowV2beta1Mod.dialogflowV2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowV2beta1SuggestArticlesResponse extends StObject {
  
  /**
    * Output only. Articles ordered by score in descending order.
    */
  var articleAnswers: js.UndefOr[js.Array[SchemaGoogleCloudDialogflowV2beta1ArticleAnswer]] = js.undefined
  
  /**
    * Number of messages prior to and including latest_message to compile the suggestion. It may be smaller than the SuggestArticlesResponse.context_size field in the request if there aren't that many messages in the conversation.
    */
  var contextSize: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The name of the latest conversation message used to compile suggestion for. Format: `projects//locations//conversations//messages/`.
    */
  var latestMessage: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDialogflowV2beta1SuggestArticlesResponse {
  
  inline def apply(): SchemaGoogleCloudDialogflowV2beta1SuggestArticlesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2beta1SuggestArticlesResponse]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowV2beta1SuggestArticlesResponse](x: Self) {
    
    inline def setArticleAnswers(value: js.Array[SchemaGoogleCloudDialogflowV2beta1ArticleAnswer]): Self = StObject.set(x, "articleAnswers", value.asInstanceOf[js.Any])
    
    inline def setArticleAnswersUndefined: Self = StObject.set(x, "articleAnswers", js.undefined)
    
    inline def setArticleAnswersVarargs(value: SchemaGoogleCloudDialogflowV2beta1ArticleAnswer*): Self = StObject.set(x, "articleAnswers", js.Array(value*))
    
    inline def setContextSize(value: Double): Self = StObject.set(x, "contextSize", value.asInstanceOf[js.Any])
    
    inline def setContextSizeNull: Self = StObject.set(x, "contextSize", null)
    
    inline def setContextSizeUndefined: Self = StObject.set(x, "contextSize", js.undefined)
    
    inline def setLatestMessage(value: String): Self = StObject.set(x, "latestMessage", value.asInstanceOf[js.Any])
    
    inline def setLatestMessageNull: Self = StObject.set(x, "latestMessage", null)
    
    inline def setLatestMessageUndefined: Self = StObject.set(x, "latestMessage", js.undefined)
  }
}
