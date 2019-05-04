package typings
package atJupyterlabAttachmentsLib.libModelMod.AttachmentsResolverNs

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
  var model: atJupyterlabAttachmentsLib.libModelMod.IAttachmentsModel
  /**
    * A parent resolver to use if the URL/path is not for an attachment.
    */
  var parent: js.UndefOr[
    atJupyterlabRendermimeDashInterfacesLib.atJupyterlabRendermimeDashInterfacesMod.IRenderMimeNs.IResolver
  ] = js.undefined
}

object IOptions {
  @scala.inline
  def apply(
    model: atJupyterlabAttachmentsLib.libModelMod.IAttachmentsModel,
    parent: atJupyterlabRendermimeDashInterfacesLib.atJupyterlabRendermimeDashInterfacesMod.IRenderMimeNs.IResolver = null
  ): IOptions = {
    val __obj = js.Dynamic.literal(model = model)
    if (parent != null) __obj.updateDynamic("parent")(parent)
    __obj.asInstanceOf[IOptions]
  }
}

