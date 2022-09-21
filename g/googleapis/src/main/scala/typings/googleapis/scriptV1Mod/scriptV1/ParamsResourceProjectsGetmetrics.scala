package typings.googleapis.scriptV1Mod.scriptV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsGetmetrics
  extends StObject
     with StandardParameters {
  
  /**
    * Optional field indicating a specific deployment to retrieve metrics from.
    */
  @JSName("metricsFilter.deploymentId")
  var metricsFilterDotdeploymentId: js.UndefOr[String] = js.undefined
  
  /**
    * Required field indicating what granularity of metrics are returned.
    */
  var metricsGranularity: js.UndefOr[String] = js.undefined
  
  /**
    * Required field indicating the script to get metrics for.
    */
  var scriptId: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsGetmetrics {
  
  inline def apply(): ParamsResourceProjectsGetmetrics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsGetmetrics]
  }
  
  extension [Self <: ParamsResourceProjectsGetmetrics](x: Self) {
    
    inline def setMetricsFilterDotdeploymentId(value: String): Self = StObject.set(x, "metricsFilter.deploymentId", value.asInstanceOf[js.Any])
    
    inline def setMetricsFilterDotdeploymentIdUndefined: Self = StObject.set(x, "metricsFilter.deploymentId", js.undefined)
    
    inline def setMetricsGranularity(value: String): Self = StObject.set(x, "metricsGranularity", value.asInstanceOf[js.Any])
    
    inline def setMetricsGranularityUndefined: Self = StObject.set(x, "metricsGranularity", js.undefined)
    
    inline def setScriptId(value: String): Self = StObject.set(x, "scriptId", value.asInstanceOf[js.Any])
    
    inline def setScriptIdUndefined: Self = StObject.set(x, "scriptId", js.undefined)
  }
}
