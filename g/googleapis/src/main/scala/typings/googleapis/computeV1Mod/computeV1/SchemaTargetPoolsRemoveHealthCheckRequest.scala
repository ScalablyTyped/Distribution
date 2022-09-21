package typings.googleapis.computeV1Mod.computeV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaTargetPoolsRemoveHealthCheckRequest extends StObject {
  
  /**
    * Health check URL to be removed. This can be a full or valid partial URL. For example, the following are valid URLs: - https://www.googleapis.com/compute/beta/projects/project /global/httpHealthChecks/health-check - projects/project/global/httpHealthChecks/health-check - global/httpHealthChecks/health-check
    */
  var healthChecks: js.UndefOr[js.Array[SchemaHealthCheckReference]] = js.undefined
}
object SchemaTargetPoolsRemoveHealthCheckRequest {
  
  inline def apply(): SchemaTargetPoolsRemoveHealthCheckRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTargetPoolsRemoveHealthCheckRequest]
  }
  
  extension [Self <: SchemaTargetPoolsRemoveHealthCheckRequest](x: Self) {
    
    inline def setHealthChecks(value: js.Array[SchemaHealthCheckReference]): Self = StObject.set(x, "healthChecks", value.asInstanceOf[js.Any])
    
    inline def setHealthChecksUndefined: Self = StObject.set(x, "healthChecks", js.undefined)
    
    inline def setHealthChecksVarargs(value: SchemaHealthCheckReference*): Self = StObject.set(x, "healthChecks", js.Array(value*))
  }
}
