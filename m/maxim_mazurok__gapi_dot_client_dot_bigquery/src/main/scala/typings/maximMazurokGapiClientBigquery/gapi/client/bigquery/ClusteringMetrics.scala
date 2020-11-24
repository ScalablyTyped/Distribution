package typings.maximMazurokGapiClientBigquery.gapi.client.bigquery

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClusteringMetrics extends js.Object {
  
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
  implicit class ClusteringMetricsOps[Self <: ClusteringMetrics] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setClustersVarargs(value: Cluster*): Self = this.set("clusters", js.Array(value :_*))
    
    @scala.inline
    def setClusters(value: js.Array[Cluster]): Self = this.set("clusters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClusters: Self = this.set("clusters", js.undefined)
    
    @scala.inline
    def setDaviesBouldinIndex(value: Double): Self = this.set("daviesBouldinIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDaviesBouldinIndex: Self = this.set("daviesBouldinIndex", js.undefined)
    
    @scala.inline
    def setMeanSquaredDistance(value: Double): Self = this.set("meanSquaredDistance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMeanSquaredDistance: Self = this.set("meanSquaredDistance", js.undefined)
  }
}
