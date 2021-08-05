package typings.maximMazurokGapiClientClassroom.gapi.client.classroom

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CourseRosterChangesInfo extends StObject {
  
  /** The `course_id` of the course to subscribe to roster changes for. */
  var courseId: js.UndefOr[String] = js.undefined
}
object CourseRosterChangesInfo {
  
  inline def apply(): CourseRosterChangesInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CourseRosterChangesInfo]
  }
  
  extension [Self <: CourseRosterChangesInfo](x: Self) {
    
    inline def setCourseId(value: String): Self = StObject.set(x, "courseId", value.asInstanceOf[js.Any])
    
    inline def setCourseIdUndefined: Self = StObject.set(x, "courseId", js.undefined)
  }
}
