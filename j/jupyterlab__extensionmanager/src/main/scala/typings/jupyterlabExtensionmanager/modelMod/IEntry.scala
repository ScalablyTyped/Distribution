package typings.jupyterlabExtensionmanager.modelMod

import typings.jupyterlabExtensionmanager.jupyterlabExtensionmanagerStrings.deprecated
import typings.jupyterlabExtensionmanager.jupyterlabExtensionmanagerStrings.error
import typings.jupyterlabExtensionmanager.jupyterlabExtensionmanagerStrings.ok
import typings.jupyterlabExtensionmanager.jupyterlabExtensionmanagerStrings.warning
import typings.jupyterlabExtensionmanager.listingsMod.IListEntry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IEntry extends js.Object {
  
  var blacklistEntry: js.UndefOr[IListEntry] = js.native
  
  /**
    * A short description of the extension.
    */
  var description: String = js.native
  
  /**
    * Whether the extension is currently enabled.
    */
  var enabled: Boolean = js.native
  
  /**
    * Whether the extension is currently installed.
    */
  var installed: Boolean = js.native
  
  /**
    * The installed version of the extension.
    */
  var installed_version: String = js.native
  
  /**
    * The latest version of the extension.
    */
  var latest_version: String = js.native
  
  /**
    * The name of the extension.
    */
  var name: String = js.native
  
  /**
    * A flag indicating the status of an installed extension.
    */
  var status: ok | warning | error | deprecated | Null = js.native
  
  /**
    * A representative link of the package.
    */
  var url: String = js.native
  
  var whitelistEntry: js.UndefOr[IListEntry] = js.native
}
object IEntry {
  
  @scala.inline
  def apply(
    description: String,
    enabled: Boolean,
    installed: Boolean,
    installed_version: String,
    latest_version: String,
    name: String,
    url: String
  ): IEntry = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], installed = installed.asInstanceOf[js.Any], installed_version = installed_version.asInstanceOf[js.Any], latest_version = latest_version.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[IEntry]
  }
  
  @scala.inline
  implicit class IEntryOps[Self <: IEntry] (val x: Self) extends AnyVal {
    
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
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstalled(value: Boolean): Self = this.set("installed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstalled_version(value: String): Self = this.set("installed_version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLatest_version(value: String): Self = this.set("latest_version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlacklistEntry(value: IListEntry): Self = this.set("blacklistEntry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBlacklistEntry: Self = this.set("blacklistEntry", js.undefined)
    
    @scala.inline
    def setStatus(value: ok | warning | error | deprecated): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusNull: Self = this.set("status", null)
    
    @scala.inline
    def setWhitelistEntry(value: IListEntry): Self = this.set("whitelistEntry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWhitelistEntry: Self = this.set("whitelistEntry", js.undefined)
  }
}
