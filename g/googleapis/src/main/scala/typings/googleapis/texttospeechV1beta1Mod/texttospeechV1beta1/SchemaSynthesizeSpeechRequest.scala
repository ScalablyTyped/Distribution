package typings.googleapis.texttospeechV1beta1Mod.texttospeechV1beta1

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
  def apply(): SchemaSynthesizeSpeechRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSynthesizeSpeechRequest]
  }
  @scala.inline
  implicit class SchemaSynthesizeSpeechRequestOps[Self <: SchemaSynthesizeSpeechRequest] (val x: Self) extends AnyVal {
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
    def setAudioConfig(value: SchemaAudioConfig): Self = this.set("audioConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAudioConfig: Self = this.set("audioConfig", js.undefined)
    @scala.inline
    def setInput(value: SchemaSynthesisInput): Self = this.set("input", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInput: Self = this.set("input", js.undefined)
    @scala.inline
    def setVoice(value: SchemaVoiceSelectionParams): Self = this.set("voice", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVoice: Self = this.set("voice", js.undefined)
  }
  
}

