package typings.materialUiStyles.stylesProviderStylesProviderMod

import typings.jss.mod.GenerateId
import typings.jss.mod.Jss
import typings.jss.mod.Rule
import typings.jss.mod.StyleSheet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StylesOptions extends js.Object {
  
  var disableGeneration: js.UndefOr[Boolean] = js.native
  
  var generateClassName: js.UndefOr[GenerateId] = js.native
  
  var injectFirst: js.UndefOr[Boolean] = js.native
  
  var jss: js.UndefOr[Jss] = js.native
  
  // TODO need info @oliviertassinari
  var sheetsCache: js.UndefOr[js.Object] = js.native
  
  // TODO need info @oliviertassinari
  var sheetsManager: js.UndefOr[js.Object] = js.native
  
  // TODO need info @oliviertassinari
  var sheetsRegistry: js.UndefOr[js.Object] = js.native
}
object StylesOptions {
  
  @scala.inline
  def apply(): StylesOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StylesOptions]
  }
  
  @scala.inline
  implicit class StylesOptionsOps[Self <: StylesOptions] (val x: Self) extends AnyVal {
    
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
    def setDisableGeneration(value: Boolean): Self = this.set("disableGeneration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableGeneration: Self = this.set("disableGeneration", js.undefined)
    
    @scala.inline
    def setGenerateClassName(value: (/* rule */ Rule, /* sheet */ js.UndefOr[StyleSheet[String]]) => String): Self = this.set("generateClassName", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteGenerateClassName: Self = this.set("generateClassName", js.undefined)
    
    @scala.inline
    def setInjectFirst(value: Boolean): Self = this.set("injectFirst", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInjectFirst: Self = this.set("injectFirst", js.undefined)
    
    @scala.inline
    def setJss(value: Jss): Self = this.set("jss", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJss: Self = this.set("jss", js.undefined)
    
    @scala.inline
    def setSheetsCache(value: js.Object): Self = this.set("sheetsCache", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSheetsCache: Self = this.set("sheetsCache", js.undefined)
    
    @scala.inline
    def setSheetsManager(value: js.Object): Self = this.set("sheetsManager", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSheetsManager: Self = this.set("sheetsManager", js.undefined)
    
    @scala.inline
    def setSheetsRegistry(value: js.Object): Self = this.set("sheetsRegistry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSheetsRegistry: Self = this.set("sheetsRegistry", js.undefined)
  }
}
