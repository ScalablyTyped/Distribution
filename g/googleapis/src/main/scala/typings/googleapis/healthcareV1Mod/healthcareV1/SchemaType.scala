package typings.googleapis.healthcareV1Mod.healthcareV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaType extends StObject {
  
  /**
    * The (sub) fields this type has (if not primitive).
    */
  var fields: js.UndefOr[js.Array[SchemaField]] = js.undefined
  
  /**
    * The name of this type. This would be the segment or datatype name. For example, "PID" or "XPN".
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * If this is a primitive type then this field is the type of the primitive For example, STRING. Leave unspecified for composite types.
    */
  var primitive: js.UndefOr[String | Null] = js.undefined
}
object SchemaType {
  
  inline def apply(): SchemaType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaType]
  }
  
  extension [Self <: SchemaType](x: Self) {
    
    inline def setFields(value: js.Array[SchemaField]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    inline def setFieldsVarargs(value: SchemaField*): Self = StObject.set(x, "fields", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPrimitive(value: String): Self = StObject.set(x, "primitive", value.asInstanceOf[js.Any])
    
    inline def setPrimitiveNull: Self = StObject.set(x, "primitive", null)
    
    inline def setPrimitiveUndefined: Self = StObject.set(x, "primitive", js.undefined)
  }
}
