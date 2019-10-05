package typings.handsontable.handsontableMod.Handsontable.contextMenu

import typings.handsontable.handsontableMod.Handsontable.wot.CellCoords
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Selection extends js.Object {
  var end: CellCoords
  var start: CellCoords
}

object Selection {
  @scala.inline
  def apply(end: CellCoords, start: CellCoords): Selection = {
    val __obj = js.Dynamic.literal(end = end, start = start)
  
    __obj.asInstanceOf[Selection]
  }
}

