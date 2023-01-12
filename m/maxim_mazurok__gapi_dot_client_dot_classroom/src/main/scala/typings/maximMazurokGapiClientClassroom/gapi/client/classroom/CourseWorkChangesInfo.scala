package typings.maximMazurokGapiClientClassroom.gapi.client.classroom

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CourseWorkChangesInfo extends StObject {
  
  /** The `course_id` of the course to subscribe to work changes for. */
  var courseId: js.UndefOr[String] = js.undefined
}
object CourseWorkChangesInfo {
  
  inline def apply(): CourseWorkChangesInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CourseWorkChangesInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CourseWorkChangesInfo] (val x: Self) extends AnyVal {
    
    inline def setCourseId(value: String): Self = StObject.set(x, "courseId", value.asInstanceOf[js.Any])
    
    inline def setCourseIdUndefined: Self = StObject.set(x, "courseId", js.undefined)
  }
}
