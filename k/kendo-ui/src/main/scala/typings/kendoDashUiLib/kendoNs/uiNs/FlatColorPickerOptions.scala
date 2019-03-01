package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FlatColorPickerOptions extends js.Object {
  var autoupdate: js.UndefOr[scala.Boolean] = js.undefined
  var buttons: js.UndefOr[scala.Boolean] = js.undefined
  var change: js.UndefOr[js.Function1[/* e */ FlatColorPickerChangeEvent, scala.Unit]] = js.undefined
  var messages: js.UndefOr[FlatColorPickerMessages] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var opacity: js.UndefOr[scala.Boolean] = js.undefined
  var preview: js.UndefOr[scala.Boolean] = js.undefined
  var value: js.UndefOr[java.lang.String] = js.undefined
}

object FlatColorPickerOptions {
  @scala.inline
  def apply(
    autoupdate: js.UndefOr[scala.Boolean] = js.undefined,
    buttons: js.UndefOr[scala.Boolean] = js.undefined,
    change: js.Function1[/* e */ FlatColorPickerChangeEvent, scala.Unit] = null,
    messages: FlatColorPickerMessages = null,
    name: java.lang.String = null,
    opacity: js.UndefOr[scala.Boolean] = js.undefined,
    preview: js.UndefOr[scala.Boolean] = js.undefined,
    value: java.lang.String = null
  ): FlatColorPickerOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoupdate)) __obj.updateDynamic("autoupdate")(autoupdate)
    if (!js.isUndefined(buttons)) __obj.updateDynamic("buttons")(buttons)
    if (change != null) __obj.updateDynamic("change")(change)
    if (messages != null) __obj.updateDynamic("messages")(messages)
    if (name != null) __obj.updateDynamic("name")(name)
    if (!js.isUndefined(opacity)) __obj.updateDynamic("opacity")(opacity)
    if (!js.isUndefined(preview)) __obj.updateDynamic("preview")(preview)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[FlatColorPickerOptions]
  }
}

