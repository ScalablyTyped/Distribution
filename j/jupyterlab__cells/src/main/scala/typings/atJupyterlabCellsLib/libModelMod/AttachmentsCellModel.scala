package typings
package atJupyterlabCellsLib.libModelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/cells/lib/model", "AttachmentsCellModel")
@js.native
class AttachmentsCellModel protected () extends CellModel {
  /**
    * Construct a new cell with optional attachments.
    */
  def this(options: atJupyterlabCellsLib.libModelMod.AttachmentsCellModelNs.IOptions) = this()
  var _attachments: js.Any = js.native
  /**
    * Get the attachments of the model.
    */
  val attachments: atJupyterlabAttachmentsLib.libModelMod.IAttachmentsModel = js.native
}

