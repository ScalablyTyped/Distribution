package typings.jupyterlabExtensionmanager.listingsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IListingApi extends js.Object {
  
  var blacklist: js.Array[IListEntry] = js.native
  
  var blacklist_uris: js.Array[String] = js.native
  
  var whitelist: js.Array[IListEntry] = js.native
  
  var whitelist_uris: js.Array[String] = js.native
}
object IListingApi {
  
  @scala.inline
  def apply(
    blacklist: js.Array[IListEntry],
    blacklist_uris: js.Array[String],
    whitelist: js.Array[IListEntry],
    whitelist_uris: js.Array[String]
  ): IListingApi = {
    val __obj = js.Dynamic.literal(blacklist = blacklist.asInstanceOf[js.Any], blacklist_uris = blacklist_uris.asInstanceOf[js.Any], whitelist = whitelist.asInstanceOf[js.Any], whitelist_uris = whitelist_uris.asInstanceOf[js.Any])
    __obj.asInstanceOf[IListingApi]
  }
  
  @scala.inline
  implicit class IListingApiOps[Self <: IListingApi] (val x: Self) extends AnyVal {
    
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
    def setBlacklistVarargs(value: IListEntry*): Self = this.set("blacklist", js.Array(value :_*))
    
    @scala.inline
    def setBlacklist(value: js.Array[IListEntry]): Self = this.set("blacklist", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlacklist_urisVarargs(value: String*): Self = this.set("blacklist_uris", js.Array(value :_*))
    
    @scala.inline
    def setBlacklist_uris(value: js.Array[String]): Self = this.set("blacklist_uris", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWhitelistVarargs(value: IListEntry*): Self = this.set("whitelist", js.Array(value :_*))
    
    @scala.inline
    def setWhitelist(value: js.Array[IListEntry]): Self = this.set("whitelist", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWhitelist_urisVarargs(value: String*): Self = this.set("whitelist_uris", js.Array(value :_*))
    
    @scala.inline
    def setWhitelist_uris(value: js.Array[String]): Self = this.set("whitelist_uris", value.asInstanceOf[js.Any])
  }
}
