package typings.luaparse.libAstMod

import typings.luaparse.Anon_End
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AssignmentStatement
  extends _Statement
     with Base[typings.luaparse.luaparseStrings.AssignmentStatement] {
  var init: js.Array[Expression]
  var variables: js.Array[IndexExpression | MemberExpression | Identifier]
}

object AssignmentStatement {
  @scala.inline
  def apply(
    init: js.Array[Expression],
    `type`: typings.luaparse.luaparseStrings.AssignmentStatement,
    variables: js.Array[IndexExpression | MemberExpression | Identifier],
    loc: Anon_End = null
  ): AssignmentStatement = {
    val __obj = js.Dynamic.literal(init = init, variables = variables)
    __obj.updateDynamic("type")(`type`)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    __obj.asInstanceOf[AssignmentStatement]
  }
}

