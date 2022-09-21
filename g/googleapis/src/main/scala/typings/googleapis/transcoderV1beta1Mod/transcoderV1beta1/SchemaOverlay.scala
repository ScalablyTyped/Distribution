package typings.googleapis.transcoderV1beta1Mod.transcoderV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaOverlay extends StObject {
  
  /**
    * List of Animations. The list should be chronological, without any time overlap.
    */
  var animations: js.UndefOr[js.Array[SchemaAnimation]] = js.undefined
  
  /**
    * Image overlay.
    */
  var image: js.UndefOr[SchemaImage] = js.undefined
}
object SchemaOverlay {
  
  inline def apply(): SchemaOverlay = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOverlay]
  }
  
  extension [Self <: SchemaOverlay](x: Self) {
    
    inline def setAnimations(value: js.Array[SchemaAnimation]): Self = StObject.set(x, "animations", value.asInstanceOf[js.Any])
    
    inline def setAnimationsUndefined: Self = StObject.set(x, "animations", js.undefined)
    
    inline def setAnimationsVarargs(value: SchemaAnimation*): Self = StObject.set(x, "animations", js.Array(value*))
    
    inline def setImage(value: SchemaImage): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
  }
}
