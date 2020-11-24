package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDialogflowV2OutputAudioConfig extends js.Object {
  
  /** Required. Audio encoding of the synthesized audio content. */
  var audioEncoding: js.UndefOr[String] = js.native
  
  /**
    * The synthesis sample rate (in hertz) for this audio. If not provided, then the synthesizer will use the default sample rate based on the audio encoding. If this is different from
    * the voice's natural sample rate, then the synthesizer will honor this request by converting to the desired sample rate (which might result in worse audio quality).
    */
  var sampleRateHertz: js.UndefOr[Double] = js.native
  
  /** Configuration of how speech should be synthesized. */
  var synthesizeSpeechConfig: js.UndefOr[GoogleCloudDialogflowV2SynthesizeSpeechConfig] = js.native
}
object GoogleCloudDialogflowV2OutputAudioConfig {
  
  @scala.inline
  def apply(): GoogleCloudDialogflowV2OutputAudioConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowV2OutputAudioConfig]
  }
  
  @scala.inline
  implicit class GoogleCloudDialogflowV2OutputAudioConfigOps[Self <: GoogleCloudDialogflowV2OutputAudioConfig] (val x: Self) extends AnyVal {
    
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
    def setAudioEncoding(value: String): Self = this.set("audioEncoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAudioEncoding: Self = this.set("audioEncoding", js.undefined)
    
    @scala.inline
    def setSampleRateHertz(value: Double): Self = this.set("sampleRateHertz", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSampleRateHertz: Self = this.set("sampleRateHertz", js.undefined)
    
    @scala.inline
    def setSynthesizeSpeechConfig(value: GoogleCloudDialogflowV2SynthesizeSpeechConfig): Self = this.set("synthesizeSpeechConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSynthesizeSpeechConfig: Self = this.set("synthesizeSpeechConfig", js.undefined)
  }
}
