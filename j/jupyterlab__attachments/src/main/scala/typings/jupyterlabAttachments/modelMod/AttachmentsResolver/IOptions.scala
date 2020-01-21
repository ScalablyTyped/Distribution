package typings.jupyterlabAttachments.modelMod.AttachmentsResolver

import typings.jupyterlabAttachments.modelMod.IAttachmentsModel
import typings.jupyterlabRendermimeInterfaces.mod.IRenderMime.IResolver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The options used to create an AttachmentsResolver.
  */
trait IOptions extends js.Object {
  /**
    * The attachments model to resolve against.
    */
  var model: IAttachmentsModel
  /**
    * A parent resolver to use if the URL/path is not for an attachment.
    */
  var parent: js.UndefOr[IResolver] = js.undefined
}

object IOptions {
  @scala.inline
  def apply(model: IAttachmentsModel, parent: IResolver = null): IOptions = {
    val __obj = js.Dynamic.literal(model = model.asInstanceOf[js.Any])
    if (parent != null) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOptions]
  }
}

