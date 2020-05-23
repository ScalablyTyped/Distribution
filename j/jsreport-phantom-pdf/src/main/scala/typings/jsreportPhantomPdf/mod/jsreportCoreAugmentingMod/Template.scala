package typings.jsreportPhantomPdf.mod.jsreportCoreAugmentingMod

import typings.jsreportPhantomPdf.anon.PartialPhantom
import typings.jsreportPhantomPdf.jsreportPhantomPdfStrings.`phantom-pdf`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Template extends js.Object {
  var phantom: js.UndefOr[PartialPhantom] = js.undefined
  var recipe: `phantom-pdf` | String
}

object Template {
  @scala.inline
  def apply(recipe: `phantom-pdf` | String, phantom: PartialPhantom = null): Template = {
    val __obj = js.Dynamic.literal(recipe = recipe.asInstanceOf[js.Any])
    if (phantom != null) __obj.updateDynamic("phantom")(phantom.asInstanceOf[js.Any])
    __obj.asInstanceOf[Template]
  }
}

