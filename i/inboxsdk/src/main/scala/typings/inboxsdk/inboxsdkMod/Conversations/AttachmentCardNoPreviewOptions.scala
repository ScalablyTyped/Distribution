package typings.inboxsdk.inboxsdkMod.Conversations

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AttachmentCardNoPreviewOptions extends js.Object {
  var buttons: js.Array[DownloadButtonDescriptor | CustomButtonDescriptor]
  var description: String
  var fileIconImageUrl: String
  var foldColor: js.UndefOr[String] = js.undefined
  var iconThumbnailUrl: String
  var previewUrl: String
  var title: String
  def previewOnClick(event: PreviewClickEvent): Unit
}

object AttachmentCardNoPreviewOptions {
  @scala.inline
  def apply(
    buttons: js.Array[DownloadButtonDescriptor | CustomButtonDescriptor],
    description: String,
    fileIconImageUrl: String,
    iconThumbnailUrl: String,
    previewOnClick: PreviewClickEvent => Unit,
    previewUrl: String,
    title: String,
    foldColor: String = null
  ): AttachmentCardNoPreviewOptions = {
    val __obj = js.Dynamic.literal(buttons = buttons, description = description, fileIconImageUrl = fileIconImageUrl, iconThumbnailUrl = iconThumbnailUrl, previewOnClick = js.Any.fromFunction1(previewOnClick), previewUrl = previewUrl, title = title)
    if (foldColor != null) __obj.updateDynamic("foldColor")(foldColor)
    __obj.asInstanceOf[AttachmentCardNoPreviewOptions]
  }
}

