package typings
package lodashDashDecoratorsLib.sharedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThrottleOptions extends js.Object {
  var leading: js.UndefOr[scala.Boolean] = js.undefined
  var trailing: js.UndefOr[scala.Boolean] = js.undefined
}

object ThrottleOptions {
  @scala.inline
  def apply(
    leading: js.UndefOr[scala.Boolean] = js.undefined,
    trailing: js.UndefOr[scala.Boolean] = js.undefined
  ): ThrottleOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(leading)) __obj.updateDynamic("leading")(leading)
    if (!js.isUndefined(trailing)) __obj.updateDynamic("trailing")(trailing)
    __obj.asInstanceOf[ThrottleOptions]
  }
}

