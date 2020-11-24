package typings.luminoDatagrid.mod

import typings.luminoDatagrid.renderermapMod.RendererMap.Values
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@lumino/datagrid", "RendererMap")
@js.native
/**
  * Construct a new renderer map.
  *
  * @param values - The initial values for the map.
  *
  * @param fallback - The renderer of last resort.
  */
class RendererMap ()
  extends typings.luminoDatagrid.renderermapMod.RendererMap {
  def this(values: Values) = this()
  def this(values: js.UndefOr[scala.Nothing], fallback: typings.luminoDatagrid.cellrendererMod.CellRenderer) = this()
  def this(values: Values, fallback: typings.luminoDatagrid.cellrendererMod.CellRenderer) = this()
}
