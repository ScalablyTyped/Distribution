package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpreadsheetSheetRow extends js.Object {
  var cells: js.UndefOr[js.Array[SpreadsheetSheetRowCell]] = js.undefined
  var height: js.UndefOr[scala.Double] = js.undefined
  var index: js.UndefOr[scala.Double] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object SpreadsheetSheetRow {
  @scala.inline
  def apply(
    cells: js.Array[SpreadsheetSheetRowCell] = null,
    height: scala.Int | scala.Double = null,
    index: scala.Int | scala.Double = null,
    `type`: java.lang.String = null
  ): SpreadsheetSheetRow = {
    val __obj = js.Dynamic.literal()
    if (cells != null) __obj.updateDynamic("cells")(cells)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[SpreadsheetSheetRow]
  }
}

