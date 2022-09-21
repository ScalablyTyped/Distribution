package typings.maximMazurokGapiClientAndroidenterprise.gapi.client.androidenterprise

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AdministratorWebTokenSpec extends StObject {
  
  /** Options for displaying the Managed Configuration page. */
  var managedConfigurations: js.UndefOr[AdministratorWebTokenSpecManagedConfigurations] = js.undefined
  
  /** The URI of the parent frame hosting the iframe. To prevent XSS, the iframe may not be hosted at other URIs. This URI must be https. Use whitespaces to separate multiple parent URIs. */
  var parent: js.UndefOr[String] = js.undefined
  
  /** Deprecated. Use PlaySearch.approveApps. */
  var permission: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Options for displaying the managed Play Search apps page. */
  var playSearch: js.UndefOr[AdministratorWebTokenSpecPlaySearch] = js.undefined
  
  /** Options for displaying the Private Apps page. */
  var privateApps: js.UndefOr[AdministratorWebTokenSpecPrivateApps] = js.undefined
  
  /** Options for displaying the Organize apps page. */
  var storeBuilder: js.UndefOr[AdministratorWebTokenSpecStoreBuilder] = js.undefined
  
  /** Options for displaying the Web Apps page. */
  var webApps: js.UndefOr[AdministratorWebTokenSpecWebApps] = js.undefined
  
  /** Options for displaying the Zero Touch page. */
  var zeroTouch: js.UndefOr[AdministratorWebTokenSpecZeroTouch] = js.undefined
}
object AdministratorWebTokenSpec {
  
  inline def apply(): AdministratorWebTokenSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AdministratorWebTokenSpec]
  }
  
  extension [Self <: AdministratorWebTokenSpec](x: Self) {
    
    inline def setManagedConfigurations(value: AdministratorWebTokenSpecManagedConfigurations): Self = StObject.set(x, "managedConfigurations", value.asInstanceOf[js.Any])
    
    inline def setManagedConfigurationsUndefined: Self = StObject.set(x, "managedConfigurations", js.undefined)
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setPermission(value: js.Array[String]): Self = StObject.set(x, "permission", value.asInstanceOf[js.Any])
    
    inline def setPermissionUndefined: Self = StObject.set(x, "permission", js.undefined)
    
    inline def setPermissionVarargs(value: String*): Self = StObject.set(x, "permission", js.Array(value*))
    
    inline def setPlaySearch(value: AdministratorWebTokenSpecPlaySearch): Self = StObject.set(x, "playSearch", value.asInstanceOf[js.Any])
    
    inline def setPlaySearchUndefined: Self = StObject.set(x, "playSearch", js.undefined)
    
    inline def setPrivateApps(value: AdministratorWebTokenSpecPrivateApps): Self = StObject.set(x, "privateApps", value.asInstanceOf[js.Any])
    
    inline def setPrivateAppsUndefined: Self = StObject.set(x, "privateApps", js.undefined)
    
    inline def setStoreBuilder(value: AdministratorWebTokenSpecStoreBuilder): Self = StObject.set(x, "storeBuilder", value.asInstanceOf[js.Any])
    
    inline def setStoreBuilderUndefined: Self = StObject.set(x, "storeBuilder", js.undefined)
    
    inline def setWebApps(value: AdministratorWebTokenSpecWebApps): Self = StObject.set(x, "webApps", value.asInstanceOf[js.Any])
    
    inline def setWebAppsUndefined: Self = StObject.set(x, "webApps", js.undefined)
    
    inline def setZeroTouch(value: AdministratorWebTokenSpecZeroTouch): Self = StObject.set(x, "zeroTouch", value.asInstanceOf[js.Any])
    
    inline def setZeroTouchUndefined: Self = StObject.set(x, "zeroTouch", js.undefined)
  }
}
