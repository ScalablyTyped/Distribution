package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RegionInstanceGroupManagersListErrorsResponse extends StObject {
  
  /** [Output Only] The list of errors of the managed instance group. */
  var items: js.UndefOr[js.Array[InstanceManagedByIgmError]] = js.native
  
  /**
    * [Output Only] This token allows you to get the next page of results for list requests. If the number of results is larger than maxResults, use the nextPageToken as a value for the
    * query parameter pageToken in the next list request. Subsequent list requests will have their own nextPageToken to continue paging through the results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}
object RegionInstanceGroupManagersListErrorsResponse {
  
  @scala.inline
  def apply(): RegionInstanceGroupManagersListErrorsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RegionInstanceGroupManagersListErrorsResponse]
  }
  
  @scala.inline
  implicit class RegionInstanceGroupManagersListErrorsResponseMutableBuilder[Self <: RegionInstanceGroupManagersListErrorsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: js.Array[InstanceManagedByIgmError]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: InstanceManagedByIgmError*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
