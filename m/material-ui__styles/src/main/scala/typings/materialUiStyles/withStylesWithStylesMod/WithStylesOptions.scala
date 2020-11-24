package typings.materialUiStyles.withStylesWithStylesMod

import typings.jss.mod.StyleSheetFactoryOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WithStylesOptions[Theme] extends StyleSheetFactoryOptions {
  
  var defaultTheme: js.UndefOr[Theme] = js.native
  
  var flip: js.UndefOr[Boolean] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var withTheme: js.UndefOr[Boolean] = js.native
}
object WithStylesOptions {
  
  @scala.inline
  def apply[Theme](): WithStylesOptions[Theme] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WithStylesOptions[Theme]]
  }
  
  @scala.inline
  implicit class WithStylesOptionsOps[Self <: WithStylesOptions[_], Theme] (val x: Self with WithStylesOptions[Theme]) extends AnyVal {
    
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
    def setDefaultTheme(value: Theme): Self = this.set("defaultTheme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultTheme: Self = this.set("defaultTheme", js.undefined)
    
    @scala.inline
    def setFlip(value: Boolean): Self = this.set("flip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFlip: Self = this.set("flip", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setWithTheme(value: Boolean): Self = this.set("withTheme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWithTheme: Self = this.set("withTheme", js.undefined)
  }
}
