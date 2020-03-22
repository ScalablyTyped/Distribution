package typings.luminoDatagrid.cellrendererMod.CellRenderer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@lumino/datagrid/lib/cellrenderer", "CellRenderer.resolveOption")
@js.native
object resolveOption extends js.Object {
  /**
    * Resolve a config option for a cell renderer.
    *
    * @param option - The config option to resolve.
    *
    * @param config - The cell config object.
    *
    * @returns The resolved value for the option.
    */
  def apply[T](option: ConfigOption[T], config: CellConfig): T = js.native
}

