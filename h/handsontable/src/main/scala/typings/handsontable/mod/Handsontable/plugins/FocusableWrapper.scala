package typings.handsontable.mod.Handsontable.plugins

import typings.std.Document
import typings.std.HTMLElement
import typings.std.WeakSet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FocusableWrapper extends js.Object {
  var eventManager: EventManager
  var listenersCount: WeakSet[HTMLElement]
  var mainElement: HTMLElement
  var rootDocument: Document
  def focus(): Unit
  def getFocusableElement(): HTMLElement
  def setFocusableElement(element: HTMLElement): Unit
  def useSecondaryElement(): Unit
}

object FocusableWrapper {
  @scala.inline
  def apply(
    eventManager: EventManager,
    focus: () => Unit,
    getFocusableElement: () => HTMLElement,
    listenersCount: WeakSet[HTMLElement],
    mainElement: HTMLElement,
    rootDocument: Document,
    setFocusableElement: HTMLElement => Unit,
    useSecondaryElement: () => Unit
  ): FocusableWrapper = {
    val __obj = js.Dynamic.literal(eventManager = eventManager.asInstanceOf[js.Any], focus = js.Any.fromFunction0(focus), getFocusableElement = js.Any.fromFunction0(getFocusableElement), listenersCount = listenersCount.asInstanceOf[js.Any], mainElement = mainElement.asInstanceOf[js.Any], rootDocument = rootDocument.asInstanceOf[js.Any], setFocusableElement = js.Any.fromFunction1(setFocusableElement), useSecondaryElement = js.Any.fromFunction0(useSecondaryElement))
    __obj.asInstanceOf[FocusableWrapper]
  }
}

