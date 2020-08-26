package typings.jsreportXlsx.mod.jsreportCoreAugmentingMod

import typings.jsreportXlsx.jsreportXlsxStrings.xlsx
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Template extends js.Object {
  var recipe: xlsx | String = js.native
}

object Template {
  @scala.inline
  def apply(recipe: xlsx | String): Template = {
    val __obj = js.Dynamic.literal(recipe = recipe.asInstanceOf[js.Any])
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
    def setRecipe(value: xlsx | String): Self = this.set("recipe", value.asInstanceOf[js.Any])
  }
  
}

