package typings.luaparse.libAstMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StringLiteral
  extends Expression
     with Base[typings.luaparse.luaparseStrings.StringLiteral] {
  var raw: String
  var value: String
}

object StringLiteral {
  @scala.inline
  def apply(raw: String, `type`: typings.luaparse.luaparseStrings.StringLiteral, value: String): StringLiteral = {
    val __obj = js.Dynamic.literal(raw = raw, value = value)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[StringLiteral]
  }
}

