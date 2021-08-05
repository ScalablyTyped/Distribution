package typings.maximMazurokGapiClientAndroidenterprise.gapi.client.androidenterprise

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AdministratorWebTokenSpecWebApps extends StObject {
  
  /** Whether the Web Apps page is displayed. Default is true. */
  var enabled: js.UndefOr[Boolean] = js.undefined
}
object AdministratorWebTokenSpecWebApps {
  
  inline def apply(): AdministratorWebTokenSpecWebApps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AdministratorWebTokenSpecWebApps]
  }
  
  extension [Self <: AdministratorWebTokenSpecWebApps](x: Self) {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
  }
}
