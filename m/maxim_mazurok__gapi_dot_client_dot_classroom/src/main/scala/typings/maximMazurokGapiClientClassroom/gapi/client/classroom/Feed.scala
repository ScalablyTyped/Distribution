package typings.maximMazurokGapiClientClassroom.gapi.client.classroom

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Feed extends StObject {
  
  /** Information about a `Feed` with a `feed_type` of `COURSE_ROSTER_CHANGES`. This field must be specified if `feed_type` is `COURSE_ROSTER_CHANGES`. */
  var courseRosterChangesInfo: js.UndefOr[CourseRosterChangesInfo] = js.native
  
  /** Information about a `Feed` with a `feed_type` of `COURSE_WORK_CHANGES`. This field must be specified if `feed_type` is `COURSE_WORK_CHANGES`. */
  var courseWorkChangesInfo: js.UndefOr[CourseWorkChangesInfo] = js.native
  
  /** The type of feed. */
  var feedType: js.UndefOr[String] = js.native
}
object Feed {
  
  @scala.inline
  def apply(): Feed = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Feed]
  }
  
  @scala.inline
  implicit class FeedMutableBuilder[Self <: Feed] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCourseRosterChangesInfo(value: CourseRosterChangesInfo): Self = StObject.set(x, "courseRosterChangesInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCourseRosterChangesInfoUndefined: Self = StObject.set(x, "courseRosterChangesInfo", js.undefined)
    
    @scala.inline
    def setCourseWorkChangesInfo(value: CourseWorkChangesInfo): Self = StObject.set(x, "courseWorkChangesInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCourseWorkChangesInfoUndefined: Self = StObject.set(x, "courseWorkChangesInfo", js.undefined)
    
    @scala.inline
    def setFeedType(value: String): Self = StObject.set(x, "feedType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFeedTypeUndefined: Self = StObject.set(x, "feedType", js.undefined)
  }
}
