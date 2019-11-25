package typings.handsontable.handsontableMod.Handsontable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectionController extends js.Object {
  var cells: Boolean
  var column: Boolean
  var row: Boolean
}

object SelectionController {
  @scala.inline
  def apply(cells: Boolean, column: Boolean, row: Boolean): SelectionController = {
    val __obj = js.Dynamic.literal(cells = cells.asInstanceOf[js.Any], column = column.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SelectionController]
  }
}

