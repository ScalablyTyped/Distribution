package typings.jupyterlabCoreutils.nbformatMod.nbformat

import typings.jupyterlabCoreutils.jupyterlabCoreutilsStrings.markdown
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A markdown cell.
  */
trait IMarkdownCell
  extends IBaseCell
     with _ICell {
  /**
    * Cell attachments.
    */
  var attachments: js.UndefOr[IAttachments] = js.undefined
  /**
    * String identifying the type of cell.
    */
  @JSName("cell_type")
  var cell_type_IMarkdownCell: markdown
}

object IMarkdownCell {
  @scala.inline
  def apply(
    cell_type: markdown,
    metadata: Partial[ICellMetadata],
    source: MultilineString,
    attachments: IAttachments = null
  ): IMarkdownCell = {
    val __obj = js.Dynamic.literal(cell_type = cell_type.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    if (attachments != null) __obj.updateDynamic("attachments")(attachments.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMarkdownCell]
  }
}

