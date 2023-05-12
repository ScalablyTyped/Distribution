package typings.luminoDatagrid.typesCelleditorMod

import typings.luminoDatagrid.typesCelleditorMod.CellEditor.CellConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@lumino/datagrid/types/celleditor", "PassInputValidator")
@js.native
open class PassInputValidator ()
  extends StObject
     with ICellInputValidator {
  
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
}
