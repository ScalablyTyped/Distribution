package typings.atJupyterlabNotebook.libTokensMod

import typings.atJupyterlabCells.atJupyterlabCellsMod.Cell
import typings.atJupyterlabNotebook.libNotebooktoolsMod.NotebookTools.IAddOptions
import typings.atJupyterlabNotebook.libPanelMod.NotebookPanel
import typings.atPhosphorWidgets.atPhosphorWidgetsMod.Widget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSName("INotebookTools")
@js.native
trait INotebookTools_ extends Widget {
  var activeCell: Cell | Null = js.native
  var activeNotebookPanel: NotebookPanel | Null = js.native
  var selectedCells: js.Array[Cell] = js.native
  def addItem(options: IAddOptions): Unit = js.native
}

