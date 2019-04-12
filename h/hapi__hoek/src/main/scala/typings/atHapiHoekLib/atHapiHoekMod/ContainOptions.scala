package typings
package atHapiHoekLib.atHapiHoekMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContainOptions extends js.Object {
  /** Perform a deep comparison of the values? */
  var deep: js.UndefOr[scala.Boolean] = js.undefined
  /** Allow only one occurrence of each value? */
  var once: js.UndefOr[scala.Boolean] = js.undefined
  /** Don't allow values not explicitly listed? */
  var only: js.UndefOr[scala.Boolean] = js.undefined
  /** Allow partial match of the values? */
  var part: js.UndefOr[scala.Boolean] = js.undefined
}

object ContainOptions {
  @scala.inline
  def apply(
    deep: js.UndefOr[scala.Boolean] = js.undefined,
    once: js.UndefOr[scala.Boolean] = js.undefined,
    only: js.UndefOr[scala.Boolean] = js.undefined,
    part: js.UndefOr[scala.Boolean] = js.undefined
  ): ContainOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(deep)) __obj.updateDynamic("deep")(deep)
    if (!js.isUndefined(once)) __obj.updateDynamic("once")(once)
    if (!js.isUndefined(only)) __obj.updateDynamic("only")(only)
    if (!js.isUndefined(part)) __obj.updateDynamic("part")(part)
    __obj.asInstanceOf[ContainOptions]
  }
}

