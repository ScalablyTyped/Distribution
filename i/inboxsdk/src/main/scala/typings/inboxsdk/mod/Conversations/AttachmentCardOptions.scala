package typings.inboxsdk.mod.Conversations

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// ConversationsDescriptors
@js.native
trait AttachmentCardOptions extends js.Object {
  var buttons: js.Array[DownloadButtonDescriptor | CustomButtonDescriptor] = js.native
  var description: String = js.native
  var failoverPreviewIconUrl: String = js.native
  var fileIconImageUrl: String = js.native
  var foldColor: js.UndefOr[String] = js.native
  var mimeType: js.UndefOr[String] = js.native
  var previewThumbnailUrl: String = js.native
  var previewUrl: String = js.native
  var title: String = js.native
  def previewOnClick(event: PreviewClickEvent): Unit = js.native
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
    title: String
  ): AttachmentCardOptions = {
    val __obj = js.Dynamic.literal(buttons = buttons.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], failoverPreviewIconUrl = failoverPreviewIconUrl.asInstanceOf[js.Any], fileIconImageUrl = fileIconImageUrl.asInstanceOf[js.Any], previewOnClick = js.Any.fromFunction1(previewOnClick), previewThumbnailUrl = previewThumbnailUrl.asInstanceOf[js.Any], previewUrl = previewUrl.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttachmentCardOptions]
  }
  @scala.inline
  implicit class AttachmentCardOptionsOps[Self <: AttachmentCardOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setButtonsVarargs(value: (DownloadButtonDescriptor | CustomButtonDescriptor)*): Self = this.set("buttons", js.Array(value :_*))
    @scala.inline
    def setButtons(value: js.Array[DownloadButtonDescriptor | CustomButtonDescriptor]): Self = this.set("buttons", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def setFailoverPreviewIconUrl(value: String): Self = this.set("failoverPreviewIconUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def setFileIconImageUrl(value: String): Self = this.set("fileIconImageUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def setPreviewOnClick(value: PreviewClickEvent => Unit): Self = this.set("previewOnClick", js.Any.fromFunction1(value))
    @scala.inline
    def setPreviewThumbnailUrl(value: String): Self = this.set("previewThumbnailUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def setPreviewUrl(value: String): Self = this.set("previewUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def setFoldColor(value: String): Self = this.set("foldColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFoldColor: Self = this.set("foldColor", js.undefined)
    @scala.inline
    def setMimeType(value: String): Self = this.set("mimeType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMimeType: Self = this.set("mimeType", js.undefined)
  }
  
}

