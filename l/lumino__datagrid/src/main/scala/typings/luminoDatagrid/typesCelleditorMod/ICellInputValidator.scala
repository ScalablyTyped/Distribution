package typings.luminoDatagrid.typesCelleditorMod

import typings.luminoDatagrid.typesCelleditorMod.CellEditor.CellConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ICellInputValidator extends StObject {
  
  /**
    * Validate cell input.
    *
    * @param cell - The object holding cell configuration data.
    *
    * @param value - The cell value input.
    *
    * @returns An object with validation result.
    */
  def validate(cell: CellConfig, value: Any): ICellInputValidatorResponse
}
object ICellInputValidator {
  
  inline def apply(validate: (CellConfig, Any) => ICellInputValidatorResponse): ICellInputValidator = {
    val __obj = js.Dynamic.literal(validate = js.Any.fromFunction2(validate))
    __obj.asInstanceOf[ICellInputValidator]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ICellInputValidator] (val x: Self) extends AnyVal {
    
    inline def setValidate(value: (CellConfig, Any) => ICellInputValidatorResponse): Self = StObject.set(x, "validate", js.Any.fromFunction2(value))
  }
}
