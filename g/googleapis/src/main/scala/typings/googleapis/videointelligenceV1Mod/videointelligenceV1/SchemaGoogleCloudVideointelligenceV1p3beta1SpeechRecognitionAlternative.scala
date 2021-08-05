package typings.googleapis.videointelligenceV1Mod.videointelligenceV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Alternative hypotheses (a.k.a. n-best list).
  */
trait SchemaGoogleCloudVideointelligenceV1p3beta1SpeechRecognitionAlternative extends StObject {
  
  /**
    * The confidence estimate between 0.0 and 1.0. A higher number indicates an
    * estimated greater likelihood that the recognized words are correct. This
    * field is typically provided only for the top hypothesis, and only for
    * `is_final=true` results. Clients should not rely on the `confidence`
    * field as it is not guaranteed to be accurate or consistent. The default
    * of 0.0 is a sentinel value indicating `confidence` was not set.
    */
  var confidence: js.UndefOr[Double] = js.undefined
  
  /**
    * Transcript text representing the words that the user spoke.
    */
  var transcript: js.UndefOr[String] = js.undefined
  
  /**
    * A list of word-specific information for each recognized word.
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
    
    inline def setConfidenceUndefined: Self = StObject.set(x, "confidence", js.undefined)
    
    inline def setTranscript(value: String): Self = StObject.set(x, "transcript", value.asInstanceOf[js.Any])
    
    inline def setTranscriptUndefined: Self = StObject.set(x, "transcript", js.undefined)
    
    inline def setWords(value: js.Array[SchemaGoogleCloudVideointelligenceV1p3beta1WordInfo]): Self = StObject.set(x, "words", value.asInstanceOf[js.Any])
    
    inline def setWordsUndefined: Self = StObject.set(x, "words", js.undefined)
    
    inline def setWordsVarargs(value: SchemaGoogleCloudVideointelligenceV1p3beta1WordInfo*): Self = StObject.set(x, "words", js.Array(value :_*))
  }
}
