package typings.jestCli

import typings.jestCli.jestCliStrings.boolean
import typings.jestCli.jestCliStrings.o
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAliasDefaultDescription extends js.Object {
  val alias: o
  val default: js.UndefOr[scala.Nothing] = js.undefined
  val description: String
  val `type`: boolean
}

object AnonAliasDefaultDescription {
  @scala.inline
  def apply(alias: o, description: String, `type`: boolean, default: js.UndefOr[scala.Nothing] = js.undefined): AnonAliasDefaultDescription = {
    val __obj = js.Dynamic.literal(alias = alias.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(default)) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAliasDefaultDescription]
  }
}

