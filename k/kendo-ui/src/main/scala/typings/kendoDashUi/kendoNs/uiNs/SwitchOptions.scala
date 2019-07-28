package typings.kendoDashUi.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SwitchOptions extends js.Object {
  var change: js.UndefOr[js.Function1[/* e */ SwitchChangeEvent, Unit]] = js.undefined
  var checked: js.UndefOr[Boolean] = js.undefined
  var enabled: js.UndefOr[Boolean] = js.undefined
  var messages: js.UndefOr[SwitchMessages] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var readonly: js.UndefOr[Boolean] = js.undefined
  var width: js.UndefOr[Double | String] = js.undefined
}

object SwitchOptions {
  @scala.inline
  def apply(
    change: /* e */ SwitchChangeEvent => Unit = null,
    checked: js.UndefOr[Boolean] = js.undefined,
    enabled: js.UndefOr[Boolean] = js.undefined,
    messages: SwitchMessages = null,
    name: String = null,
    readonly: js.UndefOr[Boolean] = js.undefined,
    width: Double | String = null
  ): SwitchOptions = {
    val __obj = js.Dynamic.literal()
    if (change != null) __obj.updateDynamic("change")(js.Any.fromFunction1(change))
    if (!js.isUndefined(checked)) __obj.updateDynamic("checked")(checked)
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    if (messages != null) __obj.updateDynamic("messages")(messages)
    if (name != null) __obj.updateDynamic("name")(name)
    if (!js.isUndefined(readonly)) __obj.updateDynamic("readonly")(readonly)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[SwitchOptions]
  }
}

