package typings.luaparse.libAstMod

import typings.luaparse.luaparseStrings.and
import typings.luaparse.luaparseStrings.or
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LogicalExpression
  extends Expression
     with Base[typings.luaparse.luaparseStrings.LogicalExpression] {
  var left: Expression
  var operator: or | and
  var right: Expression
}

object LogicalExpression {
  @scala.inline
  def apply(
    left: Expression,
    operator: or | and,
    right: Expression,
    `type`: typings.luaparse.luaparseStrings.LogicalExpression
  ): LogicalExpression = {
    val __obj = js.Dynamic.literal(left = left, operator = operator.asInstanceOf[js.Any], right = right)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[LogicalExpression]
  }
}

