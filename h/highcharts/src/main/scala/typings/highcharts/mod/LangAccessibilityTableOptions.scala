package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LangAccessibilityTableOptions extends js.Object {
  var tableSummary: js.UndefOr[String] = js.undefined
  var viewAsDataTableButtonText: js.UndefOr[String] = js.undefined
}

object LangAccessibilityTableOptions {
  @scala.inline
  def apply(tableSummary: String = null, viewAsDataTableButtonText: String = null): LangAccessibilityTableOptions = {
    val __obj = js.Dynamic.literal()
    if (tableSummary != null) __obj.updateDynamic("tableSummary")(tableSummary.asInstanceOf[js.Any])
    if (viewAsDataTableButtonText != null) __obj.updateDynamic("viewAsDataTableButtonText")(viewAsDataTableButtonText.asInstanceOf[js.Any])
    __obj.asInstanceOf[LangAccessibilityTableOptions]
  }
}

