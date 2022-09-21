package typings.googleapis.v34Mod.dfareportingV34

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCustomVariable extends StObject {
  
  /**
    * The index of the custom variable.
    */
  var index: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string "dfareporting#customVariable".
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The value of the custom variable. The length of string must not exceed 50 characters.
    */
  var value: js.UndefOr[String | Null] = js.undefined
}
object SchemaCustomVariable {
  
  inline def apply(): SchemaCustomVariable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCustomVariable]
  }
  
  extension [Self <: SchemaCustomVariable](x: Self) {
    
    inline def setIndex(value: String): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexNull: Self = StObject.set(x, "index", null)
    
    inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueNull: Self = StObject.set(x, "value", null)
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
