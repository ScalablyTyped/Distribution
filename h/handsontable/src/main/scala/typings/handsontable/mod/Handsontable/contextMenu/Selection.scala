package typings.handsontable.mod.Handsontable.contextMenu

import typings.handsontable.mod.Handsontable.wot.CellCoords
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
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Selection]
  }
}

