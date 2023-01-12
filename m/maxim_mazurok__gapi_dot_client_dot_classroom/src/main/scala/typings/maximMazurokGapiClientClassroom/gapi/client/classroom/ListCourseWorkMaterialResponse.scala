package typings.maximMazurokGapiClientClassroom.gapi.client.classroom

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListCourseWorkMaterialResponse extends StObject {
  
  /** Course work material items that match the request. */
  var courseWorkMaterial: js.UndefOr[js.Array[CourseWorkMaterial]] = js.undefined
  
  /** Token identifying the next page of results to return. If empty, no further results are available. */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object ListCourseWorkMaterialResponse {
  
  inline def apply(): ListCourseWorkMaterialResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListCourseWorkMaterialResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListCourseWorkMaterialResponse] (val x: Self) extends AnyVal {
    
    inline def setCourseWorkMaterial(value: js.Array[CourseWorkMaterial]): Self = StObject.set(x, "courseWorkMaterial", value.asInstanceOf[js.Any])
    
    inline def setCourseWorkMaterialUndefined: Self = StObject.set(x, "courseWorkMaterial", js.undefined)
    
    inline def setCourseWorkMaterialVarargs(value: CourseWorkMaterial*): Self = StObject.set(x, "courseWorkMaterial", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
