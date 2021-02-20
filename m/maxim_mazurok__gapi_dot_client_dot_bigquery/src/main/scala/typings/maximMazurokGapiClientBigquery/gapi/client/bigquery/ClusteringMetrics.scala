package typings.maximMazurokGapiClientBigquery.gapi.client.bigquery

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClusteringMetrics extends StObject {
  
  /** [Beta] Information for all clusters. */
  var clusters: js.UndefOr[js.Array[Cluster]] = js.native
  
  /** Davies-Bouldin index. */
  var daviesBouldinIndex: js.UndefOr[Double] = js.native
  
  /** Mean of squared distances between each sample to its cluster centroid. */
  var meanSquaredDistance: js.UndefOr[Double] = js.native
}
object ClusteringMetrics {
  
  @scala.inline
  def apply(): ClusteringMetrics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClusteringMetrics]
  }
  
  @scala.inline
  implicit class ClusteringMetricsMutableBuilder[Self <: ClusteringMetrics] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClusters(value: js.Array[Cluster]): Self = StObject.set(x, "clusters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClustersUndefined: Self = StObject.set(x, "clusters", js.undefined)
    
    @scala.inline
    def setClustersVarargs(value: Cluster*): Self = StObject.set(x, "clusters", js.Array(value :_*))
    
    @scala.inline
    def setDaviesBouldinIndex(value: Double): Self = StObject.set(x, "daviesBouldinIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDaviesBouldinIndexUndefined: Self = StObject.set(x, "daviesBouldinIndex", js.undefined)
    
    @scala.inline
    def setMeanSquaredDistance(value: Double): Self = StObject.set(x, "meanSquaredDistance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMeanSquaredDistanceUndefined: Self = StObject.set(x, "meanSquaredDistance", js.undefined)
  }
}
