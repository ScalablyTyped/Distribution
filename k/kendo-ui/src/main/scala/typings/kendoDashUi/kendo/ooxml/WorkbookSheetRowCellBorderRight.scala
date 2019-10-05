package typings.kendoDashUi.kendo.ooxml

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkbookSheetRowCellBorderRight extends js.Object {
  var color: js.UndefOr[String] = js.undefined
  var size: js.UndefOr[Double] = js.undefined
}

object WorkbookSheetRowCellBorderRight {
  @scala.inline
  def apply(color: String = null, size: Int | Double = null): WorkbookSheetRowCellBorderRight = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color)
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkbookSheetRowCellBorderRight]
  }
}

