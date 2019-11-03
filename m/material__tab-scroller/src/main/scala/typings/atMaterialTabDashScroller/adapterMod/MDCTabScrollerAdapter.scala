package typings.atMaterialTabDashScroller.adapterMod

import typings.std.ClientRect
import typings.std.EventTarget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MDCTabScrollerAdapter extends js.Object {
  /**
    * Adds the given className to the root element.
    * @param className The className to add
    */
  def addClass(className: String): Unit
  /**
    * Adds the given className to the scroll area element.
    * @param className The className to add
    */
  def addScrollAreaClass(className: String): Unit
  /**
    * Returns the height of the browser's horizontal scrollbars (in px).
    */
  def computeHorizontalScrollbarHeight(): Double
  /**
    * Returns the bounding client rect of the scroll area element.
    */
  def computeScrollAreaClientRect(): ClientRect
  /**
    * Returns the bounding client rect of the scroll content element.
    */
  def computeScrollContentClientRect(): ClientRect
  /**
    * Returns whether the event target matches given className.
    * @param evtTarget The event target
    * @param selector The selector to check
    */
  def eventTargetMatchesSelector(evtTarget: EventTarget, selector: String): Boolean
  /**
    * Returns the offsetWitdth of the scroll area element.
    */
  def getScrollAreaOffsetWidth(): Double
  /**
    * Returns the scrollLeft value of the scroll area element.
    */
  def getScrollAreaScrollLeft(): Double
  /**
    * Returns the offsetWidth of the scroll content element.
    */
  def getScrollContentOffsetWidth(): Double
  /**
    * Returns the scroll content element's computed style value of the given css property `propertyName`.
    * We achieve this via `getComputedStyle(...).getPropertyValue(propertyName)`.
    */
  def getScrollContentStyleValue(propertyName: String): String
  /**
    * Removes the given className from the root element.
    * @param className The className to remove
    */
  def removeClass(className: String): Unit
  /**
    * Sets the scrollLeft value of the scroll area element to the passed value.
    * @param scrollLeft The new scrollLeft value
    */
  def setScrollAreaScrollLeft(scrollLeft: Double): Unit
  /**
    * Sets a style property of the area element to the passed value.
    * @param propName The style property name to set
    * @param value The style property value
    */
  def setScrollAreaStyleProperty(propName: String, value: String): Unit
  /**
    * Sets a style property of the content element to the passed value.
    * @param propName The style property name to set
    * @param value The style property value
    */
  def setScrollContentStyleProperty(propName: String, value: String): Unit
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
}

