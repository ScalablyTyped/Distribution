package typings.handsontable.handsontableMod.HandsontableNs.wotNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CellCoords extends js.Object {
  var col: Double
  var row: Double
}

object CellCoords {
  @scala.inline
  def apply(col: Double, row: Double): CellCoords = {
    val __obj = js.Dynamic.literal(col = col, row = row)
  
    __obj.asInstanceOf[CellCoords]
  }
}

