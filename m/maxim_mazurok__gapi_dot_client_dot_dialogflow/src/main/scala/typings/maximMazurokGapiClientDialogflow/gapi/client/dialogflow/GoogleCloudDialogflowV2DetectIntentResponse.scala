package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDialogflowV2DetectIntentResponse extends js.Object {
  
  /**
    * The audio data bytes encoded as specified in the request. Note: The output audio is generated based on the values of default platform text responses found in the
    * `query_result.fulfillment_messages` field. If multiple default text responses exist, they will be concatenated when generating audio. If no default platform text responses exist,
    * the generated audio content will be empty. In some scenarios, multiple output audio fields may be present in the response structure. In these cases, only the top-most-level audio
    * output has content.
    */
  var outputAudio: js.UndefOr[String] = js.native
  
  /** The config used by the speech synthesizer to generate the output audio. */
  var outputAudioConfig: js.UndefOr[GoogleCloudDialogflowV2OutputAudioConfig] = js.native
  
  /** The selected results of the conversational query or event processing. See `alternative_query_results` for additional potential results. */
  var queryResult: js.UndefOr[GoogleCloudDialogflowV2QueryResult] = js.native
  
  /** The unique identifier of the response. It can be used to locate a response in the training example set or for reporting issues. */
  var responseId: js.UndefOr[String] = js.native
  
  /** Specifies the status of the webhook request. */
  var webhookStatus: js.UndefOr[GoogleRpcStatus] = js.native
}
object GoogleCloudDialogflowV2DetectIntentResponse {
  
  @scala.inline
  def apply(): GoogleCloudDialogflowV2DetectIntentResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowV2DetectIntentResponse]
  }
  
  @scala.inline
  implicit class GoogleCloudDialogflowV2DetectIntentResponseOps[Self <: GoogleCloudDialogflowV2DetectIntentResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setOutputAudio(value: String): Self = this.set("outputAudio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutputAudio: Self = this.set("outputAudio", js.undefined)
    
    @scala.inline
    def setOutputAudioConfig(value: GoogleCloudDialogflowV2OutputAudioConfig): Self = this.set("outputAudioConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutputAudioConfig: Self = this.set("outputAudioConfig", js.undefined)
    
    @scala.inline
    def setQueryResult(value: GoogleCloudDialogflowV2QueryResult): Self = this.set("queryResult", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQueryResult: Self = this.set("queryResult", js.undefined)
    
    @scala.inline
    def setResponseId(value: String): Self = this.set("responseId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResponseId: Self = this.set("responseId", js.undefined)
    
    @scala.inline
    def setWebhookStatus(value: GoogleRpcStatus): Self = this.set("webhookStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWebhookStatus: Self = this.set("webhookStatus", js.undefined)
  }
}
