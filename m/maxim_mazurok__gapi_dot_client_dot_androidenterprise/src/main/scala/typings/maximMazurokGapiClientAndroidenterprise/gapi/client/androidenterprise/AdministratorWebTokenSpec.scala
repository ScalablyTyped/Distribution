package typings.maximMazurokGapiClientAndroidenterprise.gapi.client.androidenterprise

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AdministratorWebTokenSpec extends js.Object {
  
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
  implicit class AdministratorWebTokenSpecOps[Self <: AdministratorWebTokenSpec] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setManagedConfigurations(value: AdministratorWebTokenSpecManagedConfigurations): Self = this.set("managedConfigurations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteManagedConfigurations: Self = this.set("managedConfigurations", js.undefined)
    
    @scala.inline
    def setParent(value: String): Self = this.set("parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParent: Self = this.set("parent", js.undefined)
    
    @scala.inline
    def setPermissionVarargs(value: String*): Self = this.set("permission", js.Array(value :_*))
    
    @scala.inline
    def setPermission(value: js.Array[String]): Self = this.set("permission", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePermission: Self = this.set("permission", js.undefined)
    
    @scala.inline
    def setPlaySearch(value: AdministratorWebTokenSpecPlaySearch): Self = this.set("playSearch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlaySearch: Self = this.set("playSearch", js.undefined)
    
    @scala.inline
    def setPrivateApps(value: AdministratorWebTokenSpecPrivateApps): Self = this.set("privateApps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrivateApps: Self = this.set("privateApps", js.undefined)
    
    @scala.inline
    def setStoreBuilder(value: AdministratorWebTokenSpecStoreBuilder): Self = this.set("storeBuilder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStoreBuilder: Self = this.set("storeBuilder", js.undefined)
    
    @scala.inline
    def setWebApps(value: AdministratorWebTokenSpecWebApps): Self = this.set("webApps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWebApps: Self = this.set("webApps", js.undefined)
  }
}
