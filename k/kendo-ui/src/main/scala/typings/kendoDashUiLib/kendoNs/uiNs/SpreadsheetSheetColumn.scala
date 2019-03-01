package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpreadsheetSheetColumn extends js.Object {
  var index: js.UndefOr[scala.Double] = js.undefined
  var width: js.UndefOr[scala.Double] = js.undefined
}

object SpreadsheetSheetColumn {
  @scala.inline
  def apply(index: scala.Int | scala.Double = null, width: scala.Int | scala.Double = null): SpreadsheetSheetColumn = {
    val __obj = js.Dynamic.literal()
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpreadsheetSheetColumn]
  }
}

