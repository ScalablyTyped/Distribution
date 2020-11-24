package typings.knockout.mod

import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("knockout", "applyBindings")
@js.native
object applyBindings extends js.Object {
  
  def apply[T](bindingContext: T): Unit = js.native
  def apply[T](bindingContext: T, rootNode: Null, extendCallback: BindingContextExtendCallback[T]): Unit = js.native
  def apply[T](bindingContext: T, rootNode: Node): Unit = js.native
  def apply[T](bindingContext: T, rootNode: Node, extendCallback: BindingContextExtendCallback[T]): Unit = js.native
  def apply[T](bindingContext: BindingContext[T]): Unit = js.native
  def apply[T](bindingContext: BindingContext[T], rootNode: Null, extendCallback: BindingContextExtendCallback[T]): Unit = js.native
  def apply[T](bindingContext: BindingContext[T], rootNode: Node): Unit = js.native
  def apply[T](bindingContext: BindingContext[T], rootNode: Node, extendCallback: BindingContextExtendCallback[T]): Unit = js.native
}
