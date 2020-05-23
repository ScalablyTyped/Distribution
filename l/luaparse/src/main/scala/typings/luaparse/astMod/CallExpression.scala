package typings.luaparse.astMod

import typings.luaparse.anon.End
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
    `type`: typings.luaparse.luaparseStrings.CallExpression,
    loc: End = null
  ): CallExpression = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], base = base.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[CallExpression]
  }
}

