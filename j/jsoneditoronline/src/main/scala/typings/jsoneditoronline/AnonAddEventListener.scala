package typings.jsoneditoronline

import typings.std.Event_
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAddEventListener extends js.Object {
  def addEventListener(
    element: HTMLElement,
    action: String,
    listener: js.Function1[/* event */ js.UndefOr[Event_], Unit],
    useCapture: Boolean
  ): js.Function1[/* event */ js.UndefOr[Event_], Unit]
  def preventDefault(event: Event_): Unit
  def removeEventListener(
    element: HTMLElement,
    action: String,
    listener: js.Function1[/* event */ js.UndefOr[Event_], Unit],
    useCapture: Boolean
  ): Unit
  def stopPropagation(event: Event_): Unit
}

object AnonAddEventListener {
  @scala.inline
  def apply(
    addEventListener: (HTMLElement, String, js.Function1[/* event */ js.UndefOr[Event_], Unit], Boolean) => js.Function1[/* event */ js.UndefOr[Event_], Unit],
    preventDefault: Event_ => Unit,
    removeEventListener: (HTMLElement, String, js.Function1[/* event */ js.UndefOr[Event_], Unit], Boolean) => Unit,
    stopPropagation: Event_ => Unit
  ): AnonAddEventListener = {
    val __obj = js.Dynamic.literal(addEventListener = js.Any.fromFunction4(addEventListener), preventDefault = js.Any.fromFunction1(preventDefault), removeEventListener = js.Any.fromFunction4(removeEventListener), stopPropagation = js.Any.fromFunction1(stopPropagation))
    __obj.asInstanceOf[AnonAddEventListener]
  }
}

