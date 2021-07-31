package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TargetPoolsAddHealthCheckRequest extends StObject {
  
  /** The HttpHealthCheck to add to the target pool. */
  var healthChecks: js.UndefOr[js.Array[HealthCheckReference]] = js.undefined
}
object TargetPoolsAddHealthCheckRequest {
  
  @scala.inline
  def apply(): TargetPoolsAddHealthCheckRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TargetPoolsAddHealthCheckRequest]
  }
  
  @scala.inline
  implicit class TargetPoolsAddHealthCheckRequestMutableBuilder[Self <: TargetPoolsAddHealthCheckRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHealthChecks(value: js.Array[HealthCheckReference]): Self = StObject.set(x, "healthChecks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHealthChecksUndefined: Self = StObject.set(x, "healthChecks", js.undefined)
    
    @scala.inline
    def setHealthChecksVarargs(value: HealthCheckReference*): Self = StObject.set(x, "healthChecks", js.Array(value :_*))
  }
}
