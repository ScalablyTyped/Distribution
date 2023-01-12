package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RegionInstanceGroupManagersListInstancesResponse extends StObject {
  
  /** A list of managed instances. */
  var managedInstances: js.UndefOr[js.Array[ManagedInstance]] = js.undefined
  
  /**
    * [Output Only] This token allows you to get the next page of results for list requests. If the number of results is larger than maxResults, use the nextPageToken as a value for the
    * query parameter pageToken in the next list request. Subsequent list requests will have their own nextPageToken to continue paging through the results.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object RegionInstanceGroupManagersListInstancesResponse {
  
  inline def apply(): RegionInstanceGroupManagersListInstancesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RegionInstanceGroupManagersListInstancesResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RegionInstanceGroupManagersListInstancesResponse] (val x: Self) extends AnyVal {
    
    inline def setManagedInstances(value: js.Array[ManagedInstance]): Self = StObject.set(x, "managedInstances", value.asInstanceOf[js.Any])
    
    inline def setManagedInstancesUndefined: Self = StObject.set(x, "managedInstances", js.undefined)
    
    inline def setManagedInstancesVarargs(value: ManagedInstance*): Self = StObject.set(x, "managedInstances", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
