package typings.isMyJsonValid.mod

import typings.isMyJsonValid.isMyJsonValidStrings.`null`
import typings.isMyJsonValid.isMyJsonValidStrings.`object`
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NullableAllOptionalObjectSchema[Properties /* <: Record[String, AnySchema] */] extends js.Object {
  
  var additionalProperties: js.UndefOr[Boolean] = js.native
  
  var properties: Properties = js.native
  
  var `type`: js.Array[`object` | `null`] = js.native
}
object NullableAllOptionalObjectSchema {
  
  @scala.inline
  def apply[Properties /* <: Record[String, AnySchema] */](properties: Properties, `type`: js.Array[`object` | `null`]): NullableAllOptionalObjectSchema[Properties] = {
    val __obj = js.Dynamic.literal(properties = properties.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NullableAllOptionalObjectSchema[Properties]]
  }
  
  @scala.inline
  implicit class NullableAllOptionalObjectSchemaOps[Self <: NullableAllOptionalObjectSchema[_], Properties /* <: Record[String, AnySchema] */] (val x: Self with NullableAllOptionalObjectSchema[Properties]) extends AnyVal {
    
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
    def setProperties(value: Properties): Self = this.set("properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeVarargs(value: (`object` | `null`)*): Self = this.set("type", js.Array(value :_*))
    
    @scala.inline
    def setType(value: js.Array[`object` | `null`]): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdditionalProperties(value: Boolean): Self = this.set("additionalProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdditionalProperties: Self = this.set("additionalProperties", js.undefined)
  }
}
