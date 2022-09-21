package typings.googleapis.dialogflowV2Mod.dialogflowV2

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowV2TextToSpeechSettings extends StObject {
  
  /**
    * Optional. Indicates whether text to speech is enabled. Even when this field is false, other settings in this proto are still retained.
    */
  var enableTextToSpeech: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Required. Audio encoding of the synthesized audio content.
    */
  var outputAudioEncoding: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. The synthesis sample rate (in hertz) for this audio. If not provided, then the synthesizer will use the default sample rate based on the audio encoding. If this is different from the voice's natural sample rate, then the synthesizer will honor this request by converting to the desired sample rate (which might result in worse audio quality).
    */
  var sampleRateHertz: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Optional. Configuration of how speech should be synthesized, mapping from language (https://cloud.google.com/dialogflow/docs/reference/language) to SynthesizeSpeechConfig.
    */
  var synthesizeSpeechConfigs: js.UndefOr[StringDictionary[SchemaGoogleCloudDialogflowV2SynthesizeSpeechConfig] | Null] = js.undefined
}
object SchemaGoogleCloudDialogflowV2TextToSpeechSettings {
  
  inline def apply(): SchemaGoogleCloudDialogflowV2TextToSpeechSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2TextToSpeechSettings]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowV2TextToSpeechSettings](x: Self) {
    
    inline def setEnableTextToSpeech(value: Boolean): Self = StObject.set(x, "enableTextToSpeech", value.asInstanceOf[js.Any])
    
    inline def setEnableTextToSpeechNull: Self = StObject.set(x, "enableTextToSpeech", null)
    
    inline def setEnableTextToSpeechUndefined: Self = StObject.set(x, "enableTextToSpeech", js.undefined)
    
    inline def setOutputAudioEncoding(value: String): Self = StObject.set(x, "outputAudioEncoding", value.asInstanceOf[js.Any])
    
    inline def setOutputAudioEncodingNull: Self = StObject.set(x, "outputAudioEncoding", null)
    
    inline def setOutputAudioEncodingUndefined: Self = StObject.set(x, "outputAudioEncoding", js.undefined)
    
    inline def setSampleRateHertz(value: Double): Self = StObject.set(x, "sampleRateHertz", value.asInstanceOf[js.Any])
    
    inline def setSampleRateHertzNull: Self = StObject.set(x, "sampleRateHertz", null)
    
    inline def setSampleRateHertzUndefined: Self = StObject.set(x, "sampleRateHertz", js.undefined)
    
    inline def setSynthesizeSpeechConfigs(value: StringDictionary[SchemaGoogleCloudDialogflowV2SynthesizeSpeechConfig]): Self = StObject.set(x, "synthesizeSpeechConfigs", value.asInstanceOf[js.Any])
    
    inline def setSynthesizeSpeechConfigsNull: Self = StObject.set(x, "synthesizeSpeechConfigs", null)
    
    inline def setSynthesizeSpeechConfigsUndefined: Self = StObject.set(x, "synthesizeSpeechConfigs", js.undefined)
  }
}
