package typings.isMyJsonValid.mod

import typings.isMyJsonValid.isMyJsonValidStrings.`null`
import typings.isMyJsonValid.isMyJsonValidStrings.array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NullableArraySchema[ItemSchema /* <: AnySchema */] extends StObject {
  
  var items: ItemSchema = js.native
  
  var `type`: js.Array[array | `null`] = js.native
}
object NullableArraySchema {
  
  @scala.inline
  def apply[ItemSchema /* <: AnySchema */](items: ItemSchema, `type`: js.Array[array | `null`]): NullableArraySchema[ItemSchema] = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NullableArraySchema[ItemSchema]]
  }
  
  @scala.inline
  implicit class NullableArraySchemaMutableBuilder[Self <: NullableArraySchema[_], ItemSchema /* <: AnySchema */] (val x: Self with NullableArraySchema[ItemSchema]) extends AnyVal {
    
    @scala.inline
    def setItems(value: ItemSchema): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: js.Array[array | `null`]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeVarargs(value: (array | `null`)*): Self = StObject.set(x, "type", js.Array(value :_*))
  }
}
