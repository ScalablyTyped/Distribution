package typings.maximMazurokGapiClientDataproc.gapi.client.dataproc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataprocMetricConfig extends StObject {
  
  /** Required. Metrics sources to enable. */
  var metrics: js.UndefOr[js.Array[Metric]] = js.undefined
}
object DataprocMetricConfig {
  
  inline def apply(): DataprocMetricConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataprocMetricConfig]
  }
  
  extension [Self <: DataprocMetricConfig](x: Self) {
    
    inline def setMetrics(value: js.Array[Metric]): Self = StObject.set(x, "metrics", value.asInstanceOf[js.Any])
    
    inline def setMetricsUndefined: Self = StObject.set(x, "metrics", js.undefined)
    
    inline def setMetricsVarargs(value: Metric*): Self = StObject.set(x, "metrics", js.Array(value*))
  }
}
