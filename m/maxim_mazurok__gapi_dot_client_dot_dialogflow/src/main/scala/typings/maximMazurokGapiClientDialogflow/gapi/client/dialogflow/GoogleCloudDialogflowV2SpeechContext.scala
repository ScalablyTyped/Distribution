package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDialogflowV2SpeechContext extends js.Object {
  
  /**
    * Optional. Boost for this context compared to other contexts: * If the boost is positive, Dialogflow will increase the probability that the phrases in this context are recognized
    * over similar sounding phrases. * If the boost is unspecified or non-positive, Dialogflow will not apply any boost. Dialogflow recommends that you use boosts in the range (0, 20] and
    * that you find a value that fits your use case with binary search.
    */
  var boost: js.UndefOr[Double] = js.native
  
  /**
    * Optional. A list of strings containing words and phrases that the speech recognizer should recognize with higher likelihood. This list can be used to: * improve accuracy for words
    * and phrases you expect the user to say, e.g. typical commands for your Dialogflow agent * add additional words to the speech recognizer vocabulary * ... See the [Cloud Speech
    * documentation](https://cloud.google.com/speech-to-text/quotas) for usage limits.
    */
  var phrases: js.UndefOr[js.Array[String]] = js.native
}
object GoogleCloudDialogflowV2SpeechContext {
  
  @scala.inline
  def apply(): GoogleCloudDialogflowV2SpeechContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowV2SpeechContext]
  }
  
  @scala.inline
  implicit class GoogleCloudDialogflowV2SpeechContextOps[Self <: GoogleCloudDialogflowV2SpeechContext] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBoost(value: Double): Self = this.set("boost", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBoost: Self = this.set("boost", js.undefined)
    
    @scala.inline
    def setPhrasesVarargs(value: String*): Self = this.set("phrases", js.Array(value :_*))
    
    @scala.inline
    def setPhrases(value: js.Array[String]): Self = this.set("phrases", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePhrases: Self = this.set("phrases", js.undefined)
  }
}
