package typings.luaparse.libAstMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BooleanLiteral
  extends Expression
     with Base[typings.luaparse.luaparseStrings.BooleanLiteral] {
  var raw: String
  var value: Boolean
}

object BooleanLiteral {
  @scala.inline
  def apply(raw: String, `type`: typings.luaparse.luaparseStrings.BooleanLiteral, value: Boolean): BooleanLiteral = {
    val __obj = js.Dynamic.literal(raw = raw, value = value)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[BooleanLiteral]
  }
}

