package typings
package handsontableLib.handsontableMod.HandsontableNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectionController extends js.Object {
  var cells: scala.Boolean
  var column: scala.Boolean
  var row: scala.Boolean
}

object SelectionController {
  @scala.inline
  def apply(cells: scala.Boolean, column: scala.Boolean, row: scala.Boolean): SelectionController = {
    val __obj = js.Dynamic.literal(cells = cells, column = column, row = row)
  
    __obj.asInstanceOf[SelectionController]
  }
}

