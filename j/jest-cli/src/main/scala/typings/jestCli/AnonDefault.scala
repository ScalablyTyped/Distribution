package typings.jestCli

import typings.jestCli.jestCliStrings.boolean
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDefault extends js.Object {
  val default: js.UndefOr[scala.Nothing] = js.undefined
  val description: String
  val `type`: boolean
}

object AnonDefault {
  @scala.inline
  def apply(description: String, `type`: boolean, default: js.UndefOr[scala.Nothing] = js.undefined): AnonDefault = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(default)) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDefault]
  }
}

