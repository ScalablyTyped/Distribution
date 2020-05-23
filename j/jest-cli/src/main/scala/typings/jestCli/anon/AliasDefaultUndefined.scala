package typings.jestCli.anon

import typings.jestCli.jestCliStrings.boolean
import typings.jestCli.jestCliStrings.i
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AliasDefaultUndefined extends js.Object {
  val alias: i
  val default: js.UndefOr[scala.Nothing] = js.undefined
  val description: java.lang.String
  val `type`: boolean
}

object AliasDefaultUndefined {
  @scala.inline
  def apply(alias: i, description: java.lang.String, `type`: boolean): AliasDefaultUndefined = {
    val __obj = js.Dynamic.literal(alias = alias.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AliasDefaultUndefined]
  }
}

