package typings.isMyJsonValid.mod

import typings.isMyJsonValid.isMyJsonValidStrings.`object`
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ObjectSchema[Properties /* <: Record[String, AnySchema] */, Required /* <: StringKeys[Properties] */] extends StObject {
  
  var additionalProperties: js.UndefOr[Boolean] = js.native
  
  var properties: Properties = js.native
  
  var required: js.Array[Required] = js.native
  
  var `type`: `object` = js.native
}
object ObjectSchema {
  
  @scala.inline
  def apply[Properties /* <: Record[String, AnySchema] */, Required /* <: StringKeys[Properties] */](properties: Properties, required: js.Array[Required], `type`: `object`): ObjectSchema[Properties, Required] = {
    val __obj = js.Dynamic.literal(properties = properties.asInstanceOf[js.Any], required = required.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectSchema[Properties, Required]]
  }
  
  @scala.inline
  implicit class ObjectSchemaMutableBuilder[Self <: ObjectSchema[_, _], Properties /* <: Record[String, AnySchema] */, Required /* <: StringKeys[Properties] */] (val x: Self with (ObjectSchema[Properties, Required])) extends AnyVal {
    
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
    def setType(value: `object`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
