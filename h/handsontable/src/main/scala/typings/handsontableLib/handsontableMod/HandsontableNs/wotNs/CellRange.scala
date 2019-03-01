package typings
package handsontableLib.handsontableMod.HandsontableNs.wotNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CellRange extends js.Object {
  var from: CellCoords
  var highlight: CellCoords
  var to: CellCoords
}

object CellRange {
  @scala.inline
  def apply(from: CellCoords, highlight: CellCoords, to: CellCoords): CellRange = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("from")(from)
    __obj.updateDynamic("highlight")(highlight)
    __obj.updateDynamic("to")(to)
    __obj.asInstanceOf[CellRange]
  }
}

