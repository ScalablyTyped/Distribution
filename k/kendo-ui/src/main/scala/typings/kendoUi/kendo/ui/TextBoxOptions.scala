package typings.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextBoxOptions extends js.Object {
  var change: js.UndefOr[js.Function1[/* e */ TextBoxChangeEvent, Unit]] = js.undefined
  var enable: js.UndefOr[Boolean] = js.undefined
  var label: js.UndefOr[String | js.Function | TextBoxLabel] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var placeholder: js.UndefOr[String] = js.undefined
  var readonly: js.UndefOr[Boolean] = js.undefined
  var value: js.UndefOr[String] = js.undefined
}

object TextBoxOptions {
  @scala.inline
  def apply(
    change: /* e */ TextBoxChangeEvent => Unit = null,
    enable: js.UndefOr[Boolean] = js.undefined,
    label: String | js.Function | TextBoxLabel = null,
    name: String = null,
    placeholder: String = null,
    readonly: js.UndefOr[Boolean] = js.undefined,
    value: String = null
  ): TextBoxOptions = {
    val __obj = js.Dynamic.literal()
    if (change != null) __obj.updateDynamic("change")(js.Any.fromFunction1(change))
    if (!js.isUndefined(enable)) __obj.updateDynamic("enable")(enable.get.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (!js.isUndefined(readonly)) __obj.updateDynamic("readonly")(readonly.get.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextBoxOptions]
  }
}

