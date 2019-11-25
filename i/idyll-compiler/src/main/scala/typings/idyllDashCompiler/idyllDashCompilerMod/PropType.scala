package typings.idyllDashCompiler.idyllDashCompilerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.idyllDashCompiler.idyllDashCompilerStrings.variable
  - typings.idyllDashCompiler.idyllDashCompilerStrings.value
  - typings.idyllDashCompiler.idyllDashCompilerStrings.expression
*/
trait PropType extends js.Object

object PropType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def expression: typings.idyllDashCompiler.idyllDashCompilerStrings.expression = this.cast("expression")
  @scala.inline
  def value: typings.idyllDashCompiler.idyllDashCompilerStrings.value = this.cast("value")
  @scala.inline
  def variable: typings.idyllDashCompiler.idyllDashCompilerStrings.variable = this.cast("variable")
}

