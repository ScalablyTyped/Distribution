package typings.googleapis.contactcenterinsightsV1Mod.contactcenterinsightsV1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudContactcenterinsightsV1FaqAnswerData extends StObject {
  
  /**
    * The piece of text from the `source` knowledge base document.
    */
  var answer: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The system's confidence score that this answer is a good match for this conversation, ranging from 0.0 (completely uncertain) to 1.0 (completely certain).
    */
  var confidenceScore: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Map that contains metadata about the FAQ answer and the document that it originates from.
    */
  var metadata: js.UndefOr[StringDictionary[String] | Null] = js.undefined
  
  /**
    * The name of the answer record. Format: projects/{project\}/locations/{location\}/answerRecords/{answer_record\}
    */
  var queryRecord: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The corresponding FAQ question.
    */
  var question: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The knowledge document that this answer was extracted from. Format: projects/{project\}/knowledgeBases/{knowledge_base\}/documents/{document\}.
    */
  var source: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudContactcenterinsightsV1FaqAnswerData {
  
  inline def apply(): SchemaGoogleCloudContactcenterinsightsV1FaqAnswerData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudContactcenterinsightsV1FaqAnswerData]
  }
  
  extension [Self <: SchemaGoogleCloudContactcenterinsightsV1FaqAnswerData](x: Self) {
    
    inline def setAnswer(value: String): Self = StObject.set(x, "answer", value.asInstanceOf[js.Any])
    
    inline def setAnswerNull: Self = StObject.set(x, "answer", null)
    
    inline def setAnswerUndefined: Self = StObject.set(x, "answer", js.undefined)
    
    inline def setConfidenceScore(value: Double): Self = StObject.set(x, "confidenceScore", value.asInstanceOf[js.Any])
    
    inline def setConfidenceScoreNull: Self = StObject.set(x, "confidenceScore", null)
    
    inline def setConfidenceScoreUndefined: Self = StObject.set(x, "confidenceScore", js.undefined)
    
    inline def setMetadata(value: StringDictionary[String]): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataNull: Self = StObject.set(x, "metadata", null)
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setQueryRecord(value: String): Self = StObject.set(x, "queryRecord", value.asInstanceOf[js.Any])
    
    inline def setQueryRecordNull: Self = StObject.set(x, "queryRecord", null)
    
    inline def setQueryRecordUndefined: Self = StObject.set(x, "queryRecord", js.undefined)
    
    inline def setQuestion(value: String): Self = StObject.set(x, "question", value.asInstanceOf[js.Any])
    
    inline def setQuestionNull: Self = StObject.set(x, "question", null)
    
    inline def setQuestionUndefined: Self = StObject.set(x, "question", js.undefined)
    
    inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceNull: Self = StObject.set(x, "source", null)
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
  }
}
