package typings.luminoDatagrid.typesCelleditorMod

import typings.luminoDatagrid.typesCelleditorMod.CellEditor.CellConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@lumino/datagrid/types/celleditor", "IntegerInputValidator")
@js.native
open class IntegerInputValidator ()
  extends StObject
     with ICellInputValidator {
  
  /**
    * Maximum value
    *
    * The default is Number.NaN, meaning no maximum constraint
    */
  var max: Double = js.native
  
  /**
    * Minimum value
    *
    * The default is Number.NaN, meaning no minimum constraint
    */
  var min: Double = js.native
  
  /**
    * Validate cell input.
    *
    * @param cell - The object holding cell configuration data.
    *
    * @param value - The cell value input.
    *
    * @returns An object with validation result.
    */
  /* CompleteClass */
  override def validate(cell: CellConfig, value: Any): ICellInputValidatorResponse = js.native
  /**
    * Validate cell input.
    *
    * @param cell - The object holding cell configuration data.
    *
    * @param value - The cell value input.
    *
    * @returns An object with validation result.
    */
  def validate(cell: CellConfig, value: Double): ICellInputValidatorResponse = js.native
}
