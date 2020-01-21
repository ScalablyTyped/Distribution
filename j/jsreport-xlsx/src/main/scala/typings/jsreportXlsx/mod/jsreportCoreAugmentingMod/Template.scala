package typings.jsreportXlsx.mod.jsreportCoreAugmentingMod

import typings.jsreportXlsx.jsreportXlsxStrings.xlsx
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Template extends js.Object {
  var recipe: xlsx | String
}

object Template {
  @scala.inline
  def apply(recipe: xlsx | String): Template = {
    val __obj = js.Dynamic.literal(recipe = recipe.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Template]
  }
}

