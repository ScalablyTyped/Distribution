package typings.googleapis.youtubeV3Mod.youtubeV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaInvideoBranding extends StObject {
  
  var imageBytes: js.UndefOr[String] = js.native
  
  var imageUrl: js.UndefOr[String] = js.native
  
  var position: js.UndefOr[SchemaInvideoPosition] = js.native
  
  var targetChannelId: js.UndefOr[String] = js.native
  
  var timing: js.UndefOr[SchemaInvideoTiming] = js.native
}
object SchemaInvideoBranding {
  
  @scala.inline
  def apply(): SchemaInvideoBranding = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInvideoBranding]
  }
  
  @scala.inline
  implicit class SchemaInvideoBrandingMutableBuilder[Self <: SchemaInvideoBranding] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setImageBytes(value: String): Self = StObject.set(x, "imageBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageBytesUndefined: Self = StObject.set(x, "imageBytes", js.undefined)
    
    @scala.inline
    def setImageUrl(value: String): Self = StObject.set(x, "imageUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageUrlUndefined: Self = StObject.set(x, "imageUrl", js.undefined)
    
    @scala.inline
    def setPosition(value: SchemaInvideoPosition): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    @scala.inline
    def setTargetChannelId(value: String): Self = StObject.set(x, "targetChannelId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetChannelIdUndefined: Self = StObject.set(x, "targetChannelId", js.undefined)
    
    @scala.inline
    def setTiming(value: SchemaInvideoTiming): Self = StObject.set(x, "timing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimingUndefined: Self = StObject.set(x, "timing", js.undefined)
  }
}
