package typings
package handsontableLib.handsontableMod.HandsontableNs.pluginsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommentsRangeObject extends js.Object {
  var from: handsontableLib.handsontableMod.HandsontableNs.wotNs.CellCoords
  var to: js.UndefOr[handsontableLib.handsontableMod.HandsontableNs.wotNs.CellCoords] = js.undefined
}

object CommentsRangeObject {
  @scala.inline
  def apply(
    from: handsontableLib.handsontableMod.HandsontableNs.wotNs.CellCoords,
    to: handsontableLib.handsontableMod.HandsontableNs.wotNs.CellCoords = null
  ): CommentsRangeObject = {
    val __obj = js.Dynamic.literal(from = from)
    if (to != null) __obj.updateDynamic("to")(to)
    __obj.asInstanceOf[CommentsRangeObject]
  }
}

