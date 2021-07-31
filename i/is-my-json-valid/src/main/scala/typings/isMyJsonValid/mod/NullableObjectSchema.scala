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
  
  @scala.inline
  def apply[Properties /* <: Record[String, AnySchema] */, Required /* <: StringKeys[Properties] */](properties: Properties, required: js.Array[Required], `type`: js.Array[`object` | `null`]): NullableObjectSchema[Properties, Required] = {
    val __obj = js.Dynamic.literal(properties = properties.asInstanceOf[js.Any], required = required.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NullableObjectSchema[Properties, Required]]
  }
  
  @scala.inline
  implicit class NullableObjectSchemaMutableBuilder[Self <: NullableObjectSchema[?, ?], Properties /* <: Record[String, AnySchema] */, Required /* <: StringKeys[Properties] */] (val x: Self & (NullableObjectSchema[Properties, Required])) extends AnyVal {
    
    @scala.inline
    def setAdditionalProperties(value: Boolean): Self = StObject.set(x, "additionalProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdditionalPropertiesUndefined: Self = StObject.set(x, "additionalProperties", js.undefined)
    
    @scala.inline
    def setProperties(value: Properties): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequired(value: js.Array[Required]): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequiredVarargs(value: Required*): Self = StObject.set(x, "required", js.Array(value :_*))
    
    @scala.inline
    def setType(value: js.Array[`object` | `null`]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeVarargs(value: (`object` | `null`)*): Self = StObject.set(x, "type", js.Array(value :_*))
  }
}
