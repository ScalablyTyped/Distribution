package typings.googleapis.transcoderV1Mod.transcoderV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaVp9CodecSettings extends StObject {
  
  /**
    * Required. The video bitrate in bits per second. The minimum value is 1,000. The maximum value is 480,000,000.
    */
  var bitrateBps: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Target CRF level. Must be between 10 and 36, where 10 is the highest quality and 36 is the most efficient compression. The default is 21. **Note:** This field is not supported.
    */
  var crfLevel: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Required. The target video frame rate in frames per second (FPS). Must be less than or equal to 120. Will default to the input frame rate if larger than the input frame rate. The API will generate an output FPS that is divisible by the input FPS, and smaller or equal to the target FPS. See [Calculating frame rate](https://cloud.google.com/transcoder/docs/concepts/frame-rate) for more information.
    */
  var frameRate: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Select the GOP size based on the specified duration. The default is `3s`. Note that `gopDuration` must be less than or equal to [`segmentDuration`](#SegmentSettings), and [`segmentDuration`](#SegmentSettings) must be divisible by `gopDuration`.
    */
  var gopDuration: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Select the GOP size based on the specified frame count. Must be greater than zero.
    */
  var gopFrameCount: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The height of the video in pixels. Must be an even integer. When not specified, the height is adjusted to match the specified width and input aspect ratio. If both are omitted, the input height is used.
    */
  var heightPixels: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Pixel format to use. The default is `yuv420p`. Supported pixel formats: - `yuv420p` pixel format - `yuv422p` pixel format - `yuv444p` pixel format - `yuv420p10` 10-bit HDR pixel format - `yuv422p10` 10-bit HDR pixel format - `yuv444p10` 10-bit HDR pixel format - `yuv420p12` 12-bit HDR pixel format - `yuv422p12` 12-bit HDR pixel format - `yuv444p12` 12-bit HDR pixel format
    */
  var pixelFormat: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Enforces the specified codec profile. The following profiles are supported: * `profile0` (default) * `profile1` * `profile2` * `profile3` The available options are [WebM-compatible](https://www.webmproject.org/vp9/profiles/). Note that certain values for this field may cause the transcoder to override other fields you set in the `Vp9CodecSettings` message.
    */
  var profile: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Specify the `rate_control_mode`. The default is `vbr`. Supported rate control modes: - `vbr` - variable bitrate
    */
  var rateControlMode: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The width of the video in pixels. Must be an even integer. When not specified, the width is adjusted to match the specified height and input aspect ratio. If both are omitted, the input width is used.
    */
  var widthPixels: js.UndefOr[Double | Null] = js.undefined
}
object SchemaVp9CodecSettings {
  
  inline def apply(): SchemaVp9CodecSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaVp9CodecSettings]
  }
  
  extension [Self <: SchemaVp9CodecSettings](x: Self) {
    
    inline def setBitrateBps(value: Double): Self = StObject.set(x, "bitrateBps", value.asInstanceOf[js.Any])
    
    inline def setBitrateBpsNull: Self = StObject.set(x, "bitrateBps", null)
    
    inline def setBitrateBpsUndefined: Self = StObject.set(x, "bitrateBps", js.undefined)
    
    inline def setCrfLevel(value: Double): Self = StObject.set(x, "crfLevel", value.asInstanceOf[js.Any])
    
    inline def setCrfLevelNull: Self = StObject.set(x, "crfLevel", null)
    
    inline def setCrfLevelUndefined: Self = StObject.set(x, "crfLevel", js.undefined)
    
    inline def setFrameRate(value: Double): Self = StObject.set(x, "frameRate", value.asInstanceOf[js.Any])
    
    inline def setFrameRateNull: Self = StObject.set(x, "frameRate", null)
    
    inline def setFrameRateUndefined: Self = StObject.set(x, "frameRate", js.undefined)
    
    inline def setGopDuration(value: String): Self = StObject.set(x, "gopDuration", value.asInstanceOf[js.Any])
    
    inline def setGopDurationNull: Self = StObject.set(x, "gopDuration", null)
    
    inline def setGopDurationUndefined: Self = StObject.set(x, "gopDuration", js.undefined)
    
    inline def setGopFrameCount(value: Double): Self = StObject.set(x, "gopFrameCount", value.asInstanceOf[js.Any])
    
    inline def setGopFrameCountNull: Self = StObject.set(x, "gopFrameCount", null)
    
    inline def setGopFrameCountUndefined: Self = StObject.set(x, "gopFrameCount", js.undefined)
    
    inline def setHeightPixels(value: Double): Self = StObject.set(x, "heightPixels", value.asInstanceOf[js.Any])
    
    inline def setHeightPixelsNull: Self = StObject.set(x, "heightPixels", null)
    
    inline def setHeightPixelsUndefined: Self = StObject.set(x, "heightPixels", js.undefined)
    
    inline def setPixelFormat(value: String): Self = StObject.set(x, "pixelFormat", value.asInstanceOf[js.Any])
    
    inline def setPixelFormatNull: Self = StObject.set(x, "pixelFormat", null)
    
    inline def setPixelFormatUndefined: Self = StObject.set(x, "pixelFormat", js.undefined)
    
    inline def setProfile(value: String): Self = StObject.set(x, "profile", value.asInstanceOf[js.Any])
    
    inline def setProfileNull: Self = StObject.set(x, "profile", null)
    
    inline def setProfileUndefined: Self = StObject.set(x, "profile", js.undefined)
    
    inline def setRateControlMode(value: String): Self = StObject.set(x, "rateControlMode", value.asInstanceOf[js.Any])
    
    inline def setRateControlModeNull: Self = StObject.set(x, "rateControlMode", null)
    
    inline def setRateControlModeUndefined: Self = StObject.set(x, "rateControlMode", js.undefined)
    
    inline def setWidthPixels(value: Double): Self = StObject.set(x, "widthPixels", value.asInstanceOf[js.Any])
    
    inline def setWidthPixelsNull: Self = StObject.set(x, "widthPixels", null)
    
    inline def setWidthPixelsUndefined: Self = StObject.set(x, "widthPixels", js.undefined)
  }
}
