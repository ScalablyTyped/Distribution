package typings.jestCli.anon

import typings.jestCli.jestCliStrings.boolean
import typings.jestCli.jestCliStrings.o
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AliasDefaultDescription extends js.Object {
  val alias: o
  val default: js.UndefOr[scala.Nothing] = js.undefined
  val description: java.lang.String
  val `type`: boolean
}

object AliasDefaultDescription {
  @scala.inline
  def apply(alias: o, description: java.lang.String, `type`: boolean): AliasDefaultDescription = {
    val __obj = js.Dynamic.literal(alias = alias.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AliasDefaultDescription]
  }
}

