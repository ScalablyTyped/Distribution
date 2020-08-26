package typings.knockout.mod

import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("knockout", "applyBindingsToNode")
@js.native
object applyBindingsToNode extends js.Object {
  def apply[T](node: Node, bindings: js.Function0[js.Object], viewModel: T): Unit = js.native
  def apply[T](node: Node, bindings: js.Function0[js.Object], viewModel: BindingContext[T]): Unit = js.native
  def apply[T](node: Node, bindings: js.Object, viewModel: T): Unit = js.native
  def apply[T](node: Node, bindings: js.Object, viewModel: BindingContext[T]): Unit = js.native
}

