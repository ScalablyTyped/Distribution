package typings.isMyJsonValid.mod

import typings.isMyJsonValid.isMyJsonValidStrings.`null`
import typings.isMyJsonValid.isMyJsonValidStrings.`object`
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NullableAllOptionalObjectSchema[Properties /* <: Record[String, AnySchema] */] extends StObject {
  
  var additionalProperties: js.UndefOr[Boolean] = js.undefined
  
  var properties: Properties
  
  var `type`: js.Array[`object` | `null`]
}
object NullableAllOptionalObjectSchema {
  
  inline def apply[Properties /* <: Record[String, AnySchema] */](properties: Properties, `type`: js.Array[`object` | `null`]): NullableAllOptionalObjectSchema[Properties] = {
    val __obj = js.Dynamic.literal(properties = properties.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NullableAllOptionalObjectSchema[Properties]]
  }
  
  extension [Self <: NullableAllOptionalObjectSchema[?], Properties /* <: Record[String, AnySchema] */](x: Self & NullableAllOptionalObjectSchema[Properties]) {
    
    inline def setAdditionalProperties(value: Boolean): Self = StObject.set(x, "additionalProperties", value.asInstanceOf[js.Any])
    
    inline def setAdditionalPropertiesUndefined: Self = StObject.set(x, "additionalProperties", js.undefined)
    
    inline def setProperties(value: Properties): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setType(value: js.Array[`object` | `null`]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeVarargs(value: (`object` | `null`)*): Self = StObject.set(x, "type", js.Array(value :_*))
  }
}
