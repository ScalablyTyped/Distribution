package typings.googleapis.transcoderV1beta1Mod.transcoderV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAudioAtom extends StObject {
  
  /**
    * List of `Channel`s for this audio stream. for in-depth explanation.
    */
  var channels: js.UndefOr[js.Array[SchemaAudioChannel]] = js.undefined
  
  /**
    * Required. The `EditAtom.key` that references the atom with audio inputs in the `Job.edit_list`.
    */
  var key: js.UndefOr[String | Null] = js.undefined
}
object SchemaAudioAtom {
  
  inline def apply(): SchemaAudioAtom = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAudioAtom]
  }
  
  extension [Self <: SchemaAudioAtom](x: Self) {
    
    inline def setChannels(value: js.Array[SchemaAudioChannel]): Self = StObject.set(x, "channels", value.asInstanceOf[js.Any])
    
    inline def setChannelsUndefined: Self = StObject.set(x, "channels", js.undefined)
    
    inline def setChannelsVarargs(value: SchemaAudioChannel*): Self = StObject.set(x, "channels", js.Array(value*))
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyNull: Self = StObject.set(x, "key", null)
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
  }
}
