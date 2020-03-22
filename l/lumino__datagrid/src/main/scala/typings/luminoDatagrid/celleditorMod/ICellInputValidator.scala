package typings.luminoDatagrid.celleditorMod

import typings.luminoDatagrid.celleditorMod.CellEditor.CellConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICellInputValidator extends js.Object {
  /**
    * Validate cell input.
    *
    * @param cell - The object holding cell configuration data.
    *
    * @param value - The cell value input.
    *
    * @returns An object with validation result.
    */
  def validate(cell: CellConfig, value: js.Any): ICellInputValidatorResponse
}

object ICellInputValidator {
  @scala.inline
  def apply(validate: (CellConfig, js.Any) => ICellInputValidatorResponse): ICellInputValidator = {
    val __obj = js.Dynamic.literal(validate = js.Any.fromFunction2(validate))
  
    __obj.asInstanceOf[ICellInputValidator]
  }
}

