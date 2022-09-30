package typings.matrixBotSdk.messageEventMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ThumbnailedFileInfo extends StObject {
  
  /**
    * The encrypted thumbnail file information, if encrypted.
    */
  var thumbnail_file: js.UndefOr[EncryptedFile] = js.undefined
  
  /**
    * Information about the thumbnail. Optionally included if a thumbnail_url is specified.
    */
  var thumbnail_info: js.UndefOr[ThumbnailInfo] = js.undefined
  
  /**
    * A URL to a thumbnail for the file, if unencrypted.
    */
  var thumbnail_url: js.UndefOr[String] = js.undefined
}
object ThumbnailedFileInfo {
  
  inline def apply(): ThumbnailedFileInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ThumbnailedFileInfo]
  }
  
  extension [Self <: ThumbnailedFileInfo](x: Self) {
    
    inline def setThumbnail_file(value: EncryptedFile): Self = StObject.set(x, "thumbnail_file", value.asInstanceOf[js.Any])
    
    inline def setThumbnail_fileUndefined: Self = StObject.set(x, "thumbnail_file", js.undefined)
    
    inline def setThumbnail_info(value: ThumbnailInfo): Self = StObject.set(x, "thumbnail_info", value.asInstanceOf[js.Any])
    
    inline def setThumbnail_infoUndefined: Self = StObject.set(x, "thumbnail_info", js.undefined)
    
    inline def setThumbnail_url(value: String): Self = StObject.set(x, "thumbnail_url", value.asInstanceOf[js.Any])
    
    inline def setThumbnail_urlUndefined: Self = StObject.set(x, "thumbnail_url", js.undefined)
  }
}
