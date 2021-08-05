package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HealthCheckLogConfig extends StObject {
  
  /** Indicates whether or not to export logs. This is false by default, which means no health check logging will be done. */
  var enable: js.UndefOr[Boolean] = js.undefined
}
object HealthCheckLogConfig {
  
  inline def apply(): HealthCheckLogConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HealthCheckLogConfig]
  }
  
  extension [Self <: HealthCheckLogConfig](x: Self) {
    
    inline def setEnable(value: Boolean): Self = StObject.set(x, "enable", value.asInstanceOf[js.Any])
    
    inline def setEnableUndefined: Self = StObject.set(x, "enable", js.undefined)
  }
}
