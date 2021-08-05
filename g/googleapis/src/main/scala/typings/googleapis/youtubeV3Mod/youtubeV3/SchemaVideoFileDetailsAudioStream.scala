package typings.googleapis.youtubeV3Mod.youtubeV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Information about an audio stream.
  */
trait SchemaVideoFileDetailsAudioStream extends StObject {
  
  /**
    * The audio stream&#39;s bitrate, in bits per second.
    */
  var bitrateBps: js.UndefOr[String] = js.undefined
  
  /**
    * The number of audio channels that the stream contains.
    */
  var channelCount: js.UndefOr[Double] = js.undefined
  
  /**
    * The audio codec that the stream uses.
    */
  var codec: js.UndefOr[String] = js.undefined
  
  /**
    * A value that uniquely identifies a video vendor. Typically, the value is
    * a four-letter vendor code.
    */
  var vendor: js.UndefOr[String] = js.undefined
}
object SchemaVideoFileDetailsAudioStream {
  
  inline def apply(): SchemaVideoFileDetailsAudioStream = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaVideoFileDetailsAudioStream]
  }
  
  extension [Self <: SchemaVideoFileDetailsAudioStream](x: Self) {
    
    inline def setBitrateBps(value: String): Self = StObject.set(x, "bitrateBps", value.asInstanceOf[js.Any])
    
    inline def setBitrateBpsUndefined: Self = StObject.set(x, "bitrateBps", js.undefined)
    
    inline def setChannelCount(value: Double): Self = StObject.set(x, "channelCount", value.asInstanceOf[js.Any])
    
    inline def setChannelCountUndefined: Self = StObject.set(x, "channelCount", js.undefined)
    
    inline def setCodec(value: String): Self = StObject.set(x, "codec", value.asInstanceOf[js.Any])
    
    inline def setCodecUndefined: Self = StObject.set(x, "codec", js.undefined)
    
    inline def setVendor(value: String): Self = StObject.set(x, "vendor", value.asInstanceOf[js.Any])
    
    inline def setVendorUndefined: Self = StObject.set(x, "vendor", js.undefined)
  }
}
