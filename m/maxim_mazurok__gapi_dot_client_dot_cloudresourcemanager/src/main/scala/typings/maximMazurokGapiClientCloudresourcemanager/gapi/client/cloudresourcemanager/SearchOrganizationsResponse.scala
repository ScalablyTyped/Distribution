package typings.maximMazurokGapiClientCloudresourcemanager.gapi.client.cloudresourcemanager

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchOrganizationsResponse extends StObject {
  
  /**
    * A pagination token to be used to retrieve the next page of results. If the result is too large to fit within the page size specified in the request, this field will be set with a
    * token that can be used to fetch the next page of results. If this field is empty, it indicates that this response contains the last page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /** The list of Organizations that matched the search query, possibly paginated. */
  var organizations: js.UndefOr[js.Array[Organization]] = js.undefined
}
object SearchOrganizationsResponse {
  
  inline def apply(): SearchOrganizationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchOrganizationsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SearchOrganizationsResponse] (val x: Self) extends AnyVal {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setOrganizations(value: js.Array[Organization]): Self = StObject.set(x, "organizations", value.asInstanceOf[js.Any])
    
    inline def setOrganizationsUndefined: Self = StObject.set(x, "organizations", js.undefined)
    
    inline def setOrganizationsVarargs(value: Organization*): Self = StObject.set(x, "organizations", js.Array(value*))
  }
}
