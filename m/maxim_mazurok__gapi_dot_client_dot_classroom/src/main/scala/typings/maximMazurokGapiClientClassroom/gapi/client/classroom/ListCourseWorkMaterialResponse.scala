package typings.maximMazurokGapiClientClassroom.gapi.client.classroom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListCourseWorkMaterialResponse extends js.Object {
  
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
  implicit class ListCourseWorkMaterialResponseOps[Self <: ListCourseWorkMaterialResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCourseWorkMaterialVarargs(value: CourseWorkMaterial*): Self = this.set("courseWorkMaterial", js.Array(value :_*))
    
    @scala.inline
    def setCourseWorkMaterial(value: js.Array[CourseWorkMaterial]): Self = this.set("courseWorkMaterial", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCourseWorkMaterial: Self = this.set("courseWorkMaterial", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
  }
}
