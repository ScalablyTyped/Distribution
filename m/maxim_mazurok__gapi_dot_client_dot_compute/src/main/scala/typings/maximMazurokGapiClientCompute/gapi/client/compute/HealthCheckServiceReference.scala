package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HealthCheckServiceReference extends StObject {
  
  var healthCheckService: js.UndefOr[String] = js.undefined
}
object HealthCheckServiceReference {
  
  inline def apply(): HealthCheckServiceReference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HealthCheckServiceReference]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HealthCheckServiceReference] (val x: Self) extends AnyVal {
    
    inline def setHealthCheckService(value: String): Self = StObject.set(x, "healthCheckService", value.asInstanceOf[js.Any])
    
    inline def setHealthCheckServiceUndefined: Self = StObject.set(x, "healthCheckService", js.undefined)
  }
}
