package typings.maximMazurokGapiClientAlertcenter.gapi.client.alertcenter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListAlertFeedbackResponse extends js.Object {
  
  /** The list of alert feedback. Feedback entries for each alert are ordered by creation time descending. */
  var feedback: js.UndefOr[js.Array[AlertFeedback]] = js.native
}
object ListAlertFeedbackResponse {
  
  @scala.inline
  def apply(): ListAlertFeedbackResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListAlertFeedbackResponse]
  }
  
  @scala.inline
  implicit class ListAlertFeedbackResponseOps[Self <: ListAlertFeedbackResponse] (val x: Self) extends AnyVal {
    
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
    def setFeedbackVarargs(value: AlertFeedback*): Self = this.set("feedback", js.Array(value :_*))
    
    @scala.inline
    def setFeedback(value: js.Array[AlertFeedback]): Self = this.set("feedback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFeedback: Self = this.set("feedback", js.undefined)
  }
}
