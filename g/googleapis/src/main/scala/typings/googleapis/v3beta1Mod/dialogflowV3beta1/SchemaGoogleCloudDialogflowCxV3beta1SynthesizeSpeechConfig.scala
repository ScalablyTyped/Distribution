package typings.googleapis.v3beta1Mod.dialogflowV3beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowCxV3beta1SynthesizeSpeechConfig extends StObject {
  
  /**
    * Optional. An identifier which selects 'audio effects' profiles that are applied on (post synthesized) text to speech. Effects are applied on top of each other in the order they are given.
    */
  var effectsProfileId: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Optional. Speaking pitch, in the range [-20.0, 20.0]. 20 means increase 20 semitones from the original pitch. -20 means decrease 20 semitones from the original pitch.
    */
  var pitch: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Optional. Speaking rate/speed, in the range [0.25, 4.0]. 1.0 is the normal native speed supported by the specific voice. 2.0 is twice as fast, and 0.5 is half as fast. If unset(0.0), defaults to the native 1.0 speed. Any other values < 0.25 or \> 4.0 will return an error.
    */
  var speakingRate: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Optional. The desired voice of the synthesized audio.
    */
  var voice: js.UndefOr[SchemaGoogleCloudDialogflowCxV3beta1VoiceSelectionParams] = js.undefined
  
  /**
    * Optional. Volume gain (in dB) of the normal native volume supported by the specific voice, in the range [-96.0, 16.0]. If unset, or set to a value of 0.0 (dB), will play at normal native signal amplitude. A value of -6.0 (dB) will play at approximately half the amplitude of the normal native signal amplitude. A value of +6.0 (dB) will play at approximately twice the amplitude of the normal native signal amplitude. We strongly recommend not to exceed +10 (dB) as there's usually no effective increase in loudness for any value greater than that.
    */
  var volumeGainDb: js.UndefOr[Double | Null] = js.undefined
}
object SchemaGoogleCloudDialogflowCxV3beta1SynthesizeSpeechConfig {
  
  inline def apply(): SchemaGoogleCloudDialogflowCxV3beta1SynthesizeSpeechConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowCxV3beta1SynthesizeSpeechConfig]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowCxV3beta1SynthesizeSpeechConfig](x: Self) {
    
    inline def setEffectsProfileId(value: js.Array[String]): Self = StObject.set(x, "effectsProfileId", value.asInstanceOf[js.Any])
    
    inline def setEffectsProfileIdNull: Self = StObject.set(x, "effectsProfileId", null)
    
    inline def setEffectsProfileIdUndefined: Self = StObject.set(x, "effectsProfileId", js.undefined)
    
    inline def setEffectsProfileIdVarargs(value: String*): Self = StObject.set(x, "effectsProfileId", js.Array(value*))
    
    inline def setPitch(value: Double): Self = StObject.set(x, "pitch", value.asInstanceOf[js.Any])
    
    inline def setPitchNull: Self = StObject.set(x, "pitch", null)
    
    inline def setPitchUndefined: Self = StObject.set(x, "pitch", js.undefined)
    
    inline def setSpeakingRate(value: Double): Self = StObject.set(x, "speakingRate", value.asInstanceOf[js.Any])
    
    inline def setSpeakingRateNull: Self = StObject.set(x, "speakingRate", null)
    
    inline def setSpeakingRateUndefined: Self = StObject.set(x, "speakingRate", js.undefined)
    
    inline def setVoice(value: SchemaGoogleCloudDialogflowCxV3beta1VoiceSelectionParams): Self = StObject.set(x, "voice", value.asInstanceOf[js.Any])
    
    inline def setVoiceUndefined: Self = StObject.set(x, "voice", js.undefined)
    
    inline def setVolumeGainDb(value: Double): Self = StObject.set(x, "volumeGainDb", value.asInstanceOf[js.Any])
    
    inline def setVolumeGainDbNull: Self = StObject.set(x, "volumeGainDb", null)
    
    inline def setVolumeGainDbUndefined: Self = StObject.set(x, "volumeGainDb", js.undefined)
  }
}
