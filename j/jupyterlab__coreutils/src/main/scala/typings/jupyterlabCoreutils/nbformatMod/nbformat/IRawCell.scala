package typings.jupyterlabCoreutils.nbformatMod.nbformat

import typings.jupyterlabCoreutils.jupyterlabCoreutilsStrings.raw
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A raw cell.
  */
trait IRawCell
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
  var cell_type_IRawCell: raw
  /**
    * Cell-level metadata.
    */
  @JSName("metadata")
  var metadata_IRawCell: Partial[IRawCellMetadata]
}

object IRawCell {
  @scala.inline
  def apply(
    cell_type: raw,
    metadata: Partial[IRawCellMetadata],
    source: MultilineString,
    attachments: IAttachments = null
  ): IRawCell = {
    val __obj = js.Dynamic.literal(cell_type = cell_type.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    if (attachments != null) __obj.updateDynamic("attachments")(attachments.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRawCell]
  }
}

