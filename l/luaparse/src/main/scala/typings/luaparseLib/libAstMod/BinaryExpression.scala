package typings
package luaparseLib.libAstMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BinaryExpression
  extends Expression
     with Base[luaparseLib.luaparseLibStrings.BinaryExpression] {
  var left: Expression
  var operator: luaparseLib.luaparseLibStrings.`+` | luaparseLib.luaparseLibStrings.`-` | luaparseLib.luaparseLibStrings.`*` | luaparseLib.luaparseLibStrings.`/` | luaparseLib.luaparseLibStrings.`%` | luaparseLib.luaparseLibStrings.`_backtick^_backtick` | luaparseLib.luaparseLibStrings.`==` | luaparseLib.luaparseLibStrings.`~=` | luaparseLib.luaparseLibStrings.`<=` | luaparseLib.luaparseLibStrings.`>=` | luaparseLib.luaparseLibStrings.`<` | luaparseLib.luaparseLibStrings.`>` | luaparseLib.luaparseLibStrings.DOTDOT
  var right: Expression
}

object BinaryExpression {
  @scala.inline
  def apply(
    left: Expression,
    operator: luaparseLib.luaparseLibStrings.`+` | luaparseLib.luaparseLibStrings.`-` | luaparseLib.luaparseLibStrings.`*` | luaparseLib.luaparseLibStrings.`/` | luaparseLib.luaparseLibStrings.`%` | luaparseLib.luaparseLibStrings.`_backtick^_backtick` | luaparseLib.luaparseLibStrings.`==` | luaparseLib.luaparseLibStrings.`~=` | luaparseLib.luaparseLibStrings.`<=` | luaparseLib.luaparseLibStrings.`>=` | luaparseLib.luaparseLibStrings.`<` | luaparseLib.luaparseLibStrings.`>` | luaparseLib.luaparseLibStrings.DOTDOT,
    right: Expression,
    `type`: luaparseLib.luaparseLibStrings.BinaryExpression
  ): BinaryExpression = {
    val __obj = js.Dynamic.literal(left = left, operator = operator.asInstanceOf[js.Any], right = right)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[BinaryExpression]
  }
}

