package typings.kendoDashUi.kendoNs.mobileNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SwitchOptions extends js.Object {
  var change: js.UndefOr[js.Function1[/* e */ SwitchChangeEvent, Unit]] = js.undefined
  var checked: js.UndefOr[Boolean] = js.undefined
  var enable: js.UndefOr[Boolean] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var offLabel: js.UndefOr[String] = js.undefined
  var onLabel: js.UndefOr[String] = js.undefined
}

object SwitchOptions {
  @scala.inline
  def apply(
    change: /* e */ SwitchChangeEvent => Unit = null,
    checked: js.UndefOr[Boolean] = js.undefined,
    enable: js.UndefOr[Boolean] = js.undefined,
    name: String = null,
    offLabel: String = null,
    onLabel: String = null
  ): SwitchOptions = {
    val __obj = js.Dynamic.literal()
    if (change != null) __obj.updateDynamic("change")(js.Any.fromFunction1(change))
    if (!js.isUndefined(checked)) __obj.updateDynamic("checked")(checked)
    if (!js.isUndefined(enable)) __obj.updateDynamic("enable")(enable)
    if (name != null) __obj.updateDynamic("name")(name)
    if (offLabel != null) __obj.updateDynamic("offLabel")(offLabel)
    if (onLabel != null) __obj.updateDynamic("onLabel")(onLabel)
    __obj.asInstanceOf[SwitchOptions]
  }
}

