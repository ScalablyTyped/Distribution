package typings.maximMazurokGapiClientClassroom.gapi.client.classroom

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListCourseWorkMaterialResponse extends StObject {
  
  /** Course work material items that match the request. */
  var courseWorkMaterial: js.UndefOr[js.Array[CourseWorkMaterial]] = js.native
  
  /** Token identifying the next page of results to return. If empty, no further results are available. */
  var nextPageToken: js.UndefOr[String] = js.native
}
object ListCourseWorkMaterialResponse {
  
  @scala.inline
  def apply(): ListCourseWorkMaterialResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListCourseWorkMaterialResponse]
  }
  
  @scala.inline
  implicit class ListCourseWorkMaterialResponseMutableBuilder[Self <: ListCourseWorkMaterialResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCourseWorkMaterial(value: js.Array[CourseWorkMaterial]): Self = StObject.set(x, "courseWorkMaterial", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCourseWorkMaterialUndefined: Self = StObject.set(x, "courseWorkMaterial", js.undefined)
    
    @scala.inline
    def setCourseWorkMaterialVarargs(value: CourseWorkMaterial*): Self = StObject.set(x, "courseWorkMaterial", js.Array(value :_*))
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
