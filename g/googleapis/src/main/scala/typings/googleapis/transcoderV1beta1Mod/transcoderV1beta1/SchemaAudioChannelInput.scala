package typings.googleapis.transcoderV1beta1Mod.transcoderV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAudioChannelInput extends StObject {
  
  /**
    * Required. The zero-based index of the channel in the input file.
    */
  var channel: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Audio volume control in dB. Negative values decrease volume, positive values increase. The default is 0.
    */
  var gainDb: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Required. The `Input.key` that identifies the input file.
    */
  var key: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. The zero-based index of the track in the input file.
    */
  var track: js.UndefOr[Double | Null] = js.undefined
}
object SchemaAudioChannelInput {
  
  inline def apply(): SchemaAudioChannelInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAudioChannelInput]
  }
  
  extension [Self <: SchemaAudioChannelInput](x: Self) {
    
    inline def setChannel(value: Double): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
    
    inline def setChannelNull: Self = StObject.set(x, "channel", null)
    
    inline def setChannelUndefined: Self = StObject.set(x, "channel", js.undefined)
    
    inline def setGainDb(value: Double): Self = StObject.set(x, "gainDb", value.asInstanceOf[js.Any])
    
    inline def setGainDbNull: Self = StObject.set(x, "gainDb", null)
    
    inline def setGainDbUndefined: Self = StObject.set(x, "gainDb", js.undefined)
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyNull: Self = StObject.set(x, "key", null)
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setTrack(value: Double): Self = StObject.set(x, "track", value.asInstanceOf[js.Any])
    
    inline def setTrackNull: Self = StObject.set(x, "track", null)
    
    inline def setTrackUndefined: Self = StObject.set(x, "track", js.undefined)
  }
}
