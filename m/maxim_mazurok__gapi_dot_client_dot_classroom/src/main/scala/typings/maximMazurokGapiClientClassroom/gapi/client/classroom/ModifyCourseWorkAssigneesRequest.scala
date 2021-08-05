package typings.maximMazurokGapiClientClassroom.gapi.client.classroom

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModifyCourseWorkAssigneesRequest extends StObject {
  
  /** Mode of the coursework describing whether it will be assigned to all students or specified individual students. */
  var assigneeMode: js.UndefOr[String] = js.undefined
  
  /** Set which students are assigned or not assigned to the coursework. Must be specified only when `assigneeMode` is `INDIVIDUAL_STUDENTS`. */
  var modifyIndividualStudentsOptions: js.UndefOr[ModifyIndividualStudentsOptions] = js.undefined
}
object ModifyCourseWorkAssigneesRequest {
  
  inline def apply(): ModifyCourseWorkAssigneesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModifyCourseWorkAssigneesRequest]
  }
  
  extension [Self <: ModifyCourseWorkAssigneesRequest](x: Self) {
    
    inline def setAssigneeMode(value: String): Self = StObject.set(x, "assigneeMode", value.asInstanceOf[js.Any])
    
    inline def setAssigneeModeUndefined: Self = StObject.set(x, "assigneeMode", js.undefined)
    
    inline def setModifyIndividualStudentsOptions(value: ModifyIndividualStudentsOptions): Self = StObject.set(x, "modifyIndividualStudentsOptions", value.asInstanceOf[js.Any])
    
    inline def setModifyIndividualStudentsOptionsUndefined: Self = StObject.set(x, "modifyIndividualStudentsOptions", js.undefined)
  }
}
