package typings
package luaparseLib.libAstMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AssignmentStatement
  extends _Statement
     with Base[luaparseLib.luaparseLibStrings.AssignmentStatement] {
  var init: js.Array[Expression]
  var variables: js.Array[IndexExpression | MemberExpression | Identifier]
}

object AssignmentStatement {
  @scala.inline
  def apply(
    init: js.Array[Expression],
    `type`: luaparseLib.luaparseLibStrings.AssignmentStatement,
    variables: js.Array[IndexExpression | MemberExpression | Identifier]
  ): AssignmentStatement = {
    val __obj = js.Dynamic.literal(init = init, variables = variables)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[AssignmentStatement]
  }
}

