package typings.jupyterlabNbformat.mod

import typings.jupyterlabNbformat.anon.PartialICodeCellMetadata
import typings.jupyterlabNbformat.jupyterlabNbformatStrings.code
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  var metadata_ICodeCell: PartialICodeCellMetadata
  /**
    * Execution, display, or stream outputs.
    */
  var outputs: js.Array[IOutput]
}

object ICodeCell {
  @scala.inline
  def apply(
    cell_type: code,
    metadata: PartialICodeCellMetadata,
    outputs: js.Array[IOutput],
    source: MultilineString,
    execution_count: ExecutionCount = null.asInstanceOf[ExecutionCount]
  ): ICodeCell = {
    val __obj = js.Dynamic.literal(cell_type = cell_type.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], outputs = outputs.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], execution_count = execution_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICodeCell]
  }
}

