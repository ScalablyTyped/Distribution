package typings.jestCli

import typings.jestCli.jestCliStrings.`Activates notifications for test resultsDot`
import typings.jestCli.jestCliStrings.boolean
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDefaultUndefinedDescriptionType extends js.Object {
  val default: js.UndefOr[scala.Nothing] = js.undefined
  val description: `Activates notifications for test resultsDot`
  val `type`: boolean
}

object AnonDefaultUndefinedDescriptionType {
  @scala.inline
  def apply(
    description: `Activates notifications for test resultsDot`,
    `type`: boolean,
    default: js.UndefOr[scala.Nothing] = js.undefined
  ): AnonDefaultUndefinedDescriptionType = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(default)) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDefaultUndefinedDescriptionType]
  }
}

