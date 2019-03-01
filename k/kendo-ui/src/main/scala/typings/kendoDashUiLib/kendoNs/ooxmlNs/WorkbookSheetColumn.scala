package typings
package kendoDashUiLib.kendoNs.ooxmlNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkbookSheetColumn extends js.Object {
  var autoWidth: js.UndefOr[scala.Boolean] = js.undefined
  var index: js.UndefOr[scala.Double] = js.undefined
  var width: js.UndefOr[scala.Double] = js.undefined
}

object WorkbookSheetColumn {
  @scala.inline
  def apply(
    autoWidth: js.UndefOr[scala.Boolean] = js.undefined,
    index: scala.Int | scala.Double = null,
    width: scala.Int | scala.Double = null
  ): WorkbookSheetColumn = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoWidth)) __obj.updateDynamic("autoWidth")(autoWidth)
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkbookSheetColumn]
  }
}

