package typings.luminoDatagrid.cellrendererMod

import typings.luminoDatagrid.cellrendererMod.CellRenderer.CellConfig
import typings.luminoDatagrid.graphicscontextMod.GraphicsContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@lumino/datagrid/lib/cellrenderer", "CellRenderer")
@js.native
abstract class CellRenderer_ () extends js.Object {
  /**
    * Paint the content for a cell.
    *
    * @param gc - The graphics context to use for drawing.
    *
    * @param config - The configuration data for the cell.
    *
    * #### Notes
    * The grid will save/restore the `gc` state before/after invoking
    * the renderer.
    *
    * For performance, the cell content is efficiently clipped to the
    * width of the column, but *the height is not clipped*. If height
    * clipping is needed, the renderer must set up its own clip rect.
    *
    * The renderer **must not** draw outside the cell bounding height.
    */
  def paint(gc: GraphicsContext, config: CellConfig): Unit = js.native
}

