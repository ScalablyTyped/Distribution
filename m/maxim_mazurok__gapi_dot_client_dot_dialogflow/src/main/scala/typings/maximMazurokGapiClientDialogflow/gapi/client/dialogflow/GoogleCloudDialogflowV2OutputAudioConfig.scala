package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDialogflowV2OutputAudioConfig extends StObject {
  
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
  implicit class GoogleCloudDialogflowV2OutputAudioConfigMutableBuilder[Self <: GoogleCloudDialogflowV2OutputAudioConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAudioEncoding(value: String): Self = StObject.set(x, "audioEncoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAudioEncodingUndefined: Self = StObject.set(x, "audioEncoding", js.undefined)
    
    @scala.inline
    def setSampleRateHertz(value: Double): Self = StObject.set(x, "sampleRateHertz", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSampleRateHertzUndefined: Self = StObject.set(x, "sampleRateHertz", js.undefined)
    
    @scala.inline
    def setSynthesizeSpeechConfig(value: GoogleCloudDialogflowV2SynthesizeSpeechConfig): Self = StObject.set(x, "synthesizeSpeechConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSynthesizeSpeechConfigUndefined: Self = StObject.set(x, "synthesizeSpeechConfig", js.undefined)
  }
}
