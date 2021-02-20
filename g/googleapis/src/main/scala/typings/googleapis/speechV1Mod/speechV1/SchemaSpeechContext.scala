package typings.googleapis.speechV1Mod.speechV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides &quot;hints&quot; to the speech recognizer to favor specific words
  * and phrases in the results.
  */
@js.native
trait SchemaSpeechContext extends StObject {
  
  /**
    * *Optional* A list of strings containing words and phrases
    * &quot;hints&quot; so that the speech recognition is more likely to
    * recognize them. This can be used to improve the accuracy for specific
    * words and phrases, for example, if specific commands are typically spoken
    * by the user. This can also be used to add additional words to the
    * vocabulary of the recognizer. See [usage
    * limits](/speech-to-text/quotas#content).
    */
  var phrases: js.UndefOr[js.Array[String]] = js.native
}
object SchemaSpeechContext {
  
  @scala.inline
  def apply(): SchemaSpeechContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSpeechContext]
  }
  
  @scala.inline
  implicit class SchemaSpeechContextMutableBuilder[Self <: SchemaSpeechContext] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPhrases(value: js.Array[String]): Self = StObject.set(x, "phrases", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhrasesUndefined: Self = StObject.set(x, "phrases", js.undefined)
    
    @scala.inline
    def setPhrasesVarargs(value: String*): Self = StObject.set(x, "phrases", js.Array(value :_*))
  }
}
