package typings.maximMazurokGapiClientClassroom.gapi.client.classroom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MultipleChoiceSubmission extends js.Object {
  
  /** Student's select choice. */
  var answer: js.UndefOr[String] = js.native
}
object MultipleChoiceSubmission {
  
  @scala.inline
  def apply(): MultipleChoiceSubmission = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MultipleChoiceSubmission]
  }
  
  @scala.inline
  implicit class MultipleChoiceSubmissionOps[Self <: MultipleChoiceSubmission] (val x: Self) extends AnyVal {
    
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
    def setAnswer(value: String): Self = this.set("answer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnswer: Self = this.set("answer", js.undefined)
  }
}
