package typings.maximMazurokGapiClientBigquery.gapi.client.bigquery

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClusterInfo extends js.Object {
  
  /** Centroid id. */
  var centroidId: js.UndefOr[String] = js.native
  
  /** Cluster radius, the average distance from centroid to each point assigned to the cluster. */
  var clusterRadius: js.UndefOr[Double] = js.native
  
  /** Cluster size, the total number of points assigned to the cluster. */
  var clusterSize: js.UndefOr[String] = js.native
}
object ClusterInfo {
  
  @scala.inline
  def apply(): ClusterInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClusterInfo]
  }
  
  @scala.inline
  implicit class ClusterInfoOps[Self <: ClusterInfo] (val x: Self) extends AnyVal {
    
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
    def setCentroidId(value: String): Self = this.set("centroidId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCentroidId: Self = this.set("centroidId", js.undefined)
    
    @scala.inline
    def setClusterRadius(value: Double): Self = this.set("clusterRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClusterRadius: Self = this.set("clusterRadius", js.undefined)
    
    @scala.inline
    def setClusterSize(value: String): Self = this.set("clusterSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClusterSize: Self = this.set("clusterSize", js.undefined)
  }
}
