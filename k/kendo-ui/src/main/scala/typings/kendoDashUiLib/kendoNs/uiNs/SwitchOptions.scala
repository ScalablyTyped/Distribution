package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SwitchOptions extends js.Object {
  var change: js.UndefOr[js.Function1[/* e */ SwitchChangeEvent, scala.Unit]] = js.undefined
  var checked: js.UndefOr[scala.Boolean] = js.undefined
  var enabled: js.UndefOr[scala.Boolean] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var readonly: js.UndefOr[scala.Boolean] = js.undefined
  var width: js.UndefOr[scala.Double | java.lang.String] = js.undefined
}

object SwitchOptions {
  @scala.inline
  def apply(
    change: js.Function1[/* e */ SwitchChangeEvent, scala.Unit] = null,
    checked: js.UndefOr[scala.Boolean] = js.undefined,
    enabled: js.UndefOr[scala.Boolean] = js.undefined,
    name: java.lang.String = null,
    readonly: js.UndefOr[scala.Boolean] = js.undefined,
    width: scala.Double | java.lang.String = null
  ): SwitchOptions = {
    val __obj = js.Dynamic.literal()
    if (change != null) __obj.updateDynamic("change")(change)
    if (!js.isUndefined(checked)) __obj.updateDynamic("checked")(checked)
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    if (name != null) __obj.updateDynamic("name")(name)
    if (!js.isUndefined(readonly)) __obj.updateDynamic("readonly")(readonly)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[SwitchOptions]
  }
}

