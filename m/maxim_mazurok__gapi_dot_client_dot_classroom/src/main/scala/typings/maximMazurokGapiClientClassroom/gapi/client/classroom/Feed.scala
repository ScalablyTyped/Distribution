package typings.maximMazurokGapiClientClassroom.gapi.client.classroom

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Feed extends StObject {
  
  /** Information about a `Feed` with a `feed_type` of `COURSE_ROSTER_CHANGES`. This field must be specified if `feed_type` is `COURSE_ROSTER_CHANGES`. */
  var courseRosterChangesInfo: js.UndefOr[CourseRosterChangesInfo] = js.undefined
  
  /** Information about a `Feed` with a `feed_type` of `COURSE_WORK_CHANGES`. This field must be specified if `feed_type` is `COURSE_WORK_CHANGES`. */
  var courseWorkChangesInfo: js.UndefOr[CourseWorkChangesInfo] = js.undefined
  
  /** The type of feed. */
  var feedType: js.UndefOr[String] = js.undefined
}
object Feed {
  
  inline def apply(): Feed = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Feed]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Feed] (val x: Self) extends AnyVal {
    
    inline def setCourseRosterChangesInfo(value: CourseRosterChangesInfo): Self = StObject.set(x, "courseRosterChangesInfo", value.asInstanceOf[js.Any])
    
    inline def setCourseRosterChangesInfoUndefined: Self = StObject.set(x, "courseRosterChangesInfo", js.undefined)
    
    inline def setCourseWorkChangesInfo(value: CourseWorkChangesInfo): Self = StObject.set(x, "courseWorkChangesInfo", value.asInstanceOf[js.Any])
    
    inline def setCourseWorkChangesInfoUndefined: Self = StObject.set(x, "courseWorkChangesInfo", js.undefined)
    
    inline def setFeedType(value: String): Self = StObject.set(x, "feedType", value.asInstanceOf[js.Any])
    
    inline def setFeedTypeUndefined: Self = StObject.set(x, "feedType", js.undefined)
  }
}
