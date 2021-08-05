package typings.googleapis.scriptV1Mod.scriptV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsGetmetrics
  extends StObject
     with StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
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
    
    inline def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    inline def setMetricsFilterDotdeploymentId(value: String): Self = StObject.set(x, "metricsFilter.deploymentId", value.asInstanceOf[js.Any])
    
    inline def setMetricsFilterDotdeploymentIdUndefined: Self = StObject.set(x, "metricsFilter.deploymentId", js.undefined)
    
    inline def setMetricsGranularity(value: String): Self = StObject.set(x, "metricsGranularity", value.asInstanceOf[js.Any])
    
    inline def setMetricsGranularityUndefined: Self = StObject.set(x, "metricsGranularity", js.undefined)
    
    inline def setScriptId(value: String): Self = StObject.set(x, "scriptId", value.asInstanceOf[js.Any])
    
    inline def setScriptIdUndefined: Self = StObject.set(x, "scriptId", js.undefined)
  }
}
