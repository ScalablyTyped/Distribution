package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCustomAttribute extends StObject {
  
  /**
    * Subattributes within this attribute group. Exactly one of value or groupValues must be provided.
    */
  var groupValues: js.UndefOr[js.Array[SchemaCustomAttribute]] = js.undefined
  
  /**
    * The name of the attribute. Underscores will be replaced by spaces upon insertion.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The value of the attribute.
    */
  var value: js.UndefOr[String | Null] = js.undefined
}
object SchemaCustomAttribute {
  
  inline def apply(): SchemaCustomAttribute = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCustomAttribute]
  }
  
  extension [Self <: SchemaCustomAttribute](x: Self) {
    
    inline def setGroupValues(value: js.Array[SchemaCustomAttribute]): Self = StObject.set(x, "groupValues", value.asInstanceOf[js.Any])
    
    inline def setGroupValuesUndefined: Self = StObject.set(x, "groupValues", js.undefined)
    
    inline def setGroupValuesVarargs(value: SchemaCustomAttribute*): Self = StObject.set(x, "groupValues", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueNull: Self = StObject.set(x, "value", null)
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
