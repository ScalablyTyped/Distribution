package typings
package luaparseLib.libAstMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StringCallExpression
  extends Expression
     with Base[luaparseLib.luaparseLibStrings.StringCallExpression] {
  var argument: Expression
  var base: Expression
}

object StringCallExpression {
  @scala.inline
  def apply(
    argument: Expression,
    base: Expression,
    `type`: luaparseLib.luaparseLibStrings.StringCallExpression
  ): StringCallExpression = {
    val __obj = js.Dynamic.literal(argument = argument, base = base)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[StringCallExpression]
  }
}

