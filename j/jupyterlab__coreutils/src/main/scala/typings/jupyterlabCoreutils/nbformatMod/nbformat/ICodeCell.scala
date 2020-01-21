package typings.jupyterlabCoreutils.nbformatMod.nbformat

import typings.jupyterlabCoreutils.jupyterlabCoreutilsStrings.code
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A code cell.
  */
trait ICodeCell
  extends IBaseCell
     with _ICell {
  /**
    * String identifying the type of cell.
    */
  @JSName("cell_type")
  var cell_type_ICodeCell: code
  /**
    * The code cell's prompt number. Will be null if the cell has not been run.
    */
  var execution_count: ExecutionCount
  /**
    * Cell-level metadata.
    */
  @JSName("metadata")
  var metadata_ICodeCell: Partial[ICodeCellMetadata]
  /**
    * Execution, display, or stream outputs.
    */
  var outputs: js.Array[IOutput]
}

object ICodeCell {
  @scala.inline
  def apply(
    cell_type: code,
    metadata: Partial[ICodeCellMetadata],
    outputs: js.Array[IOutput],
    source: MultilineString,
    execution_count: Int | Double = null
  ): ICodeCell = {
    val __obj = js.Dynamic.literal(cell_type = cell_type.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], outputs = outputs.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    if (execution_count != null) __obj.updateDynamic("execution_count")(execution_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICodeCell]
  }
}

