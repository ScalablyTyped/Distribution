package typings.luaparse.libAstMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VarargLiteral
  extends Expression
     with Base[typings.luaparse.luaparseStrings.VarargLiteral] {
  var raw: String
  var value: String
}

object VarargLiteral {
  @scala.inline
  def apply(raw: String, `type`: typings.luaparse.luaparseStrings.VarargLiteral, value: String): VarargLiteral = {
    val __obj = js.Dynamic.literal(raw = raw, value = value)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[VarargLiteral]
  }
}

