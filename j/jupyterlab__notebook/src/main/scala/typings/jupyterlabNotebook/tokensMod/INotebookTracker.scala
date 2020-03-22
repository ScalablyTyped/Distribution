package typings.jupyterlabNotebook.tokensMod

import org.scalablytyped.runtime.TopLevel
import typings.jupyterlabApputils.widgettrackerMod.IWidgetTracker
import typings.jupyterlabCells.mod.Cell
import typings.jupyterlabNotebook.panelMod.NotebookPanel
import typings.luminoCoreutils.mod.Token
import typings.luminoSignaling.mod.ISignal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait INotebookTracker extends IWidgetTracker[NotebookPanel] {
  /**
    * The currently focused cell.
    *
    * #### Notes
    * If there is no cell with the focus, then this value is `null`.
    */
  val activeCell: Cell | Null
  /**
    * A signal emitted when the current active cell changes.
    *
    * #### Notes
    * If there is no cell with the focus, then `null` will be emitted.
    */
  val activeCellChanged: ISignal[this.type, Cell | Null]
  /**
    * A signal emitted when the selection state changes.
    */
  val selectionChanged: ISignal[this.type, Unit]
}

@JSImport("@jupyterlab/notebook/lib/tokens", "INotebookTracker")
@js.native
object INotebookTracker extends TopLevel[Token[INotebookTracker]]

