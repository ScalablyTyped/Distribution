package typings.googleapis.contactcenterinsightsV1Mod.contactcenterinsightsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudContactcenterinsightsV1RuntimeAnnotation extends StObject {
  
  /**
    * The unique identifier of the annotation. Format: projects/{project\}/locations/{location\}/conversationDatasets/{dataset\}/conversationDataItems/{data_item\}/conversationAnnotations/{annotation\}
    */
  var annotationId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The feedback that the customer has about the answer in `data`.
    */
  var answerFeedback: js.UndefOr[SchemaGoogleCloudContactcenterinsightsV1AnswerFeedback] = js.undefined
  
  /**
    * Agent Assist Article Suggestion data.
    */
  var articleSuggestion: js.UndefOr[SchemaGoogleCloudContactcenterinsightsV1ArticleSuggestionData] = js.undefined
  
  /**
    * The time at which this annotation was created.
    */
  var createTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Dialogflow interaction data.
    */
  var dialogflowInteraction: js.UndefOr[SchemaGoogleCloudContactcenterinsightsV1DialogflowInteractionData] = js.undefined
  
  /**
    * The boundary in the conversation where the annotation ends, inclusive.
    */
  var endBoundary: js.UndefOr[SchemaGoogleCloudContactcenterinsightsV1AnnotationBoundary] = js.undefined
  
  /**
    * Agent Assist FAQ answer data.
    */
  var faqAnswer: js.UndefOr[SchemaGoogleCloudContactcenterinsightsV1FaqAnswerData] = js.undefined
  
  /**
    * Agent Assist Smart Compose suggestion data.
    */
  var smartComposeSuggestion: js.UndefOr[SchemaGoogleCloudContactcenterinsightsV1SmartComposeSuggestionData] = js.undefined
  
  /**
    * Agent Assist Smart Reply data.
    */
  var smartReply: js.UndefOr[SchemaGoogleCloudContactcenterinsightsV1SmartReplyData] = js.undefined
  
  /**
    * The boundary in the conversation where the annotation starts, inclusive.
    */
  var startBoundary: js.UndefOr[SchemaGoogleCloudContactcenterinsightsV1AnnotationBoundary] = js.undefined
}
object SchemaGoogleCloudContactcenterinsightsV1RuntimeAnnotation {
  
  inline def apply(): SchemaGoogleCloudContactcenterinsightsV1RuntimeAnnotation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudContactcenterinsightsV1RuntimeAnnotation]
  }
  
  extension [Self <: SchemaGoogleCloudContactcenterinsightsV1RuntimeAnnotation](x: Self) {
    
    inline def setAnnotationId(value: String): Self = StObject.set(x, "annotationId", value.asInstanceOf[js.Any])
    
    inline def setAnnotationIdNull: Self = StObject.set(x, "annotationId", null)
    
    inline def setAnnotationIdUndefined: Self = StObject.set(x, "annotationId", js.undefined)
    
    inline def setAnswerFeedback(value: SchemaGoogleCloudContactcenterinsightsV1AnswerFeedback): Self = StObject.set(x, "answerFeedback", value.asInstanceOf[js.Any])
    
    inline def setAnswerFeedbackUndefined: Self = StObject.set(x, "answerFeedback", js.undefined)
    
    inline def setArticleSuggestion(value: SchemaGoogleCloudContactcenterinsightsV1ArticleSuggestionData): Self = StObject.set(x, "articleSuggestion", value.asInstanceOf[js.Any])
    
    inline def setArticleSuggestionUndefined: Self = StObject.set(x, "articleSuggestion", js.undefined)
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeNull: Self = StObject.set(x, "createTime", null)
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setDialogflowInteraction(value: SchemaGoogleCloudContactcenterinsightsV1DialogflowInteractionData): Self = StObject.set(x, "dialogflowInteraction", value.asInstanceOf[js.Any])
    
    inline def setDialogflowInteractionUndefined: Self = StObject.set(x, "dialogflowInteraction", js.undefined)
    
    inline def setEndBoundary(value: SchemaGoogleCloudContactcenterinsightsV1AnnotationBoundary): Self = StObject.set(x, "endBoundary", value.asInstanceOf[js.Any])
    
    inline def setEndBoundaryUndefined: Self = StObject.set(x, "endBoundary", js.undefined)
    
    inline def setFaqAnswer(value: SchemaGoogleCloudContactcenterinsightsV1FaqAnswerData): Self = StObject.set(x, "faqAnswer", value.asInstanceOf[js.Any])
    
    inline def setFaqAnswerUndefined: Self = StObject.set(x, "faqAnswer", js.undefined)
    
    inline def setSmartComposeSuggestion(value: SchemaGoogleCloudContactcenterinsightsV1SmartComposeSuggestionData): Self = StObject.set(x, "smartComposeSuggestion", value.asInstanceOf[js.Any])
    
    inline def setSmartComposeSuggestionUndefined: Self = StObject.set(x, "smartComposeSuggestion", js.undefined)
    
    inline def setSmartReply(value: SchemaGoogleCloudContactcenterinsightsV1SmartReplyData): Self = StObject.set(x, "smartReply", value.asInstanceOf[js.Any])
    
    inline def setSmartReplyUndefined: Self = StObject.set(x, "smartReply", js.undefined)
    
    inline def setStartBoundary(value: SchemaGoogleCloudContactcenterinsightsV1AnnotationBoundary): Self = StObject.set(x, "startBoundary", value.asInstanceOf[js.Any])
    
    inline def setStartBoundaryUndefined: Self = StObject.set(x, "startBoundary", js.undefined)
  }
}
