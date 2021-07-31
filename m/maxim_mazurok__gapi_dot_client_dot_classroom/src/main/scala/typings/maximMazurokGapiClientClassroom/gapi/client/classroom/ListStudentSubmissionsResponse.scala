package typings.maximMazurokGapiClientClassroom.gapi.client.classroom

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListStudentSubmissionsResponse extends StObject {
  
  /** Token identifying the next page of results to return. If empty, no further results are available. */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /** Student work that matches the request. */
  var studentSubmissions: js.UndefOr[js.Array[StudentSubmission]] = js.undefined
}
object ListStudentSubmissionsResponse {
  
  @scala.inline
  def apply(): ListStudentSubmissionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListStudentSubmissionsResponse]
  }
  
  @scala.inline
  implicit class ListStudentSubmissionsResponseMutableBuilder[Self <: ListStudentSubmissionsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    @scala.inline
    def setStudentSubmissions(value: js.Array[StudentSubmission]): Self = StObject.set(x, "studentSubmissions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStudentSubmissionsUndefined: Self = StObject.set(x, "studentSubmissions", js.undefined)
    
    @scala.inline
    def setStudentSubmissionsVarargs(value: StudentSubmission*): Self = StObject.set(x, "studentSubmissions", js.Array(value :_*))
  }
}
