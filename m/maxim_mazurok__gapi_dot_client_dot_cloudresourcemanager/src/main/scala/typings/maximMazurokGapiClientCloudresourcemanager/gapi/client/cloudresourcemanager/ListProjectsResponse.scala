package typings.maximMazurokGapiClientCloudresourcemanager.gapi.client.cloudresourcemanager

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListProjectsResponse extends StObject {
  
  /**
    * Pagination token. If the result set is too large to fit in a single response, this token is returned. It encodes the position of the current result cursor. Feeding this value into a
    * new list request with the `page_token` parameter gives the next page of the results. When `next_page_token` is not filled in, there is no next page and the list returned is the last
    * page in the result set. Pagination tokens have a limited lifetime.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /** The list of Projects under the parent. This list can be paginated. */
  var projects: js.UndefOr[js.Array[Project]] = js.undefined
}
object ListProjectsResponse {
  
  inline def apply(): ListProjectsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListProjectsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListProjectsResponse] (val x: Self) extends AnyVal {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setProjects(value: js.Array[Project]): Self = StObject.set(x, "projects", value.asInstanceOf[js.Any])
    
    inline def setProjectsUndefined: Self = StObject.set(x, "projects", js.undefined)
    
    inline def setProjectsVarargs(value: Project*): Self = StObject.set(x, "projects", js.Array(value*))
  }
}
