package typings
package handsontableLib.handsontableMod.HandsontableNs.contextMenuNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Selection extends js.Object {
  var end: handsontableLib.handsontableMod.HandsontableNs.wotNs.CellCoords
  var start: handsontableLib.handsontableMod.HandsontableNs.wotNs.CellCoords
}

object Selection {
  @scala.inline
  def apply(
    end: handsontableLib.handsontableMod.HandsontableNs.wotNs.CellCoords,
    start: handsontableLib.handsontableMod.HandsontableNs.wotNs.CellCoords
  ): Selection = {
    val __obj = js.Dynamic.literal(end = end, start = start)
  
    __obj.asInstanceOf[Selection]
  }
}

