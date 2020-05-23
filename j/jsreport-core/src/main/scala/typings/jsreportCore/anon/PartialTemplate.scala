package typings.jsreportCore.anon

import typings.jsreportCore.mod.Engine
import typings.jsreportCore.mod.Helpers
import typings.jsreportCore.mod.Recipe
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<jsreport-core.jsreport-core.Template> */
trait PartialTemplate extends js.Object {
  var content: js.UndefOr[String] = js.undefined
  var engine: js.UndefOr[Engine | String] = js.undefined
  var helpers: js.UndefOr[Helpers] = js.undefined
  var recipe: js.UndefOr[Recipe | String] = js.undefined
}

object PartialTemplate {
  @scala.inline
  def apply(
    content: String = null,
    engine: Engine | String = null,
    helpers: Helpers = null,
    recipe: Recipe | String = null
  ): PartialTemplate = {
    val __obj = js.Dynamic.literal()
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (engine != null) __obj.updateDynamic("engine")(engine.asInstanceOf[js.Any])
    if (helpers != null) __obj.updateDynamic("helpers")(helpers.asInstanceOf[js.Any])
    if (recipe != null) __obj.updateDynamic("recipe")(recipe.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialTemplate]
  }
}

