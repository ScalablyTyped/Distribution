package typings.jsreportCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Template extends js.Object {
  var content: String
  var engine: Engine | String
  var helpers: Helpers
  var recipe: Recipe | String
}

object Template {
  @scala.inline
  def apply(content: String, engine: Engine | String, helpers: Helpers, recipe: Recipe | String): Template = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], engine = engine.asInstanceOf[js.Any], helpers = helpers.asInstanceOf[js.Any], recipe = recipe.asInstanceOf[js.Any])
    __obj.asInstanceOf[Template]
  }
}

