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
  def apply(columnsLimit: Int | Double = null, pasteMode: PasteModeType = null, rowsLimit: Int | Double = null): Settings = {
    val __obj = js.Dynamic.literal()
    if (columnsLimit != null) __obj.updateDynamic("columnsLimit")(columnsLimit.asInstanceOf[js.Any])
    if (pasteMode != null) __obj.updateDynamic("pasteMode")(pasteMode.asInstanceOf[js.Any])
    if (rowsLimit != null) __obj.updateDynamic("rowsLimit")(rowsLimit.asInstanceOf[js.Any])
    __obj.asInstanceOf[Settings]
  }
}

