package typings.jestCli

import typings.jestCli.jestCliStrings.`Divert all output to stderrDot`
import typings.jestCli.jestCliStrings.boolean
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon22 extends js.Object {
  val default: js.UndefOr[scala.Nothing] = js.undefined
  val description: `Divert all output to stderrDot`
  val `type`: boolean
}

object Anon22 {
  @scala.inline
  def apply(
    description: `Divert all output to stderrDot`,
    `type`: boolean,
    default: js.UndefOr[scala.Nothing] = js.undefined
  ): Anon22 = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(default)) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon22]
  }
}

