package typings.kendoDashUi.kendo.ui

import typings.kendoDashUi.kendo.data.DataSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpreadsheetInsertSheetOptions extends js.Object {
  var columnWidth: js.UndefOr[Double] = js.undefined
  var columns: js.UndefOr[Double] = js.undefined
  var data: js.UndefOr[js.Any] = js.undefined
  var dataSource: js.UndefOr[DataSource] = js.undefined
  var headerHeight: js.UndefOr[Double] = js.undefined
  var headerWidth: js.UndefOr[Double] = js.undefined
  var rowHeight: js.UndefOr[Double] = js.undefined
  var rows: js.UndefOr[Double] = js.undefined
}

object SpreadsheetInsertSheetOptions {
  @scala.inline
  def apply(
    columnWidth: Int | Double = null,
    columns: Int | Double = null,
    data: js.Any = null,
    dataSource: DataSource = null,
    headerHeight: Int | Double = null,
    headerWidth: Int | Double = null,
    rowHeight: Int | Double = null,
    rows: Int | Double = null
  ): SpreadsheetInsertSheetOptions = {
    val __obj = js.Dynamic.literal()
    if (columnWidth != null) __obj.updateDynamic("columnWidth")(columnWidth.asInstanceOf[js.Any])
    if (columns != null) __obj.updateDynamic("columns")(columns.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data)
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource)
    if (headerHeight != null) __obj.updateDynamic("headerHeight")(headerHeight.asInstanceOf[js.Any])
    if (headerWidth != null) __obj.updateDynamic("headerWidth")(headerWidth.asInstanceOf[js.Any])
    if (rowHeight != null) __obj.updateDynamic("rowHeight")(rowHeight.asInstanceOf[js.Any])
    if (rows != null) __obj.updateDynamic("rows")(rows.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpreadsheetInsertSheetOptions]
  }
}

