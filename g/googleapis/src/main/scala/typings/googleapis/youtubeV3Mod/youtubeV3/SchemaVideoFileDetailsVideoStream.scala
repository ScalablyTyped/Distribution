package typings.googleapis.youtubeV3Mod.youtubeV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaVideoFileDetailsVideoStream extends StObject {
  
  /**
    * The video content's display aspect ratio, which specifies the aspect ratio in which the video should be displayed.
    */
  var aspectRatio: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The video stream's bitrate, in bits per second.
    */
  var bitrateBps: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The video codec that the stream uses.
    */
  var codec: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The video stream's frame rate, in frames per second.
    */
  var frameRateFps: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The encoded video content's height in pixels.
    */
  var heightPixels: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The amount that YouTube needs to rotate the original source content to properly display the video.
    */
  var rotation: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A value that uniquely identifies a video vendor. Typically, the value is a four-letter vendor code.
    */
  var vendor: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The encoded video content's width in pixels. You can calculate the video's encoding aspect ratio as width_pixels / height_pixels.
    */
  var widthPixels: js.UndefOr[Double | Null] = js.undefined
}
object SchemaVideoFileDetailsVideoStream {
  
  inline def apply(): SchemaVideoFileDetailsVideoStream = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaVideoFileDetailsVideoStream]
  }
  
  extension [Self <: SchemaVideoFileDetailsVideoStream](x: Self) {
    
    inline def setAspectRatio(value: Double): Self = StObject.set(x, "aspectRatio", value.asInstanceOf[js.Any])
    
    inline def setAspectRatioNull: Self = StObject.set(x, "aspectRatio", null)
    
    inline def setAspectRatioUndefined: Self = StObject.set(x, "aspectRatio", js.undefined)
    
    inline def setBitrateBps(value: String): Self = StObject.set(x, "bitrateBps", value.asInstanceOf[js.Any])
    
    inline def setBitrateBpsNull: Self = StObject.set(x, "bitrateBps", null)
    
    inline def setBitrateBpsUndefined: Self = StObject.set(x, "bitrateBps", js.undefined)
    
    inline def setCodec(value: String): Self = StObject.set(x, "codec", value.asInstanceOf[js.Any])
    
    inline def setCodecNull: Self = StObject.set(x, "codec", null)
    
    inline def setCodecUndefined: Self = StObject.set(x, "codec", js.undefined)
    
    inline def setFrameRateFps(value: Double): Self = StObject.set(x, "frameRateFps", value.asInstanceOf[js.Any])
    
    inline def setFrameRateFpsNull: Self = StObject.set(x, "frameRateFps", null)
    
    inline def setFrameRateFpsUndefined: Self = StObject.set(x, "frameRateFps", js.undefined)
    
    inline def setHeightPixels(value: Double): Self = StObject.set(x, "heightPixels", value.asInstanceOf[js.Any])
    
    inline def setHeightPixelsNull: Self = StObject.set(x, "heightPixels", null)
    
    inline def setHeightPixelsUndefined: Self = StObject.set(x, "heightPixels", js.undefined)
    
    inline def setRotation(value: String): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
    
    inline def setRotationNull: Self = StObject.set(x, "rotation", null)
    
    inline def setRotationUndefined: Self = StObject.set(x, "rotation", js.undefined)
    
    inline def setVendor(value: String): Self = StObject.set(x, "vendor", value.asInstanceOf[js.Any])
    
    inline def setVendorNull: Self = StObject.set(x, "vendor", null)
    
    inline def setVendorUndefined: Self = StObject.set(x, "vendor", js.undefined)
    
    inline def setWidthPixels(value: Double): Self = StObject.set(x, "widthPixels", value.asInstanceOf[js.Any])
    
    inline def setWidthPixelsNull: Self = StObject.set(x, "widthPixels", null)
    
    inline def setWidthPixelsUndefined: Self = StObject.set(x, "widthPixels", js.undefined)
  }
}
