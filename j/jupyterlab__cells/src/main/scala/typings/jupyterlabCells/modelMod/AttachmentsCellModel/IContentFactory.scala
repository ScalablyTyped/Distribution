package typings.jupyterlabCells.modelMod.AttachmentsCellModel

import typings.jupyterlabAttachments.modelMod.IAttachmentsModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A factory for creating code cell model content.
  */
trait IContentFactory extends js.Object {
  /**
    * Create an output area.
    */
  def createAttachmentsModel(options: typings.jupyterlabAttachments.modelMod.IAttachmentsModel.IOptions): IAttachmentsModel
}

object IContentFactory {
  @scala.inline
  def apply(
    createAttachmentsModel: typings.jupyterlabAttachments.modelMod.IAttachmentsModel.IOptions => IAttachmentsModel
  ): IContentFactory = {
    val __obj = js.Dynamic.literal(createAttachmentsModel = js.Any.fromFunction1(createAttachmentsModel))
    __obj.asInstanceOf[IContentFactory]
  }
}

