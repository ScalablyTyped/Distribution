package typings.googleapis.texttospeechV1beta1Mod.texttospeechV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaVoiceSelectionParams extends StObject {
  
  /**
    * The configuration for a custom voice. If [CustomVoiceParams.model] is set, the service will choose the custom voice matching the specified configuration.
    */
  var customVoice: js.UndefOr[SchemaCustomVoiceParams] = js.undefined
  
  /**
    * Required. The language (and potentially also the region) of the voice expressed as a [BCP-47](https://www.rfc-editor.org/rfc/bcp/bcp47.txt) language tag, e.g. "en-US". This should not include a script tag (e.g. use "cmn-cn" rather than "cmn-Hant-cn"), because the script will be inferred from the input provided in the SynthesisInput. The TTS service will use this parameter to help choose an appropriate voice. Note that the TTS service may choose a voice with a slightly different language code than the one selected; it may substitute a different region (e.g. using en-US rather than en-CA if there isn't a Canadian voice available), or even a different language, e.g. using "nb" (Norwegian Bokmal) instead of "no" (Norwegian)".
    */
  var languageCode: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The name of the voice. If not set, the service will choose a voice based on the other parameters such as language_code and gender.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The preferred gender of the voice. If not set, the service will choose a voice based on the other parameters such as language_code and name. Note that this is only a preference, not requirement; if a voice of the appropriate gender is not available, the synthesizer should substitute a voice with a different gender rather than failing the request.
    */
  var ssmlGender: js.UndefOr[String | Null] = js.undefined
}
object SchemaVoiceSelectionParams {
  
  inline def apply(): SchemaVoiceSelectionParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaVoiceSelectionParams]
  }
  
  extension [Self <: SchemaVoiceSelectionParams](x: Self) {
    
    inline def setCustomVoice(value: SchemaCustomVoiceParams): Self = StObject.set(x, "customVoice", value.asInstanceOf[js.Any])
    
    inline def setCustomVoiceUndefined: Self = StObject.set(x, "customVoice", js.undefined)
    
    inline def setLanguageCode(value: String): Self = StObject.set(x, "languageCode", value.asInstanceOf[js.Any])
    
    inline def setLanguageCodeNull: Self = StObject.set(x, "languageCode", null)
    
    inline def setLanguageCodeUndefined: Self = StObject.set(x, "languageCode", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setSsmlGender(value: String): Self = StObject.set(x, "ssmlGender", value.asInstanceOf[js.Any])
    
    inline def setSsmlGenderNull: Self = StObject.set(x, "ssmlGender", null)
    
    inline def setSsmlGenderUndefined: Self = StObject.set(x, "ssmlGender", js.undefined)
  }
}
