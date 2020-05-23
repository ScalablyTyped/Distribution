package typings.kendoUi.kendo.ooxml

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkbookSheetColumn extends js.Object {
  var autoWidth: js.UndefOr[Boolean] = js.undefined
  var index: js.UndefOr[Double] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object WorkbookSheetColumn {
  @scala.inline
  def apply(
    autoWidth: js.UndefOr[Boolean] = js.undefined,
    index: js.UndefOr[Double] = js.undefined,
    width: js.UndefOr[Double] = js.undefined
  ): WorkbookSheetColumn = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoWidth)) __obj.updateDynamic("autoWidth")(autoWidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(index)) __obj.updateDynamic("index")(index.get.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkbookSheetColumn]
  }
}

