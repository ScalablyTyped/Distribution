package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppsDynamiteBabelPlaceholderMetadata extends StObject {
  
  var deleteMetadata: js.UndefOr[Any] = js.undefined
  
  var editMetadata: js.UndefOr[Any] = js.undefined
  
  var hangoutVideoMetadata: js.UndefOr[AppsDynamiteBabelPlaceholderMetadataHangoutVideoEventMetadata] = js.undefined
}
object AppsDynamiteBabelPlaceholderMetadata {
  
  inline def apply(): AppsDynamiteBabelPlaceholderMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppsDynamiteBabelPlaceholderMetadata]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AppsDynamiteBabelPlaceholderMetadata] (val x: Self) extends AnyVal {
    
    inline def setDeleteMetadata(value: Any): Self = StObject.set(x, "deleteMetadata", value.asInstanceOf[js.Any])
    
    inline def setDeleteMetadataUndefined: Self = StObject.set(x, "deleteMetadata", js.undefined)
    
    inline def setEditMetadata(value: Any): Self = StObject.set(x, "editMetadata", value.asInstanceOf[js.Any])
    
    inline def setEditMetadataUndefined: Self = StObject.set(x, "editMetadata", js.undefined)
    
    inline def setHangoutVideoMetadata(value: AppsDynamiteBabelPlaceholderMetadataHangoutVideoEventMetadata): Self = StObject.set(x, "hangoutVideoMetadata", value.asInstanceOf[js.Any])
    
    inline def setHangoutVideoMetadataUndefined: Self = StObject.set(x, "hangoutVideoMetadata", js.undefined)
  }
}
