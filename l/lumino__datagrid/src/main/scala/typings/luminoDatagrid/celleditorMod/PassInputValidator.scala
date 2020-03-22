package typings.luminoDatagrid.celleditorMod

import typings.luminoDatagrid.celleditorMod.CellEditor.CellConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@lumino/datagrid/lib/celleditor", "PassInputValidator")
@js.native
class PassInputValidator () extends ICellInputValidator {
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
  override def validate(cell: CellConfig, value: js.Any): ICellInputValidatorResponse = js.native
}

