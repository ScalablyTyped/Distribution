package typings.maximMazurokGapiClientClassroom.gapi.client.classroom

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListCourseWorkResponse extends StObject {
  
  /** Course work items that match the request. */
  var courseWork: js.UndefOr[js.Array[CourseWork]] = js.undefined
  
  /** Token identifying the next page of results to return. If empty, no further results are available. */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object ListCourseWorkResponse {
  
  inline def apply(): ListCourseWorkResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListCourseWorkResponse]
  }
  
  extension [Self <: ListCourseWorkResponse](x: Self) {
    
    inline def setCourseWork(value: js.Array[CourseWork]): Self = StObject.set(x, "courseWork", value.asInstanceOf[js.Any])
    
    inline def setCourseWorkUndefined: Self = StObject.set(x, "courseWork", js.undefined)
    
    inline def setCourseWorkVarargs(value: CourseWork*): Self = StObject.set(x, "courseWork", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
