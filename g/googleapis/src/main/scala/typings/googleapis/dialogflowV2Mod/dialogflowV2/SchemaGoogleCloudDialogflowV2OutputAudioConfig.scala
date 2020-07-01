package typings.googleapis.dialogflowV2Mod.dialogflowV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Instructs the speech synthesizer how to generate the output audio content.
  */
@js.native
trait SchemaGoogleCloudDialogflowV2OutputAudioConfig extends js.Object {
  /**
    * Required. Audio encoding of the synthesized audio content.
    */
  var audioEncoding: js.UndefOr[String] = js.native
  /**
    * Optional. The synthesis sample rate (in hertz) for this audio. If not
    * provided, then the synthesizer will use the default sample rate based on
    * the audio encoding. If this is different from the voice&#39;s natural
    * sample rate, then the synthesizer will honor this request by converting
    * to the desired sample rate (which might result in worse audio quality).
    */
  var sampleRateHertz: js.UndefOr[Double] = js.native
  /**
    * Optional. Configuration of how speech should be synthesized.
    */
  var synthesizeSpeechConfig: js.UndefOr[SchemaGoogleCloudDialogflowV2SynthesizeSpeechConfig] = js.native
}

object SchemaGoogleCloudDialogflowV2OutputAudioConfig {
  @scala.inline
  def apply(
    audioEncoding: String = null,
    sampleRateHertz: js.UndefOr[Double] = js.undefined,
    synthesizeSpeechConfig: SchemaGoogleCloudDialogflowV2SynthesizeSpeechConfig = null
  ): SchemaGoogleCloudDialogflowV2OutputAudioConfig = {
    val __obj = js.Dynamic.literal()
    if (audioEncoding != null) __obj.updateDynamic("audioEncoding")(audioEncoding.asInstanceOf[js.Any])
    if (!js.isUndefined(sampleRateHertz)) __obj.updateDynamic("sampleRateHertz")(sampleRateHertz.get.asInstanceOf[js.Any])
    if (synthesizeSpeechConfig != null) __obj.updateDynamic("synthesizeSpeechConfig")(synthesizeSpeechConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2OutputAudioConfig]
  }
}

