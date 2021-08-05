package typings.maximMazurokGapiClientCloudiot.gapi.client.cloudiot

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HttpConfig extends StObject {
  
  /** If enabled, allows devices to use DeviceService via the HTTP protocol. Otherwise, any requests to DeviceService will fail for this registry. */
  var httpEnabledState: js.UndefOr[String] = js.undefined
}
object HttpConfig {
  
  inline def apply(): HttpConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HttpConfig]
  }
  
  extension [Self <: HttpConfig](x: Self) {
    
    inline def setHttpEnabledState(value: String): Self = StObject.set(x, "httpEnabledState", value.asInstanceOf[js.Any])
    
    inline def setHttpEnabledStateUndefined: Self = StObject.set(x, "httpEnabledState", js.undefined)
  }
}
