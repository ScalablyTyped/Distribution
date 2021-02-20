package typings.maximMazurokGapiClientBigqueryreservation.gapi.client.bigqueryreservation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListAssignmentsResponse extends StObject {
  
  /** List of assignments visible to the user. */
  var assignments: js.UndefOr[js.Array[Assignment]] = js.native
  
  /** Token to retrieve the next page of results, or empty if there are no more results in the list. */
  var nextPageToken: js.UndefOr[String] = js.native
}
object ListAssignmentsResponse {
  
  @scala.inline
  def apply(): ListAssignmentsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListAssignmentsResponse]
  }
  
  @scala.inline
  implicit class ListAssignmentsResponseMutableBuilder[Self <: ListAssignmentsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAssignments(value: js.Array[Assignment]): Self = StObject.set(x, "assignments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssignmentsUndefined: Self = StObject.set(x, "assignments", js.undefined)
    
    @scala.inline
    def setAssignmentsVarargs(value: Assignment*): Self = StObject.set(x, "assignments", js.Array(value :_*))
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
