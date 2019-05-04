package typings
package atJupyterlabNotebookLib.libCelltoolsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/notebook/lib/celltools", "CellTools")
@js.native
class CellTools protected ()
  extends atPhosphorWidgetsLib.atPhosphorWidgetsMod.Widget {
  /**
    * Construct a new CellTools object.
    */
  def this(options: atJupyterlabNotebookLib.libCelltoolsMod.CellToolsNs.IOptions) = this()
  var _items: js.Any = js.native
  /**
    * Handle a change to the active cell.
    */
  var _onActiveCellChanged: js.Any = js.native
  /**
    * Handle a change in the metadata.
    */
  var _onMetadataChanged: js.Any = js.native
  /**
    * Handle a change in the selection.
    */
  var _onSelectionChanged: js.Any = js.native
  var _prevActive: js.Any = js.native
  var _tracker: js.Any = js.native
  /**
    * The active cell widget.
    */
  val activeCell: atJupyterlabCellsLib.atJupyterlabCellsMod.Cell | scala.Null = js.native
  /**
    * The currently selected cells.
    */
  val selectedCells: js.Array[atJupyterlabCellsLib.atJupyterlabCellsMod.Cell] = js.native
  /**
    * Add a cell tool item.
    */
  def addItem(options: atJupyterlabNotebookLib.libCelltoolsMod.CellToolsNs.IAddOptions): scala.Unit = js.native
  /**
    * Handle the removal of a child
    */
  /* protected */ def onChildRemoved(msg: atPhosphorWidgetsLib.atPhosphorWidgetsMod.WidgetNs.ChildMessage): scala.Unit = js.native
}

