package typings.knockout.mod

import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("knockout", "applyBindingAccessorsToNode")
@js.native
object applyBindingAccessorsToNode extends js.Object {
  
  def apply[T](node: Node, bindings: js.Function0[BindingAccessors], viewModel: T): Unit = js.native
  def apply[T](node: Node, bindings: js.Function0[BindingAccessors], viewModel: BindingContext[T]): Unit = js.native
  def apply[T](node: Node, bindings: BindingAccessors, viewModel: T): Unit = js.native
  def apply[T](node: Node, bindings: BindingAccessors, viewModel: BindingContext[T]): Unit = js.native
}
