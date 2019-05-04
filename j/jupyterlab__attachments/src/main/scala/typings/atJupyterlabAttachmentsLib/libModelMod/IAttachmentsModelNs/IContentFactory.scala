package typings
package atJupyterlabAttachmentsLib.libModelMod.IAttachmentsModelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The interface for an attachment content factory.
  */
trait IContentFactory extends js.Object {
  /**
    * Create an attachment model.
    */
  def createAttachmentModel(options: atJupyterlabRendermimeLib.libAttachmentmodelMod.IAttachmentModelNs.IOptions): atJupyterlabRendermimeLib.libAttachmentmodelMod.IAttachmentModel
}

object IContentFactory {
  @scala.inline
  def apply(
    createAttachmentModel: atJupyterlabRendermimeLib.libAttachmentmodelMod.IAttachmentModelNs.IOptions => atJupyterlabRendermimeLib.libAttachmentmodelMod.IAttachmentModel
  ): IContentFactory = {
    val __obj = js.Dynamic.literal(createAttachmentModel = js.Any.fromFunction1(createAttachmentModel))
  
    __obj.asInstanceOf[IContentFactory]
  }
}

