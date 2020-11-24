package typings.materialTabScroller.adapterMod

import typings.std.ClientRect
import typings.std.EventTarget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MDCTabScrollerAdapter extends js.Object {
  
  /**
    * Adds the given className to the root element.
    * @param className The className to add
    */
  def addClass(className: String): Unit = js.native
  
  /**
    * Adds the given className to the scroll area element.
    * @param className The className to add
    */
  def addScrollAreaClass(className: String): Unit = js.native
  
  /**
    * Returns the height of the browser's horizontal scrollbars (in px).
    */
  def computeHorizontalScrollbarHeight(): Double = js.native
  
  /**
    * Returns the bounding client rect of the scroll area element.
    */
  def computeScrollAreaClientRect(): ClientRect = js.native
  
  /**
    * Returns the bounding client rect of the scroll content element.
    */
  def computeScrollContentClientRect(): ClientRect = js.native
  
  /**
    * Returns whether the event target matches given className.
    * @param evtTarget The event target
    * @param selector The selector to check
    */
  def eventTargetMatchesSelector(evtTarget: EventTarget, selector: String): Boolean = js.native
  
  /**
    * Returns the offsetWitdth of the scroll area element.
    */
  def getScrollAreaOffsetWidth(): Double = js.native
  
  /**
    * Returns the scrollLeft value of the scroll area element.
    */
  def getScrollAreaScrollLeft(): Double = js.native
  
  /**
    * Returns the offsetWidth of the scroll content element.
    */
  def getScrollContentOffsetWidth(): Double = js.native
  
  /**
    * Returns the scroll content element's computed style value of the given css property `propertyName`.
    * We achieve this via `getComputedStyle(...).getPropertyValue(propertyName)`.
    */
  def getScrollContentStyleValue(propertyName: String): String = js.native
  
  /**
    * Removes the given className from the root element.
    * @param className The className to remove
    */
  def removeClass(className: String): Unit = js.native
  
  /**
    * Sets the scrollLeft value of the scroll area element to the passed value.
    * @param scrollLeft The new scrollLeft value
    */
  def setScrollAreaScrollLeft(scrollLeft: Double): Unit = js.native
  
  /**
    * Sets a style property of the area element to the passed value.
    * @param propName The style property name to set
    * @param value The style property value
    */
  def setScrollAreaStyleProperty(propName: String, value: String): Unit = js.native
  
  /**
    * Sets a style property of the content element to the passed value.
    * @param propName The style property name to set
    * @param value The style property value
    */
  def setScrollContentStyleProperty(propName: String, value: String): Unit = js.native
}
object MDCTabScrollerAdapter {
  
  @scala.inline
  def apply(
    addClass: String => Unit,
    addScrollAreaClass: String => Unit,
    computeHorizontalScrollbarHeight: () => Double,
    computeScrollAreaClientRect: () => ClientRect,
    computeScrollContentClientRect: () => ClientRect,
    eventTargetMatchesSelector: (EventTarget, String) => Boolean,
    getScrollAreaOffsetWidth: () => Double,
    getScrollAreaScrollLeft: () => Double,
    getScrollContentOffsetWidth: () => Double,
    getScrollContentStyleValue: String => String,
    removeClass: String => Unit,
    setScrollAreaScrollLeft: Double => Unit,
    setScrollAreaStyleProperty: (String, String) => Unit,
    setScrollContentStyleProperty: (String, String) => Unit
  ): MDCTabScrollerAdapter = {
    val __obj = js.Dynamic.literal(addClass = js.Any.fromFunction1(addClass), addScrollAreaClass = js.Any.fromFunction1(addScrollAreaClass), computeHorizontalScrollbarHeight = js.Any.fromFunction0(computeHorizontalScrollbarHeight), computeScrollAreaClientRect = js.Any.fromFunction0(computeScrollAreaClientRect), computeScrollContentClientRect = js.Any.fromFunction0(computeScrollContentClientRect), eventTargetMatchesSelector = js.Any.fromFunction2(eventTargetMatchesSelector), getScrollAreaOffsetWidth = js.Any.fromFunction0(getScrollAreaOffsetWidth), getScrollAreaScrollLeft = js.Any.fromFunction0(getScrollAreaScrollLeft), getScrollContentOffsetWidth = js.Any.fromFunction0(getScrollContentOffsetWidth), getScrollContentStyleValue = js.Any.fromFunction1(getScrollContentStyleValue), removeClass = js.Any.fromFunction1(removeClass), setScrollAreaScrollLeft = js.Any.fromFunction1(setScrollAreaScrollLeft), setScrollAreaStyleProperty = js.Any.fromFunction2(setScrollAreaStyleProperty), setScrollContentStyleProperty = js.Any.fromFunction2(setScrollContentStyleProperty))
    __obj.asInstanceOf[MDCTabScrollerAdapter]
  }
  
  @scala.inline
  implicit class MDCTabScrollerAdapterOps[Self <: MDCTabScrollerAdapter] (val x: Self) extends AnyVal {
    
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
    def setAddClass(value: String => Unit): Self = this.set("addClass", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAddScrollAreaClass(value: String => Unit): Self = this.set("addScrollAreaClass", js.Any.fromFunction1(value))
    
    @scala.inline
    def setComputeHorizontalScrollbarHeight(value: () => Double): Self = this.set("computeHorizontalScrollbarHeight", js.Any.fromFunction0(value))
    
    @scala.inline
    def setComputeScrollAreaClientRect(value: () => ClientRect): Self = this.set("computeScrollAreaClientRect", js.Any.fromFunction0(value))
    
    @scala.inline
    def setComputeScrollContentClientRect(value: () => ClientRect): Self = this.set("computeScrollContentClientRect", js.Any.fromFunction0(value))
    
    @scala.inline
    def setEventTargetMatchesSelector(value: (EventTarget, String) => Boolean): Self = this.set("eventTargetMatchesSelector", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetScrollAreaOffsetWidth(value: () => Double): Self = this.set("getScrollAreaOffsetWidth", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetScrollAreaScrollLeft(value: () => Double): Self = this.set("getScrollAreaScrollLeft", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetScrollContentOffsetWidth(value: () => Double): Self = this.set("getScrollContentOffsetWidth", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetScrollContentStyleValue(value: String => String): Self = this.set("getScrollContentStyleValue", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemoveClass(value: String => Unit): Self = this.set("removeClass", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetScrollAreaScrollLeft(value: Double => Unit): Self = this.set("setScrollAreaScrollLeft", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetScrollAreaStyleProperty(value: (String, String) => Unit): Self = this.set("setScrollAreaStyleProperty", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSetScrollContentStyleProperty(value: (String, String) => Unit): Self = this.set("setScrollContentStyleProperty", js.Any.fromFunction2(value))
  }
}
