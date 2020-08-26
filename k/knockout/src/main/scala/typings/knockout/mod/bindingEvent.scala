package typings.knockout.mod

import typings.knockout.knockoutStrings.childrenComplete
import typings.knockout.knockoutStrings.descendantsComplete
import typings.std.Element
import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("knockout", "bindingEvent")
@js.native
object bindingEvent extends js.Object {
  def startPossiblyAsyncContentBinding(node: Element, bindingContext: BindingContext[_]): BindingContext[_] = js.native
  @JSName("subscribe")
  def subscribe_childrenComplete(node: Node, event: childrenComplete, callback: js.Function1[/* node */ Node, Unit]): Subscription = js.native
  @JSName("subscribe")
  def subscribe_childrenComplete(
    node: Node,
    event: childrenComplete,
    callback: js.Function1[/* node */ Node, Unit],
    callbackContext: js.Any
  ): Subscription = js.native
  @JSName("subscribe")
  def subscribe_descendantsComplete(node: Node, event: descendantsComplete, callback: js.Function1[/* node */ Node, Unit]): Subscription = js.native
  @JSName("subscribe")
  def subscribe_descendantsComplete(
    node: Node,
    event: descendantsComplete,
    callback: js.Function1[/* node */ Node, Unit],
    callbackContext: js.Any
  ): Subscription = js.native
}

