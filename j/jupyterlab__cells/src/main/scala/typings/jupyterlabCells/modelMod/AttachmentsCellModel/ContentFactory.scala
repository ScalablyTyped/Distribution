package typings.jupyterlabCells.modelMod.AttachmentsCellModel

import typings.jupyterlabAttachments.modelMod.IAttachmentsModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The default implementation of an `IContentFactory`.
  */
@JSImport("@jupyterlab/cells/lib/model", "AttachmentsCellModel.ContentFactory")
@js.native
class ContentFactory () extends IContentFactory {
  /**
    * Create an output area.
    */
  /* CompleteClass */
  override def createAttachmentsModel(options: typings.jupyterlabAttachments.modelMod.IAttachmentsModel.IOptions): IAttachmentsModel = js.native
}

