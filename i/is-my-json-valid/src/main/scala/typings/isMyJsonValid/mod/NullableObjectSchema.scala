package typings.isMyJsonValid.mod

import typings.isMyJsonValid.isMyJsonValidStrings.`null`
import typings.isMyJsonValid.isMyJsonValidStrings.`object`
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NullableObjectSchema[Properties /* <: Record[String, AnySchema] */, Required /* <: StringKeys[Properties] */] extends StObject {
  
  var additionalProperties: js.UndefOr[Boolean] = js.undefined
  
  var properties: Properties
  
  var required: js.Array[Required]
  
  var `type`: js.Array[`object` | `null`]
}
object NullableObjectSchema {
  
  inline def apply[Properties /* <: Record[String, AnySchema] */, Required /* <: StringKeys[Properties] */](properties: Properties, required: js.Array[Required], `type`: js.Array[`object` | `null`]): NullableObjectSchema[Properties, Required] = {
    val __obj = js.Dynamic.literal(properties = properties.asInstanceOf[js.Any], required = required.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NullableObjectSchema[Properties, Required]]
  }
  
  extension [Self <: NullableObjectSchema[?, ?], Properties /* <: Record[String, AnySchema] */, Required /* <: StringKeys[Properties] */](x: Self & (NullableObjectSchema[Properties, Required])) {
    
    inline def setAdditionalProperties(value: Boolean): Self = StObject.set(x, "additionalProperties", value.asInstanceOf[js.Any])
    
    inline def setAdditionalPropertiesUndefined: Self = StObject.set(x, "additionalProperties", js.undefined)
    
    inline def setProperties(value: Properties): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setRequired(value: js.Array[Required]): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    inline def setRequiredVarargs(value: Required*): Self = StObject.set(x, "required", js.Array(value :_*))
    
    inline def setType(value: js.Array[`object` | `null`]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeVarargs(value: (`object` | `null`)*): Self = StObject.set(x, "type", js.Array(value :_*))
  }
}
