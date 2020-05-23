package typings.jestCli.anon

import typings.jestCli.jestCliStrings.`Use this flag to show full diffs instead of a patchDot`
import typings.jestCli.jestCliStrings.boolean
import typings.jestCli.jestCliStrings.e
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AliasDefault extends js.Object {
  val alias: e
  val default: js.UndefOr[scala.Nothing] = js.undefined
  val description: `Use this flag to show full diffs instead of a patchDot`
  val `type`: boolean
}

object AliasDefault {
  @scala.inline
  def apply(alias: e, description: `Use this flag to show full diffs instead of a patchDot`, `type`: boolean): AliasDefault = {
    val __obj = js.Dynamic.literal(alias = alias.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AliasDefault]
  }
}

