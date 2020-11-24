package typings.jupyterlabNotebook.anon

import typings.jupyterlabNotebook.widgetMod.Notebook
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Cell extends js.Object {
  
  var cell: typings.jupyterlabCells.mod.Cell = js.native
  
  var notebook: Notebook = js.native
}
object Cell {
  
  @scala.inline
  def apply(cell: typings.jupyterlabCells.mod.Cell, notebook: Notebook): Cell = {
    val __obj = js.Dynamic.literal(cell = cell.asInstanceOf[js.Any], notebook = notebook.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cell]
  }
  
  @scala.inline
  implicit class CellOps[Self <: Cell] (val x: Self) extends AnyVal {
    
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
    def setCell(value: typings.jupyterlabCells.mod.Cell): Self = this.set("cell", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotebook(value: Notebook): Self = this.set("notebook", value.asInstanceOf[js.Any])
  }
}
