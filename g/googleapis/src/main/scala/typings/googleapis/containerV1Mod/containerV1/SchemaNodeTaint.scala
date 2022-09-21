package typings.googleapis.containerV1Mod.containerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaNodeTaint extends StObject {
  
  /**
    * Effect for taint.
    */
  var effect: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Key for taint.
    */
  var key: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Value for taint.
    */
  var value: js.UndefOr[String | Null] = js.undefined
}
object SchemaNodeTaint {
  
  inline def apply(): SchemaNodeTaint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNodeTaint]
  }
  
  extension [Self <: SchemaNodeTaint](x: Self) {
    
    inline def setEffect(value: String): Self = StObject.set(x, "effect", value.asInstanceOf[js.Any])
    
    inline def setEffectNull: Self = StObject.set(x, "effect", null)
    
    inline def setEffectUndefined: Self = StObject.set(x, "effect", js.undefined)
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyNull: Self = StObject.set(x, "key", null)
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueNull: Self = StObject.set(x, "value", null)
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
