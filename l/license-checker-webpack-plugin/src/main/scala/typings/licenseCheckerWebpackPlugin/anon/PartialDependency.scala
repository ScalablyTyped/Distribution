package typings.licenseCheckerWebpackPlugin.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<license-checker-webpack-plugin.license-checker-webpack-plugin.Dependency> */
@js.native
trait PartialDependency extends js.Object {
  
  var licenseName: js.UndefOr[String] = js.native
  
  var licenseText: js.UndefOr[String] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var repository: js.UndefOr[String] = js.native
  
  var version: js.UndefOr[String] = js.native
}
object PartialDependency {
  
  @scala.inline
  def apply(): PartialDependency = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialDependency]
  }
  
  @scala.inline
  implicit class PartialDependencyOps[Self <: PartialDependency] (val x: Self) extends AnyVal {
    
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
    def setLicenseName(value: String): Self = this.set("licenseName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLicenseName: Self = this.set("licenseName", js.undefined)
    
    @scala.inline
    def setLicenseText(value: String): Self = this.set("licenseText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLicenseText: Self = this.set("licenseText", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setRepository(value: String): Self = this.set("repository", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRepository: Self = this.set("repository", js.undefined)
    
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
  }
}
