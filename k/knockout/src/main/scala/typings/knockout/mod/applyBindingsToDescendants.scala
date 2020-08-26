package typings.knockout.mod

import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("knockout", "applyBindingsToDescendants")
@js.native
object applyBindingsToDescendants extends js.Object {
  def apply[T](bindingContext: T): Unit = js.native
  def apply[T](bindingContext: T, rootNode: Node): Unit = js.native
  def apply[T](bindingContext: BindingContext[T]): Unit = js.native
  def apply[T](bindingContext: BindingContext[T], rootNode: Node): Unit = js.native
}

