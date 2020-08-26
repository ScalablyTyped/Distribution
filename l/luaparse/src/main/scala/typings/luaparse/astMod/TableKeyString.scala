package typings.luaparse.astMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TableKeyString
  extends Base[typings.luaparse.luaparseStrings.TableKeyString]
     with _Node {
  var key: Identifier = js.native
  var value: Expression = js.native
}

object TableKeyString {
  @scala.inline
  def apply(key: Identifier, `type`: typings.luaparse.luaparseStrings.TableKeyString, value: Expression): TableKeyString = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableKeyString]
  }
  @scala.inline
  implicit class TableKeyStringOps[Self <: TableKeyString] (val x: Self) extends AnyVal {
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
    def setKey(value: Identifier): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: Expression): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}

