package typings
package jscodeshiftLib.srcTemplateMod.templateNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Template extends js.Object {
  /** Tagged template function. Parses the string as source and returns an Expression AST node. */
  def expression(args: js.Any*): js.Any
  /** Tagged template function. Parses the string as source and returns an Statement AST node. */
  def statement(args: js.Any*): js.Any
  /** Tagged template function. Parses the string as source and returns an array of Statement AST nodes. */
  def statements(args: js.Any*): js.Any
}

object Template {
  @scala.inline
  def apply(
    expression: js.Function1[/* repeated */ js.Any, js.Any],
    statement: js.Function1[/* repeated */ js.Any, js.Any],
    statements: js.Function1[/* repeated */ js.Any, js.Any]
  ): Template = {
    val __obj = js.Dynamic.literal(expression = expression, statement = statement, statements = statements)
  
    __obj.asInstanceOf[Template]
  }
}

