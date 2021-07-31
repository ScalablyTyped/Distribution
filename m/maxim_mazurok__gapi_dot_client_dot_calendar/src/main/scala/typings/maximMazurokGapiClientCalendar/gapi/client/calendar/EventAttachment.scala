package typings.maximMazurokGapiClientCalendar.gapi.client.calendar

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventAttachment extends StObject {
  
  /**
    * ID of the attached file. Read-only.
    * For Google Drive files, this is the ID of the corresponding Files resource entry in the Drive API.
    */
  var fileId: js.UndefOr[String] = js.undefined
  
  /**
    * URL link to the attachment.
    * For adding Google Drive file attachments use the same format as in alternateLink property of the Files resource in the Drive API.
    * Required when adding an attachment.
    */
  var fileUrl: js.UndefOr[String] = js.undefined
  
  /** URL link to the attachment's icon. Read-only. */
  var iconLink: js.UndefOr[String] = js.undefined
  
  /** Internet media type (MIME type) of the attachment. */
  var mimeType: js.UndefOr[String] = js.undefined
  
  /** Attachment title. */
  var title: js.UndefOr[String] = js.undefined
}
object EventAttachment {
  
  @scala.inline
  def apply(): EventAttachment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventAttachment]
  }
  
  @scala.inline
  implicit class EventAttachmentMutableBuilder[Self <: EventAttachment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFileId(value: String): Self = StObject.set(x, "fileId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileIdUndefined: Self = StObject.set(x, "fileId", js.undefined)
    
    @scala.inline
    def setFileUrl(value: String): Self = StObject.set(x, "fileUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileUrlUndefined: Self = StObject.set(x, "fileUrl", js.undefined)
    
    @scala.inline
    def setIconLink(value: String): Self = StObject.set(x, "iconLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconLinkUndefined: Self = StObject.set(x, "iconLink", js.undefined)
    
    @scala.inline
    def setMimeType(value: String): Self = StObject.set(x, "mimeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMimeTypeUndefined: Self = StObject.set(x, "mimeType", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
