package typings.handsontable.handsontableMod.Handsontable.autoFill

import typings.handsontable.handsontableStrings.horizontal
import typings.handsontable.handsontableStrings.vertical
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Settings extends js.Object {
  var autoInsertRow: js.UndefOr[Boolean] = js.undefined
  var direction: js.UndefOr[vertical | horizontal] = js.undefined
}

object Settings {
  @scala.inline
  def apply(autoInsertRow: js.UndefOr[Boolean] = js.undefined, direction: vertical | horizontal = null): Settings = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoInsertRow)) __obj.updateDynamic("autoInsertRow")(autoInsertRow.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    __obj.asInstanceOf[Settings]
  }
}

