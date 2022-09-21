package typings.maximMazurokGapiClientCloudresourcemanager.gapi.client.cloudresourcemanager

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchProjectsResponse extends StObject {
  
  /**
    * Pagination token. If the result set is too large to fit in a single response, this token is returned. It encodes the position of the current result cursor. Feeding this value into a
    * new list request with the `page_token` parameter gives the next page of the results. When `next_page_token` is not filled in, there is no next page and the list returned is the last
    * page in the result set. Pagination tokens have a limited lifetime.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /** The list of Projects that matched the list filter query. This list can be paginated. */
  var projects: js.UndefOr[js.Array[Project]] = js.undefined
}
object SearchProjectsResponse {
  
  inline def apply(): SearchProjectsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchProjectsResponse]
  }
  
  extension [Self <: SearchProjectsResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setProjects(value: js.Array[Project]): Self = StObject.set(x, "projects", value.asInstanceOf[js.Any])
    
    inline def setProjectsUndefined: Self = StObject.set(x, "projects", js.undefined)
    
    inline def setProjectsVarargs(value: Project*): Self = StObject.set(x, "projects", js.Array(value*))
  }
}
