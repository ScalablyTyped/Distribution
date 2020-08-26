package typings.jsreportPhantomPdf.mod.jsreportCoreAugmentingMod

import typings.jsreportPhantomPdf.anon.PartialPhantom
import typings.jsreportPhantomPdf.jsreportPhantomPdfStrings.`phantom-pdf`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Template extends js.Object {
  var phantom: js.UndefOr[PartialPhantom] = js.native
  var recipe: `phantom-pdf` | String = js.native
}

object Template {
  @scala.inline
  def apply(recipe: `phantom-pdf` | String): Template = {
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
    def setRecipe(value: `phantom-pdf` | String): Self = this.set("recipe", value.asInstanceOf[js.Any])
    @scala.inline
    def setPhantom(value: PartialPhantom): Self = this.set("phantom", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePhantom: Self = this.set("phantom", js.undefined)
  }
  
}

