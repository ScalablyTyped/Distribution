package typings.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IgLoaderSettings extends js.Object {
  
  var autoDetectLocale: js.UndefOr[Boolean] = js.native
  
  var cssPath: String = js.native
  
  var locale: js.UndefOr[String] = js.native
  
  var localePath: js.UndefOr[String] = js.native
  
  var preinit: js.UndefOr[js.Function] = js.native
  
  var ready: js.UndefOr[js.Function] = js.native
  
  var regional: js.UndefOr[String] = js.native
  
  var resources: js.UndefOr[String] = js.native
  
  var scriptPath: String = js.native
  
  var theme: js.UndefOr[String] = js.native
}
object IgLoaderSettings {
  
  @scala.inline
  def apply(cssPath: String, scriptPath: String): IgLoaderSettings = {
    val __obj = js.Dynamic.literal(cssPath = cssPath.asInstanceOf[js.Any], scriptPath = scriptPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgLoaderSettings]
  }
  
  @scala.inline
  implicit class IgLoaderSettingsOps[Self <: IgLoaderSettings] (val x: Self) extends AnyVal {
    
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
    def setCssPath(value: String): Self = this.set("cssPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScriptPath(value: String): Self = this.set("scriptPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoDetectLocale(value: Boolean): Self = this.set("autoDetectLocale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoDetectLocale: Self = this.set("autoDetectLocale", js.undefined)
    
    @scala.inline
    def setLocale(value: String): Self = this.set("locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocale: Self = this.set("locale", js.undefined)
    
    @scala.inline
    def setLocalePath(value: String): Self = this.set("localePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocalePath: Self = this.set("localePath", js.undefined)
    
    @scala.inline
    def setPreinit(value: js.Function): Self = this.set("preinit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreinit: Self = this.set("preinit", js.undefined)
    
    @scala.inline
    def setReady(value: js.Function): Self = this.set("ready", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReady: Self = this.set("ready", js.undefined)
    
    @scala.inline
    def setRegional(value: String): Self = this.set("regional", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegional: Self = this.set("regional", js.undefined)
    
    @scala.inline
    def setResources(value: String): Self = this.set("resources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResources: Self = this.set("resources", js.undefined)
    
    @scala.inline
    def setTheme(value: String): Self = this.set("theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
  }
}
