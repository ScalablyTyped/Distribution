package typings.googleapis.loggingV2Mod.loggingV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsMetricsDelete
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The resource name of the metric to delete: "projects/[PROJECT_ID]/metrics/[METRIC_ID]"
    */
  var metricName: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsMetricsDelete {
  
  inline def apply(): ParamsResourceProjectsMetricsDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsMetricsDelete]
  }
  
  extension [Self <: ParamsResourceProjectsMetricsDelete](x: Self) {
    
    inline def setMetricName(value: String): Self = StObject.set(x, "metricName", value.asInstanceOf[js.Any])
    
    inline def setMetricNameUndefined: Self = StObject.set(x, "metricName", js.undefined)
  }
}
