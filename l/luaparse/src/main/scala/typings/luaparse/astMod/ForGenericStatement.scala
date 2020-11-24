package typings.luaparse.astMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ForGenericStatement
  extends _Statement
     with Base[typings.luaparse.luaparseStrings.ForGenericStatement] {
  
  var body: js.Array[Statement] = js.native
  
  var iterators: js.Array[Expression] = js.native
  
  var variables: js.Array[Identifier] = js.native
}
object ForGenericStatement {
  
  @scala.inline
  def apply(
    body: js.Array[Statement],
    iterators: js.Array[Expression],
    `type`: typings.luaparse.luaparseStrings.ForGenericStatement,
    variables: js.Array[Identifier]
  ): ForGenericStatement = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], iterators = iterators.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ForGenericStatement]
  }
  
  @scala.inline
  implicit class ForGenericStatementOps[Self <: ForGenericStatement] (val x: Self) extends AnyVal {
    
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
    def setBodyVarargs(value: Statement*): Self = this.set("body", js.Array(value :_*))
    
    @scala.inline
    def setBody(value: js.Array[Statement]): Self = this.set("body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIteratorsVarargs(value: Expression*): Self = this.set("iterators", js.Array(value :_*))
    
    @scala.inline
    def setIterators(value: js.Array[Expression]): Self = this.set("iterators", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariablesVarargs(value: Identifier*): Self = this.set("variables", js.Array(value :_*))
    
    @scala.inline
    def setVariables(value: js.Array[Identifier]): Self = this.set("variables", value.asInstanceOf[js.Any])
  }
}
