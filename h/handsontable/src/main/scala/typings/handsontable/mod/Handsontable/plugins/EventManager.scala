package typings.handsontable.mod.Handsontable.plugins

import typings.std.Element
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventManager extends js.Object {
  var context: js.UndefOr[js.Object] = js.native
  def addEventListener(element: Element, eventName: String, callback: js.Function1[/* event */ Event, Unit]): js.Function0[Unit] = js.native
  def clear(): Unit = js.native
  def clearEvents(): Unit = js.native
  def destroy(): Unit = js.native
  def extendEvent(context: js.Object, event: Event): js.Any = js.native
  def fireEvent(element: Element, eventName: String): Unit = js.native
  def removeEventListener(element: Element, eventName: String, callback: js.Function1[/* event */ Event, Unit]): Unit = js.native
}

object EventManager {
  @scala.inline
  def apply(
    addEventListener: (Element, String, js.Function1[/* event */ Event, Unit]) => js.Function0[Unit],
    clear: () => Unit,
    clearEvents: () => Unit,
    destroy: () => Unit,
    extendEvent: (js.Object, Event) => js.Any,
    fireEvent: (Element, String) => Unit,
    removeEventListener: (Element, String, js.Function1[/* event */ Event, Unit]) => Unit
  ): EventManager = {
    val __obj = js.Dynamic.literal(addEventListener = js.Any.fromFunction3(addEventListener), clear = js.Any.fromFunction0(clear), clearEvents = js.Any.fromFunction0(clearEvents), destroy = js.Any.fromFunction0(destroy), extendEvent = js.Any.fromFunction2(extendEvent), fireEvent = js.Any.fromFunction2(fireEvent), removeEventListener = js.Any.fromFunction3(removeEventListener))
    __obj.asInstanceOf[EventManager]
  }
  @scala.inline
  implicit class EventManagerOps[Self <: EventManager] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAddEventListener(value: (Element, String, js.Function1[/* event */ Event, Unit]) => js.Function0[Unit]): Self = this.set("addEventListener", js.Any.fromFunction3(value))
    @scala.inline
    def setClear(value: () => Unit): Self = this.set("clear", js.Any.fromFunction0(value))
    @scala.inline
    def setClearEvents(value: () => Unit): Self = this.set("clearEvents", js.Any.fromFunction0(value))
    @scala.inline
    def setDestroy(value: () => Unit): Self = this.set("destroy", js.Any.fromFunction0(value))
    @scala.inline
    def setExtendEvent(value: (js.Object, Event) => js.Any): Self = this.set("extendEvent", js.Any.fromFunction2(value))
    @scala.inline
    def setFireEvent(value: (Element, String) => Unit): Self = this.set("fireEvent", js.Any.fromFunction2(value))
    @scala.inline
    def setRemoveEventListener(value: (Element, String, js.Function1[/* event */ Event, Unit]) => Unit): Self = this.set("removeEventListener", js.Any.fromFunction3(value))
    @scala.inline
    def setContext(value: js.Object): Self = this.set("context", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContext: Self = this.set("context", js.undefined)
  }
  
}

