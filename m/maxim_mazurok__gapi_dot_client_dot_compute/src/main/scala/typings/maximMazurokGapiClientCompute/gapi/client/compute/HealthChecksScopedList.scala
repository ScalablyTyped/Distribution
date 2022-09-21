package typings.maximMazurokGapiClientCompute.gapi.client.compute

import typings.maximMazurokGapiClientCompute.anon.Code
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HealthChecksScopedList extends StObject {
  
  /** A list of HealthChecks contained in this scope. */
  var healthChecks: js.UndefOr[js.Array[HealthCheck]] = js.undefined
  
  /** Informational warning which replaces the list of backend services when the list is empty. */
  var warning: js.UndefOr[Code] = js.undefined
}
object HealthChecksScopedList {
  
  inline def apply(): HealthChecksScopedList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HealthChecksScopedList]
  }
  
  extension [Self <: HealthChecksScopedList](x: Self) {
    
    inline def setHealthChecks(value: js.Array[HealthCheck]): Self = StObject.set(x, "healthChecks", value.asInstanceOf[js.Any])
    
    inline def setHealthChecksUndefined: Self = StObject.set(x, "healthChecks", js.undefined)
    
    inline def setHealthChecksVarargs(value: HealthCheck*): Self = StObject.set(x, "healthChecks", js.Array(value*))
    
    inline def setWarning(value: Code): Self = StObject.set(x, "warning", value.asInstanceOf[js.Any])
    
    inline def setWarningUndefined: Self = StObject.set(x, "warning", js.undefined)
  }
}
