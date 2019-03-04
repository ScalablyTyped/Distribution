package typings
package handsontableLib.handsontableMod.HandsontableNs.wotNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CellCoords extends js.Object {
  var col: scala.Double
  var row: scala.Double
}

object CellCoords {
  @scala.inline
  def apply(col: scala.Double, row: scala.Double): CellCoords = {
    val __obj = js.Dynamic.literal(col = col, row = row)
  
    __obj.asInstanceOf[CellCoords]
  }
}

