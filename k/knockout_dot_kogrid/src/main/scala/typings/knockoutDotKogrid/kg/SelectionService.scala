package typings.knockoutDotKogrid.kg

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectionService[EntityType] extends js.Object {
  var lastClickedRow: Row[EntityType]
  var multi: Boolean
  def setSelection(row: Row[EntityType], selected: Boolean): Unit
}

object SelectionService {
  @scala.inline
  def apply[EntityType](lastClickedRow: Row[EntityType], multi: Boolean, setSelection: (Row[EntityType], Boolean) => Unit): SelectionService[EntityType] = {
    val __obj = js.Dynamic.literal(lastClickedRow = lastClickedRow.asInstanceOf[js.Any], multi = multi.asInstanceOf[js.Any], setSelection = js.Any.fromFunction2(setSelection))
  
    __obj.asInstanceOf[SelectionService[EntityType]]
  }
}

