package typings.maximMazurokGapiClientClassroom.gapi.client.classroom

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SubmissionHistory extends StObject {
  
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
  implicit class SubmissionHistoryMutableBuilder[Self <: SubmissionHistory] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGradeHistory(value: GradeHistory): Self = StObject.set(x, "gradeHistory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGradeHistoryUndefined: Self = StObject.set(x, "gradeHistory", js.undefined)
    
    @scala.inline
    def setStateHistory(value: StateHistory): Self = StObject.set(x, "stateHistory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateHistoryUndefined: Self = StObject.set(x, "stateHistory", js.undefined)
  }
}
