package typings.jscodeshift.templateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Template extends js.Object {
  
  /** Tagged template function. Parses the string as source and returns an Expression AST node. */
  def expression(args: js.Any*): js.Any = js.native
  
  /** Tagged template function. Parses the string as source and returns an Statement AST node. */
  def statement(args: js.Any*): js.Any = js.native
  
  /** Tagged template function. Parses the string as source and returns an array of Statement AST nodes. */
  def statements(args: js.Any*): js.Any = js.native
}
object Template {
  
  @scala.inline
  def apply(
    expression: /* repeated */ js.Any => js.Any,
    statement: /* repeated */ js.Any => js.Any,
    statements: /* repeated */ js.Any => js.Any
  ): Template = {
    val __obj = js.Dynamic.literal(expression = js.Any.fromFunction1(expression), statement = js.Any.fromFunction1(statement), statements = js.Any.fromFunction1(statements))
    __obj.asInstanceOf[Template]
  }
  
  @scala.inline
  implicit class TemplateOps[Self <: Template] (val x: Self) extends AnyVal {
    
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
    def setExpression(value: /* repeated */ js.Any => js.Any): Self = this.set("expression", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStatement(value: /* repeated */ js.Any => js.Any): Self = this.set("statement", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStatements(value: /* repeated */ js.Any => js.Any): Self = this.set("statements", js.Any.fromFunction1(value))
  }
}
