package typings.maximMazurokGapiClientClassroom.gapi.client.classroom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListTeachersResponse extends js.Object {
  
  /** Token identifying the next page of results to return. If empty, no further results are available. */
  var nextPageToken: js.UndefOr[String] = js.native
  
  /** Teachers who match the list request. */
  var teachers: js.UndefOr[js.Array[Teacher]] = js.native
}
object ListTeachersResponse {
  
  @scala.inline
  def apply(): ListTeachersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTeachersResponse]
  }
  
  @scala.inline
  implicit class ListTeachersResponseOps[Self <: ListTeachersResponse] (val x: Self) extends AnyVal {
    
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
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
    
    @scala.inline
    def setTeachersVarargs(value: Teacher*): Self = this.set("teachers", js.Array(value :_*))
    
    @scala.inline
    def setTeachers(value: js.Array[Teacher]): Self = this.set("teachers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTeachers: Self = this.set("teachers", js.undefined)
  }
}
