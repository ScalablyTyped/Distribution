package typings.kendoDashUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpreadsheetSheetColumn extends js.Object {
  var index: js.UndefOr[Double] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object SpreadsheetSheetColumn {
  @scala.inline
  def apply(index: Int | Double = null, width: Int | Double = null): SpreadsheetSheetColumn = {
    val __obj = js.Dynamic.literal()
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpreadsheetSheetColumn]
  }
}

