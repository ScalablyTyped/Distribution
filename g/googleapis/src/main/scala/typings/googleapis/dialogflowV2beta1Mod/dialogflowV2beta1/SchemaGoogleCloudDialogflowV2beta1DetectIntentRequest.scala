package typings.googleapis.dialogflowV2beta1Mod.dialogflowV2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The request to detect user&#39;s intent.
  */
@js.native
trait SchemaGoogleCloudDialogflowV2beta1DetectIntentRequest extends js.Object {
  /**
    * Optional. The natural language speech audio to be processed. This field
    * should be populated iff `query_input` is set to an input audio config. A
    * single request can contain up to 1 minute of speech audio data.
    */
  var inputAudio: js.UndefOr[String] = js.native
  /**
    * Optional. Instructs the speech synthesizer how to generate the output
    * audio. If this field is not set and agent-level speech synthesizer is not
    * configured, no output audio is generated.
    */
  var outputAudioConfig: js.UndefOr[SchemaGoogleCloudDialogflowV2beta1OutputAudioConfig] = js.native
  /**
    * Required. The input specification. It can be set to:  1.  an audio config
    * which instructs the speech recognizer how to process the speech audio, 2.
    * a conversational query in the form of text, or  3.  an event that
    * specifies which intent to trigger.
    */
  var queryInput: js.UndefOr[SchemaGoogleCloudDialogflowV2beta1QueryInput] = js.native
  /**
    * Optional. The parameters of this query.
    */
  var queryParams: js.UndefOr[SchemaGoogleCloudDialogflowV2beta1QueryParameters] = js.native
}

object SchemaGoogleCloudDialogflowV2beta1DetectIntentRequest {
  @scala.inline
  def apply(): SchemaGoogleCloudDialogflowV2beta1DetectIntentRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2beta1DetectIntentRequest]
  }
  @scala.inline
  implicit class SchemaGoogleCloudDialogflowV2beta1DetectIntentRequestOps[Self <: SchemaGoogleCloudDialogflowV2beta1DetectIntentRequest] (val x: Self) extends AnyVal {
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
    def setOutputAudioConfig(value: SchemaGoogleCloudDialogflowV2beta1OutputAudioConfig): Self = this.set("outputAudioConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOutputAudioConfig: Self = this.set("outputAudioConfig", js.undefined)
    @scala.inline
    def setQueryInput(value: SchemaGoogleCloudDialogflowV2beta1QueryInput): Self = this.set("queryInput", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQueryInput: Self = this.set("queryInput", js.undefined)
    @scala.inline
    def setQueryParams(value: SchemaGoogleCloudDialogflowV2beta1QueryParameters): Self = this.set("queryParams", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQueryParams: Self = this.set("queryParams", js.undefined)
  }
  
}

