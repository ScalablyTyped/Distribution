package typings
package inboxsdkLib.inboxsdkMod.ConversationsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AttachmentCardNoPreviewOptions extends js.Object {
  var buttons: js.Array[DownloadButtonDescriptor | CustomButtonDescriptor]
  var description: java.lang.String
  var fileIconImageUrl: java.lang.String
  var foldColor: js.UndefOr[java.lang.String] = js.undefined
  var iconThumbnailUrl: java.lang.String
  var previewUrl: java.lang.String
  var title: java.lang.String
  def previewOnClick(event: PreviewClickEvent): scala.Unit
}

object AttachmentCardNoPreviewOptions {
  @scala.inline
  def apply(
    buttons: js.Array[DownloadButtonDescriptor | CustomButtonDescriptor],
    description: java.lang.String,
    fileIconImageUrl: java.lang.String,
    iconThumbnailUrl: java.lang.String,
    previewOnClick: PreviewClickEvent => scala.Unit,
    previewUrl: java.lang.String,
    title: java.lang.String,
    foldColor: java.lang.String = null
  ): AttachmentCardNoPreviewOptions = {
    val __obj = js.Dynamic.literal(buttons = buttons, description = description, fileIconImageUrl = fileIconImageUrl, iconThumbnailUrl = iconThumbnailUrl, previewOnClick = js.Any.fromFunction1(previewOnClick), previewUrl = previewUrl, title = title)
    if (foldColor != null) __obj.updateDynamic("foldColor")(foldColor)
    __obj.asInstanceOf[AttachmentCardNoPreviewOptions]
  }
}

