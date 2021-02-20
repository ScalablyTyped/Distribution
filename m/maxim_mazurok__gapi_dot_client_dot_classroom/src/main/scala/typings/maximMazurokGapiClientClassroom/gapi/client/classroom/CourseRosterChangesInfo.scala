package typings.maximMazurokGapiClientClassroom.gapi.client.classroom

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CourseRosterChangesInfo extends StObject {
  
  /** The `course_id` of the course to subscribe to roster changes for. */
  var courseId: js.UndefOr[String] = js.native
}
object CourseRosterChangesInfo {
  
  @scala.inline
  def apply(): CourseRosterChangesInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CourseRosterChangesInfo]
  }
  
  @scala.inline
  implicit class CourseRosterChangesInfoMutableBuilder[Self <: CourseRosterChangesInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCourseId(value: String): Self = StObject.set(x, "courseId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCourseIdUndefined: Self = StObject.set(x, "courseId", js.undefined)
  }
}
