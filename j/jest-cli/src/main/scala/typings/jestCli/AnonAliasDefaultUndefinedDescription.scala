package typings.jestCli

import typings.jestCli.jestCliStrings.`Print the version and exit`
import typings.jestCli.jestCliStrings.boolean
import typings.jestCli.jestCliStrings.v
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAliasDefaultUndefinedDescription extends js.Object {
  val alias: v
  val default: js.UndefOr[scala.Nothing] = js.undefined
  val description: `Print the version and exit`
  val `type`: boolean
}

object AnonAliasDefaultUndefinedDescription {
  @scala.inline
  def apply(
    alias: v,
    description: `Print the version and exit`,
    `type`: boolean,
    default: js.UndefOr[scala.Nothing] = js.undefined
  ): AnonAliasDefaultUndefinedDescription = {
    val __obj = js.Dynamic.literal(alias = alias.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(default)) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAliasDefaultUndefinedDescription]
  }
}

