package typings.jupyterlabNbformat.mod

import typings.jupyterlabNbformat.PartialICodeCellMetadata
import typings.jupyterlabNbformat.PartialIRawCellMetadata
import typings.jupyterlabNbformat.jupyterlabNbformatStrings.code
import typings.jupyterlabNbformat.jupyterlabNbformatStrings.markdown
import typings.jupyterlabNbformat.jupyterlabNbformatStrings.raw
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _ICell extends js.Object

object _ICell {
  @scala.inline
  def IRawCell(
    cell_type: raw,
    metadata: PartialIRawCellMetadata,
    source: MultilineString,
    attachments: IAttachments = null
  ): _ICell = {
    val __obj = js.Dynamic.literal(cell_type = cell_type.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    if (attachments != null) __obj.updateDynamic("attachments")(attachments.asInstanceOf[js.Any])
    __obj.asInstanceOf[_ICell]
  }
  @scala.inline
  def IMarkdownCell(
    cell_type: markdown,
    metadata: Partial[ICellMetadata],
    source: MultilineString,
    attachments: IAttachments = null
  ): _ICell = {
    val __obj = js.Dynamic.literal(cell_type = cell_type.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    if (attachments != null) __obj.updateDynamic("attachments")(attachments.asInstanceOf[js.Any])
    __obj.asInstanceOf[_ICell]
  }
  @scala.inline
  def ICodeCell(
    cell_type: code,
    metadata: PartialICodeCellMetadata,
    outputs: js.Array[IOutput],
    source: MultilineString,
    execution_count: Int | Double = null
  ): _ICell = {
    val __obj = js.Dynamic.literal(cell_type = cell_type.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], outputs = outputs.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    if (execution_count != null) __obj.updateDynamic("execution_count")(execution_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[_ICell]
  }
}

