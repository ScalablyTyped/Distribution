package typings.maximMazurokGapiClientClassroom.gapi.client.classroom

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModifyCourseWorkAssigneesRequest extends StObject {
  
  /** Mode of the coursework describing whether it will be assigned to all students or specified individual students. */
  var assigneeMode: js.UndefOr[String] = js.native
  
  /** Set which students are assigned or not assigned to the coursework. Must be specified only when `assigneeMode` is `INDIVIDUAL_STUDENTS`. */
  var modifyIndividualStudentsOptions: js.UndefOr[ModifyIndividualStudentsOptions] = js.native
}
object ModifyCourseWorkAssigneesRequest {
  
  @scala.inline
  def apply(): ModifyCourseWorkAssigneesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModifyCourseWorkAssigneesRequest]
  }
  
  @scala.inline
  implicit class ModifyCourseWorkAssigneesRequestMutableBuilder[Self <: ModifyCourseWorkAssigneesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAssigneeMode(value: String): Self = StObject.set(x, "assigneeMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssigneeModeUndefined: Self = StObject.set(x, "assigneeMode", js.undefined)
    
    @scala.inline
    def setModifyIndividualStudentsOptions(value: ModifyIndividualStudentsOptions): Self = StObject.set(x, "modifyIndividualStudentsOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModifyIndividualStudentsOptionsUndefined: Self = StObject.set(x, "modifyIndividualStudentsOptions", js.undefined)
  }
}
