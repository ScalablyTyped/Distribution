package typings.handsontable.handsontableMod.Handsontable.wot

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
    val __obj = js.Dynamic.literal(col = col.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CellCoords]
  }
}

