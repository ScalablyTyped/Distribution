package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDialogflowV2SpeechContext extends StObject {
  
  /**
    * Optional. Boost for this context compared to other contexts: * If the boost is positive, Dialogflow will increase the probability that the phrases in this context are recognized
    * over similar sounding phrases. * If the boost is unspecified or non-positive, Dialogflow will not apply any boost. Dialogflow recommends that you use boosts in the range (0, 20] and
    * that you find a value that fits your use case with binary search.
    */
  var boost: js.UndefOr[Double] = js.undefined
  
  /**
    * Optional. A list of strings containing words and phrases that the speech recognizer should recognize with higher likelihood. This list can be used to: * improve accuracy for words
    * and phrases you expect the user to say, e.g. typical commands for your Dialogflow agent * add additional words to the speech recognizer vocabulary * ... See the [Cloud Speech
    * documentation](https://cloud.google.com/speech-to-text/quotas) for usage limits.
    */
  var phrases: js.UndefOr[js.Array[String]] = js.undefined
}
object GoogleCloudDialogflowV2SpeechContext {
  
  @scala.inline
  def apply(): GoogleCloudDialogflowV2SpeechContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowV2SpeechContext]
  }
  
  @scala.inline
  implicit class GoogleCloudDialogflowV2SpeechContextMutableBuilder[Self <: GoogleCloudDialogflowV2SpeechContext] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBoost(value: Double): Self = StObject.set(x, "boost", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBoostUndefined: Self = StObject.set(x, "boost", js.undefined)
    
    @scala.inline
    def setPhrases(value: js.Array[String]): Self = StObject.set(x, "phrases", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhrasesUndefined: Self = StObject.set(x, "phrases", js.undefined)
    
    @scala.inline
    def setPhrasesVarargs(value: String*): Self = StObject.set(x, "phrases", js.Array(value :_*))
  }
}
