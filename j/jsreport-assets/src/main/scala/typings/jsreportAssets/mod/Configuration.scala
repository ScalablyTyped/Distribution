package typings.jsreportAssets.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Configuration extends js.Object {
  
  var allowedFiles: js.UndefOr[String] = js.native
  
  var publicAccessEnabled: js.UndefOr[Boolean] = js.native
  
  var rootUrlForLinks: js.UndefOr[String] = js.native
  
  var searchOnDiskIfNotFoundInStore: js.UndefOr[Boolean] = js.native
}
object Configuration {
  
  @scala.inline
  def apply(): Configuration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Configuration]
  }
  
  @scala.inline
  implicit class ConfigurationOps[Self <: Configuration] (val x: Self) extends AnyVal {
    
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
    def setAllowedFiles(value: String): Self = this.set("allowedFiles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowedFiles: Self = this.set("allowedFiles", js.undefined)
    
    @scala.inline
    def setPublicAccessEnabled(value: Boolean): Self = this.set("publicAccessEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePublicAccessEnabled: Self = this.set("publicAccessEnabled", js.undefined)
    
    @scala.inline
    def setRootUrlForLinks(value: String): Self = this.set("rootUrlForLinks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRootUrlForLinks: Self = this.set("rootUrlForLinks", js.undefined)
    
    @scala.inline
    def setSearchOnDiskIfNotFoundInStore(value: Boolean): Self = this.set("searchOnDiskIfNotFoundInStore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSearchOnDiskIfNotFoundInStore: Self = this.set("searchOnDiskIfNotFoundInStore", js.undefined)
  }
}
