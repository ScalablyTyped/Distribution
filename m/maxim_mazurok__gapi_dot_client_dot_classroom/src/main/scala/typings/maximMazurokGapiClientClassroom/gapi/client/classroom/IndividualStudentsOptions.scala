package typings.maximMazurokGapiClientClassroom.gapi.client.classroom

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IndividualStudentsOptions extends StObject {
  
  /** Identifiers for the students that have access to the coursework/announcement. */
  var studentIds: js.UndefOr[js.Array[String]] = js.native
}
object IndividualStudentsOptions {
  
  @scala.inline
  def apply(): IndividualStudentsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IndividualStudentsOptions]
  }
  
  @scala.inline
  implicit class IndividualStudentsOptionsMutableBuilder[Self <: IndividualStudentsOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStudentIds(value: js.Array[String]): Self = StObject.set(x, "studentIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStudentIdsUndefined: Self = StObject.set(x, "studentIds", js.undefined)
    
    @scala.inline
    def setStudentIdsVarargs(value: String*): Self = StObject.set(x, "studentIds", js.Array(value :_*))
  }
}
