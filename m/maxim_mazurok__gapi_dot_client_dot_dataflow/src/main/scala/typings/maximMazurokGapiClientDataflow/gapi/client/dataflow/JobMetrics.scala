package typings.maximMazurokGapiClientDataflow.gapi.client.dataflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JobMetrics extends StObject {
  
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
  implicit class JobMetricsMutableBuilder[Self <: JobMetrics] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMetricTime(value: String): Self = StObject.set(x, "metricTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetricTimeUndefined: Self = StObject.set(x, "metricTime", js.undefined)
    
    @scala.inline
    def setMetrics(value: js.Array[MetricUpdate]): Self = StObject.set(x, "metrics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetricsUndefined: Self = StObject.set(x, "metrics", js.undefined)
    
    @scala.inline
    def setMetricsVarargs(value: MetricUpdate*): Self = StObject.set(x, "metrics", js.Array(value :_*))
  }
}
