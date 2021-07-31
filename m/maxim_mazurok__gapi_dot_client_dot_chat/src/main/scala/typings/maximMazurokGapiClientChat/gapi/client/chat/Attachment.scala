package typings.maximMazurokGapiClientChat.gapi.client.chat

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Attachment extends StObject {
  
  /** A reference to the attachment data. This is used with the media API to download the attachment data. */
  var attachmentDataRef: js.UndefOr[AttachmentDataRef] = js.undefined
  
  /** The original file name for the content, not the full path. */
  var contentName: js.UndefOr[String] = js.undefined
  
  /** The content type (MIME type) of the file. */
  var contentType: js.UndefOr[String] = js.undefined
  
  /** Output only. The download URL which should be used to allow a human user to download the attachment. Bots should not use this URL to download attachment content. */
  var downloadUri: js.UndefOr[String] = js.undefined
  
  /** A reference to the drive attachment. This is used with the Drive API. */
  var driveDataRef: js.UndefOr[DriveDataRef] = js.undefined
  
  /** Resource name of the attachment, in the form "spaces/∗/messages/∗/attachments/ *". */
  var name: js.UndefOr[String] = js.undefined
  
  /** The source of the attachment. */
  var source: js.UndefOr[String] = js.undefined
  
  /** Output only. The thumbnail URL which should be used to preview the attachment to a human user. Bots should not use this URL to download attachment content. */
  var thumbnailUri: js.UndefOr[String] = js.undefined
}
object Attachment {
  
  @scala.inline
  def apply(): Attachment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Attachment]
  }
  
  @scala.inline
  implicit class AttachmentMutableBuilder[Self <: Attachment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttachmentDataRef(value: AttachmentDataRef): Self = StObject.set(x, "attachmentDataRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttachmentDataRefUndefined: Self = StObject.set(x, "attachmentDataRef", js.undefined)
    
    @scala.inline
    def setContentName(value: String): Self = StObject.set(x, "contentName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentNameUndefined: Self = StObject.set(x, "contentName", js.undefined)
    
    @scala.inline
    def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
    
    @scala.inline
    def setDownloadUri(value: String): Self = StObject.set(x, "downloadUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDownloadUriUndefined: Self = StObject.set(x, "downloadUri", js.undefined)
    
    @scala.inline
    def setDriveDataRef(value: DriveDataRef): Self = StObject.set(x, "driveDataRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDriveDataRefUndefined: Self = StObject.set(x, "driveDataRef", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    @scala.inline
    def setThumbnailUri(value: String): Self = StObject.set(x, "thumbnailUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThumbnailUriUndefined: Self = StObject.set(x, "thumbnailUri", js.undefined)
  }
}
