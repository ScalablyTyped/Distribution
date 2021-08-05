package typings.maximMazurokGapiClientClassroom.gapi.client.classroom

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModifyAnnouncementAssigneesRequest extends StObject {
  
  /** Mode of the announcement describing whether it is accessible by all students or specified individual students. */
  var assigneeMode: js.UndefOr[String] = js.undefined
  
  /** Set which students can view or cannot view the announcement. Must be specified only when `assigneeMode` is `INDIVIDUAL_STUDENTS`. */
  var modifyIndividualStudentsOptions: js.UndefOr[ModifyIndividualStudentsOptions] = js.undefined
}
object ModifyAnnouncementAssigneesRequest {
  
  inline def apply(): ModifyAnnouncementAssigneesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModifyAnnouncementAssigneesRequest]
  }
  
  extension [Self <: ModifyAnnouncementAssigneesRequest](x: Self) {
    
    inline def setAssigneeMode(value: String): Self = StObject.set(x, "assigneeMode", value.asInstanceOf[js.Any])
    
    inline def setAssigneeModeUndefined: Self = StObject.set(x, "assigneeMode", js.undefined)
    
    inline def setModifyIndividualStudentsOptions(value: ModifyIndividualStudentsOptions): Self = StObject.set(x, "modifyIndividualStudentsOptions", value.asInstanceOf[js.Any])
    
    inline def setModifyIndividualStudentsOptionsUndefined: Self = StObject.set(x, "modifyIndividualStudentsOptions", js.undefined)
  }
}
