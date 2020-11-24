package typings.luminoDatagrid.celleditorMod

import typings.luminoDatagrid.celleditorMod.CellEditor.CellConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ICellEditor extends js.Object {
  
  /**
    * Cancel editing the cell.
    */
  def cancel(): Unit = js.native
  
  /**
    * Start editing the cell.
    *
    * @param cell - The object holding cell configuration data.
    *
    * @param options - The cell editing options.
    */
  def edit(cell: CellConfig): Unit = js.native
  def edit(cell: CellConfig, options: ICellEditOptions): Unit = js.native
}
