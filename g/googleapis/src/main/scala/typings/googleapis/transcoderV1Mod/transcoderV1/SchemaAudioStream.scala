package typings.googleapis.transcoderV1Mod.transcoderV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAudioStream extends StObject {
  
  /**
    * Required. Audio bitrate in bits per second. Must be between 1 and 10,000,000.
    */
  var bitrateBps: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Number of audio channels. Must be between 1 and 6. The default is 2.
    */
  var channelCount: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * A list of channel names specifying layout of the audio channels. This only affects the metadata embedded in the container headers, if supported by the specified format. The default is `["fl", "fr"]`. Supported channel names: - `fl` - Front left channel - `fr` - Front right channel - `sl` - Side left channel - `sr` - Side right channel - `fc` - Front center channel - `lfe` - Low frequency
    */
  var channelLayout: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * The codec for this audio stream. The default is `aac`. Supported audio codecs: - `aac` - `aac-he` - `aac-he-v2` - `mp3` - `ac3` - `eac3`
    */
  var codec: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The mapping for the `Job.edit_list` atoms with audio `EditAtom.inputs`.
    */
  var mapping: js.UndefOr[js.Array[SchemaAudioMapping]] = js.undefined
  
  /**
    * The audio sample rate in Hertz. The default is 48000 Hertz.
    */
  var sampleRateHertz: js.UndefOr[Double | Null] = js.undefined
}
object SchemaAudioStream {
  
  inline def apply(): SchemaAudioStream = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAudioStream]
  }
  
  extension [Self <: SchemaAudioStream](x: Self) {
    
    inline def setBitrateBps(value: Double): Self = StObject.set(x, "bitrateBps", value.asInstanceOf[js.Any])
    
    inline def setBitrateBpsNull: Self = StObject.set(x, "bitrateBps", null)
    
    inline def setBitrateBpsUndefined: Self = StObject.set(x, "bitrateBps", js.undefined)
    
    inline def setChannelCount(value: Double): Self = StObject.set(x, "channelCount", value.asInstanceOf[js.Any])
    
    inline def setChannelCountNull: Self = StObject.set(x, "channelCount", null)
    
    inline def setChannelCountUndefined: Self = StObject.set(x, "channelCount", js.undefined)
    
    inline def setChannelLayout(value: js.Array[String]): Self = StObject.set(x, "channelLayout", value.asInstanceOf[js.Any])
    
    inline def setChannelLayoutNull: Self = StObject.set(x, "channelLayout", null)
    
    inline def setChannelLayoutUndefined: Self = StObject.set(x, "channelLayout", js.undefined)
    
    inline def setChannelLayoutVarargs(value: String*): Self = StObject.set(x, "channelLayout", js.Array(value*))
    
    inline def setCodec(value: String): Self = StObject.set(x, "codec", value.asInstanceOf[js.Any])
    
    inline def setCodecNull: Self = StObject.set(x, "codec", null)
    
    inline def setCodecUndefined: Self = StObject.set(x, "codec", js.undefined)
    
    inline def setMapping(value: js.Array[SchemaAudioMapping]): Self = StObject.set(x, "mapping", value.asInstanceOf[js.Any])
    
    inline def setMappingUndefined: Self = StObject.set(x, "mapping", js.undefined)
    
    inline def setMappingVarargs(value: SchemaAudioMapping*): Self = StObject.set(x, "mapping", js.Array(value*))
    
    inline def setSampleRateHertz(value: Double): Self = StObject.set(x, "sampleRateHertz", value.asInstanceOf[js.Any])
    
    inline def setSampleRateHertzNull: Self = StObject.set(x, "sampleRateHertz", null)
    
    inline def setSampleRateHertzUndefined: Self = StObject.set(x, "sampleRateHertz", js.undefined)
  }
}
