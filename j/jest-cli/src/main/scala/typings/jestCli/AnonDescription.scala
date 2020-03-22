package typings.jestCli

import typings.jestCli.jestCliStrings.`Automock all files by defaultDot`
import typings.jestCli.jestCliStrings.boolean
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDescription extends js.Object {
  val default: js.UndefOr[scala.Nothing] = js.undefined
  val description: `Automock all files by defaultDot`
  val `type`: boolean
}

object AnonDescription {
  @scala.inline
  def apply(
    description: `Automock all files by defaultDot`,
    `type`: boolean,
    default: js.UndefOr[scala.Nothing] = js.undefined
  ): AnonDescription = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(default)) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDescription]
  }
}

