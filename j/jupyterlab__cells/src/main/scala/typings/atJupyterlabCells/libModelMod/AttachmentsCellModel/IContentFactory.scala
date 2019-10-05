package typings.atJupyterlabCells.libModelMod.AttachmentsCellModel

import typings.atJupyterlabAttachments.libModelMod.IAttachmentsModel
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
  def createAttachmentsModel(options: typings.atJupyterlabAttachments.libModelMod.IAttachmentsModel.IOptions): IAttachmentsModel
}

object IContentFactory {
  @scala.inline
  def apply(
    createAttachmentsModel: typings.atJupyterlabAttachments.libModelMod.IAttachmentsModel.IOptions => IAttachmentsModel
  ): IContentFactory = {
    val __obj = js.Dynamic.literal(createAttachmentsModel = js.Any.fromFunction1(createAttachmentsModel))
  
    __obj.asInstanceOf[IContentFactory]
  }
}

