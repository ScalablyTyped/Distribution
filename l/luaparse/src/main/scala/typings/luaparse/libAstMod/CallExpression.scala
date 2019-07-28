package typings.luaparse.libAstMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CallExpression
  extends Expression
     with Base[typings.luaparse.luaparseStrings.CallExpression] {
  var arguments: js.Array[Expression]
  var base: Expression
}

object CallExpression {
  @scala.inline
  def apply(
    arguments: js.Array[Expression],
    base: Expression,
    `type`: typings.luaparse.luaparseStrings.CallExpression
  ): CallExpression = {
    val __obj = js.Dynamic.literal(arguments = arguments, base = base)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[CallExpression]
  }
}

