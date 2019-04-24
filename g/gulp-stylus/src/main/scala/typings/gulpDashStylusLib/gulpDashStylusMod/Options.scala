package typings
package gulpDashStylusLib.gulpDashStylusMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var compress: js.UndefOr[scala.Boolean] = js.undefined
  var `include css`: js.UndefOr[scala.Boolean] = js.undefined
  var linenos: js.UndefOr[scala.Boolean] = js.undefined
  var rawDefine: js.UndefOr[VariableDefinitions] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    compress: js.UndefOr[scala.Boolean] = js.undefined,
    `include css`: js.UndefOr[scala.Boolean] = js.undefined,
    linenos: js.UndefOr[scala.Boolean] = js.undefined,
    rawDefine: VariableDefinitions = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(compress)) __obj.updateDynamic("compress")(compress)
    if (!js.isUndefined(`include css`)) __obj.updateDynamic("include css")(`include css`)
    if (!js.isUndefined(linenos)) __obj.updateDynamic("linenos")(linenos)
    if (rawDefine != null) __obj.updateDynamic("rawDefine")(rawDefine)
    __obj.asInstanceOf[Options]
  }
}

