package typings.maximMazurokGapiClientClassroom.gapi.client.classroom

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModifyAnnouncementAssigneesRequest extends StObject {
  
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
  implicit class ModifyAnnouncementAssigneesRequestMutableBuilder[Self <: ModifyAnnouncementAssigneesRequest] (val x: Self) extends AnyVal {
    
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
