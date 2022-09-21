package typings.googleapis.youtubeV3Mod.youtubeV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaInvideoBranding extends StObject {
  
  /**
    * The bytes the uploaded image. Only used in api to youtube communication.
    */
  var imageBytes: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The url of the uploaded image. Only used in apiary to api communication.
    */
  var imageUrl: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The spatial position within the video where the branding watermark will be displayed.
    */
  var position: js.UndefOr[SchemaInvideoPosition] = js.undefined
  
  /**
    * The channel to which this branding links. If not present it defaults to the current channel.
    */
  var targetChannelId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The temporal position within the video where watermark will be displayed.
    */
  var timing: js.UndefOr[SchemaInvideoTiming] = js.undefined
}
object SchemaInvideoBranding {
  
  inline def apply(): SchemaInvideoBranding = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInvideoBranding]
  }
  
  extension [Self <: SchemaInvideoBranding](x: Self) {
    
    inline def setImageBytes(value: String): Self = StObject.set(x, "imageBytes", value.asInstanceOf[js.Any])
    
    inline def setImageBytesNull: Self = StObject.set(x, "imageBytes", null)
    
    inline def setImageBytesUndefined: Self = StObject.set(x, "imageBytes", js.undefined)
    
    inline def setImageUrl(value: String): Self = StObject.set(x, "imageUrl", value.asInstanceOf[js.Any])
    
    inline def setImageUrlNull: Self = StObject.set(x, "imageUrl", null)
    
    inline def setImageUrlUndefined: Self = StObject.set(x, "imageUrl", js.undefined)
    
    inline def setPosition(value: SchemaInvideoPosition): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    inline def setTargetChannelId(value: String): Self = StObject.set(x, "targetChannelId", value.asInstanceOf[js.Any])
    
    inline def setTargetChannelIdNull: Self = StObject.set(x, "targetChannelId", null)
    
    inline def setTargetChannelIdUndefined: Self = StObject.set(x, "targetChannelId", js.undefined)
    
    inline def setTiming(value: SchemaInvideoTiming): Self = StObject.set(x, "timing", value.asInstanceOf[js.Any])
    
    inline def setTimingUndefined: Self = StObject.set(x, "timing", js.undefined)
  }
}
