package typings.inversify.interfacesMod.interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.inversify.inversifyStrings.ConstructorArgument
  - typings.inversify.inversifyStrings.ClassProperty
  - typings.inversify.inversifyStrings.Variable
*/
trait TargetType extends js.Object

object TargetType {
  @scala.inline
  def ClassProperty: typings.inversify.inversifyStrings.ClassProperty = this.cast("ClassProperty")
  @scala.inline
  def ConstructorArgument: typings.inversify.inversifyStrings.ConstructorArgument = this.cast("ConstructorArgument")
  @scala.inline
  def Variable: typings.inversify.inversifyStrings.Variable = this.cast("Variable")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

