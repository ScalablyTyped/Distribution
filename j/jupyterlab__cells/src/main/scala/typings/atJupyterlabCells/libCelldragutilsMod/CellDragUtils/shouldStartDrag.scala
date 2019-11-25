package typings.atJupyterlabCells.libCelldragutilsMod.CellDragUtils

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/cells/lib/celldragutils", "CellDragUtils.shouldStartDrag")
@js.native
object shouldStartDrag extends js.Object {
  /**
    * Detect if a drag event should be started. This is down if the
    * mouse is moved beyond a certain distance (DRAG_THRESHOLD).
    *
    * @param prevX - X Coordinate of the mouse pointer during the mousedown event
    * @param prevY - Y Coordinate of the mouse pointer during the mousedown event
    * @param nextX - Current X Coordinate of the mouse pointer
    * @param nextY - Current Y Coordinate of the mouse pointer
    */
  def apply(prevX: Double, prevY: Double, nextX: Double, nextY: Double): Boolean = js.native
}

