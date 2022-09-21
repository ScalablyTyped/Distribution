package typings.googleapis.videointelligenceV1Mod.videointelligenceV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudVideointelligenceV1p3beta1SpeechRecognitionAlternative extends StObject {
  
  /**
    * Output only. The confidence estimate between 0.0 and 1.0. A higher number indicates an estimated greater likelihood that the recognized words are correct. This field is set only for the top alternative. This field is not guaranteed to be accurate and users should not rely on it to be always provided. The default of 0.0 is a sentinel value indicating `confidence` was not set.
    */
  var confidence: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Transcript text representing the words that the user spoke.
    */
  var transcript: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. A list of word-specific information for each recognized word. Note: When `enable_speaker_diarization` is set to true, you will see all the words from the beginning of the audio.
    */
  var words: js.UndefOr[js.Array[SchemaGoogleCloudVideointelligenceV1p3beta1WordInfo]] = js.undefined
}
object SchemaGoogleCloudVideointelligenceV1p3beta1SpeechRecognitionAlternative {
  
  inline def apply(): SchemaGoogleCloudVideointelligenceV1p3beta1SpeechRecognitionAlternative = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudVideointelligenceV1p3beta1SpeechRecognitionAlternative]
  }
  
  extension [Self <: SchemaGoogleCloudVideointelligenceV1p3beta1SpeechRecognitionAlternative](x: Self) {
    
    inline def setConfidence(value: Double): Self = StObject.set(x, "confidence", value.asInstanceOf[js.Any])
    
    inline def setConfidenceNull: Self = StObject.set(x, "confidence", null)
    
    inline def setConfidenceUndefined: Self = StObject.set(x, "confidence", js.undefined)
    
    inline def setTranscript(value: String): Self = StObject.set(x, "transcript", value.asInstanceOf[js.Any])
    
    inline def setTranscriptNull: Self = StObject.set(x, "transcript", null)
    
    inline def setTranscriptUndefined: Self = StObject.set(x, "transcript", js.undefined)
    
    inline def setWords(value: js.Array[SchemaGoogleCloudVideointelligenceV1p3beta1WordInfo]): Self = StObject.set(x, "words", value.asInstanceOf[js.Any])
    
    inline def setWordsUndefined: Self = StObject.set(x, "words", js.undefined)
    
    inline def setWordsVarargs(value: SchemaGoogleCloudVideointelligenceV1p3beta1WordInfo*): Self = StObject.set(x, "words", js.Array(value*))
  }
}
