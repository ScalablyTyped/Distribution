package typings.maximMazurokGapiClientDataflow.gapi.client.dataflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JobMetrics extends js.Object {
  
  /** Timestamp as of which metric values are current. */
  var metricTime: js.UndefOr[String] = js.native
  
  /** All metrics for this job. */
  var metrics: js.UndefOr[js.Array[MetricUpdate]] = js.native
}
object JobMetrics {
  
  @scala.inline
  def apply(): JobMetrics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobMetrics]
  }
  
  @scala.inline
  implicit class JobMetricsOps[Self <: JobMetrics] (val x: Self) extends AnyVal {
    
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
    def setMetricTime(value: String): Self = this.set("metricTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetricTime: Self = this.set("metricTime", js.undefined)
    
    @scala.inline
    def setMetricsVarargs(value: MetricUpdate*): Self = this.set("metrics", js.Array(value :_*))
    
    @scala.inline
    def setMetrics(value: js.Array[MetricUpdate]): Self = this.set("metrics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetrics: Self = this.set("metrics", js.undefined)
  }
}
