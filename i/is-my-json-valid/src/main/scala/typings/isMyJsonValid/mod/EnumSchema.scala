package typings.isMyJsonValid.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnumSchema[Enum] extends js.Object {
  
  var enum: js.Array[Enum] = js.native
}
object EnumSchema {
  
  @scala.inline
  def apply[Enum](enum: js.Array[Enum]): EnumSchema[Enum] = {
    val __obj = js.Dynamic.literal(enum = enum.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumSchema[Enum]]
  }
  
  @scala.inline
  implicit class EnumSchemaOps[Self <: EnumSchema[_], Enum] (val x: Self with EnumSchema[Enum]) extends AnyVal {
    
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
    def setEnumVarargs(value: Enum*): Self = this.set("enum", js.Array(value :_*))
    
    @scala.inline
    def setEnum(value: js.Array[Enum]): Self = this.set("enum", value.asInstanceOf[js.Any])
  }
}
