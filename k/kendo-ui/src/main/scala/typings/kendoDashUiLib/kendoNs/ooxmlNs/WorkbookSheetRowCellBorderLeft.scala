package typings
package kendoDashUiLib.kendoNs.ooxmlNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkbookSheetRowCellBorderLeft extends js.Object {
  var color: js.UndefOr[java.lang.String] = js.undefined
  var size: js.UndefOr[scala.Double] = js.undefined
}

object WorkbookSheetRowCellBorderLeft {
  @scala.inline
  def apply(color: java.lang.String = null, size: scala.Int | scala.Double = null): WorkbookSheetRowCellBorderLeft = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color)
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkbookSheetRowCellBorderLeft]
  }
}

