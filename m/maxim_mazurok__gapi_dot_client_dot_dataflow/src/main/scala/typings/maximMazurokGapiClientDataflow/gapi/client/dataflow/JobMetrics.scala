package typings.maximMazurokGapiClientDataflow.gapi.client.dataflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JobMetrics extends StObject {
  
  /** Timestamp as of which metric values are current. */
  var metricTime: js.UndefOr[String] = js.undefined
  
  /** All metrics for this job. */
  var metrics: js.UndefOr[js.Array[MetricUpdate]] = js.undefined
}
object JobMetrics {
  
  inline def apply(): JobMetrics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobMetrics]
  }
  
  extension [Self <: JobMetrics](x: Self) {
    
    inline def setMetricTime(value: String): Self = StObject.set(x, "metricTime", value.asInstanceOf[js.Any])
    
    inline def setMetricTimeUndefined: Self = StObject.set(x, "metricTime", js.undefined)
    
    inline def setMetrics(value: js.Array[MetricUpdate]): Self = StObject.set(x, "metrics", value.asInstanceOf[js.Any])
    
    inline def setMetricsUndefined: Self = StObject.set(x, "metrics", js.undefined)
    
    inline def setMetricsVarargs(value: MetricUpdate*): Self = StObject.set(x, "metrics", js.Array(value :_*))
  }
}
