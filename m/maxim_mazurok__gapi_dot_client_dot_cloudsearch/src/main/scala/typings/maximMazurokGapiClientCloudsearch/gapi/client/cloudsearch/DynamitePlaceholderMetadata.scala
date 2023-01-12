package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DynamitePlaceholderMetadata extends StObject {
  
  var attachmentMetadata: js.UndefOr[AttachmentMetadata] = js.undefined
  
  var botMessageMetadata: js.UndefOr[Any] = js.undefined
  
  var calendarEventMetadata: js.UndefOr[Any] = js.undefined
  
  var deleteMetadata: js.UndefOr[Any] = js.undefined
  
  var editMetadata: js.UndefOr[Any] = js.undefined
  
  /** The space URL embedded in the localized string. */
  var spaceUrl: js.UndefOr[String] = js.undefined
  
  var tasksMetadata: js.UndefOr[Any] = js.undefined
  
  var videoCallMetadata: js.UndefOr[VideoCallMetadata] = js.undefined
}
object DynamitePlaceholderMetadata {
  
  inline def apply(): DynamitePlaceholderMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DynamitePlaceholderMetadata]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DynamitePlaceholderMetadata] (val x: Self) extends AnyVal {
    
    inline def setAttachmentMetadata(value: AttachmentMetadata): Self = StObject.set(x, "attachmentMetadata", value.asInstanceOf[js.Any])
    
    inline def setAttachmentMetadataUndefined: Self = StObject.set(x, "attachmentMetadata", js.undefined)
    
    inline def setBotMessageMetadata(value: Any): Self = StObject.set(x, "botMessageMetadata", value.asInstanceOf[js.Any])
    
    inline def setBotMessageMetadataUndefined: Self = StObject.set(x, "botMessageMetadata", js.undefined)
    
    inline def setCalendarEventMetadata(value: Any): Self = StObject.set(x, "calendarEventMetadata", value.asInstanceOf[js.Any])
    
    inline def setCalendarEventMetadataUndefined: Self = StObject.set(x, "calendarEventMetadata", js.undefined)
    
    inline def setDeleteMetadata(value: Any): Self = StObject.set(x, "deleteMetadata", value.asInstanceOf[js.Any])
    
    inline def setDeleteMetadataUndefined: Self = StObject.set(x, "deleteMetadata", js.undefined)
    
    inline def setEditMetadata(value: Any): Self = StObject.set(x, "editMetadata", value.asInstanceOf[js.Any])
    
    inline def setEditMetadataUndefined: Self = StObject.set(x, "editMetadata", js.undefined)
    
    inline def setSpaceUrl(value: String): Self = StObject.set(x, "spaceUrl", value.asInstanceOf[js.Any])
    
    inline def setSpaceUrlUndefined: Self = StObject.set(x, "spaceUrl", js.undefined)
    
    inline def setTasksMetadata(value: Any): Self = StObject.set(x, "tasksMetadata", value.asInstanceOf[js.Any])
    
    inline def setTasksMetadataUndefined: Self = StObject.set(x, "tasksMetadata", js.undefined)
    
    inline def setVideoCallMetadata(value: VideoCallMetadata): Self = StObject.set(x, "videoCallMetadata", value.asInstanceOf[js.Any])
    
    inline def setVideoCallMetadataUndefined: Self = StObject.set(x, "videoCallMetadata", js.undefined)
  }
}
