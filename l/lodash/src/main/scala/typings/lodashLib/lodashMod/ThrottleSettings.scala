package typings
package lodashLib.lodashMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// throttle
trait ThrottleSettings extends js.Object {
  /**
    * If you'd like to disable the leading-edge call, pass this as false.
    */
  var leading: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * If you'd like to disable the execution on the trailing-edge, pass false.
    */
  var trailing: js.UndefOr[scala.Boolean] = js.undefined
}

object ThrottleSettings {
  @scala.inline
  def apply(
    leading: js.UndefOr[scala.Boolean] = js.undefined,
    trailing: js.UndefOr[scala.Boolean] = js.undefined
  ): ThrottleSettings = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(leading)) __obj.updateDynamic("leading")(leading)
    if (!js.isUndefined(trailing)) __obj.updateDynamic("trailing")(trailing)
    __obj.asInstanceOf[ThrottleSettings]
  }
}

