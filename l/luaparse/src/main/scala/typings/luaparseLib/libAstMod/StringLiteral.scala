package typings
package luaparseLib.libAstMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StringLiteral
  extends Expression
     with Base[luaparseLib.luaparseLibStrings.StringLiteral] {
  var raw: java.lang.String
  var value: java.lang.String
}

object StringLiteral {
  @scala.inline
  def apply(
    raw: java.lang.String,
    `type`: luaparseLib.luaparseLibStrings.StringLiteral,
    value: java.lang.String
  ): StringLiteral = {
    val __obj = js.Dynamic.literal(raw = raw, value = value)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[StringLiteral]
  }
}

