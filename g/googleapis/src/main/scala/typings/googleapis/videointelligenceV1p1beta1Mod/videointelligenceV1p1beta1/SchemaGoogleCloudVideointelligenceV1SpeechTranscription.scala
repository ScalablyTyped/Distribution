package typings.googleapis.videointelligenceV1p1beta1Mod.videointelligenceV1p1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudVideointelligenceV1SpeechTranscription extends StObject {
  
  /**
    * May contain one or more recognition hypotheses (up to the maximum specified in `max_alternatives`). These alternatives are ordered in terms of accuracy, with the top (first) alternative being the most probable, as ranked by the recognizer.
    */
  var alternatives: js.UndefOr[js.Array[SchemaGoogleCloudVideointelligenceV1SpeechRecognitionAlternative]] = js.undefined
  
  /**
    * Output only. The [BCP-47](https://www.rfc-editor.org/rfc/bcp/bcp47.txt) language tag of the language in this result. This language code was detected to have the most likelihood of being spoken in the audio.
    */
  var languageCode: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudVideointelligenceV1SpeechTranscription {
  
  inline def apply(): SchemaGoogleCloudVideointelligenceV1SpeechTranscription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudVideointelligenceV1SpeechTranscription]
  }
  
  extension [Self <: SchemaGoogleCloudVideointelligenceV1SpeechTranscription](x: Self) {
    
    inline def setAlternatives(value: js.Array[SchemaGoogleCloudVideointelligenceV1SpeechRecognitionAlternative]): Self = StObject.set(x, "alternatives", value.asInstanceOf[js.Any])
    
    inline def setAlternativesUndefined: Self = StObject.set(x, "alternatives", js.undefined)
    
    inline def setAlternativesVarargs(value: SchemaGoogleCloudVideointelligenceV1SpeechRecognitionAlternative*): Self = StObject.set(x, "alternatives", js.Array(value*))
    
    inline def setLanguageCode(value: String): Self = StObject.set(x, "languageCode", value.asInstanceOf[js.Any])
    
    inline def setLanguageCodeNull: Self = StObject.set(x, "languageCode", null)
    
    inline def setLanguageCodeUndefined: Self = StObject.set(x, "languageCode", js.undefined)
  }
}
