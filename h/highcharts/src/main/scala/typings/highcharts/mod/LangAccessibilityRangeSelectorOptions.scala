package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LangAccessibilityRangeSelectorOptions extends js.Object {
  var buttonText: js.UndefOr[String] = js.undefined
  var maxInputLabel: js.UndefOr[String] = js.undefined
  var minInputLabel: js.UndefOr[String] = js.undefined
}

object LangAccessibilityRangeSelectorOptions {
  @scala.inline
  def apply(buttonText: String = null, maxInputLabel: String = null, minInputLabel: String = null): LangAccessibilityRangeSelectorOptions = {
    val __obj = js.Dynamic.literal()
    if (buttonText != null) __obj.updateDynamic("buttonText")(buttonText.asInstanceOf[js.Any])
    if (maxInputLabel != null) __obj.updateDynamic("maxInputLabel")(maxInputLabel.asInstanceOf[js.Any])
    if (minInputLabel != null) __obj.updateDynamic("minInputLabel")(minInputLabel.asInstanceOf[js.Any])
    __obj.asInstanceOf[LangAccessibilityRangeSelectorOptions]
  }
}

