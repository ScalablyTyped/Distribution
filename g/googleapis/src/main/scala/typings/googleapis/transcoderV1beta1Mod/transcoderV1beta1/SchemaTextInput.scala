package typings.googleapis.transcoderV1beta1Mod.transcoderV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaTextInput extends StObject {
  
  /**
    * Required. The `Input.key` that identifies the input file.
    */
  var key: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. The zero-based index of the track in the input file.
    */
  var track: js.UndefOr[Double | Null] = js.undefined
}
object SchemaTextInput {
  
  inline def apply(): SchemaTextInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTextInput]
  }
  
  extension [Self <: SchemaTextInput](x: Self) {
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyNull: Self = StObject.set(x, "key", null)
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setTrack(value: Double): Self = StObject.set(x, "track", value.asInstanceOf[js.Any])
    
    inline def setTrackNull: Self = StObject.set(x, "track", null)
    
    inline def setTrackUndefined: Self = StObject.set(x, "track", js.undefined)
  }
}
