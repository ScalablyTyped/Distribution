package typings
package lodashDashDecoratorsLib.sharedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DebounceOptions extends js.Object {
  var leading: js.UndefOr[scala.Boolean] = js.undefined
  var maxWait: js.UndefOr[scala.Double] = js.undefined
  var trailing: js.UndefOr[scala.Boolean] = js.undefined
  @JSName("wait")
  var wait_FDebounceOptions: js.UndefOr[scala.Double] = js.undefined
}

object DebounceOptions {
  @scala.inline
  def apply(
    leading: js.UndefOr[scala.Boolean] = js.undefined,
    maxWait: scala.Int | scala.Double = null,
    trailing: js.UndefOr[scala.Boolean] = js.undefined,
    wait: scala.Int | scala.Double = null
  ): DebounceOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(leading)) __obj.updateDynamic("leading")(leading)
    if (maxWait != null) __obj.updateDynamic("maxWait")(maxWait.asInstanceOf[js.Any])
    if (!js.isUndefined(trailing)) __obj.updateDynamic("trailing")(trailing)
    if (wait != null) __obj.updateDynamic("wait")(wait.asInstanceOf[js.Any])
    __obj.asInstanceOf[DebounceOptions]
  }
}

