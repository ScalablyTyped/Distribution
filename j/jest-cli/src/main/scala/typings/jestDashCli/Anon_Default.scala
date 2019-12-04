package typings.jestDashCli

import typings.jestDashCli.jestDashCliStrings.string
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Default extends js.Object {
  var default: js.UndefOr[scala.Nothing] = js.undefined
  var description: String
  var `type`: string
}

object Anon_Default {
  @scala.inline
  def apply(description: String, `type`: string, default: js.UndefOr[scala.Nothing] = js.undefined): Anon_Default = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(default)) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Default]
  }
}

