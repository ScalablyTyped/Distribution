package typings.inboxsdk.mod.Conversations

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// ConversationsDescriptors
trait AttachmentCardOptions extends StObject {
  
  var buttons: js.Array[DownloadButtonDescriptor | CustomButtonDescriptor]
  
  var description: String
  
  var failoverPreviewIconUrl: String
  
  var fileIconImageUrl: String
  
  var foldColor: js.UndefOr[String] = js.undefined
  
  var mimeType: js.UndefOr[String] = js.undefined
  
  def previewOnClick(event: PreviewClickEvent): Unit
  
  var previewThumbnailUrl: String
  
  var previewUrl: String
  
  var title: String
}
object AttachmentCardOptions {
  
  inline def apply(
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
  implicit open class MutableBuilder[Self <: AttachmentCardOptions] (val x: Self) extends AnyVal {
    
    inline def setButtons(value: js.Array[DownloadButtonDescriptor | CustomButtonDescriptor]): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
    
    inline def setButtonsVarargs(value: (DownloadButtonDescriptor | CustomButtonDescriptor)*): Self = StObject.set(x, "buttons", js.Array(value*))
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setFailoverPreviewIconUrl(value: String): Self = StObject.set(x, "failoverPreviewIconUrl", value.asInstanceOf[js.Any])
    
    inline def setFileIconImageUrl(value: String): Self = StObject.set(x, "fileIconImageUrl", value.asInstanceOf[js.Any])
    
    inline def setFoldColor(value: String): Self = StObject.set(x, "foldColor", value.asInstanceOf[js.Any])
    
    inline def setFoldColorUndefined: Self = StObject.set(x, "foldColor", js.undefined)
    
    inline def setMimeType(value: String): Self = StObject.set(x, "mimeType", value.asInstanceOf[js.Any])
    
    inline def setMimeTypeUndefined: Self = StObject.set(x, "mimeType", js.undefined)
    
    inline def setPreviewOnClick(value: PreviewClickEvent => Unit): Self = StObject.set(x, "previewOnClick", js.Any.fromFunction1(value))
    
    inline def setPreviewThumbnailUrl(value: String): Self = StObject.set(x, "previewThumbnailUrl", value.asInstanceOf[js.Any])
    
    inline def setPreviewUrl(value: String): Self = StObject.set(x, "previewUrl", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
