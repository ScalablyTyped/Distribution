package typings.googleapis.scriptV1Mod.scriptV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceProjectsGetmetrics extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * Optional field indicating a specific deployment to retrieve metrics from.
    */
  @JSName("metricsFilter.deploymentId")
  var metricsFilterDotdeploymentId: js.UndefOr[String] = js.native
  
  /**
    * Required field indicating what granularity of metrics are returned.
    */
  var metricsGranularity: js.UndefOr[String] = js.native
  
  /**
    * Required field indicating the script to get metrics for.
    */
  var scriptId: js.UndefOr[String] = js.native
}
object ParamsResourceProjectsGetmetrics {
  
  @scala.inline
  def apply(): ParamsResourceProjectsGetmetrics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsGetmetrics]
  }
  
  @scala.inline
  implicit class ParamsResourceProjectsGetmetricsMutableBuilder[Self <: ParamsResourceProjectsGetmetrics] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setMetricsFilterDotdeploymentId(value: String): Self = StObject.set(x, "metricsFilter.deploymentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetricsFilterDotdeploymentIdUndefined: Self = StObject.set(x, "metricsFilter.deploymentId", js.undefined)
    
    @scala.inline
    def setMetricsGranularity(value: String): Self = StObject.set(x, "metricsGranularity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetricsGranularityUndefined: Self = StObject.set(x, "metricsGranularity", js.undefined)
    
    @scala.inline
    def setScriptId(value: String): Self = StObject.set(x, "scriptId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScriptIdUndefined: Self = StObject.set(x, "scriptId", js.undefined)
  }
}
