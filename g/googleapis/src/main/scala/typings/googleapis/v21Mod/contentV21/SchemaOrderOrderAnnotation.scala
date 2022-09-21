package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaOrderOrderAnnotation extends StObject {
  
  /**
    * Key for additional google provided (as key-value pairs) annotation.
    */
  var key: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Value for additional google provided (as key-value pairs) annotation.
    */
  var value: js.UndefOr[String | Null] = js.undefined
}
object SchemaOrderOrderAnnotation {
  
  inline def apply(): SchemaOrderOrderAnnotation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOrderOrderAnnotation]
  }
  
  extension [Self <: SchemaOrderOrderAnnotation](x: Self) {
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyNull: Self = StObject.set(x, "key", null)
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueNull: Self = StObject.set(x, "value", null)
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
