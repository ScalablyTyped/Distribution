package typings.materialChips.chipAdapterMod

import typings.std.EventListener
import typings.std.EventTarget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MDCChipAdapter extends js.Object {
  def addClass(className: String): Unit
  def addClassToLeadingIcon(className: String): Unit
  /**
    * Deregisters an event listener on the root element for a given event.
    */
  def deregisterEventHandler(evtType: String, handler: EventListener): Unit
  /**
    * Deregisters an event listener on the trailing icon element for a given event.
    */
  def deregisterTrailingIconInteractionHandler(evtType: String, handler: EventListener): Unit
  /**
    * Returns true if target has className, false otherwise.
    */
  def eventTargetHasClass(target: EventTarget, className: String): Boolean
  /**
    * Returns the computed property value of the given style property on the root element.
    */
  def getComputedStyleValue(propertyName: String): String
  def hasClass(className: String): Boolean
  /**
    * Emits a custom "MDCChip:interaction" event denoting the chip has been
    * interacted with (typically on click or keydown).
    */
  def notifyInteraction(): Unit
  /**
    * Emits a custom event "MDCChip:removal" denoting the chip will be removed.
    */
  def notifyRemoval(): Unit
  /**
    * Emits a custom "MDCChip:trailingIconInteraction" event denoting the trailing icon has been
    * interacted with (typically on click or keydown).
    */
  def notifyTrailingIconInteraction(): Unit
  /**
    * Registers an event listener on the root element for a given event.
    */
  def registerEventHandler(evtType: String, handler: EventListener): Unit
  /**
    * Registers an event listener on the trailing icon element for a given event.
    */
  def registerTrailingIconInteractionHandler(evtType: String, handler: EventListener): Unit
  def removeClass(className: String): Unit
  def removeClassFromLeadingIcon(className: String): Unit
  /**
    * Sets the property value of the given style property on the root element.
    */
  def setStyleProperty(propertyName: String, value: String): Unit
}

object MDCChipAdapter {
  @scala.inline
  def apply(
    addClass: String => Unit,
    addClassToLeadingIcon: String => Unit,
    deregisterEventHandler: (String, EventListener) => Unit,
    deregisterTrailingIconInteractionHandler: (String, EventListener) => Unit,
    eventTargetHasClass: (EventTarget, String) => Boolean,
    getComputedStyleValue: String => String,
    hasClass: String => Boolean,
    notifyInteraction: () => Unit,
    notifyRemoval: () => Unit,
    notifyTrailingIconInteraction: () => Unit,
    registerEventHandler: (String, EventListener) => Unit,
    registerTrailingIconInteractionHandler: (String, EventListener) => Unit,
    removeClass: String => Unit,
    removeClassFromLeadingIcon: String => Unit,
    setStyleProperty: (String, String) => Unit
  ): MDCChipAdapter = {
    val __obj = js.Dynamic.literal(addClass = js.Any.fromFunction1(addClass), addClassToLeadingIcon = js.Any.fromFunction1(addClassToLeadingIcon), deregisterEventHandler = js.Any.fromFunction2(deregisterEventHandler), deregisterTrailingIconInteractionHandler = js.Any.fromFunction2(deregisterTrailingIconInteractionHandler), eventTargetHasClass = js.Any.fromFunction2(eventTargetHasClass), getComputedStyleValue = js.Any.fromFunction1(getComputedStyleValue), hasClass = js.Any.fromFunction1(hasClass), notifyInteraction = js.Any.fromFunction0(notifyInteraction), notifyRemoval = js.Any.fromFunction0(notifyRemoval), notifyTrailingIconInteraction = js.Any.fromFunction0(notifyTrailingIconInteraction), registerEventHandler = js.Any.fromFunction2(registerEventHandler), registerTrailingIconInteractionHandler = js.Any.fromFunction2(registerTrailingIconInteractionHandler), removeClass = js.Any.fromFunction1(removeClass), removeClassFromLeadingIcon = js.Any.fromFunction1(removeClassFromLeadingIcon), setStyleProperty = js.Any.fromFunction2(setStyleProperty))
    __obj.asInstanceOf[MDCChipAdapter]
  }
}

