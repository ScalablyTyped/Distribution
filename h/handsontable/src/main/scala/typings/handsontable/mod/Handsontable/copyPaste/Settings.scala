package typings.handsontable.mod.Handsontable.copyPaste

import typings.handsontable.mod.Handsontable.plugins.PasteModeType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Settings extends js.Object {
  var columnsLimit: js.UndefOr[Double] = js.undefined
  var pasteMode: js.UndefOr[PasteModeType] = js.undefined
  var rowsLimit: js.UndefOr[Double] = js.undefined
}

object Settings {
  @scala.inline
  def apply(
    columnsLimit: js.UndefOr[Double] = js.undefined,
    pasteMode: PasteModeType = null,
    rowsLimit: js.UndefOr[Double] = js.undefined
  ): Settings = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(columnsLimit)) __obj.updateDynamic("columnsLimit")(columnsLimit.get.asInstanceOf[js.Any])
    if (pasteMode != null) __obj.updateDynamic("pasteMode")(pasteMode.asInstanceOf[js.Any])
    if (!js.isUndefined(rowsLimit)) __obj.updateDynamic("rowsLimit")(rowsLimit.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Settings]
  }
}

