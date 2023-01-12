package typings.maximMazurokGapiClientContainer.gapi.client.container

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IdentityServiceConfig extends StObject {
  
  /** Whether to enable the Identity Service component */
  var enabled: js.UndefOr[Boolean] = js.undefined
}
object IdentityServiceConfig {
  
  inline def apply(): IdentityServiceConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IdentityServiceConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IdentityServiceConfig] (val x: Self) extends AnyVal {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
  }
}
