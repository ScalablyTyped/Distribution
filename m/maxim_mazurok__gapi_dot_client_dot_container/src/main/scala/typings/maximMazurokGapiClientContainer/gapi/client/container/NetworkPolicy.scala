package typings.maximMazurokGapiClientContainer.gapi.client.container

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NetworkPolicy extends StObject {
  
  /** Whether network policy is enabled on the cluster. */
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  /** The selected network policy provider. */
  var provider: js.UndefOr[String] = js.undefined
}
object NetworkPolicy {
  
  inline def apply(): NetworkPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NetworkPolicy]
  }
  
  extension [Self <: NetworkPolicy](x: Self) {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setProvider(value: String): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
    
    inline def setProviderUndefined: Self = StObject.set(x, "provider", js.undefined)
  }
}
