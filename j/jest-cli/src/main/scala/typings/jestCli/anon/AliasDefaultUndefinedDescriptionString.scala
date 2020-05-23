package typings.jestCli.anon

import typings.jestCli.jestCliStrings.boolean
import typings.jestCli.jestCliStrings.u
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AliasDefaultUndefinedDescriptionString extends js.Object {
  val alias: u
  val default: js.UndefOr[scala.Nothing] = js.undefined
  val description: java.lang.String
  val `type`: boolean
}

object AliasDefaultUndefinedDescriptionString {
  @scala.inline
  def apply(alias: u, description: java.lang.String, `type`: boolean): AliasDefaultUndefinedDescriptionString = {
    val __obj = js.Dynamic.literal(alias = alias.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AliasDefaultUndefinedDescriptionString]
  }
}

