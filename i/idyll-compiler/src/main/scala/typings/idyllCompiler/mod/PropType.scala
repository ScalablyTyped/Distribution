package typings.idyllCompiler.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.idyllCompiler.idyllCompilerStrings.variable
  - typings.idyllCompiler.idyllCompilerStrings.value
  - typings.idyllCompiler.idyllCompilerStrings.expression
*/
trait PropType extends js.Object

object PropType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def expression: typings.idyllCompiler.idyllCompilerStrings.expression = this.cast("expression")
  @scala.inline
  def value: typings.idyllCompiler.idyllCompilerStrings.value = this.cast("value")
  @scala.inline
  def variable: typings.idyllCompiler.idyllCompilerStrings.variable = this.cast("variable")
}

