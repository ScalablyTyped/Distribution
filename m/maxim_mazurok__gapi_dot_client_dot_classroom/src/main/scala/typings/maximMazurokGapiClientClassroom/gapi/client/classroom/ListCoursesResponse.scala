package typings.maximMazurokGapiClientClassroom.gapi.client.classroom

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListCoursesResponse extends StObject {
  
  /** Courses that match the list request. */
  var courses: js.UndefOr[js.Array[Course]] = js.undefined
  
  /** Token identifying the next page of results to return. If empty, no further results are available. */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object ListCoursesResponse {
  
  inline def apply(): ListCoursesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListCoursesResponse]
  }
  
  extension [Self <: ListCoursesResponse](x: Self) {
    
    inline def setCourses(value: js.Array[Course]): Self = StObject.set(x, "courses", value.asInstanceOf[js.Any])
    
    inline def setCoursesUndefined: Self = StObject.set(x, "courses", js.undefined)
    
    inline def setCoursesVarargs(value: Course*): Self = StObject.set(x, "courses", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
