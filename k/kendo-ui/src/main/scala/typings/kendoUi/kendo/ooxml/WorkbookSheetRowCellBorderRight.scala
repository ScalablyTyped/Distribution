package typings.kendoUi.kendo.ooxml

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkbookSheetRowCellBorderRight extends js.Object {
  var color: js.UndefOr[String] = js.undefined
  var size: js.UndefOr[Double] = js.undefined
}

object WorkbookSheetRowCellBorderRight {
  @scala.inline
  def apply(color: String = null, size: js.UndefOr[Double] = js.undefined): WorkbookSheetRowCellBorderRight = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (!js.isUndefined(size)) __obj.updateDynamic("size")(size.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkbookSheetRowCellBorderRight]
  }
}

