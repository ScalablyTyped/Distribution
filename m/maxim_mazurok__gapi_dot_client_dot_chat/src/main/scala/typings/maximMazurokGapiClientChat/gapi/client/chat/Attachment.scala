package typings.maximMazurokGapiClientChat.gapi.client.chat

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Attachment extends js.Object {
  
  /** A reference to the attachment data. This is used with the media API to download the attachment data. */
  var attachmentDataRef: js.UndefOr[AttachmentDataRef] = js.native
  
  /** The original file name for the content, not the full path. */
  var contentName: js.UndefOr[String] = js.native
  
  /** The content type (MIME type) of the file. */
  var contentType: js.UndefOr[String] = js.native
  
  /** Output only. The download URL which should be used to allow a human user to download the attachment. Bots should not use this URL to download attachment content. */
  var downloadUri: js.UndefOr[String] = js.native
  
  /** A reference to the drive attachment. This is used with the Drive API. */
  var driveDataRef: js.UndefOr[DriveDataRef] = js.native
  
  /** Resource name of the attachment, in the form "spaces/∗/messages/∗/attachments/ *". */
  var name: js.UndefOr[String] = js.native
  
  /** The source of the attachment. */
  var source: js.UndefOr[String] = js.native
  
  /** Output only. The thumbnail URL which should be used to preview the attachment to a human user. Bots should not use this URL to download attachment content. */
  var thumbnailUri: js.UndefOr[String] = js.native
}
object Attachment {
  
  @scala.inline
  def apply(): Attachment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Attachment]
  }
  
  @scala.inline
  implicit class AttachmentOps[Self <: Attachment] (val x: Self) extends AnyVal {
    
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
    def setAttachmentDataRef(value: AttachmentDataRef): Self = this.set("attachmentDataRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttachmentDataRef: Self = this.set("attachmentDataRef", js.undefined)
    
    @scala.inline
    def setContentName(value: String): Self = this.set("contentName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentName: Self = this.set("contentName", js.undefined)
    
    @scala.inline
    def setContentType(value: String): Self = this.set("contentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentType: Self = this.set("contentType", js.undefined)
    
    @scala.inline
    def setDownloadUri(value: String): Self = this.set("downloadUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDownloadUri: Self = this.set("downloadUri", js.undefined)
    
    @scala.inline
    def setDriveDataRef(value: DriveDataRef): Self = this.set("driveDataRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDriveDataRef: Self = this.set("driveDataRef", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setSource(value: String): Self = this.set("source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSource: Self = this.set("source", js.undefined)
    
    @scala.inline
    def setThumbnailUri(value: String): Self = this.set("thumbnailUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThumbnailUri: Self = this.set("thumbnailUri", js.undefined)
  }
}
