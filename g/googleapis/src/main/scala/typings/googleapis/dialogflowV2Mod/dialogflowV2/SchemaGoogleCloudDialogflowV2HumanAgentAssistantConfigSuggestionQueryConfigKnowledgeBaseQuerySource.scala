package typings.googleapis.dialogflowV2Mod.dialogflowV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionQueryConfigKnowledgeBaseQuerySource extends StObject {
  
  /**
    * Required. Knowledge bases to query. Format: `projects//locations//knowledgeBases/`. Currently, at most 5 knowledge bases are supported.
    */
  var knowledgeBases: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaGoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionQueryConfigKnowledgeBaseQuerySource {
  
  inline def apply(): SchemaGoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionQueryConfigKnowledgeBaseQuerySource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionQueryConfigKnowledgeBaseQuerySource]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionQueryConfigKnowledgeBaseQuerySource](x: Self) {
    
    inline def setKnowledgeBases(value: js.Array[String]): Self = StObject.set(x, "knowledgeBases", value.asInstanceOf[js.Any])
    
    inline def setKnowledgeBasesNull: Self = StObject.set(x, "knowledgeBases", null)
    
    inline def setKnowledgeBasesUndefined: Self = StObject.set(x, "knowledgeBases", js.undefined)
    
    inline def setKnowledgeBasesVarargs(value: String*): Self = StObject.set(x, "knowledgeBases", js.Array(value*))
  }
}
