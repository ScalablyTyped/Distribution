package typings.googleapis.dialogflowV2beta1Mod.dialogflowV2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowV2SmartReplyAnswer extends StObject {
  
  /**
    * The name of answer record, in the format of "projects//locations//answerRecords/"
    */
  var answerRecord: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Smart reply confidence. The system's confidence score that this reply is a good match for this conversation, as a value from 0.0 (completely uncertain) to 1.0 (completely certain).
    */
  var confidence: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The content of the reply.
    */
  var reply: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDialogflowV2SmartReplyAnswer {
  
  inline def apply(): SchemaGoogleCloudDialogflowV2SmartReplyAnswer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2SmartReplyAnswer]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowV2SmartReplyAnswer](x: Self) {
    
    inline def setAnswerRecord(value: String): Self = StObject.set(x, "answerRecord", value.asInstanceOf[js.Any])
    
    inline def setAnswerRecordNull: Self = StObject.set(x, "answerRecord", null)
    
    inline def setAnswerRecordUndefined: Self = StObject.set(x, "answerRecord", js.undefined)
    
    inline def setConfidence(value: Double): Self = StObject.set(x, "confidence", value.asInstanceOf[js.Any])
    
    inline def setConfidenceNull: Self = StObject.set(x, "confidence", null)
    
    inline def setConfidenceUndefined: Self = StObject.set(x, "confidence", js.undefined)
    
    inline def setReply(value: String): Self = StObject.set(x, "reply", value.asInstanceOf[js.Any])
    
    inline def setReplyNull: Self = StObject.set(x, "reply", null)
    
    inline def setReplyUndefined: Self = StObject.set(x, "reply", js.undefined)
  }
}
