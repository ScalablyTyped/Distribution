package typings.knockout.mod

import typings.knockout.knockoutStrings.childrenComplete
import typings.knockout.knockoutStrings.descendantsComplete
import typings.std.Element
import typings.std.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bindingEvent {
  
  @JSImport("knockout", "bindingEvent")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def startPossiblyAsyncContentBinding(node: Element, bindingContext: BindingContext[js.Any]): BindingContext[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("startPossiblyAsyncContentBinding")(node.asInstanceOf[js.Any], bindingContext.asInstanceOf[js.Any])).asInstanceOf[BindingContext[js.Any]]
  
  @scala.inline
  def subscribe_childrenComplete(node: Node, event: childrenComplete, callback: js.Function1[/* node */ Node, Unit]): Subscription = (^.asInstanceOf[js.Dynamic].applyDynamic("subscribe")(node.asInstanceOf[js.Any], event.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Subscription]
  @scala.inline
  def subscribe_childrenComplete(
    node: Node,
    event: childrenComplete,
    callback: js.Function1[/* node */ Node, Unit],
    callbackContext: js.Any
  ): Subscription = (^.asInstanceOf[js.Dynamic].applyDynamic("subscribe")(node.asInstanceOf[js.Any], event.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], callbackContext.asInstanceOf[js.Any])).asInstanceOf[Subscription]
  
  @scala.inline
  def subscribe_descendantsComplete(node: Node, event: descendantsComplete, callback: js.Function1[/* node */ Node, Unit]): Subscription = (^.asInstanceOf[js.Dynamic].applyDynamic("subscribe")(node.asInstanceOf[js.Any], event.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Subscription]
  @scala.inline
  def subscribe_descendantsComplete(
    node: Node,
    event: descendantsComplete,
    callback: js.Function1[/* node */ Node, Unit],
    callbackContext: js.Any
  ): Subscription = (^.asInstanceOf[js.Dynamic].applyDynamic("subscribe")(node.asInstanceOf[js.Any], event.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], callbackContext.asInstanceOf[js.Any])).asInstanceOf[Subscription]
}
