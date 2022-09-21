package typings.googleapis.dialogflowV2beta1Mod.dialogflowV2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowV2beta1Suggestion extends StObject {
  
  /**
    * Output only. Articles ordered by score in descending order.
    */
  var articles: js.UndefOr[js.Array[SchemaGoogleCloudDialogflowV2beta1SuggestionArticle]] = js.undefined
  
  /**
    * Output only. The time the suggestion was created.
    */
  var createTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Answers extracted from FAQ documents.
    */
  var faqAnswers: js.UndefOr[js.Array[SchemaGoogleCloudDialogflowV2beta1SuggestionFaqAnswer]] = js.undefined
  
  /**
    * Output only. Latest message used as context to compile this suggestion. Format: `projects//locations//conversations//messages/`.
    */
  var latestMessage: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The name of this suggestion. Format: `projects//locations//conversations//participants/x/suggestions/`.
    */
  var name: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDialogflowV2beta1Suggestion {
  
  inline def apply(): SchemaGoogleCloudDialogflowV2beta1Suggestion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2beta1Suggestion]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowV2beta1Suggestion](x: Self) {
    
    inline def setArticles(value: js.Array[SchemaGoogleCloudDialogflowV2beta1SuggestionArticle]): Self = StObject.set(x, "articles", value.asInstanceOf[js.Any])
    
    inline def setArticlesUndefined: Self = StObject.set(x, "articles", js.undefined)
    
    inline def setArticlesVarargs(value: SchemaGoogleCloudDialogflowV2beta1SuggestionArticle*): Self = StObject.set(x, "articles", js.Array(value*))
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeNull: Self = StObject.set(x, "createTime", null)
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setFaqAnswers(value: js.Array[SchemaGoogleCloudDialogflowV2beta1SuggestionFaqAnswer]): Self = StObject.set(x, "faqAnswers", value.asInstanceOf[js.Any])
    
    inline def setFaqAnswersUndefined: Self = StObject.set(x, "faqAnswers", js.undefined)
    
    inline def setFaqAnswersVarargs(value: SchemaGoogleCloudDialogflowV2beta1SuggestionFaqAnswer*): Self = StObject.set(x, "faqAnswers", js.Array(value*))
    
    inline def setLatestMessage(value: String): Self = StObject.set(x, "latestMessage", value.asInstanceOf[js.Any])
    
    inline def setLatestMessageNull: Self = StObject.set(x, "latestMessage", null)
    
    inline def setLatestMessageUndefined: Self = StObject.set(x, "latestMessage", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
