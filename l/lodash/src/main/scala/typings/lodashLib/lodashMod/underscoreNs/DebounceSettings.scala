package typings
package lodashLib.lodashMod.underscoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// debounce
trait DebounceSettings extends js.Object {
  /**
    * Specify invoking on the leading edge of the timeout.
    */
  var leading: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The maximum time func is allowed to be delayed before it’s invoked.
    */
  var maxWait: js.UndefOr[scala.Double] = js.undefined
  /**
    * Specify invoking on the trailing edge of the timeout.
    */
  var trailing: js.UndefOr[scala.Boolean] = js.undefined
}

object DebounceSettings {
  @scala.inline
  def apply(
    leading: js.UndefOr[scala.Boolean] = js.undefined,
    maxWait: scala.Int | scala.Double = null,
    trailing: js.UndefOr[scala.Boolean] = js.undefined
  ): DebounceSettings = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(leading)) __obj.updateDynamic("leading")(leading)
    if (maxWait != null) __obj.updateDynamic("maxWait")(maxWait.asInstanceOf[js.Any])
    if (!js.isUndefined(trailing)) __obj.updateDynamic("trailing")(trailing)
    __obj.asInstanceOf[DebounceSettings]
  }
}

