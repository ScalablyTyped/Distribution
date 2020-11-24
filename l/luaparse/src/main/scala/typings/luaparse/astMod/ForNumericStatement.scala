package typings.luaparse.astMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ForNumericStatement
  extends _Statement
     with Base[typings.luaparse.luaparseStrings.ForNumericStatement] {
  
  var body: js.Array[Statement] = js.native
  
  var end: Expression = js.native
  
  var start: Expression = js.native
  
  var step: Expression | Null = js.native
  
  var variable: Identifier = js.native
}
object ForNumericStatement {
  
  @scala.inline
  def apply(
    body: js.Array[Statement],
    end: Expression,
    start: Expression,
    `type`: typings.luaparse.luaparseStrings.ForNumericStatement,
    variable: Identifier
  ): ForNumericStatement = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], variable = variable.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ForNumericStatement]
  }
  
  @scala.inline
  implicit class ForNumericStatementOps[Self <: ForNumericStatement] (val x: Self) extends AnyVal {
    
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
    def setEnd(value: Expression): Self = this.set("end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStart(value: Expression): Self = this.set("start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariable(value: Identifier): Self = this.set("variable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStep(value: Expression): Self = this.set("step", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStepNull: Self = this.set("step", null)
  }
}
