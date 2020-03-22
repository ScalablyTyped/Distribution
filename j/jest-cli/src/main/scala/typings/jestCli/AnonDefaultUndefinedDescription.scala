package typings.jestCli

import typings.jestCli.jestCliStrings.`Disables stack trace in test results output`
import typings.jestCli.jestCliStrings.boolean
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDefaultUndefinedDescription extends js.Object {
  val default: js.UndefOr[scala.Nothing] = js.undefined
  val description: `Disables stack trace in test results output`
  val `type`: boolean
}

object AnonDefaultUndefinedDescription {
  @scala.inline
  def apply(
    description: `Disables stack trace in test results output`,
    `type`: boolean,
    default: js.UndefOr[scala.Nothing] = js.undefined
  ): AnonDefaultUndefinedDescription = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(default)) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDefaultUndefinedDescription]
  }
}

