package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MaskedTextBoxOptions extends js.Object {
  var change: js.UndefOr[js.Function1[/* e */ MaskedTextBoxChangeEvent, scala.Unit]] = js.undefined
  var clearPromptChar: js.UndefOr[scala.Boolean] = js.undefined
  var culture: js.UndefOr[java.lang.String] = js.undefined
  var mask: js.UndefOr[java.lang.String] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var promptChar: js.UndefOr[java.lang.String] = js.undefined
  var rules: js.UndefOr[js.Any] = js.undefined
  var unmaskOnPost: js.UndefOr[scala.Boolean] = js.undefined
  var value: js.UndefOr[java.lang.String] = js.undefined
}

object MaskedTextBoxOptions {
  @scala.inline
  def apply(
    change: js.Function1[/* e */ MaskedTextBoxChangeEvent, scala.Unit] = null,
    clearPromptChar: js.UndefOr[scala.Boolean] = js.undefined,
    culture: java.lang.String = null,
    mask: java.lang.String = null,
    name: java.lang.String = null,
    promptChar: java.lang.String = null,
    rules: js.Any = null,
    unmaskOnPost: js.UndefOr[scala.Boolean] = js.undefined,
    value: java.lang.String = null
  ): MaskedTextBoxOptions = {
    val __obj = js.Dynamic.literal()
    if (change != null) __obj.updateDynamic("change")(change)
    if (!js.isUndefined(clearPromptChar)) __obj.updateDynamic("clearPromptChar")(clearPromptChar)
    if (culture != null) __obj.updateDynamic("culture")(culture)
    if (mask != null) __obj.updateDynamic("mask")(mask)
    if (name != null) __obj.updateDynamic("name")(name)
    if (promptChar != null) __obj.updateDynamic("promptChar")(promptChar)
    if (rules != null) __obj.updateDynamic("rules")(rules)
    if (!js.isUndefined(unmaskOnPost)) __obj.updateDynamic("unmaskOnPost")(unmaskOnPost)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[MaskedTextBoxOptions]
  }
}

