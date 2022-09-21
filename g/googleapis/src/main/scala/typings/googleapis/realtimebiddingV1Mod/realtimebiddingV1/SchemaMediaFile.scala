package typings.googleapis.realtimebiddingV1Mod.realtimebiddingV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaMediaFile extends StObject {
  
  /**
    * Bitrate of the video file, in Kbps. Can be used to filter the response of the creatives.list method.
    */
  var bitrate: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The MIME type of this media file. Can be used to filter the response of the creatives.list method.
    */
  var mimeType: js.UndefOr[String | Null] = js.undefined
}
object SchemaMediaFile {
  
  inline def apply(): SchemaMediaFile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMediaFile]
  }
  
  extension [Self <: SchemaMediaFile](x: Self) {
    
    inline def setBitrate(value: String): Self = StObject.set(x, "bitrate", value.asInstanceOf[js.Any])
    
    inline def setBitrateNull: Self = StObject.set(x, "bitrate", null)
    
    inline def setBitrateUndefined: Self = StObject.set(x, "bitrate", js.undefined)
    
    inline def setMimeType(value: String): Self = StObject.set(x, "mimeType", value.asInstanceOf[js.Any])
    
    inline def setMimeTypeNull: Self = StObject.set(x, "mimeType", null)
    
    inline def setMimeTypeUndefined: Self = StObject.set(x, "mimeType", js.undefined)
  }
}
