package typings.jestCli.anon

import typings.jestCli.jestCliStrings.`Divert all output to stderrDot`
import typings.jestCli.jestCliStrings.boolean
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `22` extends js.Object {
  val default: js.UndefOr[scala.Nothing] = js.undefined
  val description: `Divert all output to stderrDot`
  val `type`: boolean
}

object `22` {
  @scala.inline
  def apply(description: `Divert all output to stderrDot`, `type`: boolean): `22` = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`22`]
  }
}

