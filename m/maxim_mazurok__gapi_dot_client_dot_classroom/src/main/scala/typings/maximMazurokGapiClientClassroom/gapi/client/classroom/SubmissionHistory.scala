package typings.maximMazurokGapiClientClassroom.gapi.client.classroom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SubmissionHistory extends js.Object {
  
  /** The grade history information of the submission, if present. */
  var gradeHistory: js.UndefOr[GradeHistory] = js.native
  
  /** The state history information of the submission, if present. */
  var stateHistory: js.UndefOr[StateHistory] = js.native
}
object SubmissionHistory {
  
  @scala.inline
  def apply(): SubmissionHistory = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SubmissionHistory]
  }
  
  @scala.inline
  implicit class SubmissionHistoryOps[Self <: SubmissionHistory] (val x: Self) extends AnyVal {
    
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
    def setGradeHistory(value: GradeHistory): Self = this.set("gradeHistory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGradeHistory: Self = this.set("gradeHistory", js.undefined)
    
    @scala.inline
    def setStateHistory(value: StateHistory): Self = this.set("stateHistory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStateHistory: Self = this.set("stateHistory", js.undefined)
  }
}
