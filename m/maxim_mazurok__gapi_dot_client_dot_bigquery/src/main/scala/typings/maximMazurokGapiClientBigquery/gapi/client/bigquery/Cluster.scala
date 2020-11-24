package typings.maximMazurokGapiClientBigquery.gapi.client.bigquery

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Cluster extends js.Object {
  
  /** Centroid id. */
  var centroidId: js.UndefOr[String] = js.native
  
  /** Count of training data rows that were assigned to this cluster. */
  var count: js.UndefOr[String] = js.native
  
  /** Values of highly variant features for this cluster. */
  var featureValues: js.UndefOr[js.Array[FeatureValue]] = js.native
}
object Cluster {
  
  @scala.inline
  def apply(): Cluster = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Cluster]
  }
  
  @scala.inline
  implicit class ClusterOps[Self <: Cluster] (val x: Self) extends AnyVal {
    
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
    def setCount(value: String): Self = this.set("count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCount: Self = this.set("count", js.undefined)
    
    @scala.inline
    def setFeatureValuesVarargs(value: FeatureValue*): Self = this.set("featureValues", js.Array(value :_*))
    
    @scala.inline
    def setFeatureValues(value: js.Array[FeatureValue]): Self = this.set("featureValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFeatureValues: Self = this.set("featureValues", js.undefined)
  }
}
