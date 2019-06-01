package typings
package luaparseLib.libAstMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LogicalExpression
  extends Expression
     with Base[luaparseLib.luaparseLibStrings.LogicalExpression] {
  var left: Expression
  var operator: luaparseLib.luaparseLibStrings.or | luaparseLib.luaparseLibStrings.and
  var right: Expression
}

object LogicalExpression {
  @scala.inline
  def apply(
    left: Expression,
    operator: luaparseLib.luaparseLibStrings.or | luaparseLib.luaparseLibStrings.and,
    right: Expression,
    `type`: luaparseLib.luaparseLibStrings.LogicalExpression
  ): LogicalExpression = {
    val __obj = js.Dynamic.literal(left = left, operator = operator.asInstanceOf[js.Any], right = right)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[LogicalExpression]
  }
}

