package typings.googleapis.v1p3beta1Mod.videointelligenceV1p3beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Alternative hypotheses (a.k.a. n-best list).
  */
@js.native
trait SchemaGoogleCloudVideointelligenceV1beta2SpeechRecognitionAlternative extends StObject {
  
  /**
    * The confidence estimate between 0.0 and 1.0. A higher number indicates an
    * estimated greater likelihood that the recognized words are correct. This
    * field is typically provided only for the top hypothesis, and only for
    * `is_final=true` results. Clients should not rely on the `confidence`
    * field as it is not guaranteed to be accurate or consistent. The default
    * of 0.0 is a sentinel value indicating `confidence` was not set.
    */
  var confidence: js.UndefOr[Double] = js.native
  
  /**
    * Transcript text representing the words that the user spoke.
    */
  var transcript: js.UndefOr[String] = js.native
  
  /**
    * A list of word-specific information for each recognized word.
    */
  var words: js.UndefOr[js.Array[SchemaGoogleCloudVideointelligenceV1beta2WordInfo]] = js.native
}
object SchemaGoogleCloudVideointelligenceV1beta2SpeechRecognitionAlternative {
  
  @scala.inline
  def apply(): SchemaGoogleCloudVideointelligenceV1beta2SpeechRecognitionAlternative = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudVideointelligenceV1beta2SpeechRecognitionAlternative]
  }
  
  @scala.inline
  implicit class SchemaGoogleCloudVideointelligenceV1beta2SpeechRecognitionAlternativeMutableBuilder[Self <: SchemaGoogleCloudVideointelligenceV1beta2SpeechRecognitionAlternative] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfidence(value: Double): Self = StObject.set(x, "confidence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfidenceUndefined: Self = StObject.set(x, "confidence", js.undefined)
    
    @scala.inline
    def setTranscript(value: String): Self = StObject.set(x, "transcript", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTranscriptUndefined: Self = StObject.set(x, "transcript", js.undefined)
    
    @scala.inline
    def setWords(value: js.Array[SchemaGoogleCloudVideointelligenceV1beta2WordInfo]): Self = StObject.set(x, "words", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWordsUndefined: Self = StObject.set(x, "words", js.undefined)
    
    @scala.inline
    def setWordsVarargs(value: SchemaGoogleCloudVideointelligenceV1beta2WordInfo*): Self = StObject.set(x, "words", js.Array(value :_*))
  }
}
