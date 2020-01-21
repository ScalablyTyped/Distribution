package typings.jupyterlabCells.celldragutilsMod.CellDragUtils

import typings.jupyterlabCells.widgetMod.Cell
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/cells/lib/celldragutils", "CellDragUtils.detectTargetArea")
@js.native
object detectTargetArea extends js.Object {
  /**
    * Detect which part of the cell triggered the MouseEvent
    *
    * @param cell - The cell which contains the MouseEvent's target
    * @param target - The DOM node which triggered the MouseEvent
    */
  def apply(cell: Cell, target: HTMLElement): ICellTargetArea = js.native
}

