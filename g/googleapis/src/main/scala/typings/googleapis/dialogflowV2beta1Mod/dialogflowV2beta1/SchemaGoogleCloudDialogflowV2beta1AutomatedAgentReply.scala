package typings.googleapis.dialogflowV2beta1Mod.dialogflowV2beta1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowV2beta1AutomatedAgentReply extends StObject {
  
  /**
    * Indicates whether the partial automated agent reply is interruptible when a later reply message arrives. e.g. if the agent specified some music as partial response, it can be cancelled.
    */
  var allowCancellation: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * AutomatedAgentReply type.
    */
  var automatedAgentReplyType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The collection of current Dialogflow CX agent session parameters at the time of this response. Deprecated: Use `parameters` instead.
    */
  var cxSessionParameters: js.UndefOr[StringDictionary[Any] | Null] = js.undefined
  
  /**
    * Response of the Dialogflow Sessions.DetectIntent call.
    */
  var detectIntentResponse: js.UndefOr[SchemaGoogleCloudDialogflowV2beta1DetectIntentResponse] = js.undefined
  
  /**
    * Event name if an event is triggered for the query.
    */
  var event: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Name of the intent if an intent is matched for the query. For a V2 query, the value format is `projects//locations/ /agent/intents/`. For a V3 query, the value format is `projects//locations/ /agents//intents/`.
    */
  var intent: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The confidence of the match. Values range from 0.0 (completely uncertain) to 1.0 (completely certain). This value is for informational purpose only and is only used to help match the best intent within the classification threshold. This value may change for the same end-user expression at any time due to a model retraining or change in implementation.
    */
  var matchConfidence: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The collection of current parameters at the time of this response.
    */
  var parameters: js.UndefOr[StringDictionary[Any] | Null] = js.undefined
  
  /**
    * Response messages from the automated agent.
    */
  var responseMessages: js.UndefOr[js.Array[SchemaGoogleCloudDialogflowV2beta1ResponseMessage]] = js.undefined
}
object SchemaGoogleCloudDialogflowV2beta1AutomatedAgentReply {
  
  inline def apply(): SchemaGoogleCloudDialogflowV2beta1AutomatedAgentReply = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2beta1AutomatedAgentReply]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowV2beta1AutomatedAgentReply](x: Self) {
    
    inline def setAllowCancellation(value: Boolean): Self = StObject.set(x, "allowCancellation", value.asInstanceOf[js.Any])
    
    inline def setAllowCancellationNull: Self = StObject.set(x, "allowCancellation", null)
    
    inline def setAllowCancellationUndefined: Self = StObject.set(x, "allowCancellation", js.undefined)
    
    inline def setAutomatedAgentReplyType(value: String): Self = StObject.set(x, "automatedAgentReplyType", value.asInstanceOf[js.Any])
    
    inline def setAutomatedAgentReplyTypeNull: Self = StObject.set(x, "automatedAgentReplyType", null)
    
    inline def setAutomatedAgentReplyTypeUndefined: Self = StObject.set(x, "automatedAgentReplyType", js.undefined)
    
    inline def setCxSessionParameters(value: StringDictionary[Any]): Self = StObject.set(x, "cxSessionParameters", value.asInstanceOf[js.Any])
    
    inline def setCxSessionParametersNull: Self = StObject.set(x, "cxSessionParameters", null)
    
    inline def setCxSessionParametersUndefined: Self = StObject.set(x, "cxSessionParameters", js.undefined)
    
    inline def setDetectIntentResponse(value: SchemaGoogleCloudDialogflowV2beta1DetectIntentResponse): Self = StObject.set(x, "detectIntentResponse", value.asInstanceOf[js.Any])
    
    inline def setDetectIntentResponseUndefined: Self = StObject.set(x, "detectIntentResponse", js.undefined)
    
    inline def setEvent(value: String): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setEventNull: Self = StObject.set(x, "event", null)
    
    inline def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
    
    inline def setIntent(value: String): Self = StObject.set(x, "intent", value.asInstanceOf[js.Any])
    
    inline def setIntentNull: Self = StObject.set(x, "intent", null)
    
    inline def setIntentUndefined: Self = StObject.set(x, "intent", js.undefined)
    
    inline def setMatchConfidence(value: Double): Self = StObject.set(x, "matchConfidence", value.asInstanceOf[js.Any])
    
    inline def setMatchConfidenceNull: Self = StObject.set(x, "matchConfidence", null)
    
    inline def setMatchConfidenceUndefined: Self = StObject.set(x, "matchConfidence", js.undefined)
    
    inline def setParameters(value: StringDictionary[Any]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersNull: Self = StObject.set(x, "parameters", null)
    
    inline def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
    
    inline def setResponseMessages(value: js.Array[SchemaGoogleCloudDialogflowV2beta1ResponseMessage]): Self = StObject.set(x, "responseMessages", value.asInstanceOf[js.Any])
    
    inline def setResponseMessagesUndefined: Self = StObject.set(x, "responseMessages", js.undefined)
    
    inline def setResponseMessagesVarargs(value: SchemaGoogleCloudDialogflowV2beta1ResponseMessage*): Self = StObject.set(x, "responseMessages", js.Array(value*))
  }
}
