package typings.jestCli

import typings.jestCli.jestCliStrings.string
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDefaultUndefinedDescriptionString extends js.Object {
  val default: js.UndefOr[scala.Nothing] = js.undefined
  val description: String
  val `type`: string
}

object AnonDefaultUndefinedDescriptionString {
  @scala.inline
  def apply(description: String, `type`: string, default: js.UndefOr[scala.Nothing] = js.undefined): AnonDefaultUndefinedDescriptionString = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(default)) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDefaultUndefinedDescriptionString]
  }
}

