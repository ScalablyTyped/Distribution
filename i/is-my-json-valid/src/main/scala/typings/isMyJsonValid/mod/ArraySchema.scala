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
  
  @scala.inline
  def apply[ItemSchema /* <: AnySchema */](items: ItemSchema): ArraySchema[ItemSchema] = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("array")
    __obj.asInstanceOf[ArraySchema[ItemSchema]]
  }
  
  @scala.inline
  implicit class ArraySchemaMutableBuilder[Self <: ArraySchema[?], ItemSchema /* <: AnySchema */] (val x: Self & ArraySchema[ItemSchema]) extends AnyVal {
    
    @scala.inline
    def setItems(value: ItemSchema): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: array): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
