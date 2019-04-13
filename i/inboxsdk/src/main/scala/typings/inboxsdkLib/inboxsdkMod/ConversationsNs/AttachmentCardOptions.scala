package typings
package inboxsdkLib.inboxsdkMod.ConversationsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// ConversationsDescriptors
trait AttachmentCardOptions extends js.Object {
  var buttons: js.Array[DownloadButtonDescriptor | CustomButtonDescriptor]
  var description: java.lang.String
  var failoverPreviewIconUrl: java.lang.String
  var fileIconImageUrl: java.lang.String
  var foldColor: js.UndefOr[java.lang.String] = js.undefined
  var mimeType: js.UndefOr[java.lang.String] = js.undefined
  var previewThumbnailUrl: java.lang.String
  var previewUrl: java.lang.String
  var title: java.lang.String
  def previewOnClick(event: PreviewClickEvent): scala.Unit
}

object AttachmentCardOptions {
  @scala.inline
  def apply(
    buttons: js.Array[DownloadButtonDescriptor | CustomButtonDescriptor],
    description: java.lang.String,
    failoverPreviewIconUrl: java.lang.String,
    fileIconImageUrl: java.lang.String,
    previewOnClick: PreviewClickEvent => scala.Unit,
    previewThumbnailUrl: java.lang.String,
    previewUrl: java.lang.String,
    title: java.lang.String,
    foldColor: java.lang.String = null,
    mimeType: java.lang.String = null
  ): AttachmentCardOptions = {
    val __obj = js.Dynamic.literal(buttons = buttons, description = description, failoverPreviewIconUrl = failoverPreviewIconUrl, fileIconImageUrl = fileIconImageUrl, previewOnClick = js.Any.fromFunction1(previewOnClick), previewThumbnailUrl = previewThumbnailUrl, previewUrl = previewUrl, title = title)
    if (foldColor != null) __obj.updateDynamic("foldColor")(foldColor)
    if (mimeType != null) __obj.updateDynamic("mimeType")(mimeType)
    __obj.asInstanceOf[AttachmentCardOptions]
  }
}

