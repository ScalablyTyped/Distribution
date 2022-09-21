package typings.googleapis.dialogflowV2Mod.dialogflowV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowV2AgentAssistantRecord extends StObject {
  
  /**
    * Output only. The article suggestion answer.
    */
  var articleSuggestionAnswer: js.UndefOr[SchemaGoogleCloudDialogflowV2ArticleAnswer] = js.undefined
  
  /**
    * Output only. The FAQ answer.
    */
  var faqAnswer: js.UndefOr[SchemaGoogleCloudDialogflowV2FaqAnswer] = js.undefined
}
object SchemaGoogleCloudDialogflowV2AgentAssistantRecord {
  
  inline def apply(): SchemaGoogleCloudDialogflowV2AgentAssistantRecord = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2AgentAssistantRecord]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowV2AgentAssistantRecord](x: Self) {
    
    inline def setArticleSuggestionAnswer(value: SchemaGoogleCloudDialogflowV2ArticleAnswer): Self = StObject.set(x, "articleSuggestionAnswer", value.asInstanceOf[js.Any])
    
    inline def setArticleSuggestionAnswerUndefined: Self = StObject.set(x, "articleSuggestionAnswer", js.undefined)
    
    inline def setFaqAnswer(value: SchemaGoogleCloudDialogflowV2FaqAnswer): Self = StObject.set(x, "faqAnswer", value.asInstanceOf[js.Any])
    
    inline def setFaqAnswerUndefined: Self = StObject.set(x, "faqAnswer", js.undefined)
  }
}
