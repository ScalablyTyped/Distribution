package typings.maximMazurokGapiClientBigtableadmin.gapi.client.bigtableadmin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListInstancesResponse extends StObject {
  
  /**
    * Locations from which Instance information could not be retrieved, due to an outage or some other transient condition. Instances whose Clusters are all in one of the failed locations
    * may be missing from `instances`, and Instances with at least one Cluster in a failed location may only have partial information returned. Values are of the form
    * `projects//locations/`
    */
  var failedLocations: js.UndefOr[js.Array[String]] = js.native
  
  /** The list of requested instances. */
  var instances: js.UndefOr[js.Array[Instance]] = js.native
  
  /** DEPRECATED: This field is unused and ignored. */
  var nextPageToken: js.UndefOr[String] = js.native
}
object ListInstancesResponse {
  
  @scala.inline
  def apply(): ListInstancesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListInstancesResponse]
  }
  
  @scala.inline
  implicit class ListInstancesResponseMutableBuilder[Self <: ListInstancesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFailedLocations(value: js.Array[String]): Self = StObject.set(x, "failedLocations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailedLocationsUndefined: Self = StObject.set(x, "failedLocations", js.undefined)
    
    @scala.inline
    def setFailedLocationsVarargs(value: String*): Self = StObject.set(x, "failedLocations", js.Array(value :_*))
    
    @scala.inline
    def setInstances(value: js.Array[Instance]): Self = StObject.set(x, "instances", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstancesUndefined: Self = StObject.set(x, "instances", js.undefined)
    
    @scala.inline
    def setInstancesVarargs(value: Instance*): Self = StObject.set(x, "instances", js.Array(value :_*))
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
