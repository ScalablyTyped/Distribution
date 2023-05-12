package typings.luminoDatagrid.typesCelleditorMod

import typings.luminoDatagrid.typesCelleditorMod.CellEditor.CellConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ICellEditor extends StObject {
  
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
