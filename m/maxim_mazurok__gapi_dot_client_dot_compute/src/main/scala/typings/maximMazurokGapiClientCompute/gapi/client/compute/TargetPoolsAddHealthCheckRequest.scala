package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TargetPoolsAddHealthCheckRequest extends StObject {
  
  /** The HttpHealthCheck to add to the target pool. */
  var healthChecks: js.UndefOr[js.Array[HealthCheckReference]] = js.undefined
}
object TargetPoolsAddHealthCheckRequest {
  
  inline def apply(): TargetPoolsAddHealthCheckRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TargetPoolsAddHealthCheckRequest]
  }
  
  extension [Self <: TargetPoolsAddHealthCheckRequest](x: Self) {
    
    inline def setHealthChecks(value: js.Array[HealthCheckReference]): Self = StObject.set(x, "healthChecks", value.asInstanceOf[js.Any])
    
    inline def setHealthChecksUndefined: Self = StObject.set(x, "healthChecks", js.undefined)
    
    inline def setHealthChecksVarargs(value: HealthCheckReference*): Self = StObject.set(x, "healthChecks", js.Array(value :_*))
  }
}
