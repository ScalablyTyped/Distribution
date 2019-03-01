package typings
package kendoDashUiLib.kendoNs.ooxmlNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkbookSheet extends js.Object {
  var columns: js.UndefOr[js.Array[WorkbookSheetColumn]] = js.undefined
  var filter: js.UndefOr[WorkbookSheetFilter] = js.undefined
  var freezePane: js.UndefOr[WorkbookSheetFreezePane] = js.undefined
  var frozenColumns: js.UndefOr[scala.Double] = js.undefined
  var frozenRows: js.UndefOr[scala.Double] = js.undefined
  var mergedCells: js.UndefOr[js.Any] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var rows: js.UndefOr[js.Array[WorkbookSheetRow]] = js.undefined
  var showGridLines: js.UndefOr[scala.Boolean] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
}

object WorkbookSheet {
  @scala.inline
  def apply(
    columns: js.Array[WorkbookSheetColumn] = null,
    filter: WorkbookSheetFilter = null,
    freezePane: WorkbookSheetFreezePane = null,
    frozenColumns: scala.Int | scala.Double = null,
    frozenRows: scala.Int | scala.Double = null,
    mergedCells: js.Any = null,
    name: java.lang.String = null,
    rows: js.Array[WorkbookSheetRow] = null,
    showGridLines: js.UndefOr[scala.Boolean] = js.undefined,
    title: java.lang.String = null
  ): WorkbookSheet = {
    val __obj = js.Dynamic.literal()
    if (columns != null) __obj.updateDynamic("columns")(columns)
    if (filter != null) __obj.updateDynamic("filter")(filter)
    if (freezePane != null) __obj.updateDynamic("freezePane")(freezePane)
    if (frozenColumns != null) __obj.updateDynamic("frozenColumns")(frozenColumns.asInstanceOf[js.Any])
    if (frozenRows != null) __obj.updateDynamic("frozenRows")(frozenRows.asInstanceOf[js.Any])
    if (mergedCells != null) __obj.updateDynamic("mergedCells")(mergedCells)
    if (name != null) __obj.updateDynamic("name")(name)
    if (rows != null) __obj.updateDynamic("rows")(rows)
    if (!js.isUndefined(showGridLines)) __obj.updateDynamic("showGridLines")(showGridLines)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[WorkbookSheet]
  }
}

