package typings.googleapis.youtubeV3Mod.youtubeV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaInvideoBranding extends StObject {
  
  var imageBytes: js.UndefOr[String] = js.undefined
  
  var imageUrl: js.UndefOr[String] = js.undefined
  
  var position: js.UndefOr[SchemaInvideoPosition] = js.undefined
  
  var targetChannelId: js.UndefOr[String] = js.undefined
  
  var timing: js.UndefOr[SchemaInvideoTiming] = js.undefined
}
object SchemaInvideoBranding {
  
  inline def apply(): SchemaInvideoBranding = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInvideoBranding]
  }
  
  extension [Self <: SchemaInvideoBranding](x: Self) {
    
    inline def setImageBytes(value: String): Self = StObject.set(x, "imageBytes", value.asInstanceOf[js.Any])
    
    inline def setImageBytesUndefined: Self = StObject.set(x, "imageBytes", js.undefined)
    
    inline def setImageUrl(value: String): Self = StObject.set(x, "imageUrl", value.asInstanceOf[js.Any])
    
    inline def setImageUrlUndefined: Self = StObject.set(x, "imageUrl", js.undefined)
    
    inline def setPosition(value: SchemaInvideoPosition): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    inline def setTargetChannelId(value: String): Self = StObject.set(x, "targetChannelId", value.asInstanceOf[js.Any])
    
    inline def setTargetChannelIdUndefined: Self = StObject.set(x, "targetChannelId", js.undefined)
    
    inline def setTiming(value: SchemaInvideoTiming): Self = StObject.set(x, "timing", value.asInstanceOf[js.Any])
    
    inline def setTimingUndefined: Self = StObject.set(x, "timing", js.undefined)
  }
}
