package typings
package jsreportDashCoreLib.jsreportDashCoreMod

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
    val __obj = js.Dynamic.literal(content = content, engine = engine.asInstanceOf[js.Any], helpers = helpers.asInstanceOf[js.Any], recipe = recipe.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Template]
  }
}

