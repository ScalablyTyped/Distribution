package typings.maximMazurokGapiClientClassroom.gapi.client.classroom

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModifyIndividualStudentsOptions extends StObject {
  
  /** IDs of students to be added as having access to this coursework/announcement. */
  var addStudentIds: js.UndefOr[js.Array[String]] = js.undefined
  
  /** IDs of students to be removed from having access to this coursework/announcement. */
  var removeStudentIds: js.UndefOr[js.Array[String]] = js.undefined
}
object ModifyIndividualStudentsOptions {
  
  @scala.inline
  def apply(): ModifyIndividualStudentsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModifyIndividualStudentsOptions]
  }
  
  @scala.inline
  implicit class ModifyIndividualStudentsOptionsMutableBuilder[Self <: ModifyIndividualStudentsOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddStudentIds(value: js.Array[String]): Self = StObject.set(x, "addStudentIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddStudentIdsUndefined: Self = StObject.set(x, "addStudentIds", js.undefined)
    
    @scala.inline
    def setAddStudentIdsVarargs(value: String*): Self = StObject.set(x, "addStudentIds", js.Array(value :_*))
    
    @scala.inline
    def setRemoveStudentIds(value: js.Array[String]): Self = StObject.set(x, "removeStudentIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoveStudentIdsUndefined: Self = StObject.set(x, "removeStudentIds", js.undefined)
    
    @scala.inline
    def setRemoveStudentIdsVarargs(value: String*): Self = StObject.set(x, "removeStudentIds", js.Array(value :_*))
  }
}
