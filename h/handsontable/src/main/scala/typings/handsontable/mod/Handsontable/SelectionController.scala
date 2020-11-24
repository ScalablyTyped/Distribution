package typings.handsontable.mod.Handsontable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SelectionController extends js.Object {
  
  var cells: Boolean = js.native
  
  var column: Boolean = js.native
  
  var row: Boolean = js.native
}
object SelectionController {
  
  @scala.inline
  def apply(cells: Boolean, column: Boolean, row: Boolean): SelectionController = {
    val __obj = js.Dynamic.literal(cells = cells.asInstanceOf[js.Any], column = column.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectionController]
  }
  
  @scala.inline
  implicit class SelectionControllerOps[Self <: SelectionController] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCells(value: Boolean): Self = this.set("cells", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumn(value: Boolean): Self = this.set("column", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRow(value: Boolean): Self = this.set("row", value.asInstanceOf[js.Any])
  }
}
