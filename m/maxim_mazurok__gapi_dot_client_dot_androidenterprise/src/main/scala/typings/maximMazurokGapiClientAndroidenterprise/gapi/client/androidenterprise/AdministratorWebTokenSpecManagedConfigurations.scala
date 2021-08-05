package typings.maximMazurokGapiClientAndroidenterprise.gapi.client.androidenterprise

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AdministratorWebTokenSpecManagedConfigurations extends StObject {
  
  /** Whether the Managed Configuration page is displayed. Default is true. */
  var enabled: js.UndefOr[Boolean] = js.undefined
}
object AdministratorWebTokenSpecManagedConfigurations {
  
  inline def apply(): AdministratorWebTokenSpecManagedConfigurations = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AdministratorWebTokenSpecManagedConfigurations]
  }
  
  extension [Self <: AdministratorWebTokenSpecManagedConfigurations](x: Self) {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
  }
}
