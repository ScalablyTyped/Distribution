package typings.googleapis.v1p2beta1Mod.videointelligenceV1p2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudVideointelligenceV1p2beta1SpeechContext extends StObject {
  
  /**
    * Optional. A list of strings containing words and phrases "hints" so that the speech recognition is more likely to recognize them. This can be used to improve the accuracy for specific words and phrases, for example, if specific commands are typically spoken by the user. This can also be used to add additional words to the vocabulary of the recognizer. See [usage limits](https://cloud.google.com/speech/limits#content).
    */
  var phrases: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaGoogleCloudVideointelligenceV1p2beta1SpeechContext {
  
  inline def apply(): SchemaGoogleCloudVideointelligenceV1p2beta1SpeechContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudVideointelligenceV1p2beta1SpeechContext]
  }
  
  extension [Self <: SchemaGoogleCloudVideointelligenceV1p2beta1SpeechContext](x: Self) {
    
    inline def setPhrases(value: js.Array[String]): Self = StObject.set(x, "phrases", value.asInstanceOf[js.Any])
    
    inline def setPhrasesNull: Self = StObject.set(x, "phrases", null)
    
    inline def setPhrasesUndefined: Self = StObject.set(x, "phrases", js.undefined)
    
    inline def setPhrasesVarargs(value: String*): Self = StObject.set(x, "phrases", js.Array(value*))
  }
}
