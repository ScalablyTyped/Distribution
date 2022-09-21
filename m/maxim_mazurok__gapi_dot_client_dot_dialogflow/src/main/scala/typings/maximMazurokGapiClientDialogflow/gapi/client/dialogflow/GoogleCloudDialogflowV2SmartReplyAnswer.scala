package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDialogflowV2SmartReplyAnswer extends StObject {
  
  /** The name of answer record, in the format of "projects//locations//answerRecords/" */
  var answerRecord: js.UndefOr[String] = js.undefined
  
  /** Smart reply confidence. The system's confidence score that this reply is a good match for this conversation, as a value from 0.0 (completely uncertain) to 1.0 (completely certain). */
  var confidence: js.UndefOr[Double] = js.undefined
  
  /** The content of the reply. */
  var reply: js.UndefOr[String] = js.undefined
}
object GoogleCloudDialogflowV2SmartReplyAnswer {
  
  inline def apply(): GoogleCloudDialogflowV2SmartReplyAnswer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowV2SmartReplyAnswer]
  }
  
  extension [Self <: GoogleCloudDialogflowV2SmartReplyAnswer](x: Self) {
    
    inline def setAnswerRecord(value: String): Self = StObject.set(x, "answerRecord", value.asInstanceOf[js.Any])
    
    inline def setAnswerRecordUndefined: Self = StObject.set(x, "answerRecord", js.undefined)
    
    inline def setConfidence(value: Double): Self = StObject.set(x, "confidence", value.asInstanceOf[js.Any])
    
    inline def setConfidenceUndefined: Self = StObject.set(x, "confidence", js.undefined)
    
    inline def setReply(value: String): Self = StObject.set(x, "reply", value.asInstanceOf[js.Any])
    
    inline def setReplyUndefined: Self = StObject.set(x, "reply", js.undefined)
  }
}
