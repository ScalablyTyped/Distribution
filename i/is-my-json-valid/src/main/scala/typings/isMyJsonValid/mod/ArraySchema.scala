package typings.isMyJsonValid.mod

import typings.isMyJsonValid.isMyJsonValidStrings.array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArraySchema[ItemSchema /* <: AnySchema */] extends StObject {
  
  var items: ItemSchema
  
  var `type`: array
}
object ArraySchema {
  
  inline def apply[ItemSchema /* <: AnySchema */](items: ItemSchema): ArraySchema[ItemSchema] = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("array")
    __obj.asInstanceOf[ArraySchema[ItemSchema]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ArraySchema[?], ItemSchema /* <: AnySchema */] (val x: Self & ArraySchema[ItemSchema]) extends AnyVal {
    
    inline def setItems(value: ItemSchema): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setType(value: array): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
