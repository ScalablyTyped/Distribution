package typings.jupyterlabExtensionmanager.companionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IInstallInfoEntry extends js.Object {
  
  /**
    * Whether the package also includes the lab extension.
    */
  var bundles_extension: js.UndefOr[Boolean] = js.native
  
  /**
    * The name of the companion package/module.
    */
  var name: js.UndefOr[String] = js.native
}
object IInstallInfoEntry {
  
  @scala.inline
  def apply(): IInstallInfoEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IInstallInfoEntry]
  }
  
  @scala.inline
  implicit class IInstallInfoEntryOps[Self <: IInstallInfoEntry] (val x: Self) extends AnyVal {
    
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
    def setBundles_extension(value: Boolean): Self = this.set("bundles_extension", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBundles_extension: Self = this.set("bundles_extension", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
}
