package typings.maximMazurokGapiClientAndroidenterprise.gapi.client.androidenterprise

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AdministratorWebTokenSpecPrivateApps extends StObject {
  
  /** Whether the Private Apps page is displayed. Default is true. */
  var enabled: js.UndefOr[Boolean] = js.undefined
}
object AdministratorWebTokenSpecPrivateApps {
  
  inline def apply(): AdministratorWebTokenSpecPrivateApps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AdministratorWebTokenSpecPrivateApps]
  }
  
  extension [Self <: AdministratorWebTokenSpecPrivateApps](x: Self) {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
  }
}
