package typings.kendoDashUi.kendo.ui

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpreadsheetSheetFilterColumn extends js.Object {
  var criteria: js.UndefOr[js.Array[SpreadsheetSheetFilterColumnCriteriaItem]] = js.undefined
  var filter: js.UndefOr[String] = js.undefined
  var index: js.UndefOr[Double] = js.undefined
  var logic: js.UndefOr[String] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
  var value: js.UndefOr[Double | String | Date] = js.undefined
  var values: js.UndefOr[js.Any] = js.undefined
}

object SpreadsheetSheetFilterColumn {
  @scala.inline
  def apply(
    criteria: js.Array[SpreadsheetSheetFilterColumnCriteriaItem] = null,
    filter: String = null,
    index: Int | Double = null,
    logic: String = null,
    `type`: String = null,
    value: Double | String | Date = null,
    values: js.Any = null
  ): SpreadsheetSheetFilterColumn = {
    val __obj = js.Dynamic.literal()
    if (criteria != null) __obj.updateDynamic("criteria")(criteria)
    if (filter != null) __obj.updateDynamic("filter")(filter)
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (logic != null) __obj.updateDynamic("logic")(logic)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (values != null) __obj.updateDynamic("values")(values)
    __obj.asInstanceOf[SpreadsheetSheetFilterColumn]
  }
}

