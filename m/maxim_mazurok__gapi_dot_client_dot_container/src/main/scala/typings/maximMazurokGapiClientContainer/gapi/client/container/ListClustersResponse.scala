package typings.maximMazurokGapiClientContainer.gapi.client.container

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListClustersResponse extends StObject {
  
  /** A list of clusters in the project in the specified zone, or across all ones. */
  var clusters: js.UndefOr[js.Array[Cluster]] = js.undefined
  
  /** If any zones are listed here, the list of clusters returned may be missing those zones. */
  var missingZones: js.UndefOr[js.Array[String]] = js.undefined
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
    
    inline def setMissingZones(value: js.Array[String]): Self = StObject.set(x, "missingZones", value.asInstanceOf[js.Any])
    
    inline def setMissingZonesUndefined: Self = StObject.set(x, "missingZones", js.undefined)
    
    inline def setMissingZonesVarargs(value: String*): Self = StObject.set(x, "missingZones", js.Array(value :_*))
  }
}
