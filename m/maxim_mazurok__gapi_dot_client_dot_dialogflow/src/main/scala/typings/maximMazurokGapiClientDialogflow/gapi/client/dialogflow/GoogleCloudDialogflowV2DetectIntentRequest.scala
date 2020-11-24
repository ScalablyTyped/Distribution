package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDialogflowV2DetectIntentRequest extends js.Object {
  
  /**
    * The natural language speech audio to be processed. This field should be populated iff `query_input` is set to an input audio config. A single request can contain up to 1 minute of
    * speech audio data.
    */
  var inputAudio: js.UndefOr[String] = js.native
  
  /** Instructs the speech synthesizer how to generate the output audio. If this field is not set and agent-level speech synthesizer is not configured, no output audio is generated. */
  var outputAudioConfig: js.UndefOr[GoogleCloudDialogflowV2OutputAudioConfig] = js.native
  
  /**
    * Mask for output_audio_config indicating which settings in this request-level config should override speech synthesizer settings defined at agent-level. If unspecified or empty,
    * output_audio_config replaces the agent-level config in its entirety.
    */
  var outputAudioConfigMask: js.UndefOr[String] = js.native
  
  /**
    * Required. The input specification. It can be set to: 1. an audio config which instructs the speech recognizer how to process the speech audio, 2. a conversational query in the form
    * of text, or 3. an event that specifies which intent to trigger.
    */
  var queryInput: js.UndefOr[GoogleCloudDialogflowV2QueryInput] = js.native
  
  /** The parameters of this query. */
  var queryParams: js.UndefOr[GoogleCloudDialogflowV2QueryParameters] = js.native
}
object GoogleCloudDialogflowV2DetectIntentRequest {
  
  @scala.inline
  def apply(): GoogleCloudDialogflowV2DetectIntentRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowV2DetectIntentRequest]
  }
  
  @scala.inline
  implicit class GoogleCloudDialogflowV2DetectIntentRequestOps[Self <: GoogleCloudDialogflowV2DetectIntentRequest] (val x: Self) extends AnyVal {
    
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
    def setInputAudio(value: String): Self = this.set("inputAudio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInputAudio: Self = this.set("inputAudio", js.undefined)
    
    @scala.inline
    def setOutputAudioConfig(value: GoogleCloudDialogflowV2OutputAudioConfig): Self = this.set("outputAudioConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutputAudioConfig: Self = this.set("outputAudioConfig", js.undefined)
    
    @scala.inline
    def setOutputAudioConfigMask(value: String): Self = this.set("outputAudioConfigMask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutputAudioConfigMask: Self = this.set("outputAudioConfigMask", js.undefined)
    
    @scala.inline
    def setQueryInput(value: GoogleCloudDialogflowV2QueryInput): Self = this.set("queryInput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQueryInput: Self = this.set("queryInput", js.undefined)
    
    @scala.inline
    def setQueryParams(value: GoogleCloudDialogflowV2QueryParameters): Self = this.set("queryParams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQueryParams: Self = this.set("queryParams", js.undefined)
  }
}
