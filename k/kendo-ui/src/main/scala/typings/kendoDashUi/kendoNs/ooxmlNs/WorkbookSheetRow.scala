package typings.kendoDashUi.kendoNs.ooxmlNs

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
    height: Int | Double = null,
    index: Int | Double = null
  ): WorkbookSheetRow = {
    val __obj = js.Dynamic.literal()
    if (cells != null) __obj.updateDynamic("cells")(cells)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkbookSheetRow]
  }
}

