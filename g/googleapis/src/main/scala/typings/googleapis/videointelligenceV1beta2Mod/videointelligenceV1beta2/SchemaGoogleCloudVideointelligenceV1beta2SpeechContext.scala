package typings.googleapis.videointelligenceV1beta2Mod.videointelligenceV1beta2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides &quot;hints&quot; to the speech recognizer to favor specific words
  * and phrases in the results.
  */
trait SchemaGoogleCloudVideointelligenceV1beta2SpeechContext extends StObject {
  
  /**
    * *Optional* A list of strings containing words and phrases
    * &quot;hints&quot; so that the speech recognition is more likely to
    * recognize them. This can be used to improve the accuracy for specific
    * words and phrases, for example, if specific commands are typically spoken
    * by the user. This can also be used to add additional words to the
    * vocabulary of the recognizer. See [usage
    * limits](https://cloud.google.com/speech/limits#content).
    */
  var phrases: js.UndefOr[js.Array[String]] = js.undefined
}
object SchemaGoogleCloudVideointelligenceV1beta2SpeechContext {
  
  inline def apply(): SchemaGoogleCloudVideointelligenceV1beta2SpeechContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudVideointelligenceV1beta2SpeechContext]
  }
  
  extension [Self <: SchemaGoogleCloudVideointelligenceV1beta2SpeechContext](x: Self) {
    
    inline def setPhrases(value: js.Array[String]): Self = StObject.set(x, "phrases", value.asInstanceOf[js.Any])
    
    inline def setPhrasesUndefined: Self = StObject.set(x, "phrases", js.undefined)
    
    inline def setPhrasesVarargs(value: String*): Self = StObject.set(x, "phrases", js.Array(value :_*))
  }
}
