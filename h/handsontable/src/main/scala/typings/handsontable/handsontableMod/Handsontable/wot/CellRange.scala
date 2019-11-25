package typings.handsontable.handsontableMod.Handsontable.wot

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
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], highlight = highlight.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CellRange]
  }
}

