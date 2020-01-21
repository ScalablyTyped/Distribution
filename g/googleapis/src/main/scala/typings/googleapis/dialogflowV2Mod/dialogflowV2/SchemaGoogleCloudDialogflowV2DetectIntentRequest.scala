package typings.googleapis.dialogflowV2Mod.dialogflowV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The request to detect user&#39;s intent.
  */
@js.native
trait SchemaGoogleCloudDialogflowV2DetectIntentRequest extends js.Object {
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
  var outputAudioConfig: js.UndefOr[SchemaGoogleCloudDialogflowV2OutputAudioConfig] = js.native
  /**
    * Required. The input specification. It can be set to:  1.  an audio config
    * which instructs the speech recognizer how to process the speech audio, 2.
    * a conversational query in the form of text, or  3.  an event that
    * specifies which intent to trigger.
    */
  var queryInput: js.UndefOr[SchemaGoogleCloudDialogflowV2QueryInput] = js.native
  /**
    * Optional. The parameters of this query.
    */
  var queryParams: js.UndefOr[SchemaGoogleCloudDialogflowV2QueryParameters] = js.native
}

object SchemaGoogleCloudDialogflowV2DetectIntentRequest {
  @scala.inline
  def apply(
    inputAudio: String = null,
    outputAudioConfig: SchemaGoogleCloudDialogflowV2OutputAudioConfig = null,
    queryInput: SchemaGoogleCloudDialogflowV2QueryInput = null,
    queryParams: SchemaGoogleCloudDialogflowV2QueryParameters = null
  ): SchemaGoogleCloudDialogflowV2DetectIntentRequest = {
    val __obj = js.Dynamic.literal()
    if (inputAudio != null) __obj.updateDynamic("inputAudio")(inputAudio.asInstanceOf[js.Any])
    if (outputAudioConfig != null) __obj.updateDynamic("outputAudioConfig")(outputAudioConfig.asInstanceOf[js.Any])
    if (queryInput != null) __obj.updateDynamic("queryInput")(queryInput.asInstanceOf[js.Any])
    if (queryParams != null) __obj.updateDynamic("queryParams")(queryParams.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2DetectIntentRequest]
  }
}

