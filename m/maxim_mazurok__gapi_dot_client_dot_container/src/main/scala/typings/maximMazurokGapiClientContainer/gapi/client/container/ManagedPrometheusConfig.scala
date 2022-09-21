package typings.maximMazurokGapiClientContainer.gapi.client.container

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ManagedPrometheusConfig extends StObject {
  
  /** Enable Managed Collection. */
  var enabled: js.UndefOr[Boolean] = js.undefined
}
object ManagedPrometheusConfig {
  
  inline def apply(): ManagedPrometheusConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ManagedPrometheusConfig]
  }
  
  extension [Self <: ManagedPrometheusConfig](x: Self) {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
  }
}
