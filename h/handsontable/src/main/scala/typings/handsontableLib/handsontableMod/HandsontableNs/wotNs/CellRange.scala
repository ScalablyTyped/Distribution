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
    val __obj = js.Dynamic.literal(from = from, highlight = highlight, to = to)
  
    __obj.asInstanceOf[CellRange]
  }
}

