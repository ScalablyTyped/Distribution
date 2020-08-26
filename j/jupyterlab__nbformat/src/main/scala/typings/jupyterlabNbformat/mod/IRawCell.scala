package typings.jupyterlabNbformat.mod

import typings.jupyterlabNbformat.anon.PartialIRawCellMetadata
import typings.jupyterlabNbformat.jupyterlabNbformatStrings.raw
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IRawCell
  extends IBaseCell
     with _ICell {
  /**
    * Cell attachments.
    */
  var attachments: js.UndefOr[IAttachments] = js.native
  /**
    * String identifying the type of cell.
    */
  @JSName("cell_type")
  var cell_type_IRawCell: raw = js.native
  /**
    * Cell-level metadata.
    */
  @JSName("metadata")
  var metadata_IRawCell: PartialIRawCellMetadata = js.native
}

object IRawCell {
  @scala.inline
  def apply(cell_type: raw, metadata: PartialIRawCellMetadata, source: MultilineString): IRawCell = {
    val __obj = js.Dynamic.literal(cell_type = cell_type.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRawCell]
  }
  @scala.inline
  implicit class IRawCellOps[Self <: IRawCell] (val x: Self) extends AnyVal {
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
    def setCell_type(value: raw): Self = this.set("cell_type", value.asInstanceOf[js.Any])
    @scala.inline
    def setMetadata(value: PartialIRawCellMetadata): Self = this.set("metadata", value.asInstanceOf[js.Any])
    @scala.inline
    def setAttachments(value: IAttachments): Self = this.set("attachments", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttachments: Self = this.set("attachments", js.undefined)
  }
  
}

