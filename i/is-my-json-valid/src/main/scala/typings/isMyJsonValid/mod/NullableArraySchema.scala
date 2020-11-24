package typings.isMyJsonValid.mod

import typings.isMyJsonValid.isMyJsonValidStrings.`null`
import typings.isMyJsonValid.isMyJsonValidStrings.array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NullableArraySchema[ItemSchema /* <: AnySchema */] extends js.Object {
  
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
  implicit class NullableArraySchemaOps[Self <: NullableArraySchema[_], ItemSchema /* <: AnySchema */] (val x: Self with NullableArraySchema[ItemSchema]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setItems(value: ItemSchema): Self = this.set("items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeVarargs(value: (array | `null`)*): Self = this.set("type", js.Array(value :_*))
    
    @scala.inline
    def setType(value: js.Array[array | `null`]): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
