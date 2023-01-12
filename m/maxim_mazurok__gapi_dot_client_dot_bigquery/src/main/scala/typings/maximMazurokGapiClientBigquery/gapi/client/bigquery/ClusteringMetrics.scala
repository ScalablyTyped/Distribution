package typings.maximMazurokGapiClientBigquery.gapi.client.bigquery

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClusteringMetrics extends StObject {
  
  /** Information for all clusters. */
  var clusters: js.UndefOr[js.Array[Cluster]] = js.undefined
  
  /** Davies-Bouldin index. */
  var daviesBouldinIndex: js.UndefOr[Double] = js.undefined
  
  /** Mean of squared distances between each sample to its cluster centroid. */
  var meanSquaredDistance: js.UndefOr[Double] = js.undefined
}
object ClusteringMetrics {
  
  inline def apply(): ClusteringMetrics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClusteringMetrics]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ClusteringMetrics] (val x: Self) extends AnyVal {
    
    inline def setClusters(value: js.Array[Cluster]): Self = StObject.set(x, "clusters", value.asInstanceOf[js.Any])
    
    inline def setClustersUndefined: Self = StObject.set(x, "clusters", js.undefined)
    
    inline def setClustersVarargs(value: Cluster*): Self = StObject.set(x, "clusters", js.Array(value*))
    
    inline def setDaviesBouldinIndex(value: Double): Self = StObject.set(x, "daviesBouldinIndex", value.asInstanceOf[js.Any])
    
    inline def setDaviesBouldinIndexUndefined: Self = StObject.set(x, "daviesBouldinIndex", js.undefined)
    
    inline def setMeanSquaredDistance(value: Double): Self = StObject.set(x, "meanSquaredDistance", value.asInstanceOf[js.Any])
    
    inline def setMeanSquaredDistanceUndefined: Self = StObject.set(x, "meanSquaredDistance", js.undefined)
  }
}
