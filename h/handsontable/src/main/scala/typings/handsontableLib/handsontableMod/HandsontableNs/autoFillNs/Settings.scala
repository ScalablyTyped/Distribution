package typings
package handsontableLib.handsontableMod.HandsontableNs.autoFillNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Settings extends js.Object {
  var autoInsertRow: js.UndefOr[scala.Boolean] = js.undefined
  var direction: js.UndefOr[
    handsontableLib.handsontableLibStrings.vertical | handsontableLib.handsontableLibStrings.horizontal
  ] = js.undefined
}

object Settings {
  @scala.inline
  def apply(
    autoInsertRow: js.UndefOr[scala.Boolean] = js.undefined,
    direction: handsontableLib.handsontableLibStrings.vertical | handsontableLib.handsontableLibStrings.horizontal = null
  ): Settings = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoInsertRow)) __obj.updateDynamic("autoInsertRow")(autoInsertRow)
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    __obj.asInstanceOf[Settings]
  }
}

