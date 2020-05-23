package typings.jestCli.anon

import typings.jestCli.jestCliStrings.`Prevent tests from printing messages through the consoleDot`
import typings.jestCli.jestCliStrings.boolean
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `13` extends js.Object {
  val default: js.UndefOr[scala.Nothing] = js.undefined
  val description: `Prevent tests from printing messages through the consoleDot`
  val `type`: boolean
}

object `13` {
  @scala.inline
  def apply(description: `Prevent tests from printing messages through the consoleDot`, `type`: boolean): `13` = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`13`]
  }
}

