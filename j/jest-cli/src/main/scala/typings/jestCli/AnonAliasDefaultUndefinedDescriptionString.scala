package typings.jestCli

import typings.jestCli.jestCliStrings.boolean
import typings.jestCli.jestCliStrings.u
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAliasDefaultUndefinedDescriptionString extends js.Object {
  val alias: u
  val default: js.UndefOr[scala.Nothing] = js.undefined
  val description: String
  val `type`: boolean
}

object AnonAliasDefaultUndefinedDescriptionString {
  @scala.inline
  def apply(alias: u, description: String, `type`: boolean, default: js.UndefOr[scala.Nothing] = js.undefined): AnonAliasDefaultUndefinedDescriptionString = {
    val __obj = js.Dynamic.literal(alias = alias.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(default)) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAliasDefaultUndefinedDescriptionString]
  }
}

