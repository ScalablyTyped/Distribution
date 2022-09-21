package typings.googleapis.texttospeechV1beta1Mod.texttospeechV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSynthesizeSpeechResponse extends StObject {
  
  /**
    * The audio metadata of `audio_content`.
    */
  var audioConfig: js.UndefOr[SchemaAudioConfig] = js.undefined
  
  /**
    * The audio data bytes encoded as specified in the request, including the header for encodings that are wrapped in containers (e.g. MP3, OGG_OPUS). For LINEAR16 audio, we include the WAV header. Note: as with all bytes fields, protobuffers use a pure binary representation, whereas JSON representations use base64.
    */
  var audioContent: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A link between a position in the original request input and a corresponding time in the output audio. It's only supported via `` of SSML input.
    */
  var timepoints: js.UndefOr[js.Array[SchemaTimepoint]] = js.undefined
}
object SchemaSynthesizeSpeechResponse {
  
  inline def apply(): SchemaSynthesizeSpeechResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSynthesizeSpeechResponse]
  }
  
  extension [Self <: SchemaSynthesizeSpeechResponse](x: Self) {
    
    inline def setAudioConfig(value: SchemaAudioConfig): Self = StObject.set(x, "audioConfig", value.asInstanceOf[js.Any])
    
    inline def setAudioConfigUndefined: Self = StObject.set(x, "audioConfig", js.undefined)
    
    inline def setAudioContent(value: String): Self = StObject.set(x, "audioContent", value.asInstanceOf[js.Any])
    
    inline def setAudioContentNull: Self = StObject.set(x, "audioContent", null)
    
    inline def setAudioContentUndefined: Self = StObject.set(x, "audioContent", js.undefined)
    
    inline def setTimepoints(value: js.Array[SchemaTimepoint]): Self = StObject.set(x, "timepoints", value.asInstanceOf[js.Any])
    
    inline def setTimepointsUndefined: Self = StObject.set(x, "timepoints", js.undefined)
    
    inline def setTimepointsVarargs(value: SchemaTimepoint*): Self = StObject.set(x, "timepoints", js.Array(value*))
  }
}
