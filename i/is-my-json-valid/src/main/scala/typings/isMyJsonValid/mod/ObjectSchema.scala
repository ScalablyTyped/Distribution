package typings.isMyJsonValid.mod

import typings.isMyJsonValid.isMyJsonValidStrings.`object`
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ObjectSchema[Properties /* <: Record[String, AnySchema] */, Required /* <: StringKeys[Properties] */] extends StObject {
  
  var additionalProperties: js.UndefOr[Boolean] = js.undefined
  
  var properties: Properties
  
  var required: js.Array[Required]
  
  var `type`: `object`
}
object ObjectSchema {
  
  inline def apply[Properties /* <: Record[String, AnySchema] */, Required /* <: StringKeys[Properties] */](properties: Properties, required: js.Array[Required]): ObjectSchema[Properties, Required] = {
    val __obj = js.Dynamic.literal(properties = properties.asInstanceOf[js.Any], required = required.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("object")
    __obj.asInstanceOf[ObjectSchema[Properties, Required]]
  }
  
  extension [Self <: ObjectSchema[?, ?], Properties /* <: Record[String, AnySchema] */, Required /* <: StringKeys[Properties] */](x: Self & (ObjectSchema[Properties, Required])) {
    
    inline def setAdditionalProperties(value: Boolean): Self = StObject.set(x, "additionalProperties", value.asInstanceOf[js.Any])
    
    inline def setAdditionalPropertiesUndefined: Self = StObject.set(x, "additionalProperties", js.undefined)
    
    inline def setProperties(value: Properties): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setRequired(value: js.Array[Required]): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    inline def setRequiredVarargs(value: Required*): Self = StObject.set(x, "required", js.Array(value :_*))
    
    inline def setType(value: `object`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
