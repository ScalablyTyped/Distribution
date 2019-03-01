package typings
package jsreportDashCoreLib.jsreportDashCoreMod.JsReportNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Template extends js.Object {
  var content: java.lang.String
  var engine: Engine | java.lang.String
  var helpers: Helpers
  var recipe: Recipe | java.lang.String
}

object Template {
  @scala.inline
  def apply(
    content: java.lang.String,
    engine: Engine | java.lang.String,
    helpers: Helpers,
    recipe: Recipe | java.lang.String
  ): Template = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("content")(content)
    __obj.updateDynamic("engine")(engine.asInstanceOf[js.Any])
    __obj.updateDynamic("helpers")(helpers.asInstanceOf[js.Any])
    __obj.updateDynamic("recipe")(recipe.asInstanceOf[js.Any])
    __obj.asInstanceOf[Template]
  }
}

