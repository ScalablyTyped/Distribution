package typings.kendoUi.kendo.ui

import typings.kendoUi.kendo.data.DataSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpreadsheetSheet extends js.Object {
  var activeCell: js.UndefOr[String] = js.undefined
  var columns: js.UndefOr[js.Array[SpreadsheetSheetColumn]] = js.undefined
  var dataSource: js.UndefOr[DataSource] = js.undefined
  var filter: js.UndefOr[SpreadsheetSheetFilter] = js.undefined
  var frozenColumns: js.UndefOr[Double] = js.undefined
  var frozenRows: js.UndefOr[Double] = js.undefined
  var mergedCells: js.UndefOr[js.Any] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var rows: js.UndefOr[js.Array[SpreadsheetSheetRow]] = js.undefined
  var selection: js.UndefOr[String] = js.undefined
  var showGridLines: js.UndefOr[Boolean] = js.undefined
  var sort: js.UndefOr[SpreadsheetSheetSort] = js.undefined
}

object SpreadsheetSheet {
  @scala.inline
  def apply(
    activeCell: String = null,
    columns: js.Array[SpreadsheetSheetColumn] = null,
    dataSource: DataSource = null,
    filter: SpreadsheetSheetFilter = null,
    frozenColumns: js.UndefOr[Double] = js.undefined,
    frozenRows: js.UndefOr[Double] = js.undefined,
    mergedCells: js.Any = null,
    name: String = null,
    rows: js.Array[SpreadsheetSheetRow] = null,
    selection: String = null,
    showGridLines: js.UndefOr[Boolean] = js.undefined,
    sort: SpreadsheetSheetSort = null
  ): SpreadsheetSheet = {
    val __obj = js.Dynamic.literal()
    if (activeCell != null) __obj.updateDynamic("activeCell")(activeCell.asInstanceOf[js.Any])
    if (columns != null) __obj.updateDynamic("columns")(columns.asInstanceOf[js.Any])
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    if (!js.isUndefined(frozenColumns)) __obj.updateDynamic("frozenColumns")(frozenColumns.get.asInstanceOf[js.Any])
    if (!js.isUndefined(frozenRows)) __obj.updateDynamic("frozenRows")(frozenRows.get.asInstanceOf[js.Any])
    if (mergedCells != null) __obj.updateDynamic("mergedCells")(mergedCells.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (rows != null) __obj.updateDynamic("rows")(rows.asInstanceOf[js.Any])
    if (selection != null) __obj.updateDynamic("selection")(selection.asInstanceOf[js.Any])
    if (!js.isUndefined(showGridLines)) __obj.updateDynamic("showGridLines")(showGridLines.get.asInstanceOf[js.Any])
    if (sort != null) __obj.updateDynamic("sort")(sort.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpreadsheetSheet]
  }
}

