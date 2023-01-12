package typings.maximMazurokGapiClientAndroidenterprise.gapi.client.androidenterprise

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AdministratorWebTokenSpecPlaySearch extends StObject {
  
  /** Allow access to the iframe in approve mode. Default is false. */
  var approveApps: js.UndefOr[Boolean] = js.undefined
  
  /** Whether the managed Play Search apps page is displayed. Default is true. */
  var enabled: js.UndefOr[Boolean] = js.undefined
}
object AdministratorWebTokenSpecPlaySearch {
  
  inline def apply(): AdministratorWebTokenSpecPlaySearch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AdministratorWebTokenSpecPlaySearch]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AdministratorWebTokenSpecPlaySearch] (val x: Self) extends AnyVal {
    
    inline def setApproveApps(value: Boolean): Self = StObject.set(x, "approveApps", value.asInstanceOf[js.Any])
    
    inline def setApproveAppsUndefined: Self = StObject.set(x, "approveApps", js.undefined)
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
  }
}
