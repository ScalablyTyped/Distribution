package typings.luaparse.astMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AssignmentStatement
  extends _Statement
     with Base[typings.luaparse.luaparseStrings.AssignmentStatement] {
  
  var init: js.Array[Expression] = js.native
  
  var variables: js.Array[IndexExpression | MemberExpression | Identifier] = js.native
}
object AssignmentStatement {
  
  @scala.inline
  def apply(
    init: js.Array[Expression],
    `type`: typings.luaparse.luaparseStrings.AssignmentStatement,
    variables: js.Array[IndexExpression | MemberExpression | Identifier]
  ): AssignmentStatement = {
    val __obj = js.Dynamic.literal(init = init.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssignmentStatement]
  }
  
  @scala.inline
  implicit class AssignmentStatementOps[Self <: AssignmentStatement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setInitVarargs(value: Expression*): Self = this.set("init", js.Array(value :_*))
    
    @scala.inline
    def setInit(value: js.Array[Expression]): Self = this.set("init", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariablesVarargs(value: (IndexExpression | MemberExpression | Identifier)*): Self = this.set("variables", js.Array(value :_*))
    
    @scala.inline
    def setVariables(value: js.Array[IndexExpression | MemberExpression | Identifier]): Self = this.set("variables", value.asInstanceOf[js.Any])
  }
}
