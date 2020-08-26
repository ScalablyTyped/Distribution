package typings.luaparse.astMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TableValue
  extends Base[typings.luaparse.luaparseStrings.TableValue]
     with _Node {
  var value: Expression = js.native
}

object TableValue {
  @scala.inline
  def apply(`type`: typings.luaparse.luaparseStrings.TableValue, value: Expression): TableValue = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableValue]
  }
  @scala.inline
  implicit class TableValueOps[Self <: TableValue] (val x: Self) extends AnyVal {
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
    def setValue(value: Expression): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}

