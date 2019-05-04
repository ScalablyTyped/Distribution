package typings
package atJupyterlabNotebookLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Cell extends js.Object {
  var cell: atJupyterlabCellsLib.atJupyterlabCellsMod.Cell
  var notebook: atJupyterlabNotebookLib.libWidgetMod.Notebook
}

object Anon_Cell {
  @scala.inline
  def apply(
    cell: atJupyterlabCellsLib.atJupyterlabCellsMod.Cell,
    notebook: atJupyterlabNotebookLib.libWidgetMod.Notebook
  ): Anon_Cell = {
    val __obj = js.Dynamic.literal(cell = cell, notebook = notebook)
  
    __obj.asInstanceOf[Anon_Cell]
  }
}

