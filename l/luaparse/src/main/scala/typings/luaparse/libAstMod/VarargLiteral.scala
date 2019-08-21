package typings.luaparse.libAstMod

import typings.luaparse.Anon_End
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
  def apply(
    raw: String,
    `type`: typings.luaparse.luaparseStrings.VarargLiteral,
    value: String,
    loc: Anon_End = null
  ): VarargLiteral = {
    val __obj = js.Dynamic.literal(raw = raw, value = value)
    __obj.updateDynamic("type")(`type`)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    __obj.asInstanceOf[VarargLiteral]
  }
}

