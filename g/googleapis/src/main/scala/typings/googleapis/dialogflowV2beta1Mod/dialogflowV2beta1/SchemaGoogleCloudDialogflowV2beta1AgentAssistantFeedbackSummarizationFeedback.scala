package typings.googleapis.dialogflowV2beta1Mod.dialogflowV2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowV2beta1AgentAssistantFeedbackSummarizationFeedback extends StObject {
  
  /**
    * Timestamp when composing of the summary starts.
    */
  var startTimestamp: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Timestamp when the summary was submitted.
    */
  var submitTimestamp: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Text of actual submitted summary.
    */
  var summaryText: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDialogflowV2beta1AgentAssistantFeedbackSummarizationFeedback {
  
  inline def apply(): SchemaGoogleCloudDialogflowV2beta1AgentAssistantFeedbackSummarizationFeedback = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2beta1AgentAssistantFeedbackSummarizationFeedback]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowV2beta1AgentAssistantFeedbackSummarizationFeedback](x: Self) {
    
    inline def setStartTimestamp(value: String): Self = StObject.set(x, "startTimestamp", value.asInstanceOf[js.Any])
    
    inline def setStartTimestampNull: Self = StObject.set(x, "startTimestamp", null)
    
    inline def setStartTimestampUndefined: Self = StObject.set(x, "startTimestamp", js.undefined)
    
    inline def setSubmitTimestamp(value: String): Self = StObject.set(x, "submitTimestamp", value.asInstanceOf[js.Any])
    
    inline def setSubmitTimestampNull: Self = StObject.set(x, "submitTimestamp", null)
    
    inline def setSubmitTimestampUndefined: Self = StObject.set(x, "submitTimestamp", js.undefined)
    
    inline def setSummaryText(value: String): Self = StObject.set(x, "summaryText", value.asInstanceOf[js.Any])
    
    inline def setSummaryTextNull: Self = StObject.set(x, "summaryText", null)
    
    inline def setSummaryTextUndefined: Self = StObject.set(x, "summaryText", js.undefined)
  }
}
