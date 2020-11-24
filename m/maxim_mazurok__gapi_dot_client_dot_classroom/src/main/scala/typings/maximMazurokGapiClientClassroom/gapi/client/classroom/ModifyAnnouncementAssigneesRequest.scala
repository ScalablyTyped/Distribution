package typings.maximMazurokGapiClientClassroom.gapi.client.classroom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModifyAnnouncementAssigneesRequest extends js.Object {
  
  /** Mode of the announcement describing whether it is accessible by all students or specified individual students. */
  var assigneeMode: js.UndefOr[String] = js.native
  
  /** Set which students can view or cannot view the announcement. Must be specified only when `assigneeMode` is `INDIVIDUAL_STUDENTS`. */
  var modifyIndividualStudentsOptions: js.UndefOr[ModifyIndividualStudentsOptions] = js.native
}
object ModifyAnnouncementAssigneesRequest {
  
  @scala.inline
  def apply(): ModifyAnnouncementAssigneesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModifyAnnouncementAssigneesRequest]
  }
  
  @scala.inline
  implicit class ModifyAnnouncementAssigneesRequestOps[Self <: ModifyAnnouncementAssigneesRequest] (val x: Self) extends AnyVal {
    
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
    def setAssigneeMode(value: String): Self = this.set("assigneeMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAssigneeMode: Self = this.set("assigneeMode", js.undefined)
    
    @scala.inline
    def setModifyIndividualStudentsOptions(value: ModifyIndividualStudentsOptions): Self = this.set("modifyIndividualStudentsOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModifyIndividualStudentsOptions: Self = this.set("modifyIndividualStudentsOptions", js.undefined)
  }
}
