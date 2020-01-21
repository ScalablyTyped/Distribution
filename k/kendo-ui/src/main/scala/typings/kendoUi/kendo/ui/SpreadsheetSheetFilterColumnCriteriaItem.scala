package typings.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpreadsheetSheetFilterColumnCriteriaItem extends js.Object {
  var operator: js.UndefOr[String] = js.undefined
  var value: js.UndefOr[String] = js.undefined
}

object SpreadsheetSheetFilterColumnCriteriaItem {
  @scala.inline
  def apply(operator: String = null, value: String = null): SpreadsheetSheetFilterColumnCriteriaItem = {
    val __obj = js.Dynamic.literal()
    if (operator != null) __obj.updateDynamic("operator")(operator.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpreadsheetSheetFilterColumnCriteriaItem]
  }
}

