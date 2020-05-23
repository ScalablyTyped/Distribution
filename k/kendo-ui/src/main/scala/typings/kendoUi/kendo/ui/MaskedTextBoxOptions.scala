package typings.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MaskedTextBoxOptions extends js.Object {
  var change: js.UndefOr[js.Function1[/* e */ MaskedTextBoxChangeEvent, Unit]] = js.undefined
  var clearPromptChar: js.UndefOr[Boolean] = js.undefined
  var culture: js.UndefOr[String] = js.undefined
  var label: js.UndefOr[String | js.Function | MaskedTextBoxLabel] = js.undefined
  var mask: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var promptChar: js.UndefOr[String] = js.undefined
  var rules: js.UndefOr[js.Any] = js.undefined
  var unmaskOnPost: js.UndefOr[Boolean] = js.undefined
  var value: js.UndefOr[String] = js.undefined
}

object MaskedTextBoxOptions {
  @scala.inline
  def apply(
    change: /* e */ MaskedTextBoxChangeEvent => Unit = null,
    clearPromptChar: js.UndefOr[Boolean] = js.undefined,
    culture: String = null,
    label: String | js.Function | MaskedTextBoxLabel = null,
    mask: String = null,
    name: String = null,
    promptChar: String = null,
    rules: js.Any = null,
    unmaskOnPost: js.UndefOr[Boolean] = js.undefined,
    value: String = null
  ): MaskedTextBoxOptions = {
    val __obj = js.Dynamic.literal()
    if (change != null) __obj.updateDynamic("change")(js.Any.fromFunction1(change))
    if (!js.isUndefined(clearPromptChar)) __obj.updateDynamic("clearPromptChar")(clearPromptChar.get.asInstanceOf[js.Any])
    if (culture != null) __obj.updateDynamic("culture")(culture.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (mask != null) __obj.updateDynamic("mask")(mask.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (promptChar != null) __obj.updateDynamic("promptChar")(promptChar.asInstanceOf[js.Any])
    if (rules != null) __obj.updateDynamic("rules")(rules.asInstanceOf[js.Any])
    if (!js.isUndefined(unmaskOnPost)) __obj.updateDynamic("unmaskOnPost")(unmaskOnPost.get.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaskedTextBoxOptions]
  }
}

