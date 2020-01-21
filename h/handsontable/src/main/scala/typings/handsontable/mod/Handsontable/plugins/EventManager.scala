package typings.handsontable.mod.Handsontable.plugins

import typings.std.Element
import typings.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventManager extends js.Object {
  var context: js.UndefOr[js.Object] = js.undefined
  def addEventListener(element: Element, eventName: String, callback: js.Function1[/* event */ Event_, Unit]): js.Function0[Unit]
  def clear(): Unit
  def clearEvents(): Unit
  def destroy(): Unit
  def extendEvent(context: js.Object, event: Event_): js.Any
  def fireEvent(element: Element, eventName: String): Unit
  def removeEventListener(element: Element, eventName: String, callback: js.Function1[/* event */ Event_, Unit]): Unit
}

object EventManager {
  @scala.inline
  def apply(
    addEventListener: (Element, String, js.Function1[/* event */ Event_, Unit]) => js.Function0[Unit],
    clear: () => Unit,
    clearEvents: () => Unit,
    destroy: () => Unit,
    extendEvent: (js.Object, Event_) => js.Any,
    fireEvent: (Element, String) => Unit,
    removeEventListener: (Element, String, js.Function1[/* event */ Event_, Unit]) => Unit,
    context: js.Object = null
  ): EventManager = {
    val __obj = js.Dynamic.literal(addEventListener = js.Any.fromFunction3(addEventListener), clear = js.Any.fromFunction0(clear), clearEvents = js.Any.fromFunction0(clearEvents), destroy = js.Any.fromFunction0(destroy), extendEvent = js.Any.fromFunction2(extendEvent), fireEvent = js.Any.fromFunction2(fireEvent), removeEventListener = js.Any.fromFunction3(removeEventListener))
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventManager]
  }
}

