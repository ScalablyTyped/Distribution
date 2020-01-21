package typings.jsreportPhantomPdf.mod.jsreportCoreAugmentingMod

import typings.jsreportPhantomPdf.jsreportPhantomPdfStrings.`phantom-pdf`
import typings.jsreportPhantomPdf.mod.Phantom
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Template extends js.Object {
  var phantom: js.UndefOr[Partial[Phantom]] = js.undefined
  var recipe: `phantom-pdf` | String
}

object Template {
  @scala.inline
  def apply(recipe: `phantom-pdf` | String, phantom: Partial[Phantom] = null): Template = {
    val __obj = js.Dynamic.literal(recipe = recipe.asInstanceOf[js.Any])
    if (phantom != null) __obj.updateDynamic("phantom")(phantom.asInstanceOf[js.Any])
    __obj.asInstanceOf[Template]
  }
}

