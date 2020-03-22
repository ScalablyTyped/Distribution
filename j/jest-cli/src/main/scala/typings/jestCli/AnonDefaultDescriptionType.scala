package typings.jestCli

import typings.jestCli.jestCliStrings.`Alias for Graveaccent--colorGraveaccentDot`
import typings.jestCli.jestCliStrings.boolean
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDefaultDescriptionType extends js.Object {
  val default: js.UndefOr[scala.Nothing] = js.undefined
  val description: `Alias for Graveaccent--colorGraveaccentDot`
  val `type`: boolean
}

object AnonDefaultDescriptionType {
  @scala.inline
  def apply(
    description: `Alias for Graveaccent--colorGraveaccentDot`,
    `type`: boolean,
    default: js.UndefOr[scala.Nothing] = js.undefined
  ): AnonDefaultDescriptionType = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(default)) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDefaultDescriptionType]
  }
}

