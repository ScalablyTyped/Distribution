package typings
package luaparseLib.libAstMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnaryExpression
  extends Expression
     with Base[luaparseLib.luaparseLibStrings.UnaryExpression] {
  var argument: Expression
  var operator: luaparseLib.luaparseLibStrings.`#` | luaparseLib.luaparseLibStrings.not
}

object UnaryExpression {
  @scala.inline
  def apply(
    argument: Expression,
    operator: luaparseLib.luaparseLibStrings.`#` | luaparseLib.luaparseLibStrings.not,
    `type`: luaparseLib.luaparseLibStrings.UnaryExpression
  ): UnaryExpression = {
    val __obj = js.Dynamic.literal(argument = argument, operator = operator.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[UnaryExpression]
  }
}

