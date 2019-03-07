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
    focus: js.Function0[scala.Unit],
    getFocusableElement: js.Function0[stdLib.HTMLElement],
    listenersCount: stdLib.WeakSet[stdLib.HTMLElement],
    mainElement: stdLib.HTMLElement,
    rootDocument: stdLib.Document,
    setFocusableElement: js.Function1[stdLib.HTMLElement, scala.Unit],
    useSecondaryElement: js.Function0[scala.Unit]
  ): FocusableWrapper = {
    val __obj = js.Dynamic.literal(eventManager = eventManager, focus = focus, getFocusableElement = getFocusableElement, listenersCount = listenersCount, mainElement = mainElement, rootDocument = rootDocument, setFocusableElement = setFocusableElement, useSecondaryElement = useSecondaryElement)
  
    __obj.asInstanceOf[FocusableWrapper]
  }
}

