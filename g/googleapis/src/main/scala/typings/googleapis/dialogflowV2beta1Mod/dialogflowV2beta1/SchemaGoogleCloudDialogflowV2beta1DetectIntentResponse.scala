package typings.googleapis.dialogflowV2beta1Mod.dialogflowV2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The message returned from the DetectIntent method.
  */
trait SchemaGoogleCloudDialogflowV2beta1DetectIntentResponse extends StObject {
  
  /**
    * If Knowledge Connectors are enabled, there could be more than one result
    * returned for a given query or event, and this field will contain all
    * results except for the top one, which is captured in query_result. The
    * alternative results are ordered by decreasing
    * `QueryResult.intent_detection_confidence`. If Knowledge Connectors are
    * disabled, this field will be empty until multiple responses for regular
    * intents are supported, at which point those additional results will be
    * surfaced here.
    */
  var alternativeQueryResults: js.UndefOr[js.Array[SchemaGoogleCloudDialogflowV2beta1QueryResult]] = js.undefined
  
  /**
    * The audio data bytes encoded as specified in the request. Note: The
    * output audio is generated based on the values of default platform text
    * responses found in the `query_result.fulfillment_messages` field. If
    * multiple default text responses exist, they will be concatenated when
    * generating audio. If no default platform text responses exist, the
    * generated audio content will be empty.
    */
  var outputAudio: js.UndefOr[String] = js.undefined
  
  /**
    * Instructs the speech synthesizer how to generate the output audio. This
    * field is populated from the agent-level speech synthesizer configuration,
    * if enabled.
    */
  var outputAudioConfig: js.UndefOr[SchemaGoogleCloudDialogflowV2beta1OutputAudioConfig] = js.undefined
  
  /**
    * The selected results of the conversational query or event processing. See
    * `alternative_query_results` for additional potential results.
    */
  var queryResult: js.UndefOr[SchemaGoogleCloudDialogflowV2beta1QueryResult] = js.undefined
  
  /**
    * The unique identifier of the response. It can be used to locate a
    * response in the training example set or for reporting issues.
    */
  var responseId: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the status of the webhook request.
    */
  var webhookStatus: js.UndefOr[SchemaGoogleRpcStatus] = js.undefined
}
object SchemaGoogleCloudDialogflowV2beta1DetectIntentResponse {
  
  inline def apply(): SchemaGoogleCloudDialogflowV2beta1DetectIntentResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2beta1DetectIntentResponse]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowV2beta1DetectIntentResponse](x: Self) {
    
    inline def setAlternativeQueryResults(value: js.Array[SchemaGoogleCloudDialogflowV2beta1QueryResult]): Self = StObject.set(x, "alternativeQueryResults", value.asInstanceOf[js.Any])
    
    inline def setAlternativeQueryResultsUndefined: Self = StObject.set(x, "alternativeQueryResults", js.undefined)
    
    inline def setAlternativeQueryResultsVarargs(value: SchemaGoogleCloudDialogflowV2beta1QueryResult*): Self = StObject.set(x, "alternativeQueryResults", js.Array(value :_*))
    
    inline def setOutputAudio(value: String): Self = StObject.set(x, "outputAudio", value.asInstanceOf[js.Any])
    
    inline def setOutputAudioConfig(value: SchemaGoogleCloudDialogflowV2beta1OutputAudioConfig): Self = StObject.set(x, "outputAudioConfig", value.asInstanceOf[js.Any])
    
    inline def setOutputAudioConfigUndefined: Self = StObject.set(x, "outputAudioConfig", js.undefined)
    
    inline def setOutputAudioUndefined: Self = StObject.set(x, "outputAudio", js.undefined)
    
    inline def setQueryResult(value: SchemaGoogleCloudDialogflowV2beta1QueryResult): Self = StObject.set(x, "queryResult", value.asInstanceOf[js.Any])
    
    inline def setQueryResultUndefined: Self = StObject.set(x, "queryResult", js.undefined)
    
    inline def setResponseId(value: String): Self = StObject.set(x, "responseId", value.asInstanceOf[js.Any])
    
    inline def setResponseIdUndefined: Self = StObject.set(x, "responseId", js.undefined)
    
    inline def setWebhookStatus(value: SchemaGoogleRpcStatus): Self = StObject.set(x, "webhookStatus", value.asInstanceOf[js.Any])
    
    inline def setWebhookStatusUndefined: Self = StObject.set(x, "webhookStatus", js.undefined)
  }
}
