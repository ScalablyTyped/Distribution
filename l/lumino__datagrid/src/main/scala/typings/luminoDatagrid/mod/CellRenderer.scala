package typings.luminoDatagrid.mod

import typings.luminoDatagrid.cellrendererMod.CellRenderer.CellConfig
import typings.luminoDatagrid.cellrendererMod.CellRenderer.ConfigOption
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@lumino/datagrid", "CellRenderer")
@js.native
abstract class CellRenderer ()
  extends typings.luminoDatagrid.cellrendererMod.CellRenderer

@JSImport("@lumino/datagrid", "CellRenderer")
@js.native
object CellRenderer extends js.Object {
  /**
    * Resolve a config option for a cell renderer.
    *
    * @param option - The config option to resolve.
    *
    * @param config - The cell config object.
    *
    * @returns The resolved value for the option.
    */
  def resolveOption[T](option: ConfigOption[T], config: CellConfig): T = js.native
}

