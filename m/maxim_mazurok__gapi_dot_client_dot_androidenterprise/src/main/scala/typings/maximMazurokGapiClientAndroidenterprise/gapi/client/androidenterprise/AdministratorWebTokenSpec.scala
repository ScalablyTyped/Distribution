package typings.maximMazurokGapiClientAndroidenterprise.gapi.client.androidenterprise

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AdministratorWebTokenSpec extends StObject {
  
  /** Options for displaying the Managed Configuration page. */
  var managedConfigurations: js.UndefOr[AdministratorWebTokenSpecManagedConfigurations] = js.native
  
  /** The URI of the parent frame hosting the iframe. To prevent XSS, the iframe may not be hosted at other URIs. This URI must be https. Use whitespaces to separate multiple parent URIs. */
  var parent: js.UndefOr[String] = js.native
  
  /** Deprecated. Use PlaySearch.approveApps. */
  var permission: js.UndefOr[js.Array[String]] = js.native
  
  /** Options for displaying the managed Play Search apps page. */
  var playSearch: js.UndefOr[AdministratorWebTokenSpecPlaySearch] = js.native
  
  /** Options for displaying the Private Apps page. */
  var privateApps: js.UndefOr[AdministratorWebTokenSpecPrivateApps] = js.native
  
  /** Options for displaying the Organize apps page. */
  var storeBuilder: js.UndefOr[AdministratorWebTokenSpecStoreBuilder] = js.native
  
  /** Options for displaying the Web Apps page. */
  var webApps: js.UndefOr[AdministratorWebTokenSpecWebApps] = js.native
}
object AdministratorWebTokenSpec {
  
  @scala.inline
  def apply(): AdministratorWebTokenSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AdministratorWebTokenSpec]
  }
  
  @scala.inline
  implicit class AdministratorWebTokenSpecMutableBuilder[Self <: AdministratorWebTokenSpec] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setManagedConfigurations(value: AdministratorWebTokenSpecManagedConfigurations): Self = StObject.set(x, "managedConfigurations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManagedConfigurationsUndefined: Self = StObject.set(x, "managedConfigurations", js.undefined)
    
    @scala.inline
    def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    @scala.inline
    def setPermission(value: js.Array[String]): Self = StObject.set(x, "permission", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPermissionUndefined: Self = StObject.set(x, "permission", js.undefined)
    
    @scala.inline
    def setPermissionVarargs(value: String*): Self = StObject.set(x, "permission", js.Array(value :_*))
    
    @scala.inline
    def setPlaySearch(value: AdministratorWebTokenSpecPlaySearch): Self = StObject.set(x, "playSearch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlaySearchUndefined: Self = StObject.set(x, "playSearch", js.undefined)
    
    @scala.inline
    def setPrivateApps(value: AdministratorWebTokenSpecPrivateApps): Self = StObject.set(x, "privateApps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrivateAppsUndefined: Self = StObject.set(x, "privateApps", js.undefined)
    
    @scala.inline
    def setStoreBuilder(value: AdministratorWebTokenSpecStoreBuilder): Self = StObject.set(x, "storeBuilder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStoreBuilderUndefined: Self = StObject.set(x, "storeBuilder", js.undefined)
    
    @scala.inline
    def setWebApps(value: AdministratorWebTokenSpecWebApps): Self = StObject.set(x, "webApps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebAppsUndefined: Self = StObject.set(x, "webApps", js.undefined)
  }
}
