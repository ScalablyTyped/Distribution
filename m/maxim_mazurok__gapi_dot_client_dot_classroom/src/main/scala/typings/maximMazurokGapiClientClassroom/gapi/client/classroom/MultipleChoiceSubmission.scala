package typings.maximMazurokGapiClientClassroom.gapi.client.classroom

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MultipleChoiceSubmission extends StObject {
  
  /** Student's select choice. */
  var answer: js.UndefOr[String] = js.undefined
}
object MultipleChoiceSubmission {
  
  @scala.inline
  def apply(): MultipleChoiceSubmission = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MultipleChoiceSubmission]
  }
  
  @scala.inline
  implicit class MultipleChoiceSubmissionMutableBuilder[Self <: MultipleChoiceSubmission] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnswer(value: String): Self = StObject.set(x, "answer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnswerUndefined: Self = StObject.set(x, "answer", js.undefined)
  }
}
