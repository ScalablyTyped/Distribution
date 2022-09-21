package typings.googleapis.transcoderV1Mod.transcoderV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaEditAtom extends StObject {
  
  /**
    * End time in seconds for the atom, relative to the input file timeline. When `end_time_offset` is not specified, the `inputs` are used until the end of the atom.
    */
  var endTimeOffset: js.UndefOr[String | Null] = js.undefined
  
  /**
    * List of `Input.key`s identifying files that should be used in this atom. The listed `inputs` must have the same timeline.
    */
  var inputs: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * A unique key for this atom. Must be specified when using advanced mapping.
    */
  var key: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Start time in seconds for the atom, relative to the input file timeline. The default is `0s`.
    */
  var startTimeOffset: js.UndefOr[String | Null] = js.undefined
}
object SchemaEditAtom {
  
  inline def apply(): SchemaEditAtom = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEditAtom]
  }
  
  extension [Self <: SchemaEditAtom](x: Self) {
    
    inline def setEndTimeOffset(value: String): Self = StObject.set(x, "endTimeOffset", value.asInstanceOf[js.Any])
    
    inline def setEndTimeOffsetNull: Self = StObject.set(x, "endTimeOffset", null)
    
    inline def setEndTimeOffsetUndefined: Self = StObject.set(x, "endTimeOffset", js.undefined)
    
    inline def setInputs(value: js.Array[String]): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
    
    inline def setInputsNull: Self = StObject.set(x, "inputs", null)
    
    inline def setInputsUndefined: Self = StObject.set(x, "inputs", js.undefined)
    
    inline def setInputsVarargs(value: String*): Self = StObject.set(x, "inputs", js.Array(value*))
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyNull: Self = StObject.set(x, "key", null)
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setStartTimeOffset(value: String): Self = StObject.set(x, "startTimeOffset", value.asInstanceOf[js.Any])
    
    inline def setStartTimeOffsetNull: Self = StObject.set(x, "startTimeOffset", null)
    
    inline def setStartTimeOffsetUndefined: Self = StObject.set(x, "startTimeOffset", js.undefined)
  }
}
