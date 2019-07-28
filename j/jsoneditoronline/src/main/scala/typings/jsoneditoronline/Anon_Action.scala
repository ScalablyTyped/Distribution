package typings.jsoneditoronline

import typings.std.Event
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Action extends js.Object {
  def addEventListener(
    element: HTMLElement,
    action: String,
    listener: js.Function1[/* event */ js.UndefOr[Event], Unit],
    useCapture: Boolean
  ): js.Function1[/* event */ js.UndefOr[Event], Unit]
  def preventDefault(event: Event): Unit
  def removeEventListener(
    element: HTMLElement,
    action: String,
    listener: js.Function1[/* event */ js.UndefOr[Event], Unit],
    useCapture: Boolean
  ): Unit
  def stopPropagation(event: Event): Unit
}

object Anon_Action {
  @scala.inline
  def apply(
    addEventListener: (HTMLElement, String, js.Function1[/* event */ js.UndefOr[Event], Unit], Boolean) => js.Function1[/* event */ js.UndefOr[Event], Unit],
    preventDefault: Event => Unit,
    removeEventListener: (HTMLElement, String, js.Function1[/* event */ js.UndefOr[Event], Unit], Boolean) => Unit,
    stopPropagation: Event => Unit
  ): Anon_Action = {
    val __obj = js.Dynamic.literal(addEventListener = js.Any.fromFunction4(addEventListener), preventDefault = js.Any.fromFunction1(preventDefault), removeEventListener = js.Any.fromFunction4(removeEventListener), stopPropagation = js.Any.fromFunction1(stopPropagation))
  
    __obj.asInstanceOf[Anon_Action]
  }
}

