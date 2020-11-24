package typings.isMyJsonValid.mod

import typings.isMyJsonValid.isMyJsonValidStrings.`null`
import typings.isMyJsonValid.isMyJsonValidStrings.boolean
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NullableBooleanSchema extends _AnySchema {
  
  var `type`: js.Array[boolean | `null`] = js.native
}
object NullableBooleanSchema {
  
  @scala.inline
  def apply(`type`: js.Array[boolean | `null`]): NullableBooleanSchema = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NullableBooleanSchema]
  }
  
  @scala.inline
  implicit class NullableBooleanSchemaOps[Self <: NullableBooleanSchema] (val x: Self) extends AnyVal {
    
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
    def setTypeVarargs(value: (boolean | `null`)*): Self = this.set("type", js.Array(value :_*))
    
    @scala.inline
    def setType(value: js.Array[boolean | `null`]): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
