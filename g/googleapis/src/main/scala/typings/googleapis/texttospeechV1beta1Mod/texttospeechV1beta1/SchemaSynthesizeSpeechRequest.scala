package typings.googleapis.texttospeechV1beta1Mod.texttospeechV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSynthesizeSpeechRequest extends StObject {
  
  /**
    * Required. The configuration of the synthesized audio.
    */
  var audioConfig: js.UndefOr[SchemaAudioConfig] = js.undefined
  
  /**
    * Whether and what timepoints are returned in the response.
    */
  var enableTimePointing: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Required. The Synthesizer requires either plain text or SSML as input.
    */
  var input: js.UndefOr[SchemaSynthesisInput] = js.undefined
  
  /**
    * Required. The desired voice of the synthesized audio.
    */
  var voice: js.UndefOr[SchemaVoiceSelectionParams] = js.undefined
}
object SchemaSynthesizeSpeechRequest {
  
  inline def apply(): SchemaSynthesizeSpeechRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSynthesizeSpeechRequest]
  }
  
  extension [Self <: SchemaSynthesizeSpeechRequest](x: Self) {
    
    inline def setAudioConfig(value: SchemaAudioConfig): Self = StObject.set(x, "audioConfig", value.asInstanceOf[js.Any])
    
    inline def setAudioConfigUndefined: Self = StObject.set(x, "audioConfig", js.undefined)
    
    inline def setEnableTimePointing(value: js.Array[String]): Self = StObject.set(x, "enableTimePointing", value.asInstanceOf[js.Any])
    
    inline def setEnableTimePointingNull: Self = StObject.set(x, "enableTimePointing", null)
    
    inline def setEnableTimePointingUndefined: Self = StObject.set(x, "enableTimePointing", js.undefined)
    
    inline def setEnableTimePointingVarargs(value: String*): Self = StObject.set(x, "enableTimePointing", js.Array(value*))
    
    inline def setInput(value: SchemaSynthesisInput): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    
    inline def setInputUndefined: Self = StObject.set(x, "input", js.undefined)
    
    inline def setVoice(value: SchemaVoiceSelectionParams): Self = StObject.set(x, "voice", value.asInstanceOf[js.Any])
    
    inline def setVoiceUndefined: Self = StObject.set(x, "voice", js.undefined)
  }
}
