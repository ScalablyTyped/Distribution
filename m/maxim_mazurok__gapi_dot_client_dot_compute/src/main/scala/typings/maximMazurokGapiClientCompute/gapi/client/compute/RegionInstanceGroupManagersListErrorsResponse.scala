package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RegionInstanceGroupManagersListErrorsResponse extends StObject {
  
  /** [Output Only] The list of errors of the managed instance group. */
  var items: js.UndefOr[js.Array[InstanceManagedByIgmError]] = js.undefined
  
  /**
    * [Output Only] This token allows you to get the next page of results for list requests. If the number of results is larger than maxResults, use the nextPageToken as a value for the
    * query parameter pageToken in the next list request. Subsequent list requests will have their own nextPageToken to continue paging through the results.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object RegionInstanceGroupManagersListErrorsResponse {
  
  inline def apply(): RegionInstanceGroupManagersListErrorsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RegionInstanceGroupManagersListErrorsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RegionInstanceGroupManagersListErrorsResponse] (val x: Self) extends AnyVal {
    
    inline def setItems(value: js.Array[InstanceManagedByIgmError]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: InstanceManagedByIgmError*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
