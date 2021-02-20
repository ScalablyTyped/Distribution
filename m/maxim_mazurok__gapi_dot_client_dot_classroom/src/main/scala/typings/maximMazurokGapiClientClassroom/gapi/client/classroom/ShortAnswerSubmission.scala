package typings.maximMazurokGapiClientClassroom.gapi.client.classroom

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ShortAnswerSubmission extends StObject {
  
  /** Student response to a short-answer question. */
  var answer: js.UndefOr[String] = js.native
}
object ShortAnswerSubmission {
  
  @scala.inline
  def apply(): ShortAnswerSubmission = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShortAnswerSubmission]
  }
  
  @scala.inline
  implicit class ShortAnswerSubmissionMutableBuilder[Self <: ShortAnswerSubmission] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnswer(value: String): Self = StObject.set(x, "answer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnswerUndefined: Self = StObject.set(x, "answer", js.undefined)
  }
}
