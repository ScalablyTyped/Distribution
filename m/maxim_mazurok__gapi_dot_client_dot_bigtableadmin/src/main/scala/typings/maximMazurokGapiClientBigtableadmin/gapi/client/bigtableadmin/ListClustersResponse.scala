package typings.maximMazurokGapiClientBigtableadmin.gapi.client.bigtableadmin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListClustersResponse extends StObject {
  
  /** The list of requested clusters. */
  var clusters: js.UndefOr[js.Array[Cluster]] = js.undefined
  
  /**
    * Locations from which Cluster information could not be retrieved, due to an outage or some other transient condition. Clusters from these locations may be missing from `clusters`, or
    * may only have partial information returned. Values are of the form `projects//locations/`
    */
  var failedLocations: js.UndefOr[js.Array[String]] = js.undefined
  
  /** DEPRECATED: This field is unused and ignored. */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object ListClustersResponse {
  
  inline def apply(): ListClustersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListClustersResponse]
  }
  
  extension [Self <: ListClustersResponse](x: Self) {
    
    inline def setClusters(value: js.Array[Cluster]): Self = StObject.set(x, "clusters", value.asInstanceOf[js.Any])
    
    inline def setClustersUndefined: Self = StObject.set(x, "clusters", js.undefined)
    
    inline def setClustersVarargs(value: Cluster*): Self = StObject.set(x, "clusters", js.Array(value :_*))
    
    inline def setFailedLocations(value: js.Array[String]): Self = StObject.set(x, "failedLocations", value.asInstanceOf[js.Any])
    
    inline def setFailedLocationsUndefined: Self = StObject.set(x, "failedLocations", js.undefined)
    
    inline def setFailedLocationsVarargs(value: String*): Self = StObject.set(x, "failedLocations", js.Array(value :_*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
