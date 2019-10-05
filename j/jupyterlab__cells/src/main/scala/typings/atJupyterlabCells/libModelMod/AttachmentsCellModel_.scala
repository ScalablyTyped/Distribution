package typings.atJupyterlabCells.libModelMod

import typings.atJupyterlabAttachments.libModelMod.IAttachmentsModel
import typings.atJupyterlabCells.libModelMod.AttachmentsCellModel.IOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/cells/lib/model", "AttachmentsCellModel")
@js.native
class AttachmentsCellModel_ protected () extends CellModel {
  /**
    * Construct a new cell with optional attachments.
    */
  def this(options: IOptions) = this()
  var _attachments: js.Any = js.native
  /**
    * Get the attachments of the model.
    */
  val attachments: IAttachmentsModel = js.native
}

