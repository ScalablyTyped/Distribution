package typings.googleapis.dialogflowV2beta1Mod.dialogflowV2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowV2beta1HumanAgentAssistantConfigSuggestionQueryConfig extends StObject {
  
  /**
    * Confidence threshold of query result. Agent Assist gives each suggestion a score in the range [0.0, 1.0], based on the relevance between the suggestion and the current conversation context. A score of 0.0 has no relevance, while a score of 1.0 has high relevance. Only suggestions with a score greater than or equal to the value of this field are included in the results. For a baseline model (the default), the recommended value is in the range [0.05, 0.1]. For a custom model, there is no recommended value. Tune this value by starting from a very low value and slowly increasing until you have desired results. If this field is not set, it is default to 0.0, which means that all suggestions are returned. Supported features: ARTICLE_SUGGESTION, FAQ, SMART_REPLY, SMART_COMPOSE.
    */
  var confidenceThreshold: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Determines how recent conversation context is filtered when generating suggestions. If unspecified, no messages will be dropped.
    */
  var contextFilterSettings: js.UndefOr[
    SchemaGoogleCloudDialogflowV2beta1HumanAgentAssistantConfigSuggestionQueryConfigContextFilterSettings
  ] = js.undefined
  
  /**
    * Query from Dialogflow agent. It is used by DIALOGFLOW_ASSIST.
    */
  var dialogflowQuerySource: js.UndefOr[
    SchemaGoogleCloudDialogflowV2beta1HumanAgentAssistantConfigSuggestionQueryConfigDialogflowQuerySource
  ] = js.undefined
  
  /**
    * Query from knowledge base document. It is used by: SMART_REPLY, SMART_COMPOSE.
    */
  var documentQuerySource: js.UndefOr[
    SchemaGoogleCloudDialogflowV2beta1HumanAgentAssistantConfigSuggestionQueryConfigDocumentQuerySource
  ] = js.undefined
  
  /**
    * Query from knowledgebase. It is used by: ARTICLE_SUGGESTION, FAQ.
    */
  var knowledgeBaseQuerySource: js.UndefOr[
    SchemaGoogleCloudDialogflowV2beta1HumanAgentAssistantConfigSuggestionQueryConfigKnowledgeBaseQuerySource
  ] = js.undefined
  
  /**
    * Maximum number of results to return. Currently, if unset, defaults to 10. And the max number is 20.
    */
  var maxResults: js.UndefOr[Double | Null] = js.undefined
}
object SchemaGoogleCloudDialogflowV2beta1HumanAgentAssistantConfigSuggestionQueryConfig {
  
  inline def apply(): SchemaGoogleCloudDialogflowV2beta1HumanAgentAssistantConfigSuggestionQueryConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2beta1HumanAgentAssistantConfigSuggestionQueryConfig]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowV2beta1HumanAgentAssistantConfigSuggestionQueryConfig](x: Self) {
    
    inline def setConfidenceThreshold(value: Double): Self = StObject.set(x, "confidenceThreshold", value.asInstanceOf[js.Any])
    
    inline def setConfidenceThresholdNull: Self = StObject.set(x, "confidenceThreshold", null)
    
    inline def setConfidenceThresholdUndefined: Self = StObject.set(x, "confidenceThreshold", js.undefined)
    
    inline def setContextFilterSettings(
      value: SchemaGoogleCloudDialogflowV2beta1HumanAgentAssistantConfigSuggestionQueryConfigContextFilterSettings
    ): Self = StObject.set(x, "contextFilterSettings", value.asInstanceOf[js.Any])
    
    inline def setContextFilterSettingsUndefined: Self = StObject.set(x, "contextFilterSettings", js.undefined)
    
    inline def setDialogflowQuerySource(
      value: SchemaGoogleCloudDialogflowV2beta1HumanAgentAssistantConfigSuggestionQueryConfigDialogflowQuerySource
    ): Self = StObject.set(x, "dialogflowQuerySource", value.asInstanceOf[js.Any])
    
    inline def setDialogflowQuerySourceUndefined: Self = StObject.set(x, "dialogflowQuerySource", js.undefined)
    
    inline def setDocumentQuerySource(
      value: SchemaGoogleCloudDialogflowV2beta1HumanAgentAssistantConfigSuggestionQueryConfigDocumentQuerySource
    ): Self = StObject.set(x, "documentQuerySource", value.asInstanceOf[js.Any])
    
    inline def setDocumentQuerySourceUndefined: Self = StObject.set(x, "documentQuerySource", js.undefined)
    
    inline def setKnowledgeBaseQuerySource(
      value: SchemaGoogleCloudDialogflowV2beta1HumanAgentAssistantConfigSuggestionQueryConfigKnowledgeBaseQuerySource
    ): Self = StObject.set(x, "knowledgeBaseQuerySource", value.asInstanceOf[js.Any])
    
    inline def setKnowledgeBaseQuerySourceUndefined: Self = StObject.set(x, "knowledgeBaseQuerySource", js.undefined)
    
    inline def setMaxResults(value: Double): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsNull: Self = StObject.set(x, "maxResults", null)
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
  }
}
