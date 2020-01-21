package typings.googleapis.dialogflowV2beta1Mod.dialogflowV2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Synthesizes speech and plays back the synthesized audio to the caller in
  * Telephony Gateway.  Telephony Gateway takes the synthesizer settings from
  * `DetectIntentResponse.output_audio_config` which can either be set at
  * request-level or can come from the agent-level synthesizer config.
  */
@js.native
trait SchemaGoogleCloudDialogflowV2beta1IntentMessageTelephonySynthesizeSpeech extends js.Object {
  /**
    * The SSML to be synthesized. For more information, see
    * [SSML](https://developers.google.com/actions/reference/ssml).
    */
  var ssml: js.UndefOr[String] = js.native
  /**
    * The raw text to be synthesized.
    */
  var text: js.UndefOr[String] = js.native
}

object SchemaGoogleCloudDialogflowV2beta1IntentMessageTelephonySynthesizeSpeech {
  @scala.inline
  def apply(ssml: String = null, text: String = null): SchemaGoogleCloudDialogflowV2beta1IntentMessageTelephonySynthesizeSpeech = {
    val __obj = js.Dynamic.literal()
    if (ssml != null) __obj.updateDynamic("ssml")(ssml.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2beta1IntentMessageTelephonySynthesizeSpeech]
  }
}

