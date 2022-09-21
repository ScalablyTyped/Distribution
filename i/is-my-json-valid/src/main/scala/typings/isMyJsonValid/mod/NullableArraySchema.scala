package typings.isMyJsonValid.mod

import typings.isMyJsonValid.isMyJsonValidStrings.`null`
import typings.isMyJsonValid.isMyJsonValidStrings.array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NullableArraySchema[ItemSchema /* <: AnySchema */] extends StObject {
  
  var items: ItemSchema
  
  var `type`: js.Array[array | `null`]
}
object NullableArraySchema {
  
  inline def apply[ItemSchema /* <: AnySchema */](items: ItemSchema, `type`: js.Array[array | `null`]): NullableArraySchema[ItemSchema] = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NullableArraySchema[ItemSchema]]
  }
  
  extension [Self <: NullableArraySchema[?], ItemSchema /* <: AnySchema */](x: Self & NullableArraySchema[ItemSchema]) {
    
    inline def setItems(value: ItemSchema): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setType(value: js.Array[array | `null`]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeVarargs(value: (array | `null`)*): Self = StObject.set(x, "type", js.Array(value*))
  }
}
