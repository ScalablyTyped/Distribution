package typings.kendoUi.kendo.ui

import typings.kendoUi.kendo.data.DataSource
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
    columnWidth: js.UndefOr[Double] = js.undefined,
    columns: js.UndefOr[Double] = js.undefined,
    data: js.Any = null,
    dataSource: DataSource = null,
    headerHeight: js.UndefOr[Double] = js.undefined,
    headerWidth: js.UndefOr[Double] = js.undefined,
    rowHeight: js.UndefOr[Double] = js.undefined,
    rows: js.UndefOr[Double] = js.undefined
  ): SpreadsheetInsertSheetOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(columnWidth)) __obj.updateDynamic("columnWidth")(columnWidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(columns)) __obj.updateDynamic("columns")(columns.get.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource.asInstanceOf[js.Any])
    if (!js.isUndefined(headerHeight)) __obj.updateDynamic("headerHeight")(headerHeight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(headerWidth)) __obj.updateDynamic("headerWidth")(headerWidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(rowHeight)) __obj.updateDynamic("rowHeight")(rowHeight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(rows)) __obj.updateDynamic("rows")(rows.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpreadsheetInsertSheetOptions]
  }
}

