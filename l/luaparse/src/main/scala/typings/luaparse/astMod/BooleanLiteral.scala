package typings.luaparse.astMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BooleanLiteral
  extends Expression
     with Base[typings.luaparse.luaparseStrings.BooleanLiteral] {
  var raw: String = js.native
  var value: Boolean = js.native
}

object BooleanLiteral {
  @scala.inline
  def apply(raw: String, `type`: typings.luaparse.luaparseStrings.BooleanLiteral, value: Boolean): BooleanLiteral = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BooleanLiteral]
  }
  @scala.inline
  implicit class BooleanLiteralOps[Self <: BooleanLiteral] (val x: Self) extends AnyVal {
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
    def setRaw(value: String): Self = this.set("raw", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: Boolean): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}

