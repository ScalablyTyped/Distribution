package typings.lasso.dependenciesMod

import typings.lasso.anon.Crossorigin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DependencyConfig extends js.Object {
  
  var attributes: js.UndefOr[Crossorigin] = js.native
  
  var `css-slot`: js.UndefOr[String] = js.native
  
  var dependencies: js.UndefOr[js.Array[DependencyConfig | String]] = js.native
  
  var external: js.UndefOr[Boolean] = js.native
  
  var from: js.UndefOr[String] = js.native
  
  var `if`: js.UndefOr[String] = js.native
  
  var `if-flag`: js.UndefOr[String] = js.native
  
  var `if-not-flag`: js.UndefOr[String] = js.native
  
  var `inline`: js.UndefOr[String] = js.native
  
  var `js-slot`: js.UndefOr[String] = js.native
  
  var path: js.UndefOr[String] = js.native
  
  var require: js.UndefOr[String] = js.native
  
  var `require-run`: js.UndefOr[String] = js.native
  
  var slot: js.UndefOr[String] = js.native
  
  var to: js.UndefOr[String] = js.native
  
  var `type`: js.UndefOr[String] = js.native
  
  var url: js.UndefOr[String] = js.native
}
object DependencyConfig {
  
  @scala.inline
  def apply(): DependencyConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DependencyConfig]
  }
  
  @scala.inline
  implicit class DependencyConfigOps[Self <: DependencyConfig] (val x: Self) extends AnyVal {
    
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
    def setAttributes(value: Crossorigin): Self = this.set("attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttributes: Self = this.set("attributes", js.undefined)
    
    @scala.inline
    def `setCss-slot`(value: String): Self = this.set("css-slot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteCss-slot`: Self = this.set("css-slot", js.undefined)
    
    @scala.inline
    def setDependenciesVarargs(value: (DependencyConfig | String)*): Self = this.set("dependencies", js.Array(value :_*))
    
    @scala.inline
    def setDependencies(value: js.Array[DependencyConfig | String]): Self = this.set("dependencies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDependencies: Self = this.set("dependencies", js.undefined)
    
    @scala.inline
    def setExternal(value: Boolean): Self = this.set("external", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExternal: Self = this.set("external", js.undefined)
    
    @scala.inline
    def setFrom(value: String): Self = this.set("from", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFrom: Self = this.set("from", js.undefined)
    
    @scala.inline
    def setIf(value: String): Self = this.set("if", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIf: Self = this.set("if", js.undefined)
    
    @scala.inline
    def `setIf-flag`(value: String): Self = this.set("if-flag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteIf-flag`: Self = this.set("if-flag", js.undefined)
    
    @scala.inline
    def `setIf-not-flag`(value: String): Self = this.set("if-not-flag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteIf-not-flag`: Self = this.set("if-not-flag", js.undefined)
    
    @scala.inline
    def setInline(value: String): Self = this.set("inline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInline: Self = this.set("inline", js.undefined)
    
    @scala.inline
    def `setJs-slot`(value: String): Self = this.set("js-slot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteJs-slot`: Self = this.set("js-slot", js.undefined)
    
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
    
    @scala.inline
    def setRequire(value: String): Self = this.set("require", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequire: Self = this.set("require", js.undefined)
    
    @scala.inline
    def `setRequire-run`(value: String): Self = this.set("require-run", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteRequire-run`: Self = this.set("require-run", js.undefined)
    
    @scala.inline
    def setSlot(value: String): Self = this.set("slot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSlot: Self = this.set("slot", js.undefined)
    
    @scala.inline
    def setTo(value: String): Self = this.set("to", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTo: Self = this.set("to", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
}
