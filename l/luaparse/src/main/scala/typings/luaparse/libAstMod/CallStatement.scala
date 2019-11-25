package typings.luaparse.libAstMod

import typings.luaparse.Anon_End
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CallStatement
  extends _Statement
     with Base[typings.luaparse.luaparseStrings.CallStatement] {
  var expression: CallExpression | StringCallExpression | TableCallExpression
}

object CallStatement {
  @scala.inline
  def apply(
    expression: CallExpression | StringCallExpression | TableCallExpression,
    `type`: typings.luaparse.luaparseStrings.CallStatement,
    loc: Anon_End = null
  ): CallStatement = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[CallStatement]
  }
}

