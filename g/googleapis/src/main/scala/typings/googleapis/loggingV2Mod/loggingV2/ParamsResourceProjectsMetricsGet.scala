package typings.googleapis.loggingV2Mod.loggingV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsMetricsGet
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The resource name of the desired metric: "projects/[PROJECT_ID]/metrics/[METRIC_ID]"
    */
  var metricName: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsMetricsGet {
  
  inline def apply(): ParamsResourceProjectsMetricsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsMetricsGet]
  }
  
  extension [Self <: ParamsResourceProjectsMetricsGet](x: Self) {
    
    inline def setMetricName(value: String): Self = StObject.set(x, "metricName", value.asInstanceOf[js.Any])
    
    inline def setMetricNameUndefined: Self = StObject.set(x, "metricName", js.undefined)
  }
}
