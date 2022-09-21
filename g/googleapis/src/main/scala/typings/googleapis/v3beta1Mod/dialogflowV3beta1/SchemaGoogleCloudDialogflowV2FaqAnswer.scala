package typings.googleapis.v3beta1Mod.dialogflowV3beta1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowV2FaqAnswer extends StObject {
  
  /**
    * The piece of text from the `source` knowledge base document.
    */
  var answer: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The name of answer record, in the format of "projects//locations//answerRecords/"
    */
  var answerRecord: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The system's confidence score that this Knowledge answer is a good match for this conversational query, range from 0.0 (completely uncertain) to 1.0 (completely certain).
    */
  var confidence: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * A map that contains metadata about the answer and the document from which it originates.
    */
  var metadata: js.UndefOr[StringDictionary[String] | Null] = js.undefined
  
  /**
    * The corresponding FAQ question.
    */
  var question: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Indicates which Knowledge Document this answer was extracted from. Format: `projects//locations//agent/knowledgeBases//documents/`.
    */
  var source: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDialogflowV2FaqAnswer {
  
  inline def apply(): SchemaGoogleCloudDialogflowV2FaqAnswer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2FaqAnswer]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowV2FaqAnswer](x: Self) {
    
    inline def setAnswer(value: String): Self = StObject.set(x, "answer", value.asInstanceOf[js.Any])
    
    inline def setAnswerNull: Self = StObject.set(x, "answer", null)
    
    inline def setAnswerRecord(value: String): Self = StObject.set(x, "answerRecord", value.asInstanceOf[js.Any])
    
    inline def setAnswerRecordNull: Self = StObject.set(x, "answerRecord", null)
    
    inline def setAnswerRecordUndefined: Self = StObject.set(x, "answerRecord", js.undefined)
    
    inline def setAnswerUndefined: Self = StObject.set(x, "answer", js.undefined)
    
    inline def setConfidence(value: Double): Self = StObject.set(x, "confidence", value.asInstanceOf[js.Any])
    
    inline def setConfidenceNull: Self = StObject.set(x, "confidence", null)
    
    inline def setConfidenceUndefined: Self = StObject.set(x, "confidence", js.undefined)
    
    inline def setMetadata(value: StringDictionary[String]): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataNull: Self = StObject.set(x, "metadata", null)
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setQuestion(value: String): Self = StObject.set(x, "question", value.asInstanceOf[js.Any])
    
    inline def setQuestionNull: Self = StObject.set(x, "question", null)
    
    inline def setQuestionUndefined: Self = StObject.set(x, "question", js.undefined)
    
    inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceNull: Self = StObject.set(x, "source", null)
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
  }
}
