package typings.googleapis.texttospeechV1Mod.texttospeechV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The top-level message sent by the client for the `SynthesizeSpeech` method.
  */
@js.native
trait SchemaSynthesizeSpeechRequest extends js.Object {
  /**
    * Required. The configuration of the synthesized audio.
    */
  var audioConfig: js.UndefOr[SchemaAudioConfig] = js.native
  /**
    * Required. The Synthesizer requires either plain text or SSML as input.
    */
  var input: js.UndefOr[SchemaSynthesisInput] = js.native
  /**
    * Required. The desired voice of the synthesized audio.
    */
  var voice: js.UndefOr[SchemaVoiceSelectionParams] = js.native
}

object SchemaSynthesizeSpeechRequest {
  @scala.inline
  def apply(
    audioConfig: SchemaAudioConfig = null,
    input: SchemaSynthesisInput = null,
    voice: SchemaVoiceSelectionParams = null
  ): SchemaSynthesizeSpeechRequest = {
    val __obj = js.Dynamic.literal()
    if (audioConfig != null) __obj.updateDynamic("audioConfig")(audioConfig.asInstanceOf[js.Any])
    if (input != null) __obj.updateDynamic("input")(input.asInstanceOf[js.Any])
    if (voice != null) __obj.updateDynamic("voice")(voice.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaSynthesizeSpeechRequest]
  }
}

