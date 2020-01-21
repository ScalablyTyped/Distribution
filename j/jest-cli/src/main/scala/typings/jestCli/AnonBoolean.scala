package typings.jestCli

import typings.jestCli.jestCliStrings.boolean
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBoolean extends js.Object {
  var default: js.UndefOr[scala.Nothing] = js.undefined
  var description: String
  var `type`: boolean
}

object AnonBoolean {
  @scala.inline
  def apply(description: String, `type`: boolean, default: js.UndefOr[scala.Nothing] = js.undefined): AnonBoolean = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(default)) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBoolean]
  }
}

