package typings.googleapis.transcoderV1Mod.transcoderV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaTextMapping extends StObject {
  
  /**
    * Required. The `EditAtom.key` that references atom with text inputs in the `Job.edit_list`.
    */
  var atomKey: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. The `Input.key` that identifies the input file.
    */
  var inputKey: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. The zero-based index of the track in the input file.
    */
  var inputTrack: js.UndefOr[Double | Null] = js.undefined
}
object SchemaTextMapping {
  
  inline def apply(): SchemaTextMapping = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTextMapping]
  }
  
  extension [Self <: SchemaTextMapping](x: Self) {
    
    inline def setAtomKey(value: String): Self = StObject.set(x, "atomKey", value.asInstanceOf[js.Any])
    
    inline def setAtomKeyNull: Self = StObject.set(x, "atomKey", null)
    
    inline def setAtomKeyUndefined: Self = StObject.set(x, "atomKey", js.undefined)
    
    inline def setInputKey(value: String): Self = StObject.set(x, "inputKey", value.asInstanceOf[js.Any])
    
    inline def setInputKeyNull: Self = StObject.set(x, "inputKey", null)
    
    inline def setInputKeyUndefined: Self = StObject.set(x, "inputKey", js.undefined)
    
    inline def setInputTrack(value: Double): Self = StObject.set(x, "inputTrack", value.asInstanceOf[js.Any])
    
    inline def setInputTrackNull: Self = StObject.set(x, "inputTrack", null)
    
    inline def setInputTrackUndefined: Self = StObject.set(x, "inputTrack", js.undefined)
  }
}
