package typings.maximMazurokGapiClientContainer.gapi.client.container

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServiceExternalIPsConfig extends StObject {
  
  /** Whether Services with ExternalIPs field are allowed or not. */
  var enabled: js.UndefOr[Boolean] = js.undefined
}
object ServiceExternalIPsConfig {
  
  inline def apply(): ServiceExternalIPsConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServiceExternalIPsConfig]
  }
  
  extension [Self <: ServiceExternalIPsConfig](x: Self) {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
  }
}
