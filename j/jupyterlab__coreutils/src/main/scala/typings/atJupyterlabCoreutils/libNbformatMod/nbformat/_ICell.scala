package typings.atJupyterlabCoreutils.libNbformatMod.nbformat

import typings.atJupyterlabCoreutils.atJupyterlabCoreutilsStrings.code
import typings.atJupyterlabCoreutils.atJupyterlabCoreutilsStrings.markdown
import typings.atJupyterlabCoreutils.atJupyterlabCoreutilsStrings.raw
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _ICell extends js.Object

object _ICell {
  @scala.inline
  def IRawCell(
    cell_type: raw,
    metadata: Partial[IRawCellMetadata],
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
    metadata: Partial[ICodeCellMetadata],
    outputs: js.Array[IOutput],
    source: MultilineString,
    execution_count: Int | Double = null
  ): _ICell = {
    val __obj = js.Dynamic.literal(cell_type = cell_type.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], outputs = outputs.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    if (execution_count != null) __obj.updateDynamic("execution_count")(execution_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[_ICell]
  }
}

