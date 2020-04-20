package typings.jupyterlabNotebook

import typings.jupyterlabCells.mod.Cell
import typings.jupyterlabNotebook.widgetMod.Notebook
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCell extends js.Object {
  var cell: Cell
  var notebook: Notebook
}

object AnonCell {
  @scala.inline
  def apply(cell: Cell, notebook: Notebook): AnonCell = {
    val __obj = js.Dynamic.literal(cell = cell.asInstanceOf[js.Any], notebook = notebook.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCell]
  }
}

