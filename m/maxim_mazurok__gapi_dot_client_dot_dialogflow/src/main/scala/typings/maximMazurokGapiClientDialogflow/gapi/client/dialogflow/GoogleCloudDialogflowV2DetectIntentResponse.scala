package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDialogflowV2DetectIntentResponse extends StObject {
  
  /**
    * The audio data bytes encoded as specified in the request. Note: The output audio is generated based on the values of default platform text responses found in the
    * `query_result.fulfillment_messages` field. If multiple default text responses exist, they will be concatenated when generating audio. If no default platform text responses exist,
    * the generated audio content will be empty. In some scenarios, multiple output audio fields may be present in the response structure. In these cases, only the top-most-level audio
    * output has content.
    */
  var outputAudio: js.UndefOr[String] = js.undefined
  
  /** The config used by the speech synthesizer to generate the output audio. */
  var outputAudioConfig: js.UndefOr[GoogleCloudDialogflowV2OutputAudioConfig] = js.undefined
  
  /** The selected results of the conversational query or event processing. See `alternative_query_results` for additional potential results. */
  var queryResult: js.UndefOr[GoogleCloudDialogflowV2QueryResult] = js.undefined
  
  /** The unique identifier of the response. It can be used to locate a response in the training example set or for reporting issues. */
  var responseId: js.UndefOr[String] = js.undefined
  
  /** Specifies the status of the webhook request. */
  var webhookStatus: js.UndefOr[GoogleRpcStatus] = js.undefined
}
object GoogleCloudDialogflowV2DetectIntentResponse {
  
  @scala.inline
  def apply(): GoogleCloudDialogflowV2DetectIntentResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowV2DetectIntentResponse]
  }
  
  @scala.inline
  implicit class GoogleCloudDialogflowV2DetectIntentResponseMutableBuilder[Self <: GoogleCloudDialogflowV2DetectIntentResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOutputAudio(value: String): Self = StObject.set(x, "outputAudio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputAudioConfig(value: GoogleCloudDialogflowV2OutputAudioConfig): Self = StObject.set(x, "outputAudioConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputAudioConfigUndefined: Self = StObject.set(x, "outputAudioConfig", js.undefined)
    
    @scala.inline
    def setOutputAudioUndefined: Self = StObject.set(x, "outputAudio", js.undefined)
    
    @scala.inline
    def setQueryResult(value: GoogleCloudDialogflowV2QueryResult): Self = StObject.set(x, "queryResult", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryResultUndefined: Self = StObject.set(x, "queryResult", js.undefined)
    
    @scala.inline
    def setResponseId(value: String): Self = StObject.set(x, "responseId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponseIdUndefined: Self = StObject.set(x, "responseId", js.undefined)
    
    @scala.inline
    def setWebhookStatus(value: GoogleRpcStatus): Self = StObject.set(x, "webhookStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebhookStatusUndefined: Self = StObject.set(x, "webhookStatus", js.undefined)
  }
}
