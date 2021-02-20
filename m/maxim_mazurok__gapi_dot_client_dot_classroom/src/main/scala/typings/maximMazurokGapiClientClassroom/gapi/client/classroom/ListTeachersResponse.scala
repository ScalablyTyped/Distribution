package typings.maximMazurokGapiClientClassroom.gapi.client.classroom

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListTeachersResponse extends StObject {
  
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
  implicit class ListTeachersResponseMutableBuilder[Self <: ListTeachersResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    @scala.inline
    def setTeachers(value: js.Array[Teacher]): Self = StObject.set(x, "teachers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTeachersUndefined: Self = StObject.set(x, "teachers", js.undefined)
    
    @scala.inline
    def setTeachersVarargs(value: Teacher*): Self = StObject.set(x, "teachers", js.Array(value :_*))
  }
}
