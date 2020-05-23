package typings.luaparse.astMod

import typings.luaparse.anon.End
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
    `type`: typings.luaparse.luaparseStrings.LogicalExpression,
    loc: End = null
  ): LogicalExpression = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogicalExpression]
  }
}

