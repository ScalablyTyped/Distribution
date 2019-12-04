package typings.jestDashCli

import typings.jestDashCli.jestDashCliStrings.boolean
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Alias extends js.Object {
  var alias: String
  var default: js.UndefOr[scala.Nothing] = js.undefined
  var description: String
  var `type`: boolean
}

object Anon_Alias {
  @scala.inline
  def apply(
    alias: String,
    description: String,
    `type`: boolean,
    default: js.UndefOr[scala.Nothing] = js.undefined
  ): Anon_Alias = {
    val __obj = js.Dynamic.literal(alias = alias.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(default)) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Alias]
  }
}

