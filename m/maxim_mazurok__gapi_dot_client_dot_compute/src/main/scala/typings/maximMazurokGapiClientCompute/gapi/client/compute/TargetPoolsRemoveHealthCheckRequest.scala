package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TargetPoolsRemoveHealthCheckRequest extends StObject {
  
  /**
    * Health check URL to be removed. This can be a full or valid partial URL. For example, the following are valid URLs:
    * - https://www.googleapis.com/compute/beta/projects/project/global/httpHealthChecks/health-check
    * - projects/project/global/httpHealthChecks/health-check
    * - global/httpHealthChecks/health-check
    */
  var healthChecks: js.UndefOr[js.Array[HealthCheckReference]] = js.undefined
}
object TargetPoolsRemoveHealthCheckRequest {
  
  @scala.inline
  def apply(): TargetPoolsRemoveHealthCheckRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TargetPoolsRemoveHealthCheckRequest]
  }
  
  @scala.inline
  implicit class TargetPoolsRemoveHealthCheckRequestMutableBuilder[Self <: TargetPoolsRemoveHealthCheckRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHealthChecks(value: js.Array[HealthCheckReference]): Self = StObject.set(x, "healthChecks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHealthChecksUndefined: Self = StObject.set(x, "healthChecks", js.undefined)
    
    @scala.inline
    def setHealthChecksVarargs(value: HealthCheckReference*): Self = StObject.set(x, "healthChecks", js.Array(value :_*))
  }
}
