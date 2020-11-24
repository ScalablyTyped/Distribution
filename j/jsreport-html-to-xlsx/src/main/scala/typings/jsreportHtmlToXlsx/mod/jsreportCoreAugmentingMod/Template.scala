package typings.jsreportHtmlToXlsx.mod.jsreportCoreAugmentingMod

import typings.jsreportHtmlToXlsx.anon.HtmlEngine
import typings.jsreportHtmlToXlsx.jsreportHtmlToXlsxStrings.`html-to-xlsx`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Template extends js.Object {
  
  var htmlToXlsx: HtmlEngine = js.native
  
  var recipe: `html-to-xlsx` | String = js.native
}
object Template {
  
  @scala.inline
  def apply(htmlToXlsx: HtmlEngine, recipe: `html-to-xlsx` | String): Template = {
    val __obj = js.Dynamic.literal(htmlToXlsx = htmlToXlsx.asInstanceOf[js.Any], recipe = recipe.asInstanceOf[js.Any])
    __obj.asInstanceOf[Template]
  }
  
  @scala.inline
  implicit class TemplateOps[Self <: Template] (val x: Self) extends AnyVal {
    
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
    def setHtmlToXlsx(value: HtmlEngine): Self = this.set("htmlToXlsx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecipe(value: `html-to-xlsx` | String): Self = this.set("recipe", value.asInstanceOf[js.Any])
  }
}
