package typings.luminoDatagrid.celleditorMod

import typings.luminoDatagrid.celleditorMod.CellEditor.CellConfig
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@lumino/datagrid/lib/celleditor", "TextInputValidator")
@js.native
class TextInputValidator () extends ICellInputValidator {
  /**
    * Maximum text length
    *
    * The default is Number.NaN, meaning no maximum constraint
    */
  var maxLength: Double = js.native
  /**
    * Minimum text length
    *
    * The default is Number.NaN, meaning no minimum constraint
    */
  var minLength: Double = js.native
  /**
    * Required text pattern as regular expression
    *
    * The default is null, meaning no pattern constraint
    */
  var pattern: RegExp | Null = js.native
  /**
    * Validate cell input.
    *
    * @param cell - The object holding cell configuration data.
    *
    * @param value - The cell value input.
    *
    * @returns An object with validation result.
    */
  def validate(cell: CellConfig, value: String): ICellInputValidatorResponse = js.native
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

