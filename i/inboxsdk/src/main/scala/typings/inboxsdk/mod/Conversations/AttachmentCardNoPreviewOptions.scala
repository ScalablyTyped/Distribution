package typings.inboxsdk.mod.Conversations

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AttachmentCardNoPreviewOptions extends js.Object {
  var buttons: js.Array[DownloadButtonDescriptor | CustomButtonDescriptor] = js.native
  var description: String = js.native
  var fileIconImageUrl: String = js.native
  var foldColor: js.UndefOr[String] = js.native
  var iconThumbnailUrl: String = js.native
  var previewUrl: String = js.native
  var title: String = js.native
  def previewOnClick(event: PreviewClickEvent): Unit = js.native
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
    title: String
  ): AttachmentCardNoPreviewOptions = {
    val __obj = js.Dynamic.literal(buttons = buttons.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], fileIconImageUrl = fileIconImageUrl.asInstanceOf[js.Any], iconThumbnailUrl = iconThumbnailUrl.asInstanceOf[js.Any], previewOnClick = js.Any.fromFunction1(previewOnClick), previewUrl = previewUrl.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttachmentCardNoPreviewOptions]
  }
  @scala.inline
  implicit class AttachmentCardNoPreviewOptionsOps[Self <: AttachmentCardNoPreviewOptions] (val x: Self) extends AnyVal {
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
    def setFileIconImageUrl(value: String): Self = this.set("fileIconImageUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def setIconThumbnailUrl(value: String): Self = this.set("iconThumbnailUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def setPreviewOnClick(value: PreviewClickEvent => Unit): Self = this.set("previewOnClick", js.Any.fromFunction1(value))
    @scala.inline
    def setPreviewUrl(value: String): Self = this.set("previewUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def setFoldColor(value: String): Self = this.set("foldColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFoldColor: Self = this.set("foldColor", js.undefined)
  }
  
}

