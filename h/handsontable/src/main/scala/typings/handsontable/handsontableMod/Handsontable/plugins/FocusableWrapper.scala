package typings.handsontable.handsontableMod.Handsontable.plugins

import typings.std.Document
import typings.std.HTMLElement
import typings.std.WeakSet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FocusableWrapper extends js.Object {
  var eventManager: typings.handsontable.handsontableMod.Handsontable.plugins.EventManager
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
    eventManager: typings.handsontable.handsontableMod.Handsontable.plugins.EventManager,
    focus: () => Unit,
    getFocusableElement: () => HTMLElement,
    listenersCount: WeakSet[HTMLElement],
    mainElement: HTMLElement,
    rootDocument: Document,
    setFocusableElement: HTMLElement => Unit,
    useSecondaryElement: () => Unit
  ): FocusableWrapper = {
    val __obj = js.Dynamic.literal(eventManager = eventManager, focus = js.Any.fromFunction0(focus), getFocusableElement = js.Any.fromFunction0(getFocusableElement), listenersCount = listenersCount, mainElement = mainElement, rootDocument = rootDocument, setFocusableElement = js.Any.fromFunction1(setFocusableElement), useSecondaryElement = js.Any.fromFunction0(useSecondaryElement))
  
    __obj.asInstanceOf[FocusableWrapper]
  }
}

