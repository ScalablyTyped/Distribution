package typings
package luaparseLib.libAstMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableCallExpression
  extends Expression
     with Base[luaparseLib.luaparseLibStrings.TableCallExpression] {
  var arguments: js.Array[Expression]
  var base: Expression
}

object TableCallExpression {
  @scala.inline
  def apply(
    arguments: js.Array[Expression],
    base: Expression,
    `type`: luaparseLib.luaparseLibStrings.TableCallExpression
  ): TableCallExpression = {
    val __obj = js.Dynamic.literal(arguments = arguments, base = base)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[TableCallExpression]
  }
}

