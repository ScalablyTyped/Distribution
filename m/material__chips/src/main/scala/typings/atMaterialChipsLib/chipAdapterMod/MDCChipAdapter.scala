package typings
package atMaterialChipsLib.chipAdapterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MDCChipAdapter extends js.Object {
  def addClass(className: java.lang.String): scala.Unit
  def addClassToLeadingIcon(className: java.lang.String): scala.Unit
  /**
    * Deregisters an event listener on the root element for a given event.
    */
  def deregisterEventHandler(evtType: java.lang.String, handler: stdLib.EventListener): scala.Unit
  /**
    * Deregisters an event listener on the trailing icon element for a given event.
    */
  def deregisterTrailingIconInteractionHandler(evtType: java.lang.String, handler: stdLib.EventListener): scala.Unit
  /**
    * Returns true if target has className, false otherwise.
    */
  def eventTargetHasClass(target: stdLib.EventTarget, className: java.lang.String): scala.Boolean
  /**
    * Returns the computed property value of the given style property on the root element.
    */
  def getComputedStyleValue(propertyName: java.lang.String): java.lang.String
  def hasClass(className: java.lang.String): scala.Boolean
  /**
    * Emits a custom "MDCChip:interaction" event denoting the chip has been
    * interacted with (typically on click or keydown).
    */
  def notifyInteraction(): scala.Unit
  /**
    * Emits a custom event "MDCChip:removal" denoting the chip will be removed.
    */
  def notifyRemoval(): scala.Unit
  /**
    * Emits a custom "MDCChip:trailingIconInteraction" event denoting the trailing icon has been
    * interacted with (typically on click or keydown).
    */
  def notifyTrailingIconInteraction(): scala.Unit
  /**
    * Registers an event listener on the root element for a given event.
    */
  def registerEventHandler(evtType: java.lang.String, handler: stdLib.EventListener): scala.Unit
  /**
    * Registers an event listener on the trailing icon element for a given event.
    */
  def registerTrailingIconInteractionHandler(evtType: java.lang.String, handler: stdLib.EventListener): scala.Unit
  def removeClass(className: java.lang.String): scala.Unit
  def removeClassFromLeadingIcon(className: java.lang.String): scala.Unit
  /**
    * Sets the property value of the given style property on the root element.
    */
  def setStyleProperty(propertyName: java.lang.String, value: java.lang.String): scala.Unit
}

object MDCChipAdapter {
  @scala.inline
  def apply(
    addClass: java.lang.String => scala.Unit,
    addClassToLeadingIcon: java.lang.String => scala.Unit,
    deregisterEventHandler: (java.lang.String, stdLib.EventListener) => scala.Unit,
    deregisterTrailingIconInteractionHandler: (java.lang.String, stdLib.EventListener) => scala.Unit,
    eventTargetHasClass: (stdLib.EventTarget, java.lang.String) => scala.Boolean,
    getComputedStyleValue: java.lang.String => java.lang.String,
    hasClass: java.lang.String => scala.Boolean,
    notifyInteraction: () => scala.Unit,
    notifyRemoval: () => scala.Unit,
    notifyTrailingIconInteraction: () => scala.Unit,
    registerEventHandler: (java.lang.String, stdLib.EventListener) => scala.Unit,
    registerTrailingIconInteractionHandler: (java.lang.String, stdLib.EventListener) => scala.Unit,
    removeClass: java.lang.String => scala.Unit,
    removeClassFromLeadingIcon: java.lang.String => scala.Unit,
    setStyleProperty: (java.lang.String, java.lang.String) => scala.Unit
  ): MDCChipAdapter = {
    val __obj = js.Dynamic.literal(addClass = js.Any.fromFunction1(addClass), addClassToLeadingIcon = js.Any.fromFunction1(addClassToLeadingIcon), deregisterEventHandler = js.Any.fromFunction2(deregisterEventHandler), deregisterTrailingIconInteractionHandler = js.Any.fromFunction2(deregisterTrailingIconInteractionHandler), eventTargetHasClass = js.Any.fromFunction2(eventTargetHasClass), getComputedStyleValue = js.Any.fromFunction1(getComputedStyleValue), hasClass = js.Any.fromFunction1(hasClass), notifyInteraction = js.Any.fromFunction0(notifyInteraction), notifyRemoval = js.Any.fromFunction0(notifyRemoval), notifyTrailingIconInteraction = js.Any.fromFunction0(notifyTrailingIconInteraction), registerEventHandler = js.Any.fromFunction2(registerEventHandler), registerTrailingIconInteractionHandler = js.Any.fromFunction2(registerTrailingIconInteractionHandler), removeClass = js.Any.fromFunction1(removeClass), removeClassFromLeadingIcon = js.Any.fromFunction1(removeClassFromLeadingIcon), setStyleProperty = js.Any.fromFunction2(setStyleProperty))
  
    __obj.asInstanceOf[MDCChipAdapter]
  }
}

