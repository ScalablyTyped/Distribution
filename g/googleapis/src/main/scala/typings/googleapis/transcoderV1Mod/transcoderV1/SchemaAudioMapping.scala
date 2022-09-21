package typings.googleapis.transcoderV1Mod.transcoderV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAudioMapping extends StObject {
  
  /**
    * Required. The `EditAtom.key` that references the atom with audio inputs in the `Job.edit_list`.
    */
  var atomKey: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Audio volume control in dB. Negative values decrease volume, positive values increase. The default is 0.
    */
  var gainDb: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Required. The zero-based index of the channel in the input audio stream.
    */
  var inputChannel: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Required. The `Input.key` that identifies the input file.
    */
  var inputKey: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. The zero-based index of the track in the input file.
    */
  var inputTrack: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Required. The zero-based index of the channel in the output audio stream.
    */
  var outputChannel: js.UndefOr[Double | Null] = js.undefined
}
object SchemaAudioMapping {
  
  inline def apply(): SchemaAudioMapping = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAudioMapping]
  }
  
  extension [Self <: SchemaAudioMapping](x: Self) {
    
    inline def setAtomKey(value: String): Self = StObject.set(x, "atomKey", value.asInstanceOf[js.Any])
    
    inline def setAtomKeyNull: Self = StObject.set(x, "atomKey", null)
    
    inline def setAtomKeyUndefined: Self = StObject.set(x, "atomKey", js.undefined)
    
    inline def setGainDb(value: Double): Self = StObject.set(x, "gainDb", value.asInstanceOf[js.Any])
    
    inline def setGainDbNull: Self = StObject.set(x, "gainDb", null)
    
    inline def setGainDbUndefined: Self = StObject.set(x, "gainDb", js.undefined)
    
    inline def setInputChannel(value: Double): Self = StObject.set(x, "inputChannel", value.asInstanceOf[js.Any])
    
    inline def setInputChannelNull: Self = StObject.set(x, "inputChannel", null)
    
    inline def setInputChannelUndefined: Self = StObject.set(x, "inputChannel", js.undefined)
    
    inline def setInputKey(value: String): Self = StObject.set(x, "inputKey", value.asInstanceOf[js.Any])
    
    inline def setInputKeyNull: Self = StObject.set(x, "inputKey", null)
    
    inline def setInputKeyUndefined: Self = StObject.set(x, "inputKey", js.undefined)
    
    inline def setInputTrack(value: Double): Self = StObject.set(x, "inputTrack", value.asInstanceOf[js.Any])
    
    inline def setInputTrackNull: Self = StObject.set(x, "inputTrack", null)
    
    inline def setInputTrackUndefined: Self = StObject.set(x, "inputTrack", js.undefined)
    
    inline def setOutputChannel(value: Double): Self = StObject.set(x, "outputChannel", value.asInstanceOf[js.Any])
    
    inline def setOutputChannelNull: Self = StObject.set(x, "outputChannel", null)
    
    inline def setOutputChannelUndefined: Self = StObject.set(x, "outputChannel", js.undefined)
  }
}
