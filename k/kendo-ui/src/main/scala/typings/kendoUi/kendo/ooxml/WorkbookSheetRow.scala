package typings.kendoUi.kendo.ooxml

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkbookSheetRow extends js.Object {
  var cells: js.UndefOr[js.Array[WorkbookSheetRowCell]] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var index: js.UndefOr[Double] = js.undefined
}

object WorkbookSheetRow {
  @scala.inline
  def apply(
    cells: js.Array[WorkbookSheetRowCell] = null,
    height: js.UndefOr[Double] = js.undefined,
    index: js.UndefOr[Double] = js.undefined
  ): WorkbookSheetRow = {
    val __obj = js.Dynamic.literal()
    if (cells != null) __obj.updateDynamic("cells")(cells.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (!js.isUndefined(index)) __obj.updateDynamic("index")(index.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkbookSheetRow]
  }
}

