package typings.jestDashCli

import typings.jestDashCli.jestDashCliStrings.boolean
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Boolean extends js.Object {
  var default: js.UndefOr[scala.Nothing] = js.undefined
  var description: String
  var `type`: boolean
}

object Anon_Boolean {
  @scala.inline
  def apply(description: String, `type`: boolean, default: js.UndefOr[scala.Nothing] = js.undefined): Anon_Boolean = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(default)) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Boolean]
  }
}

