package typings.handsontable.mod.Handsontable.plugins

import typings.std.Document
import typings.std.HTMLElement
import typings.std.WeakSet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FocusableWrapper extends StObject {
  
  var eventManager: EventManager = js.native
  
  def focus(): Unit = js.native
  
  def getFocusableElement(): HTMLElement = js.native
  
  var listenersCount: WeakSet[HTMLElement] = js.native
  
  var mainElement: HTMLElement = js.native
  
  var rootDocument: Document = js.native
  
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
  implicit class FocusableWrapperMutableBuilder[Self <: FocusableWrapper] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEventManager(value: EventManager): Self = StObject.set(x, "eventManager", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFocus(value: () => Unit): Self = StObject.set(x, "focus", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetFocusableElement(value: () => HTMLElement): Self = StObject.set(x, "getFocusableElement", js.Any.fromFunction0(value))
    
    @scala.inline
    def setListenersCount(value: WeakSet[HTMLElement]): Self = StObject.set(x, "listenersCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMainElement(value: HTMLElement): Self = StObject.set(x, "mainElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootDocument(value: Document): Self = StObject.set(x, "rootDocument", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetFocusableElement(value: HTMLElement => Unit): Self = StObject.set(x, "setFocusableElement", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUseSecondaryElement(value: () => Unit): Self = StObject.set(x, "useSecondaryElement", js.Any.fromFunction0(value))
  }
}
