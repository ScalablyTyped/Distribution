package typings.jsoneditoronline

import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JSONEditorSearchBox extends js.Object {
  def clearDelay(): Unit
  def focusActiveResult(): Unit
  def next(): Unit
  def onDelayedSearch(event: Event): Unit
  def onKeyDown(event: Event): Unit
  def onKeyUp(event: Event): Unit
  def onSearch(event: Event, forcedSearch: Boolean): Unit
  def previous(): Unit
  def setActiveResult(index: Double): Unit
}

object JSONEditorSearchBox {
  @scala.inline
  def apply(
    clearDelay: () => Unit,
    focusActiveResult: () => Unit,
    next: () => Unit,
    onDelayedSearch: Event => Unit,
    onKeyDown: Event => Unit,
    onKeyUp: Event => Unit,
    onSearch: (Event, Boolean) => Unit,
    previous: () => Unit,
    setActiveResult: Double => Unit
  ): JSONEditorSearchBox = {
    val __obj = js.Dynamic.literal(clearDelay = js.Any.fromFunction0(clearDelay), focusActiveResult = js.Any.fromFunction0(focusActiveResult), next = js.Any.fromFunction0(next), onDelayedSearch = js.Any.fromFunction1(onDelayedSearch), onKeyDown = js.Any.fromFunction1(onKeyDown), onKeyUp = js.Any.fromFunction1(onKeyUp), onSearch = js.Any.fromFunction2(onSearch), previous = js.Any.fromFunction0(previous), setActiveResult = js.Any.fromFunction1(setActiveResult))
    __obj.asInstanceOf[JSONEditorSearchBox]
  }
}

