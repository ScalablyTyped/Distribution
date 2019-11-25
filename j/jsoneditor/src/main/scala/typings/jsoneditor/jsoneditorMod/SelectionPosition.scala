package typings.jsoneditor.jsoneditorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectionPosition extends js.Object {
  var column: Double
  var row: Double
}

object SelectionPosition {
  @scala.inline
  def apply(column: Double, row: Double): SelectionPosition = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SelectionPosition]
  }
}

