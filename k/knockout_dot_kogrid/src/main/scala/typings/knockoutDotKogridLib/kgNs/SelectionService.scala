package typings
package knockoutDotKogridLib.kgNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectionService[EntityType] extends js.Object {
  var lastClickedRow: Row[EntityType]
  var multi: scala.Boolean
  def setSelection(row: Row[EntityType], selected: scala.Boolean): scala.Unit
}

object SelectionService {
  @scala.inline
  def apply[EntityType](
    lastClickedRow: Row[EntityType],
    multi: scala.Boolean,
    setSelection: js.Function2[Row[EntityType], scala.Boolean, scala.Unit]
  ): SelectionService[EntityType] = {
    val __obj = js.Dynamic.literal(lastClickedRow = lastClickedRow, multi = multi, setSelection = setSelection)
  
    __obj.asInstanceOf[SelectionService[EntityType]]
  }
}

