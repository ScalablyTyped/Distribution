package typings.googleapis.dialogflowV2Mod.dialogflowV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Instructs the speech synthesizer how to generate the output audio content.
  */
@js.native
trait SchemaGoogleCloudDialogflowV2OutputAudioConfig extends StObject {
  
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
  def apply(): SchemaGoogleCloudDialogflowV2OutputAudioConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2OutputAudioConfig]
  }
  
  @scala.inline
  implicit class SchemaGoogleCloudDialogflowV2OutputAudioConfigMutableBuilder[Self <: SchemaGoogleCloudDialogflowV2OutputAudioConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAudioEncoding(value: String): Self = StObject.set(x, "audioEncoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAudioEncodingUndefined: Self = StObject.set(x, "audioEncoding", js.undefined)
    
    @scala.inline
    def setSampleRateHertz(value: Double): Self = StObject.set(x, "sampleRateHertz", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSampleRateHertzUndefined: Self = StObject.set(x, "sampleRateHertz", js.undefined)
    
    @scala.inline
    def setSynthesizeSpeechConfig(value: SchemaGoogleCloudDialogflowV2SynthesizeSpeechConfig): Self = StObject.set(x, "synthesizeSpeechConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSynthesizeSpeechConfigUndefined: Self = StObject.set(x, "synthesizeSpeechConfig", js.undefined)
  }
}
