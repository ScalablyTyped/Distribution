package typings.maximMazurokGapiClientClassroom.gapi.client.classroom

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListCoursesResponse extends StObject {
  
  /** Courses that match the list request. */
  var courses: js.UndefOr[js.Array[Course]] = js.native
  
  /** Token identifying the next page of results to return. If empty, no further results are available. */
  var nextPageToken: js.UndefOr[String] = js.native
}
object ListCoursesResponse {
  
  @scala.inline
  def apply(): ListCoursesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListCoursesResponse]
  }
  
  @scala.inline
  implicit class ListCoursesResponseMutableBuilder[Self <: ListCoursesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCourses(value: js.Array[Course]): Self = StObject.set(x, "courses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCoursesUndefined: Self = StObject.set(x, "courses", js.undefined)
    
    @scala.inline
    def setCoursesVarargs(value: Course*): Self = StObject.set(x, "courses", js.Array(value :_*))
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
