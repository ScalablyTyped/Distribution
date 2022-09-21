package typings.googleapis.dialogflowV2beta1Mod.dialogflowV2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowV2beta1AgentAssistantFeedback extends StObject {
  
  /**
    * Optional. Whether or not the suggested answer is relevant. For example: * Query: "Can I change my mailing address?" * Suggested document says: "Items must be returned/exchanged within 60 days of the purchase date." * answer_relevance: AnswerRelevance.IRRELEVANT
    */
  var answerRelevance: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. Whether or not the information in the document is correct. For example: * Query: "Can I return the package in 2 days once received?" * Suggested document says: "Items must be returned/exchanged within 60 days of the purchase date." * Ground truth: "No return or exchange is allowed." * [document_correctness]: INCORRECT
    */
  var documentCorrectness: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. Whether or not the suggested document is efficient. For example, if the document is poorly written, hard to understand, hard to use or too long to find useful information, document_efficiency is DocumentEfficiency.INEFFICIENT.
    */
  var documentEfficiency: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Feedback for conversation summarization.
    */
  var summarizationFeedback: js.UndefOr[SchemaGoogleCloudDialogflowV2beta1AgentAssistantFeedbackSummarizationFeedback] = js.undefined
}
object SchemaGoogleCloudDialogflowV2beta1AgentAssistantFeedback {
  
  inline def apply(): SchemaGoogleCloudDialogflowV2beta1AgentAssistantFeedback = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2beta1AgentAssistantFeedback]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowV2beta1AgentAssistantFeedback](x: Self) {
    
    inline def setAnswerRelevance(value: String): Self = StObject.set(x, "answerRelevance", value.asInstanceOf[js.Any])
    
    inline def setAnswerRelevanceNull: Self = StObject.set(x, "answerRelevance", null)
    
    inline def setAnswerRelevanceUndefined: Self = StObject.set(x, "answerRelevance", js.undefined)
    
    inline def setDocumentCorrectness(value: String): Self = StObject.set(x, "documentCorrectness", value.asInstanceOf[js.Any])
    
    inline def setDocumentCorrectnessNull: Self = StObject.set(x, "documentCorrectness", null)
    
    inline def setDocumentCorrectnessUndefined: Self = StObject.set(x, "documentCorrectness", js.undefined)
    
    inline def setDocumentEfficiency(value: String): Self = StObject.set(x, "documentEfficiency", value.asInstanceOf[js.Any])
    
    inline def setDocumentEfficiencyNull: Self = StObject.set(x, "documentEfficiency", null)
    
    inline def setDocumentEfficiencyUndefined: Self = StObject.set(x, "documentEfficiency", js.undefined)
    
    inline def setSummarizationFeedback(value: SchemaGoogleCloudDialogflowV2beta1AgentAssistantFeedbackSummarizationFeedback): Self = StObject.set(x, "summarizationFeedback", value.asInstanceOf[js.Any])
    
    inline def setSummarizationFeedbackUndefined: Self = StObject.set(x, "summarizationFeedback", js.undefined)
  }
}
