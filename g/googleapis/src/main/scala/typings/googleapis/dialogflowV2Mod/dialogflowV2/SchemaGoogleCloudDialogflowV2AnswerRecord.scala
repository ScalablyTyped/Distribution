package typings.googleapis.dialogflowV2Mod.dialogflowV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowV2AnswerRecord extends StObject {
  
  /**
    * Output only. The record for human agent assistant.
    */
  var agentAssistantRecord: js.UndefOr[SchemaGoogleCloudDialogflowV2AgentAssistantRecord] = js.undefined
  
  /**
    * Required. The AnswerFeedback for this record. You can set this with AnswerRecords.UpdateAnswerRecord in order to give us feedback about this answer.
    */
  var answerFeedback: js.UndefOr[SchemaGoogleCloudDialogflowV2AnswerFeedback] = js.undefined
  
  /**
    * The unique identifier of this answer record. Format: `projects//locations//answerRecords/`.
    */
  var name: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDialogflowV2AnswerRecord {
  
  inline def apply(): SchemaGoogleCloudDialogflowV2AnswerRecord = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2AnswerRecord]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowV2AnswerRecord](x: Self) {
    
    inline def setAgentAssistantRecord(value: SchemaGoogleCloudDialogflowV2AgentAssistantRecord): Self = StObject.set(x, "agentAssistantRecord", value.asInstanceOf[js.Any])
    
    inline def setAgentAssistantRecordUndefined: Self = StObject.set(x, "agentAssistantRecord", js.undefined)
    
    inline def setAnswerFeedback(value: SchemaGoogleCloudDialogflowV2AnswerFeedback): Self = StObject.set(x, "answerFeedback", value.asInstanceOf[js.Any])
    
    inline def setAnswerFeedbackUndefined: Self = StObject.set(x, "answerFeedback", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
