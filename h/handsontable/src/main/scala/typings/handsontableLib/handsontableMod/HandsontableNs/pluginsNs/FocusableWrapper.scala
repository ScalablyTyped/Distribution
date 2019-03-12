package typings
package handsontableLib.handsontableMod.HandsontableNs.pluginsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FocusableWrapper extends js.Object {
  var eventManager: EventManager
  var listenersCount: stdLib.WeakSet[stdLib.HTMLElement]
  var mainElement: stdLib.HTMLElement
  var rootDocument: stdLib.Document
  def focus(): scala.Unit
  def getFocusableElement(): stdLib.HTMLElement
  def setFocusableElement(element: stdLib.HTMLElement): scala.Unit
  def useSecondaryElement(): scala.Unit
}

object FocusableWrapper {
  @scala.inline
  def apply(
    eventManager: EventManager,
    focus: () => scala.Unit,
    getFocusableElement: () => stdLib.HTMLElement,
    listenersCount: stdLib.WeakSet[stdLib.HTMLElement],
    mainElement: stdLib.HTMLElement,
    rootDocument: stdLib.Document,
    setFocusableElement: stdLib.HTMLElement => scala.Unit,
    useSecondaryElement: () => scala.Unit
  ): FocusableWrapper = {
    val __obj = js.Dynamic.literal(eventManager = eventManager, focus = js.Any.fromFunction0(focus), getFocusableElement = js.Any.fromFunction0(getFocusableElement), listenersCount = listenersCount, mainElement = mainElement, rootDocument = rootDocument, setFocusableElement = js.Any.fromFunction1(setFocusableElement), useSecondaryElement = js.Any.fromFunction0(useSecondaryElement))
  
    __obj.asInstanceOf[FocusableWrapper]
  }
}

