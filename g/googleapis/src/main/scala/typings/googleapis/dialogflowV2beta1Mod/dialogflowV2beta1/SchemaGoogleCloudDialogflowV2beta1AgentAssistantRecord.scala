package typings.googleapis.dialogflowV2beta1Mod.dialogflowV2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowV2beta1AgentAssistantRecord extends StObject {
  
  /**
    * Output only. The article suggestion answer.
    */
  var articleSuggestionAnswer: js.UndefOr[SchemaGoogleCloudDialogflowV2beta1ArticleAnswer] = js.undefined
  
  /**
    * Output only. The FAQ answer.
    */
  var faqAnswer: js.UndefOr[SchemaGoogleCloudDialogflowV2beta1FaqAnswer] = js.undefined
}
object SchemaGoogleCloudDialogflowV2beta1AgentAssistantRecord {
  
  inline def apply(): SchemaGoogleCloudDialogflowV2beta1AgentAssistantRecord = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2beta1AgentAssistantRecord]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowV2beta1AgentAssistantRecord](x: Self) {
    
    inline def setArticleSuggestionAnswer(value: SchemaGoogleCloudDialogflowV2beta1ArticleAnswer): Self = StObject.set(x, "articleSuggestionAnswer", value.asInstanceOf[js.Any])
    
    inline def setArticleSuggestionAnswerUndefined: Self = StObject.set(x, "articleSuggestionAnswer", js.undefined)
    
    inline def setFaqAnswer(value: SchemaGoogleCloudDialogflowV2beta1FaqAnswer): Self = StObject.set(x, "faqAnswer", value.asInstanceOf[js.Any])
    
    inline def setFaqAnswerUndefined: Self = StObject.set(x, "faqAnswer", js.undefined)
  }
}
