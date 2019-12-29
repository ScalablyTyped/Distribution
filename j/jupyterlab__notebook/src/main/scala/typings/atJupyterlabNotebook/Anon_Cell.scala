package typings.atJupyterlabNotebook

import typings.atJupyterlabCells.atJupyterlabCellsMod.Cell
import typings.atJupyterlabNotebook.libWidgetMod.Notebook
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Cell extends js.Object {
  var cell: Cell
  var notebook: Notebook
}

object Anon_Cell {
  @scala.inline
  def apply(cell: Cell, notebook: Notebook): Anon_Cell = {
    val __obj = js.Dynamic.literal(cell = cell.asInstanceOf[js.Any], notebook = notebook.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Cell]
  }
}

