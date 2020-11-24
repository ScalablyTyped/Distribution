package typings.googleapis.dialogflowV2beta1Mod.dialogflowV2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Configuration of how speech should be synthesized.
  */
@js.native
trait SchemaGoogleCloudDialogflowV2beta1SynthesizeSpeechConfig extends js.Object {
  
  /**
    * Optional. An identifier which selects &#39;audio effects&#39; profiles
    * that are applied on (post synthesized) text to speech. Effects are
    * applied on top of each other in the order they are given.
    */
  var effectsProfileId: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Optional. Speaking pitch, in the range [-20.0, 20.0]. 20 means increase
    * 20 semitones from the original pitch. -20 means decrease 20 semitones
    * from the original pitch.
    */
  var pitch: js.UndefOr[Double] = js.native
  
  /**
    * Optional. Speaking rate/speed, in the range [0.25, 4.0]. 1.0 is the
    * normal native speed supported by the specific voice. 2.0 is twice as
    * fast, and 0.5 is half as fast. If unset(0.0), defaults to the native 1.0
    * speed. Any other values &lt; 0.25 or &gt; 4.0 will return an error.
    */
  var speakingRate: js.UndefOr[Double] = js.native
  
  /**
    * Optional. The desired voice of the synthesized audio.
    */
  var voice: js.UndefOr[SchemaGoogleCloudDialogflowV2beta1VoiceSelectionParams] = js.native
  
  /**
    * Optional. Volume gain (in dB) of the normal native volume supported by
    * the specific voice, in the range [-96.0, 16.0]. If unset, or set to a
    * value of 0.0 (dB), will play at normal native signal amplitude. A value
    * of -6.0 (dB) will play at approximately half the amplitude of the normal
    * native signal amplitude. A value of +6.0 (dB) will play at approximately
    * twice the amplitude of the normal native signal amplitude. We strongly
    * recommend not to exceed +10 (dB) as there&#39;s usually no effective
    * increase in loudness for any value greater than that.
    */
  var volumeGainDb: js.UndefOr[Double] = js.native
}
object SchemaGoogleCloudDialogflowV2beta1SynthesizeSpeechConfig {
  
  @scala.inline
  def apply(): SchemaGoogleCloudDialogflowV2beta1SynthesizeSpeechConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2beta1SynthesizeSpeechConfig]
  }
  
  @scala.inline
  implicit class SchemaGoogleCloudDialogflowV2beta1SynthesizeSpeechConfigOps[Self <: SchemaGoogleCloudDialogflowV2beta1SynthesizeSpeechConfig] (val x: Self) extends AnyVal {
    
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
    def setEffectsProfileIdVarargs(value: String*): Self = this.set("effectsProfileId", js.Array(value :_*))
    
    @scala.inline
    def setEffectsProfileId(value: js.Array[String]): Self = this.set("effectsProfileId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEffectsProfileId: Self = this.set("effectsProfileId", js.undefined)
    
    @scala.inline
    def setPitch(value: Double): Self = this.set("pitch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePitch: Self = this.set("pitch", js.undefined)
    
    @scala.inline
    def setSpeakingRate(value: Double): Self = this.set("speakingRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpeakingRate: Self = this.set("speakingRate", js.undefined)
    
    @scala.inline
    def setVoice(value: SchemaGoogleCloudDialogflowV2beta1VoiceSelectionParams): Self = this.set("voice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVoice: Self = this.set("voice", js.undefined)
    
    @scala.inline
    def setVolumeGainDb(value: Double): Self = this.set("volumeGainDb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVolumeGainDb: Self = this.set("volumeGainDb", js.undefined)
  }
}
