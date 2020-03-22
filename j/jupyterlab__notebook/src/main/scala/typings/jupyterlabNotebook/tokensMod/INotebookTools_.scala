package typings.jupyterlabNotebook.tokensMod

import typings.jupyterlabCells.mod.Cell
import typings.jupyterlabNotebook.notebooktoolsMod.NotebookTools.IAddOptions
import typings.jupyterlabNotebook.panelMod.NotebookPanel
import typings.luminoWidgets.mod.Widget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait INotebookTools_ extends Widget {
  var activeCell: Cell | Null = js.native
  var activeNotebookPanel: NotebookPanel | Null = js.native
  var selectedCells: js.Array[Cell] = js.native
  def addItem(options: IAddOptions): Unit = js.native
}

