package typings.luaparse.libAstMod

import typings.luaparse.Anon_End
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NilLiteral
  extends Expression
     with Base[typings.luaparse.luaparseStrings.NilLiteral] {
  var raw: String
  var value: Null
}

object NilLiteral {
  @scala.inline
  def apply(
    raw: String,
    `type`: typings.luaparse.luaparseStrings.NilLiteral,
    value: Null,
    loc: Anon_End = null
  ): NilLiteral = {
    val __obj = js.Dynamic.literal(raw = raw, value = value)
    __obj.updateDynamic("type")(`type`)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    __obj.asInstanceOf[NilLiteral]
  }
}

