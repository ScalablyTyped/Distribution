package typings.jupyterlabNotebook.anon

import typings.jupyterlabNotebook.widgetMod.Notebook
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Cell extends js.Object {
  var cell: typings.jupyterlabCells.mod.Cell
  var notebook: Notebook
}

object Cell {
  @scala.inline
  def apply(cell: typings.jupyterlabCells.mod.Cell, notebook: Notebook): Cell = {
    val __obj = js.Dynamic.literal(cell = cell.asInstanceOf[js.Any], notebook = notebook.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cell]
  }
}

