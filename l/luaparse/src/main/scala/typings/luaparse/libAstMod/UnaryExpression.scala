package typings.luaparse.libAstMod

import typings.luaparse.luaparseStrings.`#`
import typings.luaparse.luaparseStrings.`-`
import typings.luaparse.luaparseStrings.`~`
import typings.luaparse.luaparseStrings.not
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnaryExpression
  extends Expression
     with Base[typings.luaparse.luaparseStrings.UnaryExpression] {
  var argument: Expression
  var operator: not | `-` | `~` | `#`
}

object UnaryExpression {
  @scala.inline
  def apply(
    argument: Expression,
    operator: not | `-` | `~` | `#`,
    `type`: typings.luaparse.luaparseStrings.UnaryExpression
  ): UnaryExpression = {
    val __obj = js.Dynamic.literal(argument = argument, operator = operator.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[UnaryExpression]
  }
}

