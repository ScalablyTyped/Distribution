package typings.hoek.hoekMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContainOptions extends js.Object {
  /** Perform a deep comparison of the values? */
  var deep: js.UndefOr[Boolean] = js.undefined
  /** Allow only one occurrence of each value? */
  var once: js.UndefOr[Boolean] = js.undefined
  /** Don't allow values not explicitly listed? */
  var only: js.UndefOr[Boolean] = js.undefined
  /** Allow partial match of the values? */
  var part: js.UndefOr[Boolean] = js.undefined
}

object ContainOptions {
  @scala.inline
  def apply(
    deep: js.UndefOr[Boolean] = js.undefined,
    once: js.UndefOr[Boolean] = js.undefined,
    only: js.UndefOr[Boolean] = js.undefined,
    part: js.UndefOr[Boolean] = js.undefined
  ): ContainOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(deep)) __obj.updateDynamic("deep")(deep.asInstanceOf[js.Any])
    if (!js.isUndefined(once)) __obj.updateDynamic("once")(once.asInstanceOf[js.Any])
    if (!js.isUndefined(only)) __obj.updateDynamic("only")(only.asInstanceOf[js.Any])
    if (!js.isUndefined(part)) __obj.updateDynamic("part")(part.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContainOptions]
  }
}

