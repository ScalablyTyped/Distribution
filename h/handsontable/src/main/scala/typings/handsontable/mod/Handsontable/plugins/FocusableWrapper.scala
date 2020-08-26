package typings.handsontable.mod.Handsontable.plugins

import typings.std.Document
import typings.std.HTMLElement
import typings.std.WeakSet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FocusableWrapper extends js.Object {
  var eventManager: EventManager = js.native
  var listenersCount: WeakSet[HTMLElement] = js.native
  var mainElement: HTMLElement = js.native
  var rootDocument: Document = js.native
  def focus(): Unit = js.native
  def getFocusableElement(): HTMLElement = js.native
  def setFocusableElement(element: HTMLElement): Unit = js.native
  def useSecondaryElement(): Unit = js.native
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
  @scala.inline
  implicit class FocusableWrapperOps[Self <: FocusableWrapper] (val x: Self) extends AnyVal {
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
    def setEventManager(value: EventManager): Self = this.set("eventManager", value.asInstanceOf[js.Any])
    @scala.inline
    def setFocus(value: () => Unit): Self = this.set("focus", js.Any.fromFunction0(value))
    @scala.inline
    def setGetFocusableElement(value: () => HTMLElement): Self = this.set("getFocusableElement", js.Any.fromFunction0(value))
    @scala.inline
    def setListenersCount(value: WeakSet[HTMLElement]): Self = this.set("listenersCount", value.asInstanceOf[js.Any])
    @scala.inline
    def setMainElement(value: HTMLElement): Self = this.set("mainElement", value.asInstanceOf[js.Any])
    @scala.inline
    def setRootDocument(value: Document): Self = this.set("rootDocument", value.asInstanceOf[js.Any])
    @scala.inline
    def setSetFocusableElement(value: HTMLElement => Unit): Self = this.set("setFocusableElement", js.Any.fromFunction1(value))
    @scala.inline
    def setUseSecondaryElement(value: () => Unit): Self = this.set("useSecondaryElement", js.Any.fromFunction0(value))
  }
  
}

