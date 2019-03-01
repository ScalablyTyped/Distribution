package typings
package kendoDashUiLib.kendoNs.mobileNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SwitchOptions extends js.Object {
  var change: js.UndefOr[js.Function1[/* e */ SwitchChangeEvent, scala.Unit]] = js.undefined
  var checked: js.UndefOr[scala.Boolean] = js.undefined
  var enable: js.UndefOr[scala.Boolean] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var offLabel: js.UndefOr[java.lang.String] = js.undefined
  var onLabel: js.UndefOr[java.lang.String] = js.undefined
}

object SwitchOptions {
  @scala.inline
  def apply(
    change: js.Function1[/* e */ SwitchChangeEvent, scala.Unit] = null,
    checked: js.UndefOr[scala.Boolean] = js.undefined,
    enable: js.UndefOr[scala.Boolean] = js.undefined,
    name: java.lang.String = null,
    offLabel: java.lang.String = null,
    onLabel: java.lang.String = null
  ): SwitchOptions = {
    val __obj = js.Dynamic.literal()
    if (change != null) __obj.updateDynamic("change")(change)
    if (!js.isUndefined(checked)) __obj.updateDynamic("checked")(checked)
    if (!js.isUndefined(enable)) __obj.updateDynamic("enable")(enable)
    if (name != null) __obj.updateDynamic("name")(name)
    if (offLabel != null) __obj.updateDynamic("offLabel")(offLabel)
    if (onLabel != null) __obj.updateDynamic("onLabel")(onLabel)
    __obj.asInstanceOf[SwitchOptions]
  }
}

