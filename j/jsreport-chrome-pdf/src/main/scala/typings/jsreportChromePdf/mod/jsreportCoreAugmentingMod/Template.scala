package typings.jsreportChromePdf.mod.jsreportCoreAugmentingMod

import typings.jsreportChromePdf.anon.PartialChrome
import typings.jsreportChromePdf.anon.PartialChromeImage
import typings.jsreportChromePdf.jsreportChromePdfStrings.`chrome-image`
import typings.jsreportChromePdf.jsreportChromePdfStrings.`chrome-pdf`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Template extends js.Object {
  var chrome: js.UndefOr[PartialChrome] = js.native
  var chromeImage: js.UndefOr[PartialChromeImage] = js.native
  var recipe: `chrome-pdf` | `chrome-image` | String = js.native
}

object Template {
  @scala.inline
  def apply(recipe: `chrome-pdf` | `chrome-image` | String): Template = {
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
    def setRecipe(value: `chrome-pdf` | `chrome-image` | String): Self = this.set("recipe", value.asInstanceOf[js.Any])
    @scala.inline
    def setChrome(value: PartialChrome): Self = this.set("chrome", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChrome: Self = this.set("chrome", js.undefined)
    @scala.inline
    def setChromeImage(value: PartialChromeImage): Self = this.set("chromeImage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChromeImage: Self = this.set("chromeImage", js.undefined)
  }
  
}

