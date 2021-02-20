package typings.maximMazurokGapiClientClassroom.gapi.client.classroom

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MultipleChoiceQuestion extends StObject {
  
  /** Possible choices. */
  var choices: js.UndefOr[js.Array[String]] = js.native
}
object MultipleChoiceQuestion {
  
  @scala.inline
  def apply(): MultipleChoiceQuestion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MultipleChoiceQuestion]
  }
  
  @scala.inline
  implicit class MultipleChoiceQuestionMutableBuilder[Self <: MultipleChoiceQuestion] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChoices(value: js.Array[String]): Self = StObject.set(x, "choices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChoicesUndefined: Self = StObject.set(x, "choices", js.undefined)
    
    @scala.inline
    def setChoicesVarargs(value: String*): Self = StObject.set(x, "choices", js.Array(value :_*))
  }
}
