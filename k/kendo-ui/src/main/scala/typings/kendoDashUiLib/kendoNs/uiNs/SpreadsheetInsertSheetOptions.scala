package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpreadsheetInsertSheetOptions extends js.Object {
  var columnWidth: js.UndefOr[scala.Double] = js.undefined
  var columns: js.UndefOr[scala.Double] = js.undefined
  var data: js.UndefOr[js.Any] = js.undefined
  var dataSource: js.UndefOr[kendoDashUiLib.kendoNs.dataNs.DataSource] = js.undefined
  var headerHeight: js.UndefOr[scala.Double] = js.undefined
  var headerWidth: js.UndefOr[scala.Double] = js.undefined
  var rowHeight: js.UndefOr[scala.Double] = js.undefined
  var rows: js.UndefOr[scala.Double] = js.undefined
}

object SpreadsheetInsertSheetOptions {
  @scala.inline
  def apply(
    columnWidth: scala.Int | scala.Double = null,
    columns: scala.Int | scala.Double = null,
    data: js.Any = null,
    dataSource: kendoDashUiLib.kendoNs.dataNs.DataSource = null,
    headerHeight: scala.Int | scala.Double = null,
    headerWidth: scala.Int | scala.Double = null,
    rowHeight: scala.Int | scala.Double = null,
    rows: scala.Int | scala.Double = null
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

