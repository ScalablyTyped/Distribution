package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HealthCheckReference extends StObject {
  
  var healthCheck: js.UndefOr[String] = js.undefined
}
object HealthCheckReference {
  
  inline def apply(): HealthCheckReference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HealthCheckReference]
  }
  
  extension [Self <: HealthCheckReference](x: Self) {
    
    inline def setHealthCheck(value: String): Self = StObject.set(x, "healthCheck", value.asInstanceOf[js.Any])
    
    inline def setHealthCheckUndefined: Self = StObject.set(x, "healthCheck", js.undefined)
  }
}
