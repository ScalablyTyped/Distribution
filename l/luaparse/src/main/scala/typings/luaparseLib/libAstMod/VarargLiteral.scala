package typings
package luaparseLib.libAstMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VarargLiteral
  extends Expression
     with Base[luaparseLib.luaparseLibStrings.VarargLiteral] {
  var raw: java.lang.String
  var value: java.lang.String
}

object VarargLiteral {
  @scala.inline
  def apply(
    raw: java.lang.String,
    `type`: luaparseLib.luaparseLibStrings.VarargLiteral,
    value: java.lang.String
  ): VarargLiteral = {
    val __obj = js.Dynamic.literal(raw = raw, value = value)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[VarargLiteral]
  }
}

