package typings.inboxsdk.mod.Conversations

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// ConversationsDescriptors
trait AttachmentCardOptions extends js.Object {
  var buttons: js.Array[DownloadButtonDescriptor | CustomButtonDescriptor]
  var description: String
  var failoverPreviewIconUrl: String
  var fileIconImageUrl: String
  var foldColor: js.UndefOr[String] = js.undefined
  var mimeType: js.UndefOr[String] = js.undefined
  var previewThumbnailUrl: String
  var previewUrl: String
  var title: String
  def previewOnClick(event: PreviewClickEvent): Unit
}

object AttachmentCardOptions {
  @scala.inline
  def apply(
    buttons: js.Array[DownloadButtonDescriptor | CustomButtonDescriptor],
    description: String,
    failoverPreviewIconUrl: String,
    fileIconImageUrl: String,
    previewOnClick: PreviewClickEvent => Unit,
    previewThumbnailUrl: String,
    previewUrl: String,
    title: String,
    foldColor: String = null,
    mimeType: String = null
  ): AttachmentCardOptions = {
    val __obj = js.Dynamic.literal(buttons = buttons.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], failoverPreviewIconUrl = failoverPreviewIconUrl.asInstanceOf[js.Any], fileIconImageUrl = fileIconImageUrl.asInstanceOf[js.Any], previewOnClick = js.Any.fromFunction1(previewOnClick), previewThumbnailUrl = previewThumbnailUrl.asInstanceOf[js.Any], previewUrl = previewUrl.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    if (foldColor != null) __obj.updateDynamic("foldColor")(foldColor.asInstanceOf[js.Any])
    if (mimeType != null) __obj.updateDynamic("mimeType")(mimeType.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttachmentCardOptions]
  }
}

