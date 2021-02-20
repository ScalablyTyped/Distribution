package typings.maximMazurokGapiClientClassroom.gapi.client.classroom

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListCourseWorkResponse extends StObject {
  
  /** Course work items that match the request. */
  var courseWork: js.UndefOr[js.Array[CourseWork]] = js.native
  
  /** Token identifying the next page of results to return. If empty, no further results are available. */
  var nextPageToken: js.UndefOr[String] = js.native
}
object ListCourseWorkResponse {
  
  @scala.inline
  def apply(): ListCourseWorkResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListCourseWorkResponse]
  }
  
  @scala.inline
  implicit class ListCourseWorkResponseMutableBuilder[Self <: ListCourseWorkResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCourseWork(value: js.Array[CourseWork]): Self = StObject.set(x, "courseWork", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCourseWorkUndefined: Self = StObject.set(x, "courseWork", js.undefined)
    
    @scala.inline
    def setCourseWorkVarargs(value: CourseWork*): Self = StObject.set(x, "courseWork", js.Array(value :_*))
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
