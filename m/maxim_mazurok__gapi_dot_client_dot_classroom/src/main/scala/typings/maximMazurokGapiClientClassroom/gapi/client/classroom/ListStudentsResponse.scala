package typings.maximMazurokGapiClientClassroom.gapi.client.classroom

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListStudentsResponse extends StObject {
  
  /** Token identifying the next page of results to return. If empty, no further results are available. */
  var nextPageToken: js.UndefOr[String] = js.native
  
  /** Students who match the list request. */
  var students: js.UndefOr[js.Array[Student]] = js.native
}
object ListStudentsResponse {
  
  @scala.inline
  def apply(): ListStudentsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListStudentsResponse]
  }
  
  @scala.inline
  implicit class ListStudentsResponseMutableBuilder[Self <: ListStudentsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    @scala.inline
    def setStudents(value: js.Array[Student]): Self = StObject.set(x, "students", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStudentsUndefined: Self = StObject.set(x, "students", js.undefined)
    
    @scala.inline
    def setStudentsVarargs(value: Student*): Self = StObject.set(x, "students", js.Array(value :_*))
  }
}
