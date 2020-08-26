package typings.luminoDatagrid.celleditorMod

import typings.luminoDatagrid.celleditorMod.CellEditor.CellConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
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
  def validate(cell: CellConfig, value: js.Any): ICellInputValidatorResponse = js.native
}

object ICellInputValidator {
  @scala.inline
  def apply(validate: (CellConfig, js.Any) => ICellInputValidatorResponse): ICellInputValidator = {
    val __obj = js.Dynamic.literal(validate = js.Any.fromFunction2(validate))
    __obj.asInstanceOf[ICellInputValidator]
  }
  @scala.inline
  implicit class ICellInputValidatorOps[Self <: ICellInputValidator] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setValidate(value: (CellConfig, js.Any) => ICellInputValidatorResponse): Self = this.set("validate", js.Any.fromFunction2(value))
  }
  
}

