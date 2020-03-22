package typings.jestCli

import typings.jestCli.jestCliStrings.`Print debugging info about your jest configDot`
import typings.jestCli.jestCliStrings.boolean
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDefaultUndefined extends js.Object {
  val default: js.UndefOr[scala.Nothing] = js.undefined
  val description: `Print debugging info about your jest configDot`
  val `type`: boolean
}

object AnonDefaultUndefined {
  @scala.inline
  def apply(
    description: `Print debugging info about your jest configDot`,
    `type`: boolean,
    default: js.UndefOr[scala.Nothing] = js.undefined
  ): AnonDefaultUndefined = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(default)) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDefaultUndefined]
  }
}

