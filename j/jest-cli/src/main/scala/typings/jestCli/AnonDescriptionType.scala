package typings.jestCli

import typings.jestCli.jestCliStrings.`Alias for --coverageDot`
import typings.jestCli.jestCliStrings.boolean
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDescriptionType extends js.Object {
  val default: js.UndefOr[scala.Nothing] = js.undefined
  val description: `Alias for --coverageDot`
  val `type`: boolean
}

object AnonDescriptionType {
  @scala.inline
  def apply(
    description: `Alias for --coverageDot`,
    `type`: boolean,
    default: js.UndefOr[scala.Nothing] = js.undefined
  ): AnonDescriptionType = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(default)) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDescriptionType]
  }
}

