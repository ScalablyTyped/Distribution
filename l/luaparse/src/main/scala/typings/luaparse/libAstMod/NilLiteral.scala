package typings.luaparse.libAstMod

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
  def apply(raw: String, `type`: typings.luaparse.luaparseStrings.NilLiteral, value: Null): NilLiteral = {
    val __obj = js.Dynamic.literal(raw = raw, value = value)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[NilLiteral]
  }
}

