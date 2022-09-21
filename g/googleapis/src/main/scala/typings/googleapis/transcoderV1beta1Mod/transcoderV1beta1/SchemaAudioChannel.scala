package typings.googleapis.transcoderV1beta1Mod.transcoderV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAudioChannel extends StObject {
  
  /**
    * List of `Job.inputs` for this audio channel.
    */
  var inputs: js.UndefOr[js.Array[SchemaAudioChannelInput]] = js.undefined
}
object SchemaAudioChannel {
  
  inline def apply(): SchemaAudioChannel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAudioChannel]
  }
  
  extension [Self <: SchemaAudioChannel](x: Self) {
    
    inline def setInputs(value: js.Array[SchemaAudioChannelInput]): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
    
    inline def setInputsUndefined: Self = StObject.set(x, "inputs", js.undefined)
    
    inline def setInputsVarargs(value: SchemaAudioChannelInput*): Self = StObject.set(x, "inputs", js.Array(value*))
  }
}
