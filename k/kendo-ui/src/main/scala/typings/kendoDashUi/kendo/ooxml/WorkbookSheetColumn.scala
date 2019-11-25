package typings.kendoDashUi.kendo.ooxml

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
    index: Int | Double = null,
    width: Int | Double = null
  ): WorkbookSheetColumn = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoWidth)) __obj.updateDynamic("autoWidth")(autoWidth.asInstanceOf[js.Any])
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkbookSheetColumn]
  }
}

