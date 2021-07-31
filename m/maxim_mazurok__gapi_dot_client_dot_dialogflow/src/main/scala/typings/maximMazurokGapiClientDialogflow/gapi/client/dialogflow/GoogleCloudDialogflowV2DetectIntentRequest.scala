package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDialogflowV2DetectIntentRequest extends StObject {
  
  /**
    * The natural language speech audio to be processed. This field should be populated iff `query_input` is set to an input audio config. A single request can contain up to 1 minute of
    * speech audio data.
    */
  var inputAudio: js.UndefOr[String] = js.undefined
  
  /** Instructs the speech synthesizer how to generate the output audio. If this field is not set and agent-level speech synthesizer is not configured, no output audio is generated. */
  var outputAudioConfig: js.UndefOr[GoogleCloudDialogflowV2OutputAudioConfig] = js.undefined
  
  /**
    * Mask for output_audio_config indicating which settings in this request-level config should override speech synthesizer settings defined at agent-level. If unspecified or empty,
    * output_audio_config replaces the agent-level config in its entirety.
    */
  var outputAudioConfigMask: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The input specification. It can be set to: 1. an audio config which instructs the speech recognizer how to process the speech audio, 2. a conversational query in the form
    * of text, or 3. an event that specifies which intent to trigger.
    */
  var queryInput: js.UndefOr[GoogleCloudDialogflowV2QueryInput] = js.undefined
  
  /** The parameters of this query. */
  var queryParams: js.UndefOr[GoogleCloudDialogflowV2QueryParameters] = js.undefined
}
object GoogleCloudDialogflowV2DetectIntentRequest {
  
  @scala.inline
  def apply(): GoogleCloudDialogflowV2DetectIntentRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowV2DetectIntentRequest]
  }
  
  @scala.inline
  implicit class GoogleCloudDialogflowV2DetectIntentRequestMutableBuilder[Self <: GoogleCloudDialogflowV2DetectIntentRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInputAudio(value: String): Self = StObject.set(x, "inputAudio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputAudioUndefined: Self = StObject.set(x, "inputAudio", js.undefined)
    
    @scala.inline
    def setOutputAudioConfig(value: GoogleCloudDialogflowV2OutputAudioConfig): Self = StObject.set(x, "outputAudioConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputAudioConfigMask(value: String): Self = StObject.set(x, "outputAudioConfigMask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputAudioConfigMaskUndefined: Self = StObject.set(x, "outputAudioConfigMask", js.undefined)
    
    @scala.inline
    def setOutputAudioConfigUndefined: Self = StObject.set(x, "outputAudioConfig", js.undefined)
    
    @scala.inline
    def setQueryInput(value: GoogleCloudDialogflowV2QueryInput): Self = StObject.set(x, "queryInput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryInputUndefined: Self = StObject.set(x, "queryInput", js.undefined)
    
    @scala.inline
    def setQueryParams(value: GoogleCloudDialogflowV2QueryParameters): Self = StObject.set(x, "queryParams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryParamsUndefined: Self = StObject.set(x, "queryParams", js.undefined)
  }
}
